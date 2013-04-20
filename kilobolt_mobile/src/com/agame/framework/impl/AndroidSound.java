package com.agame.framework.impl;

import android.media.SoundPool;

import com.agame.framework.Sound;

public class AndroidSound implements Sound {

	int soundId;
	SoundPool soundPool;
	
	public AndroidSound(int soundId, SoundPool soundPool) {
		super();
		this.soundId = soundId;
		this.soundPool = soundPool;
	}

	@Override
	public void play(float volume) {
		soundPool.play(	soundId, volume, volume, 0, 0, 1);
	}

	@Override
	public void dispose() {
		soundPool.unload(soundId);
	}

}
