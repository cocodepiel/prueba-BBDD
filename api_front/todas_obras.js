const extrasObras = {
    9: { anyo: 1656, imagen: "img/meninas.jpg" },
    10: { anyo: 1600, imagen: "img/vocacion.jpg" },
    11: { anyo: 1931, imagen: "img/persistencia.jpg" },
    12: { anyo: 1964, imagen: "img/hijo.jpg" },
    13: { anyo: 1939, imagen: "img/fridas.jpg" },
    14: { anyo: 1503, imagen: "img/La_Gioconda.jpg" },
    15: { anyo: 1512, imagen: "img/creacion.jpg" }
};

function cargarTodasLasObras(){
    fetch("http://localhost:4050/obras")
    .then(function(respuestaTextoPlano){
        return respuestaTextoPlano.json()
    })
    .then(function(datosJSON){
        const contenedorGrid = document.getElementById("obras-grid")
        contenedorGrid.innerHTML = ""

        for(let obra of datosJSON){
            const extras = extrasObras[obra.id] || { anyo: "Desconocido", imagen: "" }
            const card = document.createElement("div")
            card.classList.add("obra-card")
            
            let autor = obra.usuario && obra.usuario.nombre ? (obra.usuario.nombre + " " + (obra.usuario.apellido1 || "")) : "Actor desconocido";
            let salaNombre = obra.sala ? obra.sala.nombre : "Sin sala";
            let imagenHTML = extras.imagen ? `<img src="${extras.imagen}" alt="${obra.nombre}">` : `<div style="padding: 20px; text-align: center; color: var(--text-dim);">Sin imagen</div>`;

            card.innerHTML = `
                <div class="imagen-container">
                    ${imagenHTML}
                </div>
                <h3>${obra.nombre || "Sin nombre"}</h3>
                <p><strong>Autor:</strong> ${autor}</p>
                <p><strong>Año:</strong> ${extras.anyo}</p>
                <p><strong>Sala:</strong> ${salaNombre}</p>
                <p style="margin-top: 10px; margin-bottom: 15px; flex-grow: 1;">${obra.descripcion || "Sin descripción"}</p>
                <button class="btn-detalles" onclick="window.location.href='show.html?id=${obra.id}'">Ver Ficha</button>
            `;

            contenedorGrid.appendChild(card)
        }
    })
    .catch(function(error){
        console.log("Error al cargar obras:", error)
    })
}

cargarTodasLasObras();