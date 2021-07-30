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

public val WeatherIcons.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp, viewportWidth
                = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.62f, 21.05f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.25f, -0.61f)
                curveToRelative(0.17f, -0.16f, 0.38f, -0.24f, 0.63f, -0.24f)
                horizontalLineToRelative(18.67f)
                curveToRelative(0.25f, 0.0f, 0.45f, 0.08f, 0.61f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.24f, 0.36f, 0.24f, 0.61f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.25f, 0.58f)
                curveToRelative(-0.17f, 0.16f, -0.37f, 0.23f, -0.6f, 0.23f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.25f, 0.0f, -0.46f, -0.08f, -0.63f, -0.23f)
                curveTo(2.7f, 21.47f, 2.62f, 21.28f, 2.62f, 21.05f)
                close()
                moveTo(5.24f, 17.91f)
                curveToRelative(0.0f, -0.24f, 0.09f, -0.44f, 0.26f, -0.6f)
                curveToRelative(0.15f, -0.15f, 0.35f, -0.23f, 0.59f, -0.23f)
                horizontalLineToRelative(18.67f)
                curveToRelative(0.23f, 0.0f, 0.42f, 0.08f, 0.58f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.23f, 0.35f, 0.23f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.23f, 0.6f)
                curveToRelative(-0.16f, 0.17f, -0.35f, 0.25f, -0.58f, 0.25f)
                horizontalLineTo(6.09f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.25f)
                curveTo(5.32f, 18.34f, 5.24f, 18.14f, 5.24f, 17.91f)
                close()
                moveTo(5.37f, 15.52f)
                curveToRelative(0.0f, 0.09f, 0.05f, 0.13f, 0.15f, 0.13f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.06f, 0.0f, 0.13f, -0.05f, 0.2f, -0.16f)
                curveToRelative(0.24f, -0.52f, 0.59f, -0.94f, 1.06f, -1.27f)
                curveToRelative(0.47f, -0.33f, 0.99f, -0.52f, 1.55f, -0.56f)
                lineToRelative(0.55f, -0.07f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.18f)
                lineToRelative(0.07f, -0.5f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.98f, 1.37f, -2.7f)
                curveToRelative(0.81f, -0.72f, 1.76f, -1.08f, 2.85f, -1.08f)
                curveToRelative(1.08f, 0.0f, 2.02f, 0.36f, 2.83f, 1.07f)
                curveToRelative(0.8f, 0.71f, 1.26f, 1.61f, 1.37f, 2.68f)
                lineToRelative(0.08f, 0.57f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.64f, 0.0f, 1.23f, 0.17f, 1.76f, 0.52f)
                reflectiveCurveToRelative(0.92f, 0.8f, 1.18f, 1.37f)
                curveToRelative(0.07f, 0.11f, 0.14f, 0.16f, 0.21f, 0.16f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.12f, 0.0f, 0.17f, -0.07f, 0.14f, -0.23f)
                curveToRelative(-0.29f, -1.02f, -0.88f, -1.86f, -1.74f, -2.51f)
                curveToRelative(-0.87f, -0.65f, -1.86f, -0.97f, -2.97f, -0.97f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.33f, -1.33f, -1.03f, -2.42f, -2.1f, -3.27f)
                reflectiveCurveToRelative(-2.28f, -1.27f, -3.65f, -1.27f)
                curveToRelative(-1.4f, 0.0f, -2.64f, 0.44f, -3.73f, 1.32f)
                reflectiveCurveToRelative(-1.78f, 2.0f, -2.09f, 3.36f)
                curveToRelative(-0.85f, 0.2f, -1.6f, 0.6f, -2.24f, 1.21f)
                curveToRelative(-0.64f, 0.61f, -1.09f, 1.33f, -1.34f, 2.18f)
                verticalLineToRelative(-0.04f)
                curveTo(5.37f, 15.45f, 5.37f, 15.48f, 5.37f, 15.52f)
                close()
                moveTo(6.98f, 24.11f)
                curveToRelative(0.0f, -0.24f, 0.09f, -0.43f, 0.26f, -0.59f)
                curveToRelative(0.15f, -0.15f, 0.35f, -0.23f, 0.6f, -0.23f)
                horizontalLineToRelative(18.68f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.23f)
                curveToRelative(0.17f, 0.16f, 0.25f, 0.35f, 0.25f, 0.58f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.25f, 0.61f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.25f, -0.6f, 0.25f)
                horizontalLineTo(7.84f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.09f, -0.6f, -0.26f)
                curveTo(7.07f, 24.55f, 6.98f, 24.34f, 6.98f, 24.11f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
