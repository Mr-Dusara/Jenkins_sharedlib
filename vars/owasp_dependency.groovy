def call(){
  dependencyCheck additionalArguments: '''--scan ./
                                          --nvdApiDelay 6000 
                                          --nvdMaxRetryCount 15''', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
