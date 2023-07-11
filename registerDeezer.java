AudioPlayerManager playerManager = new DefaultAudioPlayerManager();

// create a new DeezerSourceManager with the master decryption key and register it
playerManager.registerSourceManager(new DeezerSourceManager("...");