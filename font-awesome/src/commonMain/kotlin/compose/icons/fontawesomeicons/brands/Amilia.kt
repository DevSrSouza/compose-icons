package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Amilia: ImageVector
    get() {
        if (_amilia != null) {
            return _amilia!!
        }
        _amilia = Builder(name = "Amilia", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.1f, 32.0f)
                curveToRelative(-61.9f, 0.0f, -131.5f, 16.9f, -184.2f, 55.4f)
                curveToRelative(-5.1f, 3.1f, -9.1f, 9.2f, -7.2f, 19.4f)
                curveToRelative(1.1f, 5.1f, 5.1f, 27.4f, 10.2f, 39.6f)
                curveToRelative(4.1f, 10.2f, 14.2f, 10.2f, 20.3f, 6.1f)
                curveToRelative(32.5f, -22.3f, 96.5f, -47.7f, 152.3f, -47.7f)
                curveToRelative(57.9f, 0.0f, 58.9f, 28.4f, 58.9f, 73.1f)
                verticalLineToRelative(38.5f)
                curveTo(203.0f, 227.7f, 78.2f, 251.0f, 46.7f, 264.2f)
                curveTo(11.2f, 280.5f, 16.3f, 357.7f, 16.3f, 376.0f)
                reflectiveCurveToRelative(15.2f, 104.0f, 124.9f, 104.0f)
                curveToRelative(47.8f, 0.0f, 113.7f, -20.7f, 153.3f, -42.1f)
                verticalLineToRelative(25.4f)
                curveToRelative(0.0f, 3.0f, 2.1f, 8.2f, 6.1f, 9.1f)
                curveToRelative(3.1f, 1.0f, 50.7f, 2.0f, 59.9f, 2.0f)
                reflectiveCurveToRelative(62.5f, 0.3f, 66.5f, -0.7f)
                curveToRelative(4.1f, -1.0f, 5.1f, -6.1f, 5.1f, -9.1f)
                lineTo(432.1f, 168.0f)
                curveToRelative(-0.1f, -80.3f, -57.9f, -136.0f, -192.0f, -136.0f)
                close()
                moveTo(290.3f, 380.0f)
                curveToRelative(-21.4f, 13.2f, -48.7f, 24.4f, -79.1f, 24.4f)
                curveToRelative(-52.8f, 0.0f, -58.9f, -33.5f, -59.0f, -44.7f)
                curveToRelative(0.0f, -12.2f, -3.0f, -42.7f, 18.3f, -52.9f)
                curveToRelative(24.3f, -13.2f, 75.1f, -29.4f, 119.8f, -33.5f)
                close()
            }
        }
        .build()
        return _amilia!!
    }

private var _amilia: ImageVector? = null
