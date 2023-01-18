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

public val LightGroup.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.7f, 58.3f)
                lineToRelative(-80.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -5.3f, 0.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 40.0f)
                verticalLineTo(153.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 12.0f, 31.0f)
                verticalLineTo(96.1f)
                lineToRelative(72.3f, 21.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.3f, -0.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 214.0f, 112.0f)
                verticalLineTo(64.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 209.7f, 58.3f)
                close()
                moveTo(88.0f, 218.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 88.0f, 218.0f)
                close()
                moveTo(202.0f, 103.9f)
                lineTo(134.0f, 83.5f)
                verticalLineTo(48.1f)
                lineToRelative(68.0f, 20.4f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
