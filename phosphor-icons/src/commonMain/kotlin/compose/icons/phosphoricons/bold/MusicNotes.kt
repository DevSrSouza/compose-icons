package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) {
            return _musicNotes!!
        }
        _musicNotes = Builder(name = "MusicNotes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.4f, 22.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -10.3f, -2.1f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 68.0f, 64.0f)
                verticalLineTo(167.4f)
                arcTo(38.9f, 38.9f, 0.0f, false, false, 52.0f, 164.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                verticalLineTo(121.4f)
                lineToRelative(104.0f, -26.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(38.9f, 38.9f, 0.0f, false, false, -16.0f, -3.4f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                verticalLineTo(32.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 215.4f, 22.5f)
                close()
                moveTo(52.0f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 52.0f, 220.0f)
                close()
                moveTo(92.0f, 96.6f)
                verticalLineTo(73.4f)
                lineToRelative(104.0f, -26.0f)
                verticalLineTo(70.6f)
                close()
                moveTo(180.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 188.0f)
                close()
            }
        }
        .build()
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
