# {{name}}

Clojure and AngularJS in perfect harmony.


# Dependencies

To get started:

- ensure you have nodejs and npm installed
- ensure you have ruby and the ```sass``` rubygem installed: ```gem install sass```
- install grunt: ```npm install -g grunt-cli``` (may require sudo)
- run ```npm install``` to install the required node packages
- run ```bower install``` to install front-end libraries
- run ```grunt server``` to fire up the development server, with coffeescript compilation and live-reloading.


# Testing

To install the dependences required for angular protractor tests, run: ```./node_modules/protractor/bin/webdriver-manager update```

Run the full test suite with : ```grunt test:all```

Run only the frontend tests with: ```grunt test:e2e```

And only the backend api tests with: ```grunt test:ring```