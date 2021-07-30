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

public val BrandsGroup.BuyNLarge: ImageVector
    get() {
        if (_buyNLarge != null) {
            return _buyNLarge!!
        }
        _buyNLarge = Builder(name = "BuyNLarge", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveTo(133.27f, 32.0f, 7.79f, 132.32f, 7.79f, 256.0f)
                reflectiveCurveTo(133.27f, 480.0f, 288.0f, 480.0f)
                reflectiveCurveToRelative(280.21f, -100.32f, 280.21f, -224.0f)
                reflectiveCurveTo(442.73f, 32.0f, 288.0f, 32.0f)
                close()
                moveTo(202.61f, 389.19f)
                lineTo(64.1f, 390.55f)
                lineToRelative(77.25f, -290.74f)
                horizontalLineToRelative(133.44f)
                curveToRelative(63.15f, 0.0f, 84.93f, 28.65f, 78.0f, 72.84f)
                arcToRelative(60.24f, 60.24f, 0.0f, false, true, -1.5f, 6.85f)
                arcToRelative(77.39f, 77.39f, 0.0f, false, false, -17.21f, -1.93f)
                curveToRelative(-42.35f, 0.0f, -76.69f, 33.88f, -76.69f, 75.65f)
                curveToRelative(0.0f, 37.14f, 27.14f, 68.0f, 62.93f, 74.45f)
                curveToRelative(-18.24f, 37.16f, -56.16f, 60.92f, -117.71f, 61.52f)
                close()
                moveTo(358.0f, 207.11f)
                horizontalLineToRelative(32.0f)
                lineToRelative(-22.16f, 90.31f)
                horizontalLineToRelative(-35.41f)
                lineToRelative(-11.19f, -35.63f)
                lineToRelative(-7.83f, 35.63f)
                horizontalLineToRelative(-37.83f)
                lineToRelative(26.63f, -90.31f)
                horizontalLineToRelative(31.34f)
                lineToRelative(15.0f, 36.75f)
                close()
                moveTo(503.86f, 389.19f)
                lineTo(306.79f, 389.19f)
                lineTo(322.63f, 328.0f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, false, 11.47f, 0.83f)
                curveToRelative(42.34f, 0.0f, 76.69f, -33.87f, 76.69f, -75.65f)
                curveToRelative(0.0f, -32.65f, -21.0f, -60.46f, -50.38f, -71.06f)
                lineToRelative(21.33f, -82.35f)
                horizontalLineToRelative(92.5f)
                lineToRelative(-53.05f, 205.36f)
                horizontalLineToRelative(103.87f)
                close()
                moveTo(211.7f, 269.39f)
                lineTo(187.0f, 269.39f)
                lineToRelative(-13.8f, 56.47f)
                horizontalLineToRelative(24.7f)
                curveToRelative(16.14f, 0.0f, 32.11f, -3.18f, 37.94f, -26.65f)
                curveToRelative(5.56f, -22.31f, -7.99f, -29.82f, -24.14f, -29.82f)
                close()
                moveTo(233.0f, 170.0f)
                horizontalLineToRelative(-21.34f)
                lineTo(200.0f, 217.71f)
                horizontalLineToRelative(21.37f)
                curveToRelative(18.0f, 0.0f, 35.38f, -14.64f, 39.21f, -30.14f)
                curveTo(265.23f, 168.71f, 251.07f, 170.0f, 233.0f, 170.0f)
                close()
            }
        }
        .build()
        return _buyNLarge!!
    }

private var _buyNLarge: ImageVector? = null
