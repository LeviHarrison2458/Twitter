function hoverFunction(event) {
	let element = event.currentTarget;
	element.classList.remove("btn-primary");
	element.classList.add("btn-danger");
	element.innerText="Unfollow";
}

function unhoverFunction(event) {
	let element = event.currentTarget;
	element.innerText="Following";
	element.classList.remove("btn-danger");
	element.classList.add("btn-primary");	
}

let element = document.querySelector(".unfollow_btn");
element.addEventListener("mouseover", hoverFunction);
element.addEventListener("mouseout", unhoverFunction);