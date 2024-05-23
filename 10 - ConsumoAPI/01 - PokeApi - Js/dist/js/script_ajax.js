let contentMenu = null;
let btnAtras = null;
let btnSiguiente = null;
let waitContent = null;
let pokemonName = null;
let pokemonImg = null;

window.onload = function(){
	contentMenu = document.getElementById("contentMenu");
	btnAtras = document.getElementById("btnAtras");
	btnSiguiente = document.getElementById("btnSiguiente");
	waitContent = document.getElementById("waitContent");
	pokemonName = document.getElementById("pokemonName");
	pokemonImg = document.getElementById("pokemonImg");

	getPokemons("https://pokeapi.co/api/v2/pokemon");
	dataPokemon("https://pokeapi.co/api/v2/pokemon/1/");
}

function getPokemons(endpoint){	
	try {
		waitContent.style.display = 'block';
		fetch( endpoint )
		.then( res => res.json() )
		.then( data => {
			contentMenu.innerHTML = "";
			for (var i=0; i<data.results.length; i++) {
				let btnTemp = `<button class="col-2 m-1 btn btn-outline-primary" onclick="dataPokemon('${ data.results[i].url }')" >${ data.results[i].name }</button>`;
				contentMenu.innerHTML += btnTemp;
			}
			btnAtras.setAttribute("data-endpoint", data.previous );
			btnSiguiente.setAttribute("data-endpoint", data.next);
			waitContent.style.display = 'none';
		});
	} catch(e) {
		console.log("Error en consumo API: ");
		console.log(e);
	}
}

function getNext(){
	let endpoint = btnSiguiente.getAttribute("data-endpoint");
	if (endpoint!=null){
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}

function getBack(){
	let endpoint = btnAtras.getAttribute("data-endpoint");
	if (endpoint!=null){
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}

function dataPokemon(endpoint){
	try {
		waitContent.style.display = 'block';
		pokemonName.innerHTML = "";
		pokemonImg.src = "";

		fetch(endpoint)
		.then( res => res.json() )
		.then( data => {

			const nombre = data.name;
			const url_img = data.sprites.other.dream_world.front_default;

			pokemonName.innerHTML = nombre;
			pokemonImg.src = url_img;

			waitContent.style.display = 'none';
		});
	} catch(e) {
		console.log("Error en consumo API: ");
		console.log(e);
	}
}