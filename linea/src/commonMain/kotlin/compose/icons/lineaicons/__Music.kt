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
import kotlin.String
import kotlin.collections.List as ____KtList
import kotlin.collections.Map as ____KtMap

public object MusicGroup

public val LineaIcons.Music: MusicGroup
  get() = MusicGroup

public val MusicGroup.groupName: String
  get() = "music"

private var __AllIcons: ____KtList<ImageVector>? = null

public val MusicGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(BeginningButton, Bell, Cd, Diapason, EjectButton, EndButton,
        FastforwardButton, Headphones, Ipod, Loudspeaker, Microphone, MicrophoneOld, Mixer, Mute,
        NoteMultiple, NoteSingle, PauseButton, PlayButton, Playlist, RadioGhettoblaster,
        RadioPortable, Record, Recordplayer, RepeatButton, RewindButton, ShuffleButton, StopButton,
        Tape, VolumeDown, VolumeUp)
    return __AllIcons!!
  }

private var __AllIconsNamed: ____KtMap<String, ImageVector>? = null

public val MusicGroup.AllIconsNamed: ____KtMap<String, ImageVector>
  get() {
    if (__AllIconsNamed != null) {
      return __AllIconsNamed!!
    }
    __AllIconsNamed= mapOf("beginningbutton" to BeginningButton, "bell" to Bell, "cd" to Cd,
        "diapason" to Diapason, "ejectbutton" to EjectButton, "endbutton" to EndButton,
        "fastforwardbutton" to FastforwardButton, "headphones" to Headphones, "ipod" to Ipod,
        "loudspeaker" to Loudspeaker, "microphone" to Microphone, "microphoneold" to MicrophoneOld,
        "mixer" to Mixer, "mute" to Mute, "notemultiple" to NoteMultiple, "notesingle" to
        NoteSingle, "pausebutton" to PauseButton, "playbutton" to PlayButton, "playlist" to
        Playlist, "radioghettoblaster" to RadioGhettoblaster, "radioportable" to RadioPortable,
        "record" to Record, "recordplayer" to Recordplayer, "repeatbutton" to RepeatButton,
        "rewindbutton" to RewindButton, "shufflebutton" to ShuffleButton, "stopbutton" to
        StopButton, "tape" to Tape, "volumedown" to VolumeDown, "volumeup" to VolumeUp)
    return __AllIconsNamed!!
  }
