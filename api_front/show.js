const extrasObras = {
    9: { anyo: 1656, imagen: "img/meninas.jpg" },
    10: { anyo: 1600, imagen: "img/vocacion.jpg" },
    11: { anyo: 1931, imagen: "img/persistencia.jpg" },
    12: { anyo: 1964, imagen: "img/hijo.jpg" },
    13: { anyo: 1939, imagen: "img/fridas.jpg" },
    14: { anyo: 1503, imagen: "img/La_Gioconda.jpg" },
    15: { anyo: 1512, imagen: "img/creacion.jpg" }
};

function cargarDetallesObra(){
    const parametrosURL = new URLSearchParams(window.location.search)
    const idObra = parametrosURL.get("id")

    fetch("http://localhost:4050/obras/" + idObra)
    .then(function(respuestaTextoPlano){
        return respuestaTextoPlano.json()
    })
    .then(function(datosJSON){
        document.getElementById("nombre-obra").innerText = datosJSON.nombre || "Sin nombre"
        document.getElementById("descripcion-obra").innerText = datosJSON.descripcion || "Sin descripción"
        document.getElementById("sala-obra").innerText = (datosJSON.sala && datosJSON.sala.nombre) ? datosJSON.sala.nombre : "Sin sala"
        document.getElementById("id-obra").innerText = datosJSON.id || idObra
        
        if(datosJSON.usuario && datosJSON.usuario.nombre){
            document.getElementById("autor-obra").innerText = datosJSON.usuario.nombre + " " + (datosJSON.usuario.apellido1 || "")
        } else {
            document.getElementById("autor-obra").innerText = "No asignado"
        }

        const extras = extrasObras[idObra];
        if (extras) {
            document.getElementById("anyo-obra").innerText = extras.anyo;
            const imgEl = document.getElementById("imagen-obra");
            imgEl.src = extras.imagen;
            imgEl.style.display = "block";
            document.getElementById("placeholder-obra").style.display = "none";
        } else {
            document.getElementById("anyo-obra").innerText = "Desconocido";
            document.getElementById("placeholder-obra").innerHTML = "<span>Imagen no disponible</span>";
        }
    })
    .catch(function(error){
        console.log("Error al cargar detalles:", error)
    })
}

cargarDetallesObra()