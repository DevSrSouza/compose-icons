package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) {
            return _musicNotes!!
        }
        _musicNotes = Builder(name = "MusicNotes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(180.0f, 172.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(52.0f, 204.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.9f, 25.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.8f, -1.5f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 64.0f)
                verticalLineTo(174.1f)
                arcTo(35.3f, 35.3f, 0.0f, false, false, 52.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                verticalLineTo(118.2f)
                lineToRelative(112.0f, -28.0f)
                verticalLineToRelative(51.9f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, false, -20.0f, -6.1f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                verticalLineTo(32.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 212.9f, 25.7f)
                close()
                moveTo(52.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 224.0f)
                close()
                moveTo(88.0f, 101.8f)
                verticalLineTo(70.2f)
                lineToRelative(112.0f, -28.0f)
                verticalLineTo(73.8f)
                close()
                moveTo(180.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 180.0f, 192.0f)
                close()
            }
        }
        .build()
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
