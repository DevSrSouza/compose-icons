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

public val BrandsGroup.Symfony: ImageVector
    get() {
        if (_symfony != null) {
            return _symfony!!
        }
        _symfony = Builder(name = "Symfony", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(389.74f, 151.54f)
                curveToRelative(-11.47f, 0.41f, -19.4f, -6.45f, -19.77f, -16.87f)
                curveToRelative(-0.27f, -9.18f, 6.68f, -13.44f, 6.53f, -18.85f)
                curveToRelative(-0.23f, -6.55f, -10.16f, -6.82f, -12.87f, -6.67f)
                curveToRelative(-39.78f, 1.29f, -48.59f, 57.0f, -58.89f, 113.85f)
                curveToRelative(21.43f, 3.15f, 36.65f, -0.72f, 45.14f, -6.22f)
                curveToRelative(12.0f, -7.75f, -3.34f, -15.72f, -1.42f, -24.56f)
                curveToRelative(4.0f, -18.16f, 32.55f, -19.0f, 32.0f, 5.3f)
                curveToRelative(-0.36f, 17.86f, -25.92f, 41.81f, -77.6f, 35.7f)
                curveToRelative(-10.76f, 59.52f, -18.35f, 115.0f, -58.2f, 161.72f)
                curveToRelative(-29.0f, 34.46f, -58.4f, 39.82f, -71.58f, 40.26f)
                curveToRelative(-24.65f, 0.85f, -41.0f, -12.31f, -41.58f, -29.84f)
                curveToRelative(-0.56f, -17.0f, 14.45f, -26.26f, 24.31f, -26.59f)
                curveToRelative(21.89f, -0.75f, 30.12f, 25.67f, 14.88f, 34.0f)
                curveToRelative(-12.09f, 9.71f, 0.11f, 12.61f, 2.05f, 12.55f)
                curveToRelative(10.42f, -0.36f, 17.34f, -5.51f, 22.18f, -9.0f)
                curveToRelative(24.0f, -20.0f, 33.24f, -54.86f, 45.35f, -118.35f)
                curveToRelative(8.19f, -49.66f, 17.0f, -78.0f, 18.23f, -82.0f)
                curveToRelative(-16.93f, -12.75f, -27.08f, -28.55f, -49.85f, -34.72f)
                curveToRelative(-15.61f, -4.23f, -25.12f, -0.63f, -31.81f, 7.83f)
                curveToRelative(-7.92f, 10.0f, -5.29f, 23.0f, 2.37f, 30.7f)
                lineToRelative(12.63f, 14.0f)
                curveToRelative(15.51f, 17.93f, 24.0f, 31.87f, 20.8f, 50.62f)
                curveToRelative(-5.06f, 29.93f, -40.72f, 52.9f, -82.88f, 39.94f)
                curveToRelative(-36.0f, -11.11f, -42.7f, -36.56f, -38.38f, -50.62f)
                curveToRelative(7.51f, -24.15f, 42.36f, -11.72f, 34.62f, 13.6f)
                curveToRelative(-2.79f, 8.6f, -4.92f, 8.68f, -6.28f, 13.07f)
                curveToRelative(-4.56f, 14.77f, 41.85f, 28.4f, 51.0f, -1.39f)
                curveToRelative(4.47f, -14.52f, -5.3f, -21.71f, -22.25f, -39.85f)
                curveToRelative(-28.47f, -31.75f, -16.0f, -65.49f, 2.95f, -79.67f)
                curveTo(204.23f, 140.13f, 251.94f, 197.0f, 262.0f, 205.29f)
                curveToRelative(37.17f, -109.0f, 100.53f, -105.46f, 102.43f, -105.53f)
                curveToRelative(25.16f, -0.81f, 44.19f, 10.59f, 44.83f, 28.65f)
                curveToRelative(0.25f, 7.69f, -4.17f, 22.59f, -19.52f, 23.13f)
                close()
            }
        }
        .build()
        return _symfony!!
    }

private var _symfony: ImageVector? = null
