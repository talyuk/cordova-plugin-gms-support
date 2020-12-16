# GMS Supports

Cordova plugin to check if Google Play Services are supported

## Using

In your cordova project folder:

    $ cordova plugin add cordova-plugin-gms-support


Then the variable 'GMSSupport' will be available after `deviceready` fires.

```js
	document.addEventListener('deviceready', function () {

		var success = function(response) {
			// response.status is a boolean value
			console.log(response.status);
		}

		var failure = function(error) {
			console.warn(error);
		}

		GMSSupport.getStatus(success, failure);
	})
```

