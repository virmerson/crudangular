/**
 * Created by Virmerson on 14/09/15.
 */
'use strict';

var appControllers = angular.module('appControllers', []);

//Um controller dela
appControllers.controller('ClienteCtrl', function ($scope, $http) {

    /*   $scope.clientes = [ {'nome':'Jão', 'email': 'jao@gmail.com'} ,
     {'nome': 'Maria', 'email':'maria@gmail.com' } ,
     {'nome': 'Zé', 'email': 'ze@gmail.com'}]; */

    $scope.clientes = {}; //Lista de clientes vinculadas a tela
    $scope.cliente = {}; // Objeto Cliente Vinculado a tela (Form)

    $scope.listar = function () {

        $http.get("ws/cliente/lista").success(function (dados) {
            $scope.clientes = dados;
        });
    };

    $scope.salvar = function (){
        $http.post("ws/cliente/salvar", $scope.cliente).success(function (dados){
            //$scope.clientes.push(dados);
            window.alert("Sucesso!");
            $scope.cliente= {};
            $scope.listar();
        });

    };

    $scope.excluir =  function (idP){
            $http.delete("ws/cliente/excluir/"+ idP,{}).success(function (){

            });

    };

    $scope.editar = function (cliente){
        $scope.cliente = cliente;
    }

    $scope.listar(); //carregando inicialmente


});





