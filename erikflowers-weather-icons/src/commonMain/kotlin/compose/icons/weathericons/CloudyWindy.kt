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

public val WeatherIcons.CloudyWindy: ImageVector
    get() {
        if (_cloudyWindy != null) {
            return _cloudyWindy!!
        }
        _cloudyWindy = Builder(name = "CloudyWindy", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 21.04f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.25f, -0.61f)
                reflectiveCurveToRelative(0.38f, -0.24f, 0.63f, -0.24f)
                horizontalLineToRelative(8.97f)
                curveToRelative(0.24f, 0.0f, 0.43f, 0.08f, 0.59f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.23f, 0.36f, 0.23f, 0.61f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.6f)
                curveToRelative(-0.16f, 0.16f, -0.35f, 0.24f, -0.59f, 0.24f)
                horizontalLineTo(3.98f)
                curveToRelative(-0.25f, 0.0f, -0.46f, -0.08f, -0.63f, -0.24f)
                reflectiveCurveTo(3.1f, 21.27f, 3.1f, 21.04f)
                close()
                moveTo(5.73f, 17.98f)
                curveToRelative(0.0f, -0.24f, 0.09f, -0.44f, 0.27f, -0.6f)
                curveToRelative(0.14f, -0.15f, 0.34f, -0.23f, 0.59f, -0.23f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.23f, 0.0f, 0.42f, 0.08f, 0.58f, 0.23f)
                reflectiveCurveToRelative(0.23f, 0.35f, 0.23f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.23f, 0.61f)
                curveToRelative(-0.15f, 0.17f, -0.35f, 0.25f, -0.58f, 0.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.09f, -0.6f, -0.26f)
                reflectiveCurveTo(5.73f, 18.21f, 5.73f, 17.98f)
                close()
                moveTo(6.35f, 15.65f)
                curveToRelative(0.0f, 0.09f, 0.06f, 0.14f, 0.17f, 0.14f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.09f, 0.0f, 0.17f, -0.05f, 0.23f, -0.14f)
                curveToRelative(0.23f, -0.54f, 0.57f, -0.99f, 1.04f, -1.35f)
                reflectiveCurveToRelative(0.99f, -0.56f, 1.58f, -0.6f)
                lineToRelative(0.54f, -0.07f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.18f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.09f, 0.58f, -1.99f, 1.39f, -2.72f)
                curveToRelative(0.82f, -0.73f, 1.77f, -1.09f, 2.87f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.03f, 0.36f, 2.83f, 1.07f)
                curveToRelative(0.8f, 0.72f, 1.27f, 1.62f, 1.41f, 2.7f)
                lineToRelative(0.07f, 0.59f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.16f, 0.18f, 0.16f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.96f)
                curveToRelative(0.64f, 0.64f, 0.96f, 1.41f, 0.96f, 2.32f)
                curveToRelative(0.0f, 0.88f, -0.33f, 1.64f, -0.97f, 2.28f)
                curveToRelative(-0.65f, 0.65f, -1.42f, 0.97f, -2.31f, 0.97f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(-0.12f, 0.0f, -0.18f, 0.06f, -0.18f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.18f, 0.18f)
                horizontalLineToRelative(6.89f)
                curveToRelative(0.68f, 0.0f, 1.32f, -0.13f, 1.94f, -0.39f)
                reflectiveCurveToRelative(1.14f, -0.61f, 1.58f, -1.05f)
                reflectiveCurveToRelative(0.79f, -0.97f, 1.05f, -1.58f)
                reflectiveCurveToRelative(0.39f, -1.25f, 0.39f, -1.92f)
                curveToRelative(0.0f, -0.9f, -0.22f, -1.73f, -0.66f, -2.49f)
                curveToRelative(-0.44f, -0.76f, -1.04f, -1.36f, -1.8f, -1.8f)
                curveToRelative(-0.76f, -0.44f, -1.6f, -0.66f, -2.5f, -0.66f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.33f, -1.34f, -1.03f, -2.44f, -2.1f, -3.3f)
                curveToRelative(-1.08f, -0.85f, -2.3f, -1.28f, -3.68f, -1.28f)
                curveToRelative(-1.42f, 0.0f, -2.67f, 0.44f, -3.76f, 1.33f)
                curveToRelative(-1.09f, 0.88f, -1.78f, 2.01f, -2.08f, 3.39f)
                curveToRelative(-0.86f, 0.19f, -1.62f, 0.6f, -2.27f, 1.21f)
                reflectiveCurveToRelative(-1.1f, 1.35f, -1.36f, 2.22f)
                verticalLineToRelative(0.02f)
                curveTo(6.36f, 15.6f, 6.35f, 15.62f, 6.35f, 15.65f)
                close()
                moveTo(7.5f, 24.13f)
                curveToRelative(0.0f, -0.24f, 0.09f, -0.44f, 0.26f, -0.6f)
                curveToRelative(0.15f, -0.16f, 0.35f, -0.23f, 0.59f, -0.23f)
                horizontalLineToRelative(8.99f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.61f, 0.24f)
                curveToRelative(0.17f, 0.16f, 0.25f, 0.36f, 0.25f, 0.6f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.25f, 0.61f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.25f, -0.61f, 0.25f)
                horizontalLineTo(8.35f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.6f, -0.25f)
                curveTo(7.58f, 24.57f, 7.5f, 24.37f, 7.5f, 24.13f)
                close()
            }
        }
        .build()
        return _cloudyWindy!!
    }

private var _cloudyWindy: ImageVector? = null
