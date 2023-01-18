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

public val BoldGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.6f, 41.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -16.8f, -16.8f)
                curveToRelative(-11.9f, -1.7f, -42.8f, -2.6f, -72.7f, 27.2f)
                lineToRelative(-7.8f, 7.8f)
                lineTo(74.7f, 59.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -14.1f, 5.9f)
                lineTo(28.3f, 97.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.2f, 33.8f)
                lineToRelative(38.3f, 7.7f)
                lineToRelative(40.1f, 40.1f)
                lineToRelative(7.7f, 38.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 13.8f, 15.2f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, false, 5.8f, 0.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 14.2f, -5.9f)
                lineToRelative(32.3f, -32.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 5.9f, -14.1f)
                lineTo(196.6f, 121.7f)
                lineToRelative(7.8f, -7.8f)
                curveTo(234.2f, 84.0f, 233.3f, 53.1f, 231.6f, 41.2f)
                close()
                moveTo(76.4f, 83.4f)
                horizontalLineToRelative(33.9f)
                lineTo(78.8f, 115.0f)
                lineToRelative(-28.3f, -5.7f)
                close()
                moveTo(159.1f, 68.6f)
                curveToRelative(19.8f, -19.8f, 39.3f, -21.5f, 49.1f, -20.8f)
                curveToRelative(0.7f, 9.8f, -1.0f, 29.3f, -20.8f, 49.1f)
                lineTo(128.0f, 156.3f)
                lineTo(99.7f, 128.0f)
                close()
                moveTo(172.6f, 179.6f)
                lineTo(146.7f, 205.5f)
                lineTo(141.0f, 177.2f)
                lineToRelative(31.6f, -31.5f)
                close()
                moveTo(101.0f, 198.4f)
                curveToRelative(-18.4f, 31.7f, -61.7f, 32.1f, -63.5f, 32.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                curveToRelative(0.0f, -1.8f, 0.4f, -45.1f, 32.1f, -63.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 20.8f)
                curveToRelative(-11.0f, 6.4f, -16.0f, 19.0f, -18.2f, 28.9f)
                curveToRelative(9.8f, -2.3f, 22.4f, -7.3f, 28.8f, -18.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.8f, 12.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
