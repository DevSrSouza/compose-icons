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

public val DuotoneGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(211.4f, 127.4f)
                lineTo(184.0f, 72.0f)
                horizontalLineTo(72.0f)
                lineTo(44.6f, 127.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.7f, 8.3f)
                lineTo(128.0f, 248.0f)
                lineToRelative(82.7f, -112.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 211.4f, 127.4f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.6f, 123.9f)
                lineTo(192.0f, 70.1f)
                lineTo(192.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(80.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f)
                lineTo(64.0f, 70.1f)
                lineTo(37.4f, 123.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 1.5f, 16.6f)
                lineToRelative(82.7f, 112.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 12.8f, 0.0f)
                lineToRelative(82.7f, -112.2f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 218.6f, 123.9f)
                close()
                moveTo(176.0f, 32.0f)
                lineTo(176.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                lineTo(80.0f, 32.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(136.0f, 223.6f)
                lineTo(136.0f, 158.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(64.8f)
                lineTo(51.8f, 131.0f)
                lineTo(77.0f, 80.0f)
                lineTo(179.0f, 80.0f)
                lineToRelative(25.2f, 51.0f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
