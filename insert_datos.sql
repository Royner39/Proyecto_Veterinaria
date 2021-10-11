use veterinaria;

insert into veterinario (cedula,nombre,apellidos,direccion,telefono,numero_colegiado,horario_atencion)values (124587,"Juan","Vargas","Liberia","89562332",1205,"Martes y Jueves");
insert into veterinario  (cedula,nombre,apellidos,direccion,telefono,numero_colegiado,horario_atencion) values(142578,"Beti","Vega","Turrialba","85697412",4125,"Viernes");
insert into veterinario  (cedula,nombre,apellidos,direccion,telefono,numero_colegiado,horario_atencion)values(365289,"Lucas","Villa","Heredia","95623714",5896,"Lunes");
insert into veterinario  (cedula,nombre,apellidos,direccion,telefono,numero_colegiado,horario_atencion)values(748596,"Jorge","Velez","Osa","15263478",8745,"Miercoles");

insert into cliente (cedula,nombre,apellidos,direccion,telefono)values(475896,"Pablo","Bonilla","Alajuela","12458631");
insert into cliente (cedula,nombre,apellidos,direccion,telefono)values(856915,"Antonio","Araya","Heredia","54123687");
insert into cliente (cedula,nombre,apellidos,direccion,telefono)values(958476,"Lorena","Valle","San Carlos","8569742");
insert into cliente (cedula,nombre,apellidos,direccion,telefono)values(856471,"Gustavo","Torres","Cartago","52847691");

insert into especialidad values (12,"Cardiologia");
insert into especialidad values (32,"Oftalmolgia");
insert into especialidad values (80,"Cirugia");
insert into especialidad values (45,"Radiologia");

insert into especialidad_veterinario(id_especialidad,cedula_veterinario) values (12,124587);
insert into especialidad_veterinario(id_especialidad,cedula_veterinario) values (32,124587);
insert into especialidad_veterinario (id_especialidad,cedula_veterinario)values (12,365289);

insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (8,"perro","pirulo",'2020-1-15');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (7,"perro","patas",'2014-07-02');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (6,"perro","pancho",'2005-07-12');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (5,"gato","Misingo",'2017-09-29');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (4,"gato","natasha",'2020-3-3');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (3,"gato","renata",'2015-6-22');
insert into mascota(id_mascota,tipo_mascota, nombre_mascota, fecha_nacimiento) values (2,"perico","polito",'2021-1-13');

insert into cliente_mascota(cedula_cliente, id_mascota) values(475896,8);
insert into cliente_mascota(cedula_cliente, id_mascota) values(475896,6);
insert into cliente_mascota(cedula_cliente, id_mascota) values(958476,7);
insert into cliente_mascota(cedula_cliente, id_mascota) values(856915,5);
insert into cliente_mascota(cedula_cliente, id_mascota) values(856471,4);
insert into cliente_mascota(cedula_cliente, id_mascota) values(856471,3);
insert into cliente_mascota(cedula_cliente, id_mascota) values(856915,2);


insert into servicios_hospital values (1245,"castración macho menor 15k",15000);
insert into servicios_hospital values (1236,"castración macho mayor 15k",19500);
insert into servicios_hospital values (9658,"castración hembra menor 15k",20000);
insert into servicios_hospital values (8547,"castración hembra mayor 15k",22000);
insert into servicios_hospital values (7854,"extracción de tumor",19000);
insert into servicios_hospital values (7344,"Cirugía de emergencia",25000);


insert into medicamentos_hospital(id_medicamento,nombre_medicamento,cantidad_medicamento_inventario,costo_medicamento) values (4582,"Baytril 50mg", 45, 250);
insert into medicamentos_hospital (id_medicamento,nombre_medicamento,cantidad_medicamento_inventario,costo_medicamento)values (7496,"Ibermectina", 3, 25000);
insert into medicamentos_hospital (id_medicamento,nombre_medicamento,cantidad_medicamento_inventario,costo_medicamento)values (5674,"Baicox", 60, 450);
insert into medicamentos_hospital (id_medicamento,nombre_medicamento,cantidad_medicamento_inventario,costo_medicamento)values (2396,"relay C", 25, 600);
insert into medicamentos_hospital (id_medicamento,nombre_medicamento,cantidad_medicamento_inventario,costo_medicamento)values (2196,"Carprodil", 90, 270);

insert into producto_tienda (id_producto,nombre_producto,descripcion,cantidad_inventario,precio_producto)values (5286,"Balance Adulto RG","Alimento-Saco",10,15000);
insert into producto_tienda (id_producto,nombre_producto,descripcion,cantidad_inventario,precio_producto)values (8964,"Nutri Cachorro RP","Alimento-Bolsa 2.5K",7,5000);
insert into producto_tienda (id_producto,nombre_producto,descripcion,cantidad_inventario,precio_producto)values (7581,"Comedero EcoPlus","comedero-aluminio- diametro 15cm",4,4000);
insert into producto_tienda (id_producto,nombre_producto,descripcion,cantidad_inventario,precio_producto)values (6859,"arena FelixMint","Arena para gato olor menta",9,1500);

