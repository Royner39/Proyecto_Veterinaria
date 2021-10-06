function eliminar(id){
    swal({
        title: "Está seguro que desea eliminar?",
        text: "Una vez eliminado, no podrá recuperar la información relacionada!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax(
                    {url:"/eliminar/"+id,
                    success: function (res){
                    console.log(res);
                    }});
                swal("Poof! Se ha eliminado correctamente!", {
                    icon: "success",
                }).then((OK)=>{
                    location.href="/listar";
                });
            } else {
                swal("No se ha eliminado!");
            }
        });
}