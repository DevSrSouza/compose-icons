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

public val WeatherIcons.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 12.68f)
                verticalLineToRelative(-0.32f)
                curveToRelative(0.0f, -0.1f, 0.03f, -0.18f, 0.1f, -0.25f)
                curveToRelative(0.07f, -0.07f, 0.15f, -0.1f, 0.25f, -0.1f)
                horizontalLineToRelative(7.58f)
                curveToRelative(0.1f, 0.0f, 0.18f, 0.03f, 0.25f, 0.1f)
                curveToRelative(0.07f, 0.07f, 0.1f, 0.15f, 0.1f, 0.25f)
                verticalLineToRelative(0.32f)
                curveToRelative(0.0f, 0.1f, -0.03f, 0.18f, -0.1f, 0.25f)
                curveToRelative(-0.07f, 0.07f, -0.15f, 0.1f, -0.25f, 0.1f)
                horizontalLineToRelative(-0.44f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.02f, -0.28f, 0.14f, -0.52f, 0.35f, -0.71f)
                curveToRelative(0.21f, -0.19f, 0.46f, -0.29f, 0.75f, -0.29f)
                curveToRelative(0.29f, 0.0f, 0.53f, 0.1f, 0.74f, 0.29f)
                curveToRelative(0.21f, 0.19f, 0.32f, 0.43f, 0.35f, 0.71f)
                horizontalLineToRelative(1.32f)
                verticalLineToRelative(-3.39f)
                curveToRelative(-0.14f, -0.01f, -0.25f, -0.06f, -0.35f, -0.16f)
                curveToRelative(-0.1f, -0.1f, -0.15f, -0.23f, -0.15f, -0.37f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0.0f, -0.14f, 0.05f, -0.27f, 0.16f, -0.38f)
                reflectiveCurveToRelative(0.24f, -0.16f, 0.39f, -0.16f)
                horizontalLineToRelative(1.99f)
                curveToRelative(0.15f, 0.0f, 0.28f, 0.05f, 0.38f, 0.16f)
                reflectiveCurveToRelative(0.15f, 0.23f, 0.15f, 0.38f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 0.14f, -0.05f, 0.27f, -0.14f, 0.37f)
                curveToRelative(-0.09f, 0.1f, -0.2f, 0.16f, -0.34f, 0.16f)
                verticalLineToRelative(3.39f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.1f, 0.71f, 0.3f)
                reflectiveCurveToRelative(0.3f, 0.44f, 0.3f, 0.71f)
                verticalLineToRelative(2.93f)
                lineToRelative(3.73f, 4.87f)
                horizontalLineToRelative(-4.74f)
                verticalLineToRelative(-3.04f)
                horizontalLineToRelative(-0.71f)
                curveToRelative(0.11f, 0.26f, 0.16f, 0.54f, 0.16f, 0.83f)
                curveToRelative(0.0f, 0.61f, -0.21f, 1.12f, -0.64f, 1.56f)
                curveToRelative(-0.43f, 0.43f, -0.95f, 0.65f, -1.55f, 0.65f)
                curveToRelative(-0.61f, 0.0f, -1.12f, -0.22f, -1.56f, -0.65f)
                curveToRelative(-0.43f, -0.43f, -0.65f, -0.95f, -0.65f, -1.56f)
                curveToRelative(0.0f, -0.29f, 0.05f, -0.57f, 0.16f, -0.83f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.11f, 0.27f, 0.17f, 0.55f, 0.17f, 0.83f)
                curveToRelative(0.0f, 0.61f, -0.22f, 1.12f, -0.65f, 1.56f)
                reflectiveCurveToRelative(-0.95f, 0.65f, -1.56f, 0.65f)
                curveToRelative(-0.61f, 0.0f, -1.12f, -0.22f, -1.55f, -0.65f)
                reflectiveCurveToRelative(-0.64f, -0.95f, -0.64f, -1.56f)
                curveToRelative(0.0f, -0.29f, 0.05f, -0.57f, 0.16f, -0.83f)
                horizontalLineTo(9.97f)
                curveToRelative(0.12f, 0.29f, 0.18f, 0.57f, 0.18f, 0.83f)
                curveToRelative(0.0f, 0.61f, -0.22f, 1.12f, -0.65f, 1.56f)
                reflectiveCurveToRelative(-0.95f, 0.65f, -1.56f, 0.65f)
                reflectiveCurveToRelative(-1.12f, -0.22f, -1.56f, -0.65f)
                reflectiveCurveToRelative(-0.65f, -0.95f, -0.65f, -1.56f)
                curveToRelative(0.0f, -0.29f, 0.06f, -0.57f, 0.17f, -0.84f)
                curveToRelative(-0.24f, -0.04f, -0.45f, -0.15f, -0.61f, -0.34f)
                reflectiveCurveToRelative(-0.24f, -0.41f, -0.24f, -0.66f)
                verticalLineToRelative(-0.86f)
                horizontalLineTo(5.03f)
                verticalLineToRelative(-5.55f)
                horizontalLineTo(4.6f)
                curveToRelative(-0.1f, 0.0f, -0.18f, -0.03f, -0.25f, -0.1f)
                curveTo(4.28f, 12.86f, 4.25f, 12.78f, 4.25f, 12.68f)
                close()
                moveTo(6.3f, 16.62f)
                curveToRelative(0.0f, 0.21f, 0.07f, 0.39f, 0.22f, 0.54f)
                curveToRelative(0.15f, 0.15f, 0.33f, 0.22f, 0.54f, 0.22f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.21f, 0.0f, 0.39f, -0.07f, 0.53f, -0.22f)
                curveToRelative(0.14f, -0.15f, 0.22f, -0.33f, 0.22f, -0.54f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0.0f, -0.21f, -0.07f, -0.38f, -0.22f, -0.53f)
                curveToRelative(-0.15f, -0.15f, -0.32f, -0.22f, -0.53f, -0.22f)
                horizontalLineTo(7.07f)
                curveToRelative(-0.21f, 0.0f, -0.39f, 0.07f, -0.54f, 0.23f)
                curveToRelative(-0.15f, 0.15f, -0.22f, 0.32f, -0.22f, 0.52f)
                verticalLineTo(16.62f)
                close()
                moveTo(15.78f, 5.43f)
                curveToRelative(0.0f, 0.41f, 0.16f, 0.76f, 0.47f, 1.04f)
                curveToRelative(0.0f, 0.2f, 0.09f, 0.43f, 0.26f, 0.68f)
                reflectiveCurveToRelative(0.36f, 0.4f, 0.56f, 0.44f)
                curveToRelative(0.04f, 0.22f, 0.15f, 0.41f, 0.31f, 0.57f)
                curveToRelative(0.16f, 0.15f, 0.36f, 0.25f, 0.59f, 0.3f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.24f, -0.16f, 0.39f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.33f, 0.18f, 0.45f)
                curveToRelative(0.12f, 0.12f, 0.27f, 0.18f, 0.45f, 0.18f)
                curveToRelative(0.18f, 0.0f, 0.33f, -0.06f, 0.46f, -0.19f)
                curveToRelative(0.13f, -0.12f, 0.19f, -0.28f, 0.19f, -0.45f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.05f, -0.01f, -0.09f)
                curveToRelative(-0.01f, -0.04f, -0.01f, -0.08f, -0.01f, -0.1f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.21f, 0.0f, 0.39f, -0.08f, 0.54f, -0.23f)
                curveToRelative(0.15f, -0.15f, 0.23f, -0.34f, 0.23f, -0.55f)
                curveToRelative(0.0f, -0.1f, -0.04f, -0.22f, -0.12f, -0.38f)
                curveToRelative(0.17f, -0.09f, 0.31f, -0.25f, 0.41f, -0.47f)
                horizontalLineToRelative(0.45f)
                curveTo(21.0f, 7.0f, 21.34f, 6.85f, 21.61f, 6.57f)
                curveToRelative(0.28f, -0.28f, 0.42f, -0.61f, 0.42f, -1.01f)
                curveToRelative(0.0f, -0.34f, -0.11f, -0.64f, -0.33f, -0.9f)
                curveToRelative(-0.22f, -0.26f, -0.5f, -0.43f, -0.83f, -0.52f)
                curveToRelative(-0.08f, -0.4f, -0.29f, -0.73f, -0.62f, -0.99f)
                reflectiveCurveToRelative(-0.71f, -0.39f, -1.12f, -0.39f)
                curveToRelative(-0.41f, 0.0f, -0.77f, 0.13f, -1.08f, 0.38f)
                curveToRelative(-0.31f, 0.25f, -0.52f, 0.58f, -0.62f, 0.97f)
                horizontalLineToRelative(-0.11f)
                curveToRelative(-0.41f, 0.0f, -0.77f, 0.13f, -1.08f, 0.39f)
                curveTo(15.93f, 4.75f, 15.78f, 5.07f, 15.78f, 5.43f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
