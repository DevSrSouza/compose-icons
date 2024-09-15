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

public val BrandsGroup.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.25f, 8.0f, 8.0f, 119.25f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.25f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.25f, 248.0f, -248.0f)
                reflectiveCurveTo(392.75f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(419.97f, 122.37f)
                curveToRelative(29.5f, 36.05f, 47.37f, 81.96f, 47.83f, 131.96f)
                curveToRelative(-6.98f, -1.48f, -77.02f, -15.68f, -147.5f, -6.82f)
                curveToRelative(-5.75f, -14.04f, -11.18f, -26.39f, -18.62f, -41.61f)
                curveToRelative(78.32f, -31.98f, 113.82f, -77.48f, 118.28f, -83.52f)
                close()
                moveTo(396.42f, 97.87f)
                curveToRelative(-3.81f, 5.43f, -35.7f, 48.29f, -111.02f, 76.52f)
                curveToRelative(-34.71f, -63.78f, -73.18f, -116.17f, -79.04f, -124.01f)
                curveToRelative(67.18f, -16.19f, 137.97f, 1.27f, 190.06f, 47.49f)
                close()
                moveTo(165.94f, 64.62f)
                curveToRelative(5.59f, 7.66f, 43.44f, 60.12f, 78.54f, 122.51f)
                curveToRelative(-99.09f, 26.31f, -186.36f, 25.93f, -195.83f, 25.81f)
                curveTo(62.38f, 147.21f, 106.68f, 92.57f, 165.94f, 64.62f)
                close()
                moveTo(44.17f, 256.32f)
                curveToRelative(0.0f, -2.17f, 0.04f, -4.32f, 0.11f, -6.47f)
                curveToRelative(9.27f, 0.19f, 111.92f, 1.51f, 217.71f, -30.15f)
                curveToRelative(6.06f, 11.87f, 11.86f, 23.92f, 17.17f, 35.95f)
                curveToRelative(-76.6f, 21.58f, -146.19f, 83.53f, -180.53f, 142.31f)
                curveTo(64.79f, 360.4f, 44.17f, 310.73f, 44.17f, 256.32f)
                close()
                moveTo(125.98f, 423.44f)
                curveToRelative(22.13f, -45.23f, 82.18f, -103.62f, 167.58f, -132.76f)
                curveToRelative(29.74f, 77.28f, 42.04f, 142.05f, 45.19f, 160.64f)
                curveToRelative(-68.11f, 29.01f, -150.01f, 21.05f, -212.77f, -27.88f)
                close()
                moveTo(374.36f, 431.93f)
                curveToRelative(-2.17f, -12.89f, -13.45f, -74.9f, -41.15f, -151.03f)
                curveToRelative(66.38f, -10.63f, 124.7f, 6.77f, 131.95f, 9.06f)
                curveToRelative(-9.44f, 58.94f, -43.27f, 109.84f, -90.79f, 141.98f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
