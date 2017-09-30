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
