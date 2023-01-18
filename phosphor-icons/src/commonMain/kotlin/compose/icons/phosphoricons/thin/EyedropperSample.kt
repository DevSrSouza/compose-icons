package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) {
            return _eyedropperSample!!
        }
        _eyedropperSample = Builder(name = "EyedropperSample", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 67.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -10.0f, -22.9f)
                curveToRelative(-12.5f, -11.7f, -32.7f, -11.3f, -45.0f, 1.1f)
                lineTo(140.2f, 70.5f)
                lineToRelative(-2.1f, -2.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineToRelative(-7.1f, 7.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(4.9f, 4.9f)
                lineTo(54.5f, 150.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -9.6f, 33.4f)
                lineTo(34.6f, 207.5f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, 2.0f, 10.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 4.8f, -1.0f)
                lineToRelative(22.2f, -9.7f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 33.4f, -9.6f)
                lineToRelative(53.1f, -53.2f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(7.0f, -7.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, -28.2f)
                lineToRelative(-2.0f, -2.1f)
                lineToRelative(25.1f, -25.2f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 220.0f, 67.6f)
                close()
                moveTo(99.8f, 195.8f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, -27.1f, 7.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.6f, 0.1f)
                lineTo(46.7f, 213.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.4f, -0.9f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.4f, -1.9f)
                lineToRelative(10.9f, -24.8f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 0.2f, -2.6f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 54.7f, 164.0f)
                horizontalLineToRelative(76.9f)
                close()
                moveTo(139.6f, 156.0f)
                horizontalLineTo(60.4f)
                lineToRelative(53.0f, -53.0f)
                lineTo(153.0f, 142.6f)
                close()
                moveTo(177.0f, 113.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-7.1f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(108.5f, 86.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(7.0f, -7.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(27.6f, -27.6f)
                curveToRelative(9.3f, -9.3f, 24.5f, -9.7f, 33.9f, -0.8f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 205.0f, 85.0f)
                close()
            }
        }
        .build()
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
