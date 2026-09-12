public static void main(String[] args) {
    maquinacafe maquina = new maquinacafe(100, 400);

    maquina.consultar();
    maquina.prepararcafe();
    maquina.consultar();
    maquina.reabastecerpo(50);
    maquina.consultar();
}