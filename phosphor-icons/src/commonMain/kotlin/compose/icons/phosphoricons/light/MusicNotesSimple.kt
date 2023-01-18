package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) {
            return _musicNotesSimple!!
        }
        _musicNotesSimple = Builder(name = "MusicNotesSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.7f, 27.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -5.2f, -1.1f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 74.0f, 64.0f)
                lineTo(74.0f, 178.1f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 86.0f, 204.0f)
                lineTo(86.0f, 68.7f)
                lineToRelative(116.0f, -29.0f)
                lineTo(202.0f, 146.1f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 214.0f, 172.0f)
                lineTo(214.0f, 32.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 211.7f, 27.3f)
                close()
                moveTo(52.0f, 226.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 52.0f, 226.0f)
                close()
                moveTo(180.0f, 194.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 180.0f, 194.0f)
                close()
            }
        }
        .build()
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
