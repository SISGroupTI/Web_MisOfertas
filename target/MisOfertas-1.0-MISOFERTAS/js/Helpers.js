function separarArray(array, chunks){
    var aux = array.reduce((ar, it, i) => { 
      const ix = Math.floor(i/chunks); 

      if(!ar[ix]) {
        ar[ix] = [];
      }

      ar[ix].push(it);

      return ar;
    }, []);
    return aux;
}

function separarMiles(valor){
    return "$"+valor.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
}

function findGetParameter(parameterName) {
    var result = null,
        tmp = [];
    var items = location.search.substr(1).split("&");
    for (var index = 0; index < items.length; index++) {
        tmp = items[index].split("=");
        if (tmp[0] === parameterName) result = decodeURIComponent(tmp[1]);
    }
    return result;
}

function obtenerFecha(fecha){
    let dateFecha = new Date(fecha);
}