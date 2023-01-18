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

public val DuotoneGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(219.5f, 121.0f)
                lineTo(50.6f, 26.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.4f, 9.7f)
                lineTo(71.0f, 125.3f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, 0.0f, 5.4f)
                lineTo(39.2f, 219.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.4f, 9.7f)
                lineTo(219.5f, 135.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 219.5f, 121.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.4f, 114.0f)
                lineTo(54.5f, 19.4f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 31.6f, 38.8f)
                lineTo(63.5f, 128.0f)
                lineTo(31.6f, 217.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 15.1f, 21.4f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 7.8f, -2.0f)
                lineTo(223.4f, 142.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -28.0f)
                close()
                moveTo(46.7f, 222.6f)
                lineTo(77.6f, 136.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(77.6f)
                lineTo(46.7f, 33.4f)
                lineTo(215.6f, 128.0f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
