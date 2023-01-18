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

public val IonIcons.LogoFirefox: ImageVector
    get() {
        if (_logoFirefox != null) {
            return _logoFirefox!!
        }
        _logoFirefox = Builder(name = "LogoFirefox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.46f, 194.62f)
                verticalLineToRelative(-0.07f)
                curveToRelative(-0.22f, -0.76f, -0.45f, -1.52f, -0.68f, -2.28f)
                curveToRelative(-0.05f, -0.19f, -0.11f, -0.38f, -0.17f, -0.56f)
                curveToRelative(-0.43f, -1.44f, -0.87f, -2.88f, -1.33f, -4.31f)
                lineToRelative(-0.06f, -0.2f)
                arcToRelative(223.24f, 223.24f, 0.0f, false, false, -10.0f, -25.56f)
                arcToRelative(191.77f, 191.77f, 0.0f, false, false, -12.9f, -23.8f)
                arcTo(225.15f, 225.15f, 0.0f, false, false, 371.58f, 64.1f)
                horizontalLineToRelative(0.0f)
                arcTo(222.9f, 222.9f, 0.0f, false, false, 256.0f, 32.0f)
                curveToRelative(-7.0f, 0.0f, -14.0f, 0.34f, -20.82f, 1.0f)
                curveToRelative(-24.12f, 2.54f, -64.78f, 11.21f, -97.77f, 40.18f)
                curveTo(257.5f, 11.86f, 417.94f, 85.7f, 404.29f, 223.0f)
                curveToRelative(-4.86f, 49.0f, -46.46f, 82.67f, -85.19f, 88.35f)
                arcToRelative(73.73f, 73.73f, 0.0f, false, true, -20.8f, 0.21f)
                curveToRelative(-94.59f, -13.15f, -88.8f, -90.68f, -60.06f, -123.83f)
                curveToRelative(-38.0f, -0.24f, -67.47f, 46.79f, -53.15f, 93.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-32.95f, -61.18f, 0.35f, -157.0f, 70.93f, -186.0f)
                curveToRelative(-82.95f, -12.0f, -160.71f, 28.2f, -185.7f, 98.07f)
                arcTo(330.23f, 330.23f, 0.0f, false, true, 88.07f, 118.0f)
                reflectiveCurveToRelative(-45.22f, 35.74f, -54.44f, 110.9f)
                curveToRelative(-0.14f, 1.16f, -0.27f, 2.32f, -0.39f, 3.49f)
                curveToRelative(-0.05f, 0.4f, -0.09f, 0.8f, -0.13f, 1.21f)
                quadToRelative(-0.53f, 5.25f, -0.8f, 10.57f)
                curveToRelative(0.0f, 0.27f, 0.0f, 0.54f, 0.0f, 0.81f)
                curveToRelative(-0.07f, 1.48f, -0.13f, 3.0f, -0.17f, 4.46f)
                lineToRelative(0.0f, 1.25f)
                curveToRelative(0.0f, 1.76f, -0.07f, 3.52f, -0.07f, 5.29f)
                curveToRelative(0.0f, 123.71f, 100.29f, 224.0f, 224.0f, 224.0f)
                reflectiveCurveTo(480.0f, 379.71f, 480.0f, 256.0f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 471.46f, 194.62f)
                close()
            }
        }
        .build()
        return _logoFirefox!!
    }

private var _logoFirefox: ImageVector? = null
