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

public val WeatherIcons.Tsunami: ImageVector
    get() {
        if (_tsunami != null) {
            return _tsunami!!
        }
        _tsunami = Builder(name = "Tsunami", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.07f, 21.24f)
                curveToRelative(0.0f, -0.16f, 0.06f, -0.3f, 0.17f, -0.42f)
                curveToRelative(0.12f, -0.12f, 0.25f, -0.18f, 0.41f, -0.18f)
                horizontalLineToRelative(0.4f)
                curveToRelative(-0.21f, -0.66f, -0.39f, -1.35f, -0.53f, -2.07f)
                curveToRelative(-0.21f, -1.1f, -0.32f, -2.1f, -0.32f, -2.99f)
                curveToRelative(0.0f, -1.71f, 0.3f, -3.32f, 0.91f, -4.81f)
                curveTo(6.73f, 9.31f, 7.59f, 8.06f, 8.7f, 7.01f)
                curveToRelative(1.12f, -1.06f, 2.42f, -1.87f, 3.9f, -2.42f)
                curveToRelative(1.51f, -0.57f, 3.14f, -0.86f, 4.91f, -0.86f)
                curveToRelative(1.06f, 0.0f, 2.06f, 0.09f, 3.0f, 0.28f)
                curveToRelative(0.94f, 0.22f, 1.85f, 0.56f, 2.73f, 1.03f)
                lineToRelative(1.7f, 0.91f)
                lineToRelative(-1.88f, 0.39f)
                curveToRelative(-0.58f, 0.13f, -0.98f, 0.39f, -1.2f, 0.78f)
                curveToRelative(-0.16f, 0.32f, -0.15f, 0.69f, 0.03f, 1.11f)
                lineToRelative(0.41f, 0.95f)
                lineToRelative(-1.02f, 0.05f)
                curveToRelative(-0.43f, 0.03f, -0.83f, 0.12f, -1.18f, 0.27f)
                curveToRelative(-0.33f, 0.16f, -0.52f, 0.32f, -0.58f, 0.5f)
                curveToRelative(-0.11f, 0.23f, 0.01f, 0.56f, 0.36f, 1.0f)
                lineToRelative(0.81f, 0.96f)
                lineToRelative(-1.26f, 0.18f)
                curveToRelative(-1.55f, 0.23f, -2.82f, 0.55f, -3.81f, 0.96f)
                reflectiveCurveToRelative(-1.77f, 0.94f, -2.35f, 1.59f)
                curveToRelative(-0.56f, 0.62f, -0.98f, 1.42f, -1.25f, 2.37f)
                curveToRelative(-0.27f, 0.96f, -0.42f, 2.15f, -0.45f, 3.59f)
                horizontalLineToRelative(5.26f)
                verticalLineToRelative(-2.78f)
                lineToRelative(-0.38f, 0.23f)
                curveToRelative(-0.14f, 0.09f, -0.29f, 0.11f, -0.45f, 0.07f)
                curveToRelative(-0.17f, -0.04f, -0.29f, -0.13f, -0.37f, -0.28f)
                curveToRelative(-0.09f, -0.14f, -0.11f, -0.29f, -0.08f, -0.45f)
                reflectiveCurveToRelative(0.12f, -0.29f, 0.27f, -0.38f)
                lineToRelative(3.82f, -2.38f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.03f, -0.01f)
                curveToRelative(0.07f, -0.02f, 0.14f, -0.05f, 0.23f, -0.07f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.01f, 0.01f, 0.02f, 0.02f, 0.03f, 0.02f)
                horizontalLineToRelative(0.07f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.02f, 0.01f)
                horizontalLineToRelative(0.03f)
                lineToRelative(0.02f, 0.01f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.01f, 0.01f, 0.02f, 0.02f, 0.02f, 0.03f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f)
                curveToRelative(0.02f, 0.0f, 0.03f, 0.0f, 0.03f, 0.01f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.03f, 0.01f)
                lineToRelative(0.02f, 0.01f)
                lineToRelative(3.82f, 2.35f)
                curveToRelative(0.14f, 0.09f, 0.23f, 0.22f, 0.27f, 0.38f)
                curveToRelative(0.03f, 0.17f, 0.01f, 0.32f, -0.08f, 0.46f)
                curveToRelative(-0.08f, 0.14f, -0.2f, 0.23f, -0.37f, 0.26f)
                reflectiveCurveToRelative(-0.32f, 0.01f, -0.45f, -0.08f)
                lineToRelative(-0.31f, -0.19f)
                verticalLineToRelative(2.77f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.16f, 0.0f, 0.29f, 0.06f, 0.4f, 0.18f)
                curveToRelative(0.11f, 0.12f, 0.16f, 0.26f, 0.16f, 0.42f)
                curveToRelative(0.01f, 0.17f, -0.05f, 0.31f, -0.16f, 0.43f)
                curveToRelative(-0.11f, 0.12f, -0.25f, 0.18f, -0.4f, 0.18f)
                horizontalLineTo(5.65f)
                curveToRelative(-0.16f, 0.0f, -0.3f, -0.06f, -0.41f, -0.17f)
                curveTo(5.13f, 21.56f, 5.07f, 21.42f, 5.07f, 21.24f)
                close()
                moveTo(6.62f, 15.58f)
                curveToRelative(0.0f, 0.71f, 0.1f, 1.62f, 0.3f, 2.73f)
                curveToRelative(0.15f, 0.81f, 0.33f, 1.52f, 0.54f, 2.12f)
                horizontalLineToRelative(2.69f)
                curveToRelative(0.05f, -1.45f, 0.2f, -2.65f, 0.45f, -3.59f)
                curveToRelative(0.35f, -1.27f, 0.88f, -2.31f, 1.6f, -3.09f)
                curveToRelative(0.73f, -0.82f, 1.69f, -1.47f, 2.89f, -1.96f)
                curveToRelative(0.82f, -0.34f, 1.86f, -0.63f, 3.11f, -0.87f)
                lineToRelative(-0.08f, -0.25f)
                curveToRelative(-0.1f, -0.46f, -0.07f, -0.87f, 0.09f, -1.23f)
                curveToRelative(0.22f, -0.51f, 0.65f, -0.92f, 1.28f, -1.21f)
                curveToRelative(0.07f, -0.03f, 0.13f, -0.06f, 0.19f, -0.07f)
                curveToRelative(-0.86f, -0.2f, -1.73f, -0.25f, -2.6f, -0.14f)
                curveToRelative(-0.99f, 0.12f, -1.92f, 0.41f, -2.78f, 0.85f)
                curveToRelative(-1.11f, 0.58f, -2.11f, 1.41f, -3.01f, 2.48f)
                curveToRelative(-0.1f, 0.12f, -0.23f, 0.18f, -0.38f, 0.18f)
                curveToRelative(-0.12f, 0.0f, -0.22f, -0.03f, -0.31f, -0.1f)
                curveToRelative(-0.1f, -0.09f, -0.16f, -0.2f, -0.17f, -0.34f)
                reflectiveCurveToRelative(0.02f, -0.26f, 0.11f, -0.37f)
                curveToRelative(1.0f, -1.19f, 2.11f, -2.1f, 3.34f, -2.73f)
                curveToRelative(0.98f, -0.49f, 2.03f, -0.81f, 3.14f, -0.95f)
                curveToRelative(0.57f, -0.07f, 1.12f, -0.08f, 1.67f, -0.02f)
                curveToRelative(0.54f, 0.06f, 0.92f, 0.12f, 1.14f, 0.17f)
                reflectiveCurveToRelative(0.37f, 0.09f, 0.45f, 0.12f)
                lineToRelative(0.08f, 0.03f)
                curveToRelative(0.05f, -0.31f, 0.13f, -0.59f, 0.24f, -0.84f)
                curveToRelative(0.16f, -0.29f, 0.37f, -0.56f, 0.64f, -0.8f)
                curveToRelative(-0.3f, -0.09f, -0.65f, -0.19f, -1.04f, -0.28f)
                curveToRelative(-0.8f, -0.18f, -1.7f, -0.26f, -2.69f, -0.26f)
                curveToRelative(-1.58f, 0.0f, -3.05f, 0.26f, -4.42f, 0.77f)
                curveToRelative(-1.34f, 0.51f, -2.48f, 1.22f, -3.42f, 2.14f)
                curveToRelative(-0.98f, 0.91f, -1.73f, 2.0f, -2.23f, 3.26f)
                curveTo(6.89f, 12.65f, 6.62f, 14.07f, 6.62f, 15.58f)
                close()
                moveTo(18.05f, 20.64f)
                horizontalLineToRelative(3.88f)
                verticalLineToRelative(-3.52f)
                lineToRelative(-1.98f, -1.21f)
                lineToRelative(-1.9f, 1.19f)
                verticalLineTo(20.64f)
                close()
            }
        }
        .build()
        return _tsunami!!
    }

private var _tsunami: ImageVector? = null
