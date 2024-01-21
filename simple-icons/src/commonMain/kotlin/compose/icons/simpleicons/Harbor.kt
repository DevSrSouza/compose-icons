package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Harbor: ImageVector
    get() {
        if (_harbor != null) {
            return _harbor!!
        }
        _harbor = Builder(name = "Harbor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.006f, 15.751f)
                lineToRelative(4.256f, 1.876f)
                lineToRelative(0.066f, 0.805f)
                lineToRelative(-4.388f, -1.934f)
                lineToRelative(0.066f, -0.747f)
                close()
                moveTo(7.31f, 12.316f)
                horizontalLineToRelative(-0.605f)
                lineTo(6.705f, 11.21f)
                horizontalLineToRelative(0.381f)
                lineTo(7.086f, 8.95f)
                horizontalLineToRelative(-0.381f)
                verticalLineToRelative(-0.649f)
                lineToRelative(2.118f, -2.073f)
                verticalLineToRelative(-0.146f)
                curveToRelative(0.0f, -0.11f, 0.09f, -0.2f, 0.2f, -0.2f)
                curveToRelative(0.11f, 0.0f, 0.2f, 0.09f, 0.2f, 0.2f)
                verticalLineToRelative(0.146f)
                lineToRelative(2.12f, 2.073f)
                verticalLineToRelative(0.65f)
                horizontalLineToRelative(-0.382f)
                verticalLineToRelative(2.259f)
                horizontalLineToRelative(0.381f)
                verticalLineToRelative(1.106f)
                horizontalLineToRelative(-0.514f)
                lineToRelative(0.27f, 3.313f)
                lineTo(7.17f, 13.9f)
                lineToRelative(0.14f, -1.583f)
                close()
                moveTo(7.7f, 11.21f)
                horizontalLineToRelative(0.628f)
                verticalLineToRelative(-0.965f)
                curveToRelative(0.0f, -0.383f, 0.313f, -0.696f, 0.695f, -0.696f)
                reflectiveCurveToRelative(0.696f, 0.313f, 0.696f, 0.696f)
                verticalLineToRelative(0.965f)
                horizontalLineToRelative(0.628f)
                lineTo(10.347f, 8.95f)
                lineTo(7.7f, 8.95f)
                verticalLineToRelative(2.26f)
                close()
                moveTo(6.89f, 17.05f)
                lineToRelative(-0.066f, 0.747f)
                lineToRelative(4.618f, 2.035f)
                lineToRelative(-0.066f, -0.805f)
                lineToRelative(-4.486f, -1.977f)
                close()
                moveTo(7.12f, 14.45f)
                lineTo(7.054f, 15.197f)
                lineTo(11.212f, 17.029f)
                lineTo(11.147f, 16.224f)
                lineTo(7.121f, 14.45f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.57f, 11.285f)
                arcToRelative(9.682f, 9.682f, 0.0f, false, false, -0.223f, -1.523f)
                lineToRelative(-9.751f, 0.332f)
                lineToRelative(8.801f, -2.828f)
                lineToRelative(-0.019f, -0.037f)
                arcTo(9.802f, 9.802f, 0.0f, false, false, 19.23f, 5.59f)
                lineToRelative(-7.786f, 4.03f)
                lineToRelative(5.712f, -5.941f)
                arcToRelative(9.675f, 9.675f, 0.0f, false, false, -5.14f, -1.474f)
                curveToRelative(-5.371f, 0.0f, -9.74f, 4.369f, -9.74f, 9.74f)
                curveToRelative(0.0f, 3.38f, 1.73f, 6.362f, 4.35f, 8.11f)
                lineToRelative(0.151f, -1.704f)
                lineToRelative(4.715f, 2.078f)
                lineToRelative(0.102f, 1.246f)
                curveToRelative(0.14f, 0.006f, 0.28f, 0.01f, 0.422f, 0.01f)
                curveToRelative(4.646f, 0.0f, 8.54f, -3.27f, 9.507f, -7.63f)
                lineToRelative(-10.08f, -3.497f)
                lineToRelative(10.128f, 0.727f)
            }
        }
        .build()
        return _harbor!!
    }

private var _harbor: ImageVector? = null
