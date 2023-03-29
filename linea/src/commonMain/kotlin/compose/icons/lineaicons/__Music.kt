package compose.icons.lineaicons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.LineaIcons
import compose.icons.lineaicons.music.BeginningButton
import compose.icons.lineaicons.music.Bell
import compose.icons.lineaicons.music.Cd
import compose.icons.lineaicons.music.Diapason
import compose.icons.lineaicons.music.EjectButton
import compose.icons.lineaicons.music.EndButton
import compose.icons.lineaicons.music.FastforwardButton
import compose.icons.lineaicons.music.Headphones
import compose.icons.lineaicons.music.Ipod
import compose.icons.lineaicons.music.Loudspeaker
import compose.icons.lineaicons.music.Microphone
import compose.icons.lineaicons.music.MicrophoneOld
import compose.icons.lineaicons.music.Mixer
import compose.icons.lineaicons.music.Mute
import compose.icons.lineaicons.music.NoteMultiple
import compose.icons.lineaicons.music.NoteSingle
import compose.icons.lineaicons.music.PauseButton
import compose.icons.lineaicons.music.PlayButton
import compose.icons.lineaicons.music.Playlist
import compose.icons.lineaicons.music.RadioGhettoblaster
import compose.icons.lineaicons.music.RadioPortable
import compose.icons.lineaicons.music.Record
import compose.icons.lineaicons.music.Recordplayer
import compose.icons.lineaicons.music.RepeatButton
import compose.icons.lineaicons.music.RewindButton
import compose.icons.lineaicons.music.ShuffleButton
import compose.icons.lineaicons.music.StopButton
import compose.icons.lineaicons.music.Tape
import compose.icons.lineaicons.music.VolumeDown
import compose.icons.lineaicons.music.VolumeUp
import kotlin.collections.List as ____KtList

public object MusicGroup

public val LineaIcons.Music: MusicGroup
  get() = MusicGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MusicGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Mixer, Bell, Ipod, Microphone, PlayButton, Diapason, Playlist, VolumeDown,
        PauseButton, BeginningButton, Cd, RepeatButton, RadioGhettoblaster, Record, Headphones,
        StopButton, Tape, NoteSingle, MicrophoneOld, Recordplayer, VolumeUp, Loudspeaker,
        NoteMultiple, EjectButton, RewindButton, FastforwardButton, ShuffleButton, Mute,
        RadioPortable, EndButton)
    return __AllIcons!!
  }
