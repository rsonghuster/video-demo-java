prepare:
	cp ffmpeg ./functions/split/ffmpeg

deploy:
	fun build && fun deploy -y