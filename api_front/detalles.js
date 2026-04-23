function cargarDetallesObra() {
    const parametrosURL = new URLSearchParams(window.location.search)
    const idObra = parametrosURL.get("obraId")

    console.log("Buscando obra con ID:", idObra)

    fetch("http://localhost:4050/obras/" + idObra)
        .then(function (respuestaTextoPlano) {
            console.log("Response:", respuestaTextoPlano)
            return respuestaTextoPlano.json()
        })
        .then(function (datosJSON) {
            console.log("Datos completos:", datosJSON)
            console.log("Nombre:", datosJSON.nombre)
            console.log("Descripcion:", datosJSON.descripcion)
            console.log("Sala:", datosJSON.sala)

            document.getElementById("nombre-obra").innerText = datosJSON.nombre || "Sin nombre"
            document.getElementById("descripcion-obra").innerText = datosJSON.descripcion || "Sin descripción"
            document.getElementById("sala-obra").innerText = (datosJSON.sala && datosJSON.sala.nombre) ? datosJSON.sala.nombre : "Sin sala"

            // Auor
            if (datosJSON.usuario && datosJSON.usuario.nombre) {
                document.getElementById("autor-obra").innerText = datosJSON.usuario.nombre + " " + (datosJSON.usuario.apellido1 || "")
            } else {
                document.getElementById("autor-obra").innerText = "Actor desconocido"
            }
        })
        .catch(function (error) {
            console.log("Error al cargar detalles:", error)
            alert("Error: " + error)
        })
}

cargarDetallesObra()