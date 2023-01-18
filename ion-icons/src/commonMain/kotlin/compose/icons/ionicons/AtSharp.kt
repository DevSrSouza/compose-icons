package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AtSharp: ImageVector
    get() {
        if (_atSharp != null) {
            return _atSharp!!
        }
        _atSharp = Builder(name = "AtSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.6f, 115.78f)
                curveToRelative(-32.07f, -35.0f, -79.47f, -53.51f, -137.09f, -53.51f)
                curveToRelative(-51.0f, 0.0f, -100.69f, 19.8f, -139.82f, 55.76f)
                reflectiveCurveTo(67.56f, 201.87f, 63.06f, 252.86f)
                curveTo(58.51f, 304.53f, 74.47f, 353.15f, 108.0f, 389.76f)
                curveToRelative(33.37f, 36.44f, 80.07f, 56.51f, 131.49f, 56.51f)
                curveToRelative(32.52f, 0.0f, 53.61f, -2.36f, 85.48f, -15.75f)
                lineToRelative(14.75f, -6.2f)
                lineToRelative(-12.4f, -29.5f)
                lineTo(312.57f, 401.0f)
                curveToRelative(-27.15f, 11.4f, -43.78f, 13.25f, -73.08f, 13.25f)
                curveToRelative(-42.34f, 0.0f, -80.65f, -16.38f, -107.89f, -46.12f)
                curveToRelative(-27.4f, -29.92f, -40.42f, -69.86f, -36.66f, -112.48f)
                curveToRelative(7.84f, -89.0f, 86.6f, -161.4f, 175.57f, -161.4f)
                curveToRelative(48.4f, 0.0f, 87.65f, 14.91f, 113.49f, 43.13f)
                curveToRelative(24.61f, 26.87f, 35.6f, 63.92f, 31.79f, 107.15f)
                curveToRelative(-3.29f, 37.35f, -17.76f, 55.74f, -29.32f, 64.6f)
                curveToRelative(-11.0f, 8.44f, -22.0f, 10.18f, -28.0f, 9.11f)
                curveToRelative(-17.68f, -3.13f, -26.87f, -20.46f, -24.59f, -46.29f)
                lineToRelative(9.93f, -109.12f)
                lineTo(311.9f, 160.0f)
                lineToRelative(-2.0f, 22.29f)
                arcToRelative(79.69f, 79.69f, 0.0f, false, false, -57.32f, -24.0f)
                curveToRelative(-23.8f, 0.0f, -46.54f, 10.07f, -64.0f, 28.37f)
                curveToRelative(-16.77f, 17.53f, -27.23f, 41.05f, -29.45f, 66.22f)
                curveToRelative(-2.45f, 27.87f, 5.75f, 54.34f, 22.51f, 72.64f)
                arcToRelative(76.14f, 76.14f, 0.0f, false, false, 56.88f, 24.77f)
                arcTo(93.0f, 93.0f, 0.0f, false, false, 310.0f, 318.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 42.88f, 31.81f)
                curveToRelative(16.89f, 3.0f, 36.73f, -2.69f, 53.08f, -15.21f)
                curveToRelative(30.19f, -23.13f, 39.36f, -60.19f, 41.74f, -87.2f)
                curveTo(452.22f, 195.7f, 438.0f, 149.0f, 407.6f, 115.78f)
                close()
                moveTo(281.26f, 301.78f)
                arcToRelative(62.19f, 62.19f, 0.0f, false, true, -42.81f, 16.53f)
                arcToRelative(43.94f, 43.94f, 0.0f, false, true, -33.28f, -14.38f)
                curveToRelative(-10.71f, -11.7f, -15.9f, -29.27f, -14.23f, -48.22f)
                curveToRelative(3.23f, -36.68f, 30.29f, -65.4f, 61.61f, -65.4f)
                arcToRelative(48.16f, 48.16f, 0.0f, false, true, 35.88f, 15.82f)
                curveTo(299.3f, 218.0f, 304.63f, 235.0f, 303.06f, 252.86f)
                curveTo(301.28f, 273.14f, 293.73f, 290.0f, 281.26f, 301.74f)
                close()
            }
        }
        .build()
        return _atSharp!!
    }

private var _atSharp: ImageVector? = null
