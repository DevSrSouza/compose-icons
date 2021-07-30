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

public val BrandsGroup.Searchengin: ImageVector
    get() {
        if (_searchengin != null) {
            return _searchengin!!
        }
        _searchengin = Builder(name = "Searchengin", defaultWidth = 460.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 460.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.6f, 130.3f)
                lineToRelative(-67.2f, 28.2f)
                lineTo(153.4f, 43.2f)
                lineTo(98.7f, 233.5f)
                lineToRelative(54.7f, -24.2f)
                verticalLineToRelative(130.3f)
                lineToRelative(67.2f, -209.3f)
                close()
                moveTo(137.4f, 33.6f)
                lineToRelative(-1.3f, 4.7f)
                lineToRelative(-15.2f, 52.9f)
                curveTo(80.6f, 106.7f, 52.0f, 145.8f, 52.0f, 191.5f)
                curveToRelative(0.0f, 52.3f, 34.3f, 95.9f, 83.4f, 105.5f)
                verticalLineToRelative(53.6f)
                curveTo(57.5f, 340.1f, 0.0f, 272.4f, 0.0f, 191.6f)
                curveToRelative(0.0f, -80.5f, 59.8f, -147.2f, 137.4f, -158.0f)
                close()
                moveTo(448.8f, 480.8f)
                curveToRelative(-11.2f, 11.2f, -23.1f, 12.3f, -28.6f, 10.5f)
                curveToRelative(-5.4f, -1.8f, -27.1f, -19.9f, -60.4f, -44.4f)
                curveToRelative(-33.3f, -24.6f, -33.6f, -35.7f, -43.0f, -56.7f)
                curveToRelative(-9.4f, -20.9f, -30.4f, -42.6f, -57.5f, -52.4f)
                lineToRelative(-9.7f, -14.7f)
                curveToRelative(-24.7f, 16.9f, -53.0f, 26.9f, -81.3f, 28.7f)
                lineToRelative(2.1f, -6.6f)
                lineToRelative(15.9f, -49.5f)
                curveToRelative(46.5f, -11.9f, 80.9f, -54.0f, 80.9f, -104.2f)
                curveToRelative(0.0f, -54.5f, -38.4f, -102.1f, -96.0f, -107.1f)
                lineTo(171.2f, 32.3f)
                curveTo(254.4f, 37.4f, 320.0f, 106.8f, 320.0f, 191.6f)
                curveToRelative(0.0f, 33.6f, -11.2f, 64.7f, -29.0f, 90.4f)
                lineToRelative(14.6f, 9.6f)
                curveToRelative(9.8f, 27.1f, 31.5f, 48.0f, 52.4f, 57.4f)
                reflectiveCurveToRelative(32.2f, 9.7f, 56.8f, 43.0f)
                curveToRelative(24.6f, 33.2f, 42.7f, 54.9f, 44.5f, 60.3f)
                reflectiveCurveToRelative(0.7f, 17.3f, -10.5f, 28.5f)
                close()
                moveTo(438.9f, 462.9f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.6f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.6f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.6f, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _searchengin!!
    }

private var _searchengin: ImageVector? = null
