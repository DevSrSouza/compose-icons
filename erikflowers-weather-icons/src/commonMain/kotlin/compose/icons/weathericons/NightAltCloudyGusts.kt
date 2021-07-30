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

public val WeatherIcons.NightAltCloudyGusts: ImageVector
    get() {
        if (_nightAltCloudyGusts != null) {
            return _nightAltCloudyGusts!!
        }
        _nightAltCloudyGusts = Builder(name = "NightAltCloudyGusts", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.98f, 21.02f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.43f, 0.27f, 0.6f)
                curveToRelative(0.17f, 0.17f, 0.37f, 0.25f, 0.61f, 0.25f)
                horizontalLineTo(9.6f)
                curveToRelative(0.26f, 0.0f, 0.49f, 0.1f, 0.69f, 0.29f)
                curveToRelative(0.2f, 0.19f, 0.3f, 0.42f, 0.3f, 0.68f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.3f, 0.69f)
                reflectiveCurveToRelative(-0.43f, 0.29f, -0.69f, 0.29f)
                curveToRelative(-0.26f, 0.0f, -0.48f, -0.1f, -0.68f, -0.3f)
                curveToRelative(-0.18f, -0.16f, -0.38f, -0.24f, -0.61f, -0.24f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.24f)
                curveToRelative(-0.16f, 0.16f, -0.24f, 0.36f, -0.24f, 0.6f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.42f, 0.24f, 0.6f)
                curveToRelative(0.52f, 0.53f, 1.16f, 0.79f, 1.89f, 0.79f)
                reflectiveCurveToRelative(1.37f, -0.26f, 1.89f, -0.78f)
                curveToRelative(0.52f, -0.52f, 0.78f, -1.15f, 0.78f, -1.89f)
                curveToRelative(0.0f, -0.74f, -0.26f, -1.37f, -0.78f, -1.89f)
                reflectiveCurveToRelative(-1.15f, -0.79f, -1.89f, -0.79f)
                horizontalLineTo(3.86f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.09f, -0.62f, 0.26f)
                curveTo(3.07f, 20.59f, 2.98f, 20.79f, 2.98f, 21.02f)
                close()
                moveTo(2.98f, 18.0f)
                curveToRelative(0.0f, 0.22f, 0.09f, 0.41f, 0.27f, 0.58f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.24f, 0.61f, 0.24f)
                horizontalLineToRelative(10.85f)
                curveToRelative(0.74f, 0.0f, 1.37f, -0.26f, 1.89f, -0.78f)
                curveToRelative(0.52f, -0.52f, 0.78f, -1.15f, 0.78f, -1.88f)
                curveToRelative(0.0f, -0.74f, -0.26f, -1.36f, -0.78f, -1.88f)
                curveToRelative(-0.52f, -0.52f, -1.15f, -0.77f, -1.89f, -0.77f)
                curveToRelative(-0.76f, 0.0f, -1.39f, 0.25f, -1.89f, 0.76f)
                curveToRelative(-0.15f, 0.16f, -0.23f, 0.36f, -0.23f, 0.61f)
                curveToRelative(0.0f, 0.25f, 0.08f, 0.45f, 0.23f, 0.6f)
                curveToRelative(0.15f, 0.15f, 0.35f, 0.23f, 0.59f, 0.23f)
                reflectiveCurveToRelative(0.44f, -0.07f, 0.62f, -0.23f)
                curveToRelative(0.19f, -0.19f, 0.42f, -0.28f, 0.68f, -0.28f)
                curveToRelative(0.26f, 0.0f, 0.48f, 0.09f, 0.67f, 0.28f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.42f, 0.29f, 0.68f)
                curveToRelative(0.0f, 0.26f, -0.1f, 0.49f, -0.29f, 0.68f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.67f, 0.29f)
                horizontalLineTo(3.86f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.09f, -0.62f, 0.26f)
                curveTo(3.07f, 17.57f, 2.98f, 17.77f, 2.98f, 18.0f)
                close()
                moveTo(5.5f, 15.65f)
                curveToRelative(0.0f, 0.09f, 0.05f, 0.13f, 0.16f, 0.13f)
                horizontalLineTo(7.1f)
                curveToRelative(0.08f, 0.0f, 0.15f, -0.05f, 0.22f, -0.15f)
                curveToRelative(0.22f, -0.54f, 0.57f, -0.99f, 1.05f, -1.35f)
                curveToRelative(0.47f, -0.35f, 1.0f, -0.55f, 1.58f, -0.6f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.17f)
                lineToRelative(0.08f, -0.52f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.77f, -1.09f, 2.86f, -1.09f)
                reflectiveCurveToRelative(2.05f, 0.36f, 2.85f, 1.09f)
                curveToRelative(0.81f, 0.72f, 1.27f, 1.63f, 1.38f, 2.72f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.28f)
                curveToRelative(0.0f, 0.89f, -0.32f, 1.65f, -0.96f, 2.29f)
                curveToRelative(-0.64f, 0.64f, -1.41f, 0.96f, -2.31f, 0.96f)
                horizontalLineToRelative(-6.91f)
                curveToRelative(-0.11f, 0.0f, -0.17f, 0.06f, -0.17f, 0.18f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.17f, 0.17f)
                horizontalLineToRelative(6.91f)
                curveToRelative(0.89f, 0.0f, 1.72f, -0.22f, 2.48f, -0.67f)
                reflectiveCurveToRelative(1.36f, -1.05f, 1.8f, -1.81f)
                reflectiveCurveToRelative(0.67f, -1.59f, 0.67f, -2.48f)
                curveToRelative(0.0f, -0.88f, -0.23f, -1.71f, -0.68f, -2.48f)
                curveToRelative(0.73f, -0.71f, 1.23f, -1.57f, 1.51f, -2.58f)
                lineTo(27.0f, 11.18f)
                curveToRelative(0.02f, -0.02f, 0.03f, -0.04f, 0.03f, -0.07f)
                curveToRelative(0.0f, -0.04f, -0.05f, -0.1f, -0.14f, -0.16f)
                lineToRelative(-0.6f, -0.21f)
                curveToRelative(-0.84f, -0.26f, -1.48f, -0.71f, -1.92f, -1.36f)
                curveToRelative(-0.44f, -0.65f, -0.66f, -1.32f, -0.66f, -2.02f)
                curveToRelative(0.0f, -0.24f, 0.03f, -0.51f, 0.09f, -0.79f)
                lineToRelative(0.13f, -0.62f)
                curveToRelative(0.02f, -0.1f, -0.02f, -0.18f, -0.13f, -0.22f)
                lineToRelative(-0.8f, -0.24f)
                curveToRelative(-0.44f, -0.11f, -0.85f, -0.16f, -1.25f, -0.16f)
                curveToRelative(-0.37f, 0.0f, -0.74f, 0.04f, -1.12f, 0.13f)
                curveToRelative(-0.38f, 0.09f, -0.77f, 0.22f, -1.18f, 0.41f)
                curveToRelative(-0.4f, 0.18f, -0.8f, 0.45f, -1.18f, 0.8f)
                curveToRelative(-0.38f, 0.35f, -0.72f, 0.75f, -1.0f, 1.22f)
                curveToRelative(-0.71f, -0.3f, -1.48f, -0.45f, -2.32f, -0.45f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.31f)
                reflectiveCurveToRelative(-1.77f, 1.99f, -2.07f, 3.35f)
                curveToRelative(-0.86f, 0.2f, -1.61f, 0.61f, -2.27f, 1.23f)
                curveToRelative(-0.66f, 0.62f, -1.11f, 1.35f, -1.36f, 2.2f)
                verticalLineToRelative(0.03f)
                curveTo(5.51f, 15.58f, 5.5f, 15.61f, 5.5f, 15.65f)
                close()
                moveTo(18.73f, 8.76f)
                curveToRelative(0.31f, -0.55f, 0.74f, -0.97f, 1.29f, -1.26f)
                curveToRelative(0.55f, -0.29f, 1.12f, -0.44f, 1.71f, -0.44f)
                curveToRelative(0.14f, 0.0f, 0.24f, 0.0f, 0.31f, 0.01f)
                curveToRelative(-0.01f, 0.09f, -0.02f, 0.21f, -0.02f, 0.36f)
                curveToRelative(0.0f, 0.94f, 0.26f, 1.85f, 0.79f, 2.71f)
                curveToRelative(0.52f, 0.86f, 1.25f, 1.51f, 2.17f, 1.94f)
                curveToRelative(-0.16f, 0.38f, -0.41f, 0.72f, -0.75f, 1.03f)
                curveToRelative(-0.89f, -0.76f, -1.94f, -1.14f, -3.16f, -1.14f)
                horizontalLineToRelative(-0.33f)
                curveTo(20.48f, 10.71f, 19.81f, 9.64f, 18.73f, 8.76f)
                close()
            }
        }
        .build()
        return _nightAltCloudyGusts!!
    }

private var _nightAltCloudyGusts: ImageVector? = null
