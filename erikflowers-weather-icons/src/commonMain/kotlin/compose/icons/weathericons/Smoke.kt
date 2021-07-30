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

public val WeatherIcons.Smoke: ImageVector
    get() {
        if (_smoke != null) {
            return _smoke!!
        }
        _smoke = Builder(name = "Smoke", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.34f, 12.48f)
                curveToRelative(0.0f, -0.94f, 0.3f, -1.78f, 0.89f, -2.52f)
                reflectiveCurveToRelative(1.34f, -1.21f, 2.25f, -1.41f)
                curveTo(9.73f, 7.43f, 10.3f, 6.5f, 11.2f, 5.78f)
                reflectiveCurveToRelative(1.92f, -1.08f, 3.08f, -1.08f)
                curveToRelative(1.12f, 0.0f, 2.13f, 0.35f, 3.02f, 1.05f)
                curveToRelative(0.89f, 0.7f, 1.46f, 1.6f, 1.73f, 2.69f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.12f, 0.0f, 2.08f, 0.39f, 2.88f, 1.18f)
                curveToRelative(0.79f, 0.78f, 1.19f, 1.74f, 1.19f, 2.85f)
                curveToRelative(0.0f, 0.6f, -0.12f, 1.17f, -0.37f, 1.7f)
                curveToRelative(-0.25f, 0.53f, -0.59f, 0.99f, -1.03f, 1.37f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 0.59f, -0.19f, 1.12f, -0.56f, 1.59f)
                curveToRelative(-0.37f, 0.47f, -0.84f, 0.76f, -1.4f, 0.89f)
                curveToRelative(-0.14f, 0.62f, -0.45f, 1.15f, -0.91f, 1.58f)
                curveToRelative(-0.46f, 0.43f, -1.01f, 0.7f, -1.63f, 0.8f)
                curveToRelative(0.29f, 0.34f, 0.43f, 0.72f, 0.43f, 1.13f)
                curveToRelative(0.0f, 0.48f, -0.17f, 0.89f, -0.51f, 1.24f)
                curveToRelative(-0.34f, 0.34f, -0.75f, 0.52f, -1.23f, 0.52f)
                curveToRelative(-0.48f, 0.0f, -0.89f, -0.17f, -1.23f, -0.52f)
                curveToRelative(-0.34f, -0.34f, -0.51f, -0.76f, -0.51f, -1.24f)
                curveToRelative(0.0f, -0.19f, 0.03f, -0.38f, 0.1f, -0.57f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.58f, 0.0f, -1.08f, -0.21f, -1.5f, -0.63f)
                curveToRelative(-0.42f, -0.42f, -0.63f, -0.92f, -0.63f, -1.5f)
                curveToRelative(0.0f, -0.4f, 0.1f, -0.76f, 0.3f, -1.07f)
                curveToRelative(-0.52f, -0.29f, -0.89f, -0.7f, -1.12f, -1.25f)
                horizontalLineToRelative(-1.28f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-1.07f, -0.07f, -1.98f, -0.49f, -2.73f, -1.27f)
                reflectiveCurveTo(6.34f, 13.56f, 6.34f, 12.48f)
                close()
                moveTo(7.74f, 12.23f)
                curveToRelative(0.0f, 0.8f, 0.28f, 1.48f, 0.84f, 2.04f)
                reflectiveCurveToRelative(1.24f, 0.84f, 2.03f, 0.84f)
                curveToRelative(0.49f, 0.0f, 0.95f, -0.11f, 1.37f, -0.34f)
                curveToRelative(0.12f, 0.74f, 0.47f, 1.36f, 1.04f, 1.86f)
                reflectiveCurveToRelative(1.25f, 0.74f, 2.02f, 0.74f)
                curveToRelative(0.87f, 0.0f, 1.61f, -0.31f, 2.22f, -0.92f)
                curveToRelative(0.41f, 0.48f, 0.92f, 0.71f, 1.54f, 0.71f)
                curveToRelative(0.57f, 0.0f, 1.05f, -0.2f, 1.46f, -0.6f)
                curveToRelative(0.4f, -0.4f, 0.6f, -0.89f, 0.6f, -1.46f)
                curveToRelative(0.4f, -0.27f, 0.72f, -0.61f, 0.95f, -1.04f)
                curveToRelative(0.23f, -0.42f, 0.35f, -0.88f, 0.35f, -1.37f)
                curveToRelative(0.0f, -0.79f, -0.28f, -1.47f, -0.85f, -2.02f)
                curveToRelative(-0.57f, -0.55f, -1.25f, -0.83f, -2.05f, -0.83f)
                curveToRelative(-0.56f, 0.0f, -1.07f, 0.15f, -1.53f, 0.44f)
                curveToRelative(0.06f, -0.24f, 0.08f, -0.51f, 0.08f, -0.79f)
                curveToRelative(0.0f, -0.96f, -0.34f, -1.78f, -1.03f, -2.46f)
                curveToRelative(-0.69f, -0.68f, -1.52f, -1.01f, -2.49f, -1.01f)
                curveToRelative(-0.94f, 0.0f, -1.75f, 0.33f, -2.43f, 0.97f)
                reflectiveCurveToRelative(-1.04f, 1.44f, -1.07f, 2.37f)
                curveToRelative(-0.02f, 0.0f, -0.05f, 0.0f, -0.08f, 0.0f)
                curveToRelative(-0.04f, 0.0f, -0.07f, 0.0f, -0.09f, 0.0f)
                curveToRelative(-0.79f, 0.0f, -1.46f, 0.28f, -2.03f, 0.84f)
                reflectiveCurveTo(7.74f, 11.45f, 7.74f, 12.23f)
                close()
            }
        }
        .build()
        return _smoke!!
    }

private var _smoke: ImageVector? = null
