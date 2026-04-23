function cargarObras(){
    const parametrosURL = new URLSearchParams(window.location.search)
    const idSala = parametrosURL.get("salaId")
    const nombreSala = parametrosURL.get("salaNombre")
    document.getElementById("sala-nombre").innerText = "Obras de la Sala: " + nombreSala    
    fetch("http://localhost:4050/salas/" + idSala + "/obras")
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

            celdaTabla.innerText = obra.usuario ? obra.usuario.nombre + " " + (obra.usuario.apellido1 || "") : "Sin artista"

            fila.appendChild(celdaTabla)

            celdaTabla = document.createElement("td")
            const botonVerFicha = document.createElement("button")
            botonVerFicha.innerText = "Ver Ficha"
            botonVerFicha.classList.add("btn-detalles")
            botonVerFicha.onclick = function(){
                window.location.href = "show.html?id=" + obra.id
            }
            celdaTabla.appendChild(botonVerFicha)
            fila.appendChild(celdaTabla)

            cuerpoTabla.appendChild(fila)

            
        }
    })
}

cargarObras();