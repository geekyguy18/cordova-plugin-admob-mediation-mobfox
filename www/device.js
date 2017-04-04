var exec = require('cordova/exec');

exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "cordova-plugin-admob-mediation-mobfox", "coolMethod", [arg0]);
};
