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

public val WeatherIcons.NightCloudyWindy: ImageVector
    get() {
        if (_nightCloudyWindy != null) {
            return _nightCloudyWindy!!
        }
        _nightCloudyWindy = Builder(name = "NightCloudyWindy", defaultWidth = 30.0.dp, defaultHeight
                = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.43f, 21.0f)
                curveToRelative(0.0f, 0.25f, 0.09f, 0.45f, 0.27f, 0.6f)
                curveToRelative(0.17f, 0.17f, 0.37f, 0.26f, 0.61f, 0.26f)
                horizontalLineToRelative(9.54f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.61f)
                reflectiveCurveToRelative(-0.08f, -0.44f, -0.24f, -0.61f)
                curveToRelative(-0.16f, -0.17f, -0.35f, -0.25f, -0.59f, -0.25f)
                horizontalLineTo(3.31f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.09f, -0.62f, 0.26f)
                curveTo(2.52f, 20.57f, 2.43f, 20.77f, 2.43f, 21.0f)
                close()
                moveTo(5.07f, 17.97f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.42f, 0.27f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.6f, 0.24f)
                horizontalLineToRelative(9.55f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.24f, -0.6f)
                curveToRelative(-0.16f, -0.17f, -0.35f, -0.25f, -0.59f, -0.25f)
                horizontalLineTo(5.94f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.25f)
                curveTo(5.15f, 17.54f, 5.07f, 17.74f, 5.07f, 17.97f)
                close()
                moveTo(6.21f, 15.64f)
                curveToRelative(0.0f, 0.07f, 0.07f, 0.11f, 0.2f, 0.11f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.09f, 0.0f, 0.16f, -0.05f, 0.23f, -0.14f)
                curveToRelative(0.22f, -0.54f, 0.57f, -0.99f, 1.05f, -1.35f)
                curveToRelative(0.47f, -0.36f, 1.0f, -0.56f, 1.58f, -0.6f)
                lineToRelative(0.54f, -0.07f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.18f)
                lineToRelative(0.07f, -0.51f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.77f, -1.1f, 2.87f, -1.1f)
                reflectiveCurveToRelative(2.06f, 0.36f, 2.87f, 1.09f)
                curveToRelative(0.81f, 0.72f, 1.28f, 1.63f, 1.39f, 2.73f)
                lineToRelative(0.08f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.17f, 0.19f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.69f, 0.32f, 2.33f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.29f)
                curveToRelative(0.0f, 0.89f, -0.32f, 1.65f, -0.96f, 2.29f)
                curveToRelative(-0.64f, 0.64f, -1.42f, 0.96f, -2.33f, 0.96f)
                horizontalLineToRelative(-6.91f)
                curveToRelative(-0.11f, 0.0f, -0.17f, 0.06f, -0.17f, 0.17f)
                verticalLineToRelative(1.38f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.17f, 0.18f)
                horizontalLineToRelative(6.91f)
                curveToRelative(0.91f, 0.0f, 1.74f, -0.22f, 2.51f, -0.67f)
                curveToRelative(0.77f, -0.44f, 1.37f, -1.05f, 1.82f, -1.81f)
                curveToRelative(0.45f, -0.76f, 0.67f, -1.59f, 0.67f, -2.49f)
                curveToRelative(0.0f, -0.71f, -0.15f, -1.37f, -0.44f, -2.01f)
                curveToRelative(0.77f, -1.01f, 1.15f, -2.1f, 1.15f, -3.29f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.64f)
                reflectiveCurveToRelative(-1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.69f, -0.7f, -2.64f, -0.7f)
                curveToRelative(-1.52f, 0.0f, -2.81f, 0.56f, -3.84f, 1.67f)
                curveTo(17.6f, 7.6f, 16.7f, 7.4f, 15.74f, 7.4f)
                curveToRelative(-0.93f, 0.0f, -1.81f, 0.2f, -2.63f, 0.59f)
                reflectiveCurveToRelative(-1.51f, 0.95f, -2.07f, 1.66f)
                curveToRelative(-0.56f, 0.71f, -0.94f, 1.52f, -1.13f, 2.43f)
                curveToRelative(-0.88f, 0.2f, -1.64f, 0.6f, -2.29f, 1.2f)
                curveToRelative(-0.65f, 0.6f, -1.11f, 1.33f, -1.36f, 2.17f)
                lineTo(6.21f, 15.64f)
                close()
                moveTo(6.83f, 24.09f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.43f, 0.26f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.6f, 0.24f)
                horizontalLineToRelative(9.56f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.6f, -0.23f)
                reflectiveCurveToRelative(0.25f, -0.35f, 0.25f, -0.59f)
                reflectiveCurveToRelative(-0.08f, -0.44f, -0.25f, -0.61f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.25f, -0.6f, -0.25f)
                horizontalLineTo(7.69f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.09f, -0.6f, 0.26f)
                curveTo(6.92f, 23.66f, 6.83f, 23.86f, 6.83f, 24.09f)
                close()
                moveTo(19.83f, 9.02f)
                curveToRelative(0.67f, -0.65f, 1.5f, -0.98f, 2.47f, -0.98f)
                curveToRelative(0.99f, 0.0f, 1.83f, 0.35f, 2.52f, 1.04f)
                curveToRelative(0.69f, 0.69f, 1.04f, 1.53f, 1.04f, 2.52f)
                curveToRelative(0.0f, 0.63f, -0.16f, 1.22f, -0.49f, 1.77f)
                curveToRelative(-0.98f, -0.96f, -2.15f, -1.43f, -3.52f, -1.43f)
                horizontalLineToRelative(-0.32f)
                curveTo(21.3f, 10.84f, 20.73f, 9.87f, 19.83f, 9.02f)
                close()
            }
        }
        .build()
        return _nightCloudyWindy!!
    }

private var _nightCloudyWindy: ImageVector? = null
