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

public val BrandsGroup.GooglePlusG: ImageVector
    get() {
        if (_googlePlusG != null) {
            return _googlePlusG!!
        }
        _googlePlusG = Builder(name = "GooglePlusG", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.061f, 228.496f)
                curveToRelative(1.834f, 9.692f, 3.143f, 19.384f, 3.143f, 31.956f)
                curveTo(389.204f, 370.205f, 315.599f, 448.0f, 204.8f, 448.0f)
                curveToRelative(-106.084f, 0.0f, -192.0f, -85.915f, -192.0f, -192.0f)
                reflectiveCurveToRelative(85.916f, -192.0f, 192.0f, -192.0f)
                curveToRelative(51.864f, 0.0f, 95.083f, 18.859f, 128.611f, 50.292f)
                lineToRelative(-52.126f, 50.03f)
                curveToRelative(-14.145f, -13.621f, -39.028f, -29.599f, -76.485f, -29.599f)
                curveToRelative(-65.484f, 0.0f, -118.92f, 54.221f, -118.92f, 121.277f)
                curveToRelative(0.0f, 67.056f, 53.436f, 121.277f, 118.92f, 121.277f)
                curveToRelative(75.961f, 0.0f, 104.513f, -54.745f, 108.965f, -82.773f)
                lineTo(204.8f, 294.504f)
                verticalLineToRelative(-66.009f)
                horizontalLineToRelative(181.261f)
                close()
                moveTo(571.467f, 234.933f)
                lineTo(571.467f, 179.2f)
                horizontalLineToRelative(-56.001f)
                verticalLineToRelative(55.733f)
                horizontalLineToRelative(-55.733f)
                verticalLineToRelative(56.001f)
                horizontalLineToRelative(55.733f)
                verticalLineToRelative(55.733f)
                horizontalLineToRelative(56.001f)
                verticalLineToRelative(-55.733f)
                lineTo(627.2f, 290.934f)
                verticalLineToRelative(-56.001f)
                horizontalLineToRelative(-55.733f)
                close()
            }
        }
        .build()
        return _googlePlusG!!
    }

private var _googlePlusG: ImageVector? = null