insert into expediente values(68);
insert into expediente values(67);
insert into expediente values(66);
insert into expediente values(65);
insert into expediente values(64);
insert into expediente values(63);
insert into expediente values(62);

insert into tratamiento(id_tratamiento,fecha,descripcion) values(5826,'2020-8-15', "Retiro de espinas de erizo en cabeza y manos");
insert into tratamiento (id_tratamiento,fecha,descripcion) values(5693,'2020-8-10', "Obstrucción urinaria");
insert into tratamiento (id_tratamiento,fecha,descripcion) values(8723,'2020-9-5', "Envenenado por morder un sapo");
insert into tratamiento(id_tratamiento,fecha,descripcion)  values(9145,'2020-12-3', "Caída desde un segundo piso");

insert into tratamiento_medicamento values (9145,5674);
insert into tratamiento_medicamento values (9145,2396);
insert into tratamiento_medicamento values (8723,4582);
insert into tratamiento_medicamento values (5693,7496);

insert into tratamiento_veterinario(id_tratamiento,cedula_veterinario) values (5826,124587);
insert into tratamiento_veterinario (id_tratamiento,cedula_veterinario)values (5693,142578);
insert into tratamiento_veterinario (id_tratamiento,cedula_veterinario)values (8723,365289);
insert into tratamiento_veterinario (id_tratamiento,cedula_veterinario)values (9145,748596);

insert into tratamiento_expediente (id_tratamiento,id_expediente)values (5826,66);
insert into tratamiento_expediente (id_tratamiento,id_expediente)values (5693,64);
insert into tratamiento_expediente (id_tratamiento,id_expediente)values (8723,68);
insert into tratamiento_expediente (id_tratamiento,id_expediente)values (9145,63);


insert into medicamento_vendido values (1,12,7200);
insert into medicamento_vendido values (4,16,7200);
insert into medicamento_vendido values (3,8,4800);
insert into medicamento_vendido values (2,1,25000);


insert into medicamento_vendido_medicamento(id_medicamento,id_medicamento_vendido) values (4582,3);
insert into medicamento_vendido_medicamento (id_medicamento,id_medicamento_vendido)values (5674,4);
insert into medicamento_vendido_medicamento(id_medicamento,id_medicamento_vendido) values (2396,1);
insert into medicamento_vendido_medicamento (id_medicamento,id_medicamento_vendido)values (7496,2);


insert into producto_vendido values (1,2,8000);
insert into producto_vendido values (2,1,4000);
insert into producto_vendido values (3,4,6000);
insert into producto_vendido values (4,1,5000);

insert into producto_vendido_producto (id_producto,id_producto_vendido)values(7581,1);
insert into producto_vendido_producto (id_producto,id_producto_vendido)values(7581,2);
insert into producto_vendido_producto (id_producto,id_producto_vendido)values(6859,3);
insert into producto_vendido_producto (id_producto,id_producto_vendido)values(8964,4);


insert into mascota_expediente values (8,68);
insert into mascota_expediente values (7,67);
insert into mascota_expediente values (6,66);
insert into mascota_expediente values (5,65);
insert into mascota_expediente values (4,64);
insert into mascota_expediente values (3,63);
insert into mascota_expediente values (2,62);


insert into factura_hospital values (1,'2020-8-15', 32200);
insert into factura_hospital values (2,'2020-12-3',50000);

insert into factura_tienda values (3,'2021-5-15',12000);
insert into factura_tienda values (4,'2021-9-10',11000);


insert into expediente_factura_tienda values (68,3);
insert into expediente_factura_tienda values (66,4);

insert into servicio_factura_hospital values (1,7344);
insert into servicio_factura_hospital values (2,1236);


insert into producto_vendido_factura(id_producto_vendido,id_factura_tienda) values (1,3);
insert into producto_vendido_factura (id_producto_vendido,id_factura_tienda)values (2,3);
insert into producto_vendido_factura(id_producto_vendido,id_factura_tienda) values (3,4);
insert into producto_vendido_factura (id_producto_vendido,id_factura_tienda)values (4,4);

insert into medicamento_vendido_factura values (1,1);
insert into medicamento_vendido_factura values (2,2);


insert into cliente_factura_tienda (cedula_cliente,id_factura_tienda)values(856471,3);
insert into cliente_factura_tienda (cedula_cliente,id_factura_tienda)values(856471,4);

insert into cliente_factura_hospital values(475896,1);
insert into cliente_factura_hospital values(856471,2);


select * from veterinario;
delete from veterinaria.veterinario where nombre = 'Royner';
