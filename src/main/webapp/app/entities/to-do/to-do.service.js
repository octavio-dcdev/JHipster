(function() {
    'use strict';
    angular
        .module('jHipsterApp')
        .factory('ToDo', ToDo);

    ToDo.$inject = ['$resource'];

    function ToDo ($resource) {
        var resourceUrl =  'api/to-dos/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
