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

public val WeatherIcons.NightCloudyGusts: ImageVector
    get() {
        if (_nightCloudyGusts != null) {
            return _nightCloudyGusts!!
        }
        _nightCloudyGusts = Builder(name = "NightCloudyGusts", defaultWidth = 30.0.dp, defaultHeight
                = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.06f, 20.98f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.44f, 0.27f, 0.6f)
                curveToRelative(0.18f, 0.18f, 0.38f, 0.27f, 0.61f, 0.27f)
                horizontalLineToRelative(5.88f)
                curveToRelative(0.26f, 0.0f, 0.49f, 0.09f, 0.69f, 0.28f)
                curveToRelative(0.2f, 0.19f, 0.3f, 0.42f, 0.3f, 0.68f)
                curveToRelative(0.0f, 0.26f, -0.1f, 0.48f, -0.3f, 0.68f)
                reflectiveCurveToRelative(-0.43f, 0.3f, -0.68f, 0.3f)
                curveToRelative(-0.25f, 0.0f, -0.48f, -0.1f, -0.68f, -0.3f)
                curveToRelative(-0.19f, -0.17f, -0.39f, -0.26f, -0.62f, -0.26f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.25f)
                curveToRelative(-0.16f, 0.17f, -0.24f, 0.37f, -0.24f, 0.61f)
                reflectiveCurveToRelative(0.08f, 0.44f, 0.24f, 0.6f)
                curveToRelative(0.52f, 0.52f, 1.15f, 0.78f, 1.88f, 0.78f)
                curveToRelative(0.74f, 0.0f, 1.38f, -0.26f, 1.89f, -0.77f)
                curveToRelative(0.52f, -0.52f, 0.78f, -1.14f, 0.78f, -1.88f)
                curveToRelative(0.0f, -0.74f, -0.26f, -1.38f, -0.78f, -1.9f)
                curveToRelative(-0.52f, -0.52f, -1.15f, -0.79f, -1.89f, -0.79f)
                horizontalLineTo(3.94f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.62f, 0.25f)
                curveTo(3.14f, 20.55f, 3.06f, 20.75f, 3.06f, 20.98f)
                close()
                moveTo(3.06f, 17.97f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.42f, 0.27f, 0.58f)
                curveToRelative(0.15f, 0.16f, 0.35f, 0.24f, 0.61f, 0.24f)
                horizontalLineToRelative(10.99f)
                curveToRelative(0.74f, 0.0f, 1.37f, -0.26f, 1.89f, -0.78f)
                curveToRelative(0.52f, -0.52f, 0.78f, -1.15f, 0.78f, -1.88f)
                reflectiveCurveToRelative(-0.26f, -1.36f, -0.78f, -1.88f)
                curveToRelative(-0.52f, -0.52f, -1.15f, -0.77f, -1.89f, -0.77f)
                curveToRelative(-0.76f, 0.0f, -1.39f, 0.25f, -1.89f, 0.75f)
                curveToRelative(-0.15f, 0.17f, -0.23f, 0.38f, -0.23f, 0.63f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.23f, 0.59f)
                reflectiveCurveToRelative(0.35f, 0.23f, 0.6f, 0.23f)
                curveToRelative(0.25f, 0.0f, 0.45f, -0.07f, 0.61f, -0.23f)
                curveToRelative(0.19f, -0.19f, 0.42f, -0.28f, 0.68f, -0.28f)
                curveToRelative(0.26f, 0.0f, 0.48f, 0.09f, 0.68f, 0.28f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.42f, 0.29f, 0.68f)
                reflectiveCurveToRelative(-0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.68f, 0.29f)
                horizontalLineTo(3.94f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.62f, 0.25f)
                curveTo(3.14f, 17.54f, 3.06f, 17.74f, 3.06f, 17.97f)
                close()
                moveTo(5.71f, 15.63f)
                curveToRelative(0.0f, 0.08f, 0.06f, 0.12f, 0.17f, 0.12f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.08f, 0.0f, 0.15f, -0.05f, 0.22f, -0.14f)
                curveToRelative(0.23f, -0.54f, 0.57f, -0.99f, 1.05f, -1.35f)
                curveToRelative(0.47f, -0.36f, 1.0f, -0.56f, 1.59f, -0.6f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.19f)
                lineToRelative(0.07f, -0.5f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.77f, -1.09f, 2.86f, -1.09f)
                reflectiveCurveToRelative(2.04f, 0.36f, 2.85f, 1.08f)
                curveToRelative(0.81f, 0.72f, 1.27f, 1.63f, 1.39f, 2.72f)
                lineToRelative(0.07f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.18f, 0.18f)
                horizontalLineToRelative(1.63f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.32f, 2.31f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.28f)
                curveToRelative(0.0f, 0.89f, -0.32f, 1.66f, -0.96f, 2.29f)
                curveToRelative(-0.64f, 0.63f, -1.41f, 0.95f, -2.31f, 0.95f)
                horizontalLineToRelative(-6.91f)
                curveToRelative(-0.11f, 0.0f, -0.17f, 0.06f, -0.17f, 0.18f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.17f, 0.18f)
                horizontalLineToRelative(6.91f)
                curveToRelative(0.89f, 0.0f, 1.72f, -0.22f, 2.48f, -0.67f)
                curveToRelative(0.76f, -0.44f, 1.36f, -1.05f, 1.8f, -1.81f)
                curveToRelative(0.44f, -0.76f, 0.66f, -1.59f, 0.66f, -2.49f)
                curveToRelative(0.0f, -0.74f, -0.14f, -1.42f, -0.42f, -2.02f)
                curveToRelative(0.76f, -1.0f, 1.14f, -2.11f, 1.14f, -3.33f)
                curveToRelative(0.0f, -0.71f, -0.14f, -1.39f, -0.42f, -2.04f)
                reflectiveCurveToRelative(-0.65f, -1.2f, -1.12f, -1.67f)
                curveToRelative(-0.47f, -0.47f, -1.03f, -0.84f, -1.67f, -1.11f)
                reflectiveCurveTo(22.42f, 6.3f, 21.71f, 6.3f)
                curveToRelative(-1.54f, 0.0f, -2.84f, 0.58f, -3.88f, 1.73f)
                curveToRelative(-0.78f, -0.41f, -1.67f, -0.61f, -2.65f, -0.61f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.31f)
                reflectiveCurveToRelative(-1.77f, 1.99f, -2.07f, 3.35f)
                curveToRelative(-0.85f, 0.2f, -1.6f, 0.61f, -2.26f, 1.23f)
                reflectiveCurveToRelative(-1.11f, 1.35f, -1.37f, 2.18f)
                verticalLineToRelative(0.04f)
                curveTo(5.72f, 15.58f, 5.71f, 15.62f, 5.71f, 15.63f)
                close()
                moveTo(19.24f, 9.0f)
                curveToRelative(0.72f, -0.68f, 1.54f, -1.02f, 2.48f, -1.02f)
                curveToRelative(0.98f, 0.0f, 1.81f, 0.35f, 2.51f, 1.05f)
                reflectiveCurveToRelative(1.05f, 1.53f, 1.05f, 2.5f)
                curveToRelative(0.0f, 0.61f, -0.17f, 1.22f, -0.51f, 1.85f)
                curveToRelative(-0.96f, -0.96f, -2.11f, -1.43f, -3.47f, -1.43f)
                horizontalLineToRelative(-0.33f)
                curveTo(20.73f, 10.88f, 20.16f, 9.89f, 19.24f, 9.0f)
                close()
            }
        }
        .build()
        return _nightCloudyGusts!!
    }

private var _nightCloudyGusts: ImageVector? = null
