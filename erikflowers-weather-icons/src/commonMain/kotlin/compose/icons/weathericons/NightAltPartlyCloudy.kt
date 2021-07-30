package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.NightAltPartlyCloudy: ImageVector
    get() {
        if (_nightAltPartlyCloudy != null) {
            return _nightAltPartlyCloudy!!
        }
        _nightAltPartlyCloudy = Builder(name = "NightAltPartlyCloudy", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.77f, 19.65f)
                curveToRelative(0.0f, -0.79f, 0.23f, -1.48f, 0.68f, -2.09f)
                curveToRelative(0.45f, -0.61f, 1.06f, -1.03f, 1.81f, -1.27f)
                curveToRelative(0.32f, -1.09f, 0.98f, -1.92f, 1.99f, -2.49f)
                verticalLineToRelative(-0.35f)
                curveToRelative(0.0f, -1.46f, 0.46f, -2.74f, 1.38f, -3.85f)
                reflectiveCurveToRelative(2.09f, -1.8f, 3.5f, -2.06f)
                curveToRelative(0.36f, -0.06f, 0.72f, -0.09f, 1.08f, -0.09f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.21f, 0.0f, 0.44f, 0.02f, 0.7f, 0.05f)
                curveToRelative(0.26f, 0.02f, 0.5f, 0.06f, 0.73f, 0.11f)
                lineToRelative(0.91f, 0.28f)
                curveToRelative(0.13f, 0.07f, 0.18f, 0.16f, 0.16f, 0.26f)
                lineToRelative(-0.13f, 0.7f)
                curveTo(19.54f, 9.18f, 19.5f, 9.5f, 19.5f, 9.82f)
                curveToRelative(0.0f, 0.35f, 0.05f, 0.71f, 0.16f, 1.07f)
                curveToRelative(0.11f, 0.37f, 0.27f, 0.72f, 0.5f, 1.08f)
                reflectiveCurveToRelative(0.52f, 0.68f, 0.91f, 0.97f)
                curveToRelative(0.38f, 0.29f, 0.83f, 0.51f, 1.33f, 0.66f)
                lineToRelative(0.71f, 0.21f)
                curveToRelative(0.11f, 0.03f, 0.17f, 0.08f, 0.17f, 0.18f)
                curveToRelative(0.0f, 0.04f, 0.0f, 0.06f, -0.01f, 0.07f)
                lineToRelative(-0.18f, 0.68f)
                curveToRelative(-0.06f, 0.24f, -0.13f, 0.49f, -0.22f, 0.73f)
                curveToRelative(-0.15f, 0.44f, -0.38f, 0.89f, -0.7f, 1.37f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, -0.01f, -0.01f)
                curveToRelative(-0.44f, 0.63f, -0.98f, 1.16f, -1.64f, 1.58f)
                curveToRelative(0.14f, 0.34f, 0.21f, 0.75f, 0.21f, 1.24f)
                curveToRelative(0.0f, 0.99f, -0.35f, 1.83f, -1.04f, 2.53f)
                curveToRelative(-0.69f, 0.7f, -1.52f, 1.05f, -2.49f, 1.05f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.97f, 0.0f, -1.81f, -0.35f, -2.52f, -1.06f)
                curveTo(7.13f, 21.46f, 6.77f, 20.62f, 6.77f, 19.65f)
                close()
                moveTo(8.75f, 19.65f)
                curveToRelative(0.0f, 0.45f, 0.15f, 0.83f, 0.46f, 1.15f)
                reflectiveCurveToRelative(0.69f, 0.47f, 1.14f, 0.47f)
                horizontalLineToRelative(6.85f)
                curveToRelative(0.43f, 0.0f, 0.8f, -0.16f, 1.12f, -0.48f)
                curveToRelative(0.32f, -0.32f, 0.47f, -0.7f, 0.47f, -1.14f)
                curveToRelative(0.0f, -0.43f, -0.16f, -0.8f, -0.47f, -1.12f)
                reflectiveCurveToRelative(-0.69f, -0.47f, -1.12f, -0.47f)
                horizontalLineTo(15.9f)
                curveToRelative(-0.11f, 0.0f, -0.19f, -0.07f, -0.25f, -0.23f)
                lineToRelative(-0.08f, -0.64f)
                curveToRelative(-0.07f, -0.58f, -0.32f, -1.06f, -0.75f, -1.44f)
                reflectiveCurveToRelative(-0.93f, -0.58f, -1.51f, -0.58f)
                curveToRelative(-0.57f, 0.0f, -1.06f, 0.19f, -1.48f, 0.58f)
                curveToRelative(-0.42f, 0.39f, -0.66f, 0.87f, -0.73f, 1.44f)
                lineToRelative(-0.1f, 0.55f)
                curveToRelative(0.0f, 0.15f, -0.06f, 0.22f, -0.19f, 0.22f)
                lineToRelative(-0.63f, 0.08f)
                curveToRelative(-0.41f, 0.04f, -0.75f, 0.21f, -1.02f, 0.51f)
                curveTo(8.89f, 18.87f, 8.75f, 19.23f, 8.75f, 19.65f)
                close()
                moveTo(13.18f, 13.25f)
                horizontalLineToRelative(0.12f)
                curveToRelative(0.93f, 0.0f, 1.75f, 0.26f, 2.49f, 0.78f)
                curveToRelative(0.73f, 0.52f, 1.25f, 1.22f, 1.54f, 2.1f)
                curveToRelative(0.77f, 0.0f, 1.45f, 0.24f, 2.03f, 0.72f)
                curveToRelative(0.69f, -0.43f, 1.2f, -1.02f, 1.53f, -1.75f)
                curveToRelative(-1.04f, -0.52f, -1.85f, -1.27f, -2.43f, -2.25f)
                reflectiveCurveToRelative(-0.88f, -2.01f, -0.88f, -3.11f)
                verticalLineTo(9.39f)
                curveToRelative(-0.03f, 0.0f, -0.07f, 0.0f, -0.12f, 0.0f)
                curveToRelative(-0.05f, 0.0f, -0.09f, 0.0f, -0.12f, 0.0f)
                curveToRelative(-0.61f, 0.0f, -1.2f, 0.13f, -1.77f, 0.39f)
                curveToRelative(-0.57f, 0.26f, -1.05f, 0.64f, -1.44f, 1.12f)
                lineToRelative(-0.03f, -0.02f)
                curveTo(13.55f, 11.56f, 13.25f, 12.35f, 13.18f, 13.25f)
                close()
            }
        }
        .build()
        return _nightAltPartlyCloudy!!
    }

private var _nightAltPartlyCloudy: ImageVector? = null
