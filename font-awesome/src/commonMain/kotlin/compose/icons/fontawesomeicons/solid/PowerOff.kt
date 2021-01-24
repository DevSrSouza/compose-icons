package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PowerOff: ImageVector
    get() {
        if (_powerOff != null) {
            return _powerOff!!
        }
        _powerOff = Builder(name = "PowerOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 54.1f)
                curveToRelative(63.0f, 45.0f, 104.0f, 118.6f, 104.0f, 201.9f)
                curveToRelative(0.0f, 136.8f, -110.8f, 247.7f, -247.5f, 248.0f)
                curveTo(120.0f, 504.3f, 8.2f, 393.0f, 8.0f, 256.4f)
                curveTo(7.9f, 173.1f, 48.9f, 99.3f, 111.8f, 54.2f)
                curveToRelative(11.7f, -8.3f, 28.0f, -4.8f, 35.0f, 7.7f)
                lineTo(162.6f, 90.0f)
                curveToRelative(5.9f, 10.5f, 3.1f, 23.8f, -6.6f, 31.0f)
                curveToRelative(-41.5f, 30.8f, -68.0f, 79.6f, -68.0f, 134.9f)
                curveToRelative(-0.1f, 92.3f, 74.5f, 168.1f, 168.0f, 168.1f)
                curveToRelative(91.6f, 0.0f, 168.6f, -74.2f, 168.0f, -169.1f)
                curveToRelative(-0.3f, -51.8f, -24.7f, -101.8f, -68.1f, -134.0f)
                curveToRelative(-9.7f, -7.2f, -12.4f, -20.5f, -6.5f, -30.9f)
                lineToRelative(15.8f, -28.1f)
                curveToRelative(7.0f, -12.4f, 23.2f, -16.1f, 34.8f, -7.8f)
                close()
                moveTo(296.0f, 264.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
