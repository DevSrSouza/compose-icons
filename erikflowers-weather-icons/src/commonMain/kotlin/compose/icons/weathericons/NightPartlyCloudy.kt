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

public val WeatherIcons.NightPartlyCloudy: ImageVector
    get() {
        if (_nightPartlyCloudy != null) {
            return _nightPartlyCloudy!!
        }
        _nightPartlyCloudy = Builder(name = "NightPartlyCloudy", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.77f, 19.61f)
                curveToRelative(0.0f, 0.97f, 0.35f, 1.81f, 1.06f, 2.52f)
                curveToRelative(0.71f, 0.71f, 1.55f, 1.06f, 2.52f, 1.06f)
                horizontalLineToRelative(6.85f)
                curveToRelative(0.97f, 0.0f, 1.8f, -0.35f, 2.49f, -1.05f)
                curveToRelative(0.69f, -0.7f, 1.04f, -1.54f, 1.04f, -2.53f)
                curveToRelative(0.0f, -0.48f, -0.07f, -0.89f, -0.21f, -1.23f)
                curveToRelative(0.83f, -0.53f, 1.49f, -1.24f, 1.97f, -2.12f)
                curveToRelative(0.48f, -0.88f, 0.73f, -1.83f, 0.73f, -2.84f)
                curveToRelative(0.0f, -0.81f, -0.16f, -1.59f, -0.47f, -2.33f)
                curveToRelative(-0.32f, -0.74f, -0.74f, -1.38f, -1.28f, -1.91f)
                reflectiveCurveTo(20.3f, 8.22f, 19.56f, 7.9f)
                curveToRelative(-0.74f, -0.32f, -1.51f, -0.48f, -2.32f, -0.48f)
                curveToRelative(-1.09f, 0.0f, -2.1f, 0.27f, -3.02f, 0.81f)
                reflectiveCurveToRelative(-1.65f, 1.27f, -2.18f, 2.18f)
                curveToRelative(-0.53f, 0.92f, -0.79f, 1.92f, -0.79f, 3.01f)
                verticalLineToRelative(0.34f)
                curveToRelative(-1.01f, 0.57f, -1.67f, 1.41f, -1.99f, 2.49f)
                curveToRelative(-0.76f, 0.24f, -1.36f, 0.66f, -1.81f, 1.27f)
                curveTo(7.0f, 18.13f, 6.77f, 18.83f, 6.77f, 19.61f)
                close()
                moveTo(8.75f, 19.61f)
                curveToRelative(0.0f, -0.42f, 0.13f, -0.78f, 0.4f, -1.08f)
                curveToRelative(0.27f, -0.3f, 0.61f, -0.47f, 1.02f, -0.51f)
                lineToRelative(0.63f, -0.08f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.08f, 0.19f, -0.23f)
                lineToRelative(0.1f, -0.56f)
                curveToRelative(0.07f, -0.58f, 0.31f, -1.06f, 0.73f, -1.44f)
                curveToRelative(0.42f, -0.39f, 0.91f, -0.58f, 1.48f, -0.58f)
                curveToRelative(0.58f, 0.0f, 1.09f, 0.19f, 1.51f, 0.58f)
                curveToRelative(0.43f, 0.39f, 0.68f, 0.87f, 0.75f, 1.44f)
                lineToRelative(0.08f, 0.65f)
                curveToRelative(0.06f, 0.15f, 0.15f, 0.23f, 0.25f, 0.23f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.43f, 0.0f, 0.8f, 0.16f, 1.12f, 0.47f)
                curveToRelative(0.32f, 0.31f, 0.47f, 0.68f, 0.47f, 1.12f)
                curveToRelative(0.0f, 0.45f, -0.16f, 0.83f, -0.47f, 1.15f)
                reflectiveCurveToRelative(-0.69f, 0.48f, -1.12f, 0.48f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.45f, 0.0f, -0.83f, -0.16f, -1.14f, -0.48f)
                reflectiveCurveTo(8.75f, 20.06f, 8.75f, 19.61f)
                close()
                moveTo(13.18f, 13.22f)
                curveToRelative(0.07f, -1.09f, 0.49f, -2.01f, 1.27f, -2.76f)
                curveToRelative(0.78f, -0.74f, 1.71f, -1.12f, 2.8f, -1.12f)
                curveToRelative(1.11f, 0.0f, 2.06f, 0.4f, 2.84f, 1.19f)
                curveToRelative(0.78f, 0.79f, 1.17f, 1.76f, 1.17f, 2.89f)
                curveToRelative(0.0f, 0.7f, -0.17f, 1.35f, -0.51f, 1.95f)
                curveToRelative(-0.34f, 0.6f, -0.8f, 1.08f, -1.38f, 1.45f)
                curveToRelative(-0.59f, -0.49f, -1.27f, -0.73f, -2.03f, -0.73f)
                curveToRelative(-0.29f, -0.88f, -0.81f, -1.57f, -1.54f, -2.09f)
                curveToRelative(-0.73f, -0.52f, -1.56f, -0.78f, -2.49f, -0.78f)
                horizontalLineTo(13.18f)
                close()
            }
        }
        .build()
        return _nightPartlyCloudy!!
    }

private var _nightPartlyCloudy: ImageVector? = null
