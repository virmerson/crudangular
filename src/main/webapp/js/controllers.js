/**
 * Created by Virmerson on 14/09/15.
 */
'use strict';

var appControllers =  angular.module('appControllers', []);

//Um controller dela
appControllers.controller('ClienteCtrl', function ($scope, $http){

  /*   $scope.clientes = [ {'nome':'Jão', 'email': 'jao@gmail.com'} ,
                        {'nome': 'Maria', 'email':'maria@gmail.com' } ,
                        {'nome': 'Zé', 'email': 'ze@gmail.com'}]; */

    $scope.clientes = {};
    $http.get("ws/cliente/lista").success( function (dados){
         $scope.clientes = dados;
    });

} );





