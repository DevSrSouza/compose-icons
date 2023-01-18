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

public val LightGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 55.9f, 55.9f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, 144.2f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 128.0f, 230.0f)
                horizontalLineToRelative(0.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 230.0f, 128.0f)
                close()
                moveTo(208.0f, 169.3f)
                lineTo(151.8f, 159.1f)
                lineTo(209.9f, 90.7f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, -1.9f, 78.6f)
                close()
                moveTo(108.3f, 151.1f)
                lineTo(98.1f, 122.5f)
                lineToRelative(19.7f, -23.1f)
                lineToRelative(29.9f, 5.5f)
                lineToRelative(10.2f, 28.6f)
                lineToRelative(-19.7f, 23.1f)
                close()
                moveTo(203.8f, 79.4f)
                lineTo(166.8f, 122.9f)
                lineTo(136.7f, 38.4f)
                arcToRelative(89.1f, 89.1f, 0.0f, false, true, 54.9f, 26.0f)
                arcTo(87.1f, 87.1f, 0.0f, false, true, 203.8f, 79.4f)
                close()
                moveTo(64.4f, 64.4f)
                arcToRelative(89.1f, 89.1f, 0.0f, false, true, 59.4f, -26.3f)
                lineTo(143.0f, 91.8f)
                lineTo(54.8f, 75.7f)
                arcTo(78.7f, 78.7f, 0.0f, false, true, 64.4f, 64.4f)
                close()
                moveTo(48.0f, 86.7f)
                lineToRelative(56.2f, 10.2f)
                lineTo(46.1f, 165.3f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 48.0f, 86.7f)
                close()
                moveTo(52.2f, 176.6f)
                lineTo(89.2f, 133.1f)
                lineTo(119.3f, 217.6f)
                arcToRelative(89.1f, 89.1f, 0.0f, false, true, -54.9f, -26.0f)
                arcTo(87.1f, 87.1f, 0.0f, false, true, 52.2f, 176.6f)
                close()
                moveTo(132.2f, 217.9f)
                lineTo(113.0f, 164.2f)
                lineToRelative(26.5f, 4.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(61.7f, 11.3f)
                arcToRelative(78.7f, 78.7f, 0.0f, false, true, -9.6f, 11.3f)
                arcTo(89.1f, 89.1f, 0.0f, false, true, 132.2f, 217.9f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
