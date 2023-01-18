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

public val LightGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 114.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -17.8f, 3.6f)
                lineTo(162.4f, 70.0f)
                lineTo(192.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(152.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, 3.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 6.0f)
                lineToRelative(13.4f, 23.0f)
                lineTo(98.1f, 90.0f)
                lineTo(81.2f, 61.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 76.0f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(72.6f, 70.0f)
                lineTo(87.5f, 95.6f)
                lineTo(70.0f, 119.6f)
                arcTo(45.2f, 45.2f, 0.0f, false, false, 48.0f, 114.0f)
                arcToRelative(46.1f, 46.1f, 0.0f, true, false, 31.7f, 12.7f)
                lineTo(94.1f, 107.0f)
                lineToRelative(32.7f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 3.0f, -0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, -8.2f)
                lineToRelative(-32.1f, -55.0f)
                horizontalLineToRelative(62.1f)
                lineToRelative(12.7f, 21.7f)
                arcTo(45.9f, 45.9f, 0.0f, true, false, 208.0f, 114.0f)
                close()
                moveTo(82.0f, 160.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, true, -19.1f, -30.6f)
                lineTo(43.2f, 156.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 1.3f, 8.3f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 48.0f, 166.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, -2.5f)
                lineToRelative(19.8f, -27.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 82.0f, 160.0f)
                close()
                moveTo(208.0f, 194.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -22.0f, -59.9f)
                lineTo(202.8f, 163.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 3.0f, -0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, -8.2f)
                lineToRelative(-16.9f, -28.9f)
                arcTo(32.8f, 32.8f, 0.0f, false, true, 208.0f, 126.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
