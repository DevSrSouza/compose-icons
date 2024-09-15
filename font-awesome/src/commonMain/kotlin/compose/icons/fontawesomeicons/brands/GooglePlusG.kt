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
                moveTo(386.06f, 228.5f)
                curveToRelative(1.83f, 9.69f, 3.14f, 19.38f, 3.14f, 31.96f)
                curveTo(389.2f, 370.2f, 315.6f, 448.0f, 204.8f, 448.0f)
                curveToRelative(-106.08f, 0.0f, -192.0f, -85.92f, -192.0f, -192.0f)
                reflectiveCurveToRelative(85.92f, -192.0f, 192.0f, -192.0f)
                curveToRelative(51.86f, 0.0f, 95.08f, 18.86f, 128.61f, 50.29f)
                lineToRelative(-52.13f, 50.03f)
                curveToRelative(-14.15f, -13.62f, -39.03f, -29.6f, -76.49f, -29.6f)
                curveToRelative(-65.48f, 0.0f, -118.92f, 54.22f, -118.92f, 121.28f)
                curveToRelative(0.0f, 67.06f, 53.44f, 121.28f, 118.92f, 121.28f)
                curveToRelative(75.96f, 0.0f, 104.51f, -54.74f, 108.96f, -82.77f)
                lineTo(204.8f, 294.5f)
                verticalLineToRelative(-66.01f)
                horizontalLineToRelative(181.26f)
                close()
                moveTo(571.47f, 234.93f)
                lineTo(571.47f, 179.2f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(55.73f)
                horizontalLineToRelative(-55.73f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(55.73f)
                verticalLineToRelative(55.73f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-55.73f)
                lineTo(627.2f, 290.93f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-55.73f)
                close()
            }
        }
        .build()
        return _googlePlusG!!
    }

private var _googlePlusG: ImageVector? = null
