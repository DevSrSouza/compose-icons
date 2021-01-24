package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.DribbbleSquare: ImageVector
    get() {
        if (_dribbbleSquare != null) {
            return _dribbbleSquare!!
        }
        _dribbbleSquare = Builder(name = "DribbbleSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.2f, 228.2f)
                curveToRelative(8.9f, -42.4f, 37.4f, -77.7f, 75.7f, -95.7f)
                curveToRelative(3.6f, 4.9f, 28.0f, 38.8f, 50.7f, 79.0f)
                curveToRelative(-64.0f, 17.0f, -120.3f, 16.8f, -126.4f, 16.7f)
                close()
                moveTo(314.6f, 154.0f)
                curveToRelative(-33.6f, -29.8f, -79.3f, -41.1f, -122.6f, -30.6f)
                curveToRelative(3.8f, 5.1f, 28.6f, 38.9f, 51.0f, 80.0f)
                curveToRelative(48.6f, -18.3f, 69.1f, -45.9f, 71.6f, -49.4f)
                close()
                moveTo(140.1f, 364.0f)
                curveToRelative(40.5f, 31.6f, 93.3f, 36.7f, 137.3f, 18.0f)
                curveToRelative(-2.0f, -12.0f, -10.0f, -53.8f, -29.2f, -103.6f)
                curveToRelative(-55.1f, 18.8f, -93.8f, 56.4f, -108.1f, 85.6f)
                close()
                moveTo(238.9f, 255.8f)
                curveToRelative(-3.4f, -7.8f, -7.2f, -15.5f, -11.1f, -23.2f)
                curveTo(159.6f, 253.0f, 93.4f, 252.2f, 87.4f, 252.0f)
                curveToRelative(0.0f, 1.4f, -0.1f, 2.8f, -0.1f, 4.2f)
                curveToRelative(0.0f, 35.1f, 13.3f, 67.1f, 35.1f, 91.4f)
                curveToRelative(22.2f, -37.9f, 67.1f, -77.9f, 116.5f, -91.8f)
                close()
                moveTo(273.8f, 272.1f)
                curveToRelative(17.9f, 49.1f, 25.1f, 89.1f, 26.5f, 97.4f)
                curveToRelative(30.7f, -20.7f, 52.5f, -53.6f, 58.6f, -91.6f)
                curveToRelative(-4.6f, -1.5f, -42.3f, -12.7f, -85.1f, -5.8f)
                close()
                moveTo(253.5f, 223.7f)
                curveToRelative(4.8f, 9.8f, 8.3f, 17.8f, 12.0f, 26.8f)
                curveToRelative(45.5f, -5.7f, 90.7f, 3.4f, 95.2f, 4.4f)
                curveToRelative(-0.3f, -32.3f, -11.8f, -61.9f, -30.9f, -85.1f)
                curveToRelative(-2.9f, 3.9f, -25.8f, 33.2f, -76.3f, 53.9f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(384.0f, 256.0f)
                curveToRelative(0.0f, -88.2f, -71.8f, -160.0f, -160.0f, -160.0f)
                reflectiveCurveTo(64.0f, 167.8f, 64.0f, 256.0f)
                reflectiveCurveToRelative(71.8f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(160.0f, -71.8f, 160.0f, -160.0f)
                close()
            }
        }
        .build()
        return _dribbbleSquare!!
    }

private var _dribbbleSquare: ImageVector? = null
