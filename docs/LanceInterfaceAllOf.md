

# LanceInterfaceAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerType** | [**ContainerTypeEnum**](#ContainerTypeEnum) | The container type that lance should use. Can be DOCKER to force a docker deployment, NATIVE to force a plain container deployment or BOTH to let the system derive the container type.  |  [optional]
**operatingSystem** | [**OperatingSystem**](OperatingSystem.md) |  |  [optional]
**init** | **String** | Initialization action.  |  [optional]
**preInstall** | **String** | Executed before installation action. Can be e.g. used for downloading binaries.  |  [optional]
**install** | **String** | Used for installing the application.  |  [optional]
**postInstall** | **String** | Used for configuration of the application component. First action where Lance environment variables are set.  |  [optional]
**preStart** | **String** | Called before starting the application. Can be e.g. used for configuration an environment.  |  [optional]
**start** | **String** | Starts the component. Needs to return for PlainContainer and not return for Docker.  |  [optional]
**startDetection** | **String** | Detects the start of the application. Required if the application does not start instantianous.  |  [optional]
**stopDetection** | **String** | Checks if the application has stopped. Is periodically checked to detect a crash of the application.  |  [optional]
**postStart** | **String** | Executed after the application has successfully started.  |  [optional]
**preStop** | **String** | Called before the application is stopped.  |  [optional]
**stop** | **String** | Stops the application.  |  [optional]
**postStop** | **String** | Executed after the application is successfully stopped.  |  [optional]
**shutdown** | **String** | Executed before the container is shutdown. Can be used to backup state.  |  [optional]
**updateAction** | **String** | A script that is executed if a new instance of a downstream task is available.  |  [optional]



## Enum: ContainerTypeEnum

Name | Value
---- | -----
NATIVE | &quot;NATIVE&quot;
DOCKER | &quot;DOCKER&quot;
BOTH | &quot;BOTH&quot;



