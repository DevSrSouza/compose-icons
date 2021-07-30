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

public val BrandsGroup.Nimblr: ImageVector
    get() {
        if (_nimblr != null) {
            return _nimblr!!
        }
        _nimblr = Builder(name = "Nimblr", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.6f, 299.29f)
                curveToRelative(15.57f, 0.0f, 27.15f, 11.46f, 27.15f, 27.0f)
                reflectiveCurveToRelative(-11.62f, 27.0f, -27.15f, 27.0f)
                curveToRelative(-15.7f, 0.0f, -27.15f, -11.57f, -27.15f, -27.0f)
                reflectiveCurveToRelative(11.55f, -27.0f, 27.15f, -27.0f)
                close()
                moveTo(113.0f, 326.25f)
                curveToRelative(0.0f, -15.61f, 11.68f, -27.0f, 27.15f, -27.0f)
                reflectiveCurveToRelative(27.15f, 11.46f, 27.15f, 27.0f)
                reflectiveCurveToRelative(-11.47f, 27.0f, -27.15f, 27.0f)
                curveToRelative(-15.44f, 0.0f, -27.15f, -11.31f, -27.15f, -27.0f)
                moveTo(191.76f, 159.0f)
                curveTo(157.0f, 159.0f, 89.45f, 178.77f, 59.25f, 227.0f)
                lineTo(14.0f, 0.0f)
                verticalLineToRelative(335.48f)
                curveTo(14.0f, 433.13f, 93.61f, 512.0f, 191.76f, 512.0f)
                reflectiveCurveToRelative(177.76f, -78.95f, 177.76f, -176.52f)
                reflectiveCurveTo(290.13f, 159.0f, 191.76f, 159.0f)
                close()
                moveTo(191.76f, 467.12f)
                curveToRelative(-73.27f, 0.0f, -132.51f, -58.9f, -132.51f, -131.59f)
                reflectiveCurveToRelative(59.24f, -131.59f, 132.51f, -131.59f)
                reflectiveCurveToRelative(132.51f, 58.86f, 132.51f, 131.54f)
                reflectiveCurveTo(265.0f, 467.07f, 191.76f, 467.07f)
                close()
            }
        }
        .build()
        return _nimblr!!
    }

private var _nimblr: ImageVector? = null
