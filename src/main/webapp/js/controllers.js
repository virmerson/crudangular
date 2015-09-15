/**
 * Created by Virmerson on 14/09/15.
 */

    //Aplicacao
var appCrudAngular =  angular.module('appCrudAngular', []);

//Um controller dela
appCrudAngular.controller('ClienteCtrl', function ($scope){

    $scope.clientes = [ {'nome':'Jão', 'email': 'jao@gmail.com'} ,
                        {'nome': 'Maria', 'email':'maria@gmail.com' } ,
                        {'nome': 'Zé', 'email': 'ze@gmail.com'}];

} );