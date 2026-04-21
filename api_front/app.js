function cargarObras(){
    fetch("http://localhost:4050/obras")
    .then(function(respuestaTextoPlano){
        return respuestaTextoPlano.json()
    })
    .then(function(datosJSON){
        console.log(datosJSON)
        const cuerpoTabla = document.getElementById("obras-body")
        cuerpoTabla.innerHTML = ""
        for(let obra of datosJSON){
            const fila = document.createElement("tr")

            let celdaTabla = document.createElement("td")
            celdaTabla.innerText = obra.id
            fila.appendChild(celdaTabla)

            

            celdaTabla = document.createElement("td")
            celdaTabla.innerText = obra.nombre
            fila.appendChild(celdaTabla)
            
            celdaTabla = document.createElement("td")
            celdaTabla.innerText = obra.descripcion
            fila.appendChild(celdaTabla)

            celdaTabla = document.createElement("td")
            celdaTabla.innerText = obra.sala ? obra.sala.nombre : "Sin sala"
            fila.appendChild(celdaTabla)

            celdaTabla = document.createElement("td")
            const botonMostrar = document.createElement("button")
            botonMostrar.innerText = "Ver"
            botonMostrar.classList.add("btn-detalles")
            botonMostrar.onclick = function(){
                window.location.href = "show.html?id=" + obra.id
            }
            celdaTabla.appendChild(botonMostrar)
            fila.appendChild(celdaTabla)

            cuerpoTabla.appendChild(fila)
        }
    })
    .catch(function(error){
        console.log("Error al cargar obras:", error)
    })
}