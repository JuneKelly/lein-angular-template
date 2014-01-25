'use strict'

angular.module('{{sanitized}}App')
  .controller 'MainCtrl', ($scope, $http) ->
    $scope.niceThings = []

    loadNiceThings = () ->
      $http(
        method: 'GET'
        url: '/api/nicethings'
        headers: { 'Accept': 'application/json'}
      )
        .success (data) ->
          $scope.niceThings = data.things

    loadNiceThings()
