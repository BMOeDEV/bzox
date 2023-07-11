AudioPlayerManager playerManager = new DefaultAudioPlayerManager();

// create a new YandexMusicSourceManager with the access token and register it
playerManager.registerSourceManager(new YandexMusicSourceManager("...");