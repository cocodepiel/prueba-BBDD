function cargarSalas(){
    fetch("http://localhost:4050/salas")
    .then(function(respuestaTextoPlano){
        return respuestaTextoPlano.json()
    })
    .then(function(datosJSON){
        console.log(datosJSON)
        const cuerpoTabla = document.getElementById("salas-body")
        cuerpoTabla.innerHTML = ""
        for(let sala of datosJSON){
            const fila = document.createElement("tr")

            let celdaTabla = document.createElement("td")
            celdaTabla.innerText = sala.id
            fila.appendChild(celdaTabla)

            celdaTabla = document.createElement("td")
            celdaTabla.innerText = sala.nombre
            fila.appendChild(celdaTabla)

            celdaTabla = document.createElement("td")
            const botonMostrar = document.createElement("button")
            botonMostrar.innerText = "Ver Obras"
            botonMostrar.classList.add("btn-detalles")
            botonMostrar.onclick = function(){
                window.location.href = "obras.html?salaId=" + sala.id + "&salaNombre=" + encodeURIComponent(sala.nombre)
            }
            celdaTabla.appendChild(botonMostrar)
            fila.appendChild(celdaTabla)

            cuerpoTabla.appendChild(fila)
        }
    })
    .catch(function(error){
        console.log("Error al cargar salas:", error)
    })
}

cargarSalas()