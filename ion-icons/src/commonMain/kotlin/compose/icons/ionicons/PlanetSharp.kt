package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PlanetSharp: ImageVector
    get() {
        if (_planetSharp != null) {
            return _planetSharp!!
        }
        _planetSharp = Builder(name = "PlanetSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.0f, 274.71f)
                curveTo(90.36f, 363.0f, 165.26f, 432.0f, 256.0f, 432.0f)
                arcToRelative(174.91f, 174.91f, 0.0f, false, false, 71.49f, -15.19f)
                curveToRelative(-40.3f, -16.53f, -84.05f, -38.17f, -127.77f, -63.36f)
                curveTo(157.0f, 328.86f, 115.84f, 301.5f, 81.0f, 274.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(492.72f, 339.51f)
                curveToRelative(-8.5f, -11.31f, -20.0f, -23.8f, -34.0f, -37.0f)
                arcToRelative(205.25f, 205.25f, 0.0f, false, true, -11.0f, 34.0f)
                curveToRelative(28.72f, 29.5f, 33.2f, 45.34f, 32.17f, 48.45f)
                curveToRelative(-2.0f, 2.23f, -17.05f, 6.89f, -58.15f, -3.53f)
                quadToRelative(-8.83f, -2.24f, -19.32f, -5.46f)
                quadToRelative(-6.76f, -2.08f, -13.79f, -4.49f)
                horizontalLineToRelative(0.0f)
                arcToRelative(176.76f, 176.76f, 0.0f, false, false, 19.54f, -27.25f)
                curveToRelative(0.17f, -0.29f, 0.35f, -0.58f, 0.52f, -0.88f)
                arcTo(175.39f, 175.39f, 0.0f, false, false, 432.0f, 256.0f)
                arcTo(178.87f, 178.87f, 0.0f, false, false, 431.0f, 237.0f)
                curveTo(421.43f, 148.83f, 346.6f, 80.0f, 256.0f, 80.0f)
                arcTo(175.37f, 175.37f, 0.0f, false, false, 149.6f, 115.89f)
                arcToRelative(177.4f, 177.4f, 0.0f, false, false, -45.83f, 51.84f)
                curveToRelative(-0.16f, 0.29f, -0.34f, 0.58f, -0.51f, 0.87f)
                arcToRelative(175.48f, 175.48f, 0.0f, false, false, -13.83f, 30.52f)
                quadToRelative(-5.59f, -4.87f, -10.79f, -9.67f)
                curveToRelative(-5.39f, -5.0f, -10.17f, -9.63f, -14.42f, -14.0f)
                curveTo(34.65f, 145.19f, 31.13f, 129.84f, 32.06f, 127.0f)
                curveToRelative(2.16f, -2.43f, 18.1f, -6.54f, 58.13f, 3.55f)
                arcToRelative(209.88f, 209.88f, 0.0f, false, true, 24.0f, -26.56f)
                curveToRelative(-18.86f, -5.61f, -35.79f, -9.35f, -50.05f, -11.0f)
                curveTo(33.41f, 89.47f, 13.3f, 95.52f, 4.35f, 111.0f)
                curveTo(1.11f, 116.58f, -2.0f, 126.09f, 1.63f, 139.6f)
                curveTo(7.0f, 159.66f, 26.14f, 184.0f, 53.23f, 209.5f)
                curveToRelative(8.63f, 8.13f, 18.06f, 16.37f, 28.12f, 24.64f)
                curveToRelative(7.32f, 6.0f, 15.0f, 12.06f, 22.9f, 18.08f)
                quadToRelative(7.91f, 6.0f, 16.15f, 12.0f)
                reflectiveQuadTo(137.1f, 276.0f)
                curveToRelative(25.41f, 17.61f, 52.26f, 34.52f, 78.59f, 49.69f)
                quadToRelative(14.34f, 8.26f, 28.64f, 16.0f)
                reflectiveQuadToRelative(28.37f, 14.81f)
                curveToRelative(21.9f, 11.0f, 43.35f, 20.92f, 63.86f, 29.43f)
                quadToRelative(13.19f, 5.48f, 25.81f, 10.16f)
                curveToRelative(11.89f, 4.42f, 23.37f, 8.31f, 34.31f, 11.59f)
                lineToRelative(1.1f, 0.33f)
                curveToRelative(25.73f, 7.66f, 47.42f, 11.69f, 64.48f, 12.0f)
                horizontalLineTo(464.0f)
                curveToRelative(21.64f, 0.0f, 36.3f, -6.38f, 43.58f, -19.0f)
                curveTo(516.67f, 385.39f, 511.66f, 364.69f, 492.72f, 339.51f)
                close()
            }
        }
        .build()
        return _planetSharp!!
    }

private var _planetSharp: ImageVector? = null
