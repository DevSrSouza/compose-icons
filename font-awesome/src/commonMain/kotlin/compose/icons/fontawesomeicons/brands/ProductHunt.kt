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

public val BrandsGroup.ProductHunt: ImageVector
    get() {
        if (_productHunt != null) {
            return _productHunt!!
        }
        _productHunt = Builder(name = "ProductHunt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.3f, 218.8f)
                curveToRelative(0.0f, 20.5f, -16.7f, 37.2f, -37.2f, 37.2f)
                horizontalLineToRelative(-70.3f)
                verticalLineToRelative(-74.4f)
                horizontalLineToRelative(70.3f)
                curveToRelative(20.5f, 0.0f, 37.2f, 16.7f, 37.2f, 37.2f)
                close()
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.0f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                close()
                moveTo(375.9f, 218.8f)
                curveToRelative(0.0f, -47.9f, -38.9f, -86.8f, -86.8f, -86.8f)
                lineTo(169.2f, 132.0f)
                verticalLineToRelative(248.0f)
                horizontalLineToRelative(49.6f)
                verticalLineToRelative(-74.4f)
                horizontalLineToRelative(70.3f)
                curveToRelative(47.9f, 0.0f, 86.8f, -38.9f, 86.8f, -86.8f)
                close()
            }
        }
        .build()
        return _productHunt!!
    }

private var _productHunt: ImageVector? = null
