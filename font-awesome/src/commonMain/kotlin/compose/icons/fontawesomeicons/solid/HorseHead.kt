package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = Builder(name = "HorseHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(509.8f, 332.5f)
                lineToRelative(-69.9f, -164.3f)
                curveToRelative(-14.9f, -41.2f, -50.4f, -71.0f, -93.0f, -79.2f)
                curveToRelative(18.0f, -10.6f, 46.3f, -35.9f, 34.2f, -82.3f)
                curveToRelative(-1.3f, -5.0f, -7.1f, -7.9f, -12.0f, -6.1f)
                lineTo(166.9f, 76.3f)
                curveTo(35.9f, 123.4f, 0.0f, 238.9f, 0.0f, 398.8f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(236.2f)
                curveToRelative(23.8f, 0.0f, 39.3f, -25.0f, 28.6f, -46.3f)
                lineTo(256.0f, 384.0f)
                verticalLineToRelative(-0.7f)
                curveToRelative(-45.6f, -3.5f, -84.6f, -30.7f, -104.3f, -69.6f)
                curveToRelative(-1.6f, -3.1f, -0.9f, -6.9f, 1.6f, -9.3f)
                lineToRelative(12.1f, -12.1f)
                curveToRelative(3.9f, -3.9f, 10.6f, -2.7f, 12.9f, 2.4f)
                curveToRelative(14.8f, 33.7f, 48.2f, 57.4f, 87.4f, 57.4f)
                curveToRelative(17.2f, 0.0f, 33.0f, -5.1f, 46.8f, -13.2f)
                lineToRelative(46.0f, 63.9f)
                curveToRelative(6.0f, 8.4f, 15.7f, 13.3f, 26.0f, 13.3f)
                horizontalLineToRelative(50.3f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineToRelative(45.3f, -39.8f)
                curveToRelative(8.9f, -9.1f, 11.7f, -22.6f, 7.1f, -34.4f)
                close()
                moveTo(328.0f, 224.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
