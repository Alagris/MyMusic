This is the highest-level project. It uses, all other projects as it's dependencies.
Use:
git clone https://github.com/Alagris/BronyMusicBot.git
git clone https://github.com/Alagris/YoutubeScraperLib.git
git clone https://github.com/Alagris/JavaFX-Utils.git

Here is hierarchy of dependencies:
MyMusic (uses JavaFX)
	|
	L_ JavaFX-Utils (uses JavaFX)
	|
	L_ BronyMusicBot (uses MySQL and JSoup)
			|
			L_ YoutubeScraperLib (uses JSoup and requires youtube-dl)