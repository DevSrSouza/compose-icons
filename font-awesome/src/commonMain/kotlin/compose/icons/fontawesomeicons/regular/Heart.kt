package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.8f, 468.2f)
                lineToRelative(-2.5f, -2.3f)
                lineTo(48.1f, 303.2f)
                curveTo(17.4f, 274.7f, 0.0f, 234.7f, 0.0f, 192.8f)
                verticalLineToRelative(-3.3f)
                curveToRelative(0.0f, -70.4f, 50.0f, -130.8f, 119.2f, -144.0f)
                curveTo(158.6f, 37.9f, 198.9f, 47.0f, 231.0f, 69.6f)
                curveToRelative(9.0f, 6.4f, 17.4f, 13.8f, 25.0f, 22.3f)
                curveToRelative(4.2f, -4.8f, 8.7f, -9.2f, 13.5f, -13.3f)
                curveToRelative(3.7f, -3.2f, 7.5f, -6.2f, 11.5f, -9.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveTo(313.1f, 47.0f, 353.4f, 37.9f, 392.8f, 45.4f)
                curveTo(462.0f, 58.6f, 512.0f, 119.1f, 512.0f, 189.5f)
                verticalLineToRelative(3.3f)
                curveToRelative(0.0f, 41.9f, -17.4f, 81.9f, -48.1f, 110.4f)
                lineTo(288.7f, 465.9f)
                lineToRelative(-2.5f, 2.3f)
                curveToRelative(-8.2f, 7.6f, -19.0f, 11.9f, -30.2f, 11.9f)
                reflectiveCurveToRelative(-22.0f, -4.2f, -30.2f, -11.9f)
                close()
                moveTo(239.1f, 145.0f)
                curveToRelative(-0.4f, -0.3f, -0.7f, -0.7f, -1.0f, -1.1f)
                lineToRelative(-17.8f, -20.0f)
                curveToRelative(0.0f, 0.0f, -0.1f, -0.1f, -0.1f, -0.1f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-23.1f, -25.9f, -58.0f, -37.7f, -92.0f, -31.2f)
                curveTo(81.6f, 101.5f, 48.0f, 142.1f, 48.0f, 189.5f)
                verticalLineToRelative(3.3f)
                curveToRelative(0.0f, 28.5f, 11.9f, 55.8f, 32.8f, 75.2f)
                lineTo(256.0f, 430.7f)
                lineTo(431.2f, 268.0f)
                curveToRelative(20.9f, -19.4f, 32.8f, -46.7f, 32.8f, -75.2f)
                verticalLineToRelative(-3.3f)
                curveToRelative(0.0f, -47.3f, -33.6f, -88.0f, -80.1f, -96.9f)
                curveToRelative(-34.0f, -6.5f, -69.0f, 5.4f, -92.0f, 31.2f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.1f)
                reflectiveCurveToRelative(0.0f, 0.0f, -0.1f, 0.1f)
                lineToRelative(-17.8f, 20.0f)
                curveToRelative(-0.3f, 0.4f, -0.7f, 0.7f, -1.0f, 1.1f)
                curveToRelative(-4.5f, 4.5f, -10.6f, 7.0f, -16.9f, 7.0f)
                reflectiveCurveToRelative(-12.4f, -2.5f, -16.9f, -7.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
