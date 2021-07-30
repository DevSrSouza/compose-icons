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

public val WeatherIcons.NightAltCloudyWindy: ImageVector
    get() {
        if (_nightAltCloudyWindy != null) {
            return _nightAltCloudyWindy!!
        }
        _nightAltCloudyWindy = Builder(name = "NightAltCloudyWindy", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.35f, 21.05f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.25f, 0.59f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.23f, 0.63f, 0.23f)
                horizontalLineToRelative(9.4f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.25f, -0.08f, -0.45f, -0.23f, -0.61f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                horizontalLineToRelative(-9.4f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.63f, 0.24f)
                reflectiveCurveTo(2.35f, 20.8f, 2.35f, 21.05f)
                close()
                moveTo(4.98f, 18.0f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.44f, 0.26f, 0.6f)
                curveToRelative(0.16f, 0.17f, 0.36f, 0.25f, 0.6f, 0.25f)
                horizontalLineToRelative(9.42f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.23f, -0.59f)
                reflectiveCurveToRelative(-0.35f, -0.24f, -0.59f, -0.24f)
                horizontalLineTo(5.85f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.24f)
                curveTo(5.07f, 17.57f, 4.98f, 17.77f, 4.98f, 18.0f)
                close()
                moveTo(6.02f, 15.66f)
                curveToRelative(0.0f, 0.09f, 0.06f, 0.14f, 0.18f, 0.14f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.09f, 0.0f, 0.16f, -0.05f, 0.22f, -0.14f)
                curveToRelative(0.23f, -0.54f, 0.57f, -0.99f, 1.04f, -1.35f)
                curveToRelative(0.47f, -0.36f, 0.99f, -0.56f, 1.58f, -0.6f)
                lineToRelative(0.55f, -0.07f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.09f, 0.57f, -2.0f, 1.38f, -2.72f)
                curveToRelative(0.82f, -0.73f, 1.77f, -1.09f, 2.87f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.36f, 2.84f, 1.08f)
                curveToRelative(0.8f, 0.72f, 1.27f, 1.62f, 1.41f, 2.71f)
                lineToRelative(0.08f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.96f)
                curveToRelative(0.64f, 0.64f, 0.96f, 1.41f, 0.96f, 2.31f)
                curveToRelative(0.0f, 0.88f, -0.32f, 1.65f, -0.97f, 2.29f)
                curveToRelative(-0.65f, 0.65f, -1.41f, 0.97f, -2.3f, 0.97f)
                horizontalLineToRelative(-6.91f)
                curveToRelative(-0.11f, 0.0f, -0.17f, 0.06f, -0.17f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.17f, 0.17f)
                horizontalLineToRelative(6.91f)
                curveToRelative(0.9f, 0.0f, 1.73f, -0.22f, 2.49f, -0.66f)
                curveToRelative(0.76f, -0.44f, 1.37f, -1.04f, 1.81f, -1.8f)
                curveToRelative(0.44f, -0.76f, 0.67f, -1.59f, 0.67f, -2.49f)
                reflectiveCurveToRelative(-0.22f, -1.72f, -0.65f, -2.47f)
                curveToRelative(0.72f, -0.64f, 1.22f, -1.5f, 1.51f, -2.58f)
                lineToRelative(0.18f, -0.68f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.03f, 0.01f, -0.07f)
                curveToRelative(0.0f, -0.08f, -0.05f, -0.13f, -0.15f, -0.16f)
                lineToRelative(-0.62f, -0.22f)
                curveToRelative(-0.44f, -0.13f, -0.83f, -0.32f, -1.16f, -0.57f)
                curveToRelative(-0.34f, -0.25f, -0.6f, -0.53f, -0.8f, -0.84f)
                curveToRelative(-0.2f, -0.31f, -0.34f, -0.62f, -0.44f, -0.94f)
                curveToRelative(-0.1f, -0.32f, -0.15f, -0.63f, -0.15f, -0.95f)
                curveToRelative(0.0f, -0.24f, 0.04f, -0.53f, 0.11f, -0.87f)
                lineToRelative(0.13f, -0.61f)
                curveToRelative(0.04f, -0.09f, 0.0f, -0.17f, -0.13f, -0.23f)
                lineTo(23.62f, 5.5f)
                curveToRelative(-0.44f, -0.11f, -0.85f, -0.16f, -1.25f, -0.16f)
                curveToRelative(-0.38f, 0.0f, -0.75f, 0.04f, -1.13f, 0.13f)
                reflectiveCurveToRelative(-0.77f, 0.22f, -1.18f, 0.41f)
                curveToRelative(-0.41f, 0.18f, -0.8f, 0.45f, -1.18f, 0.8f)
                curveToRelative(-0.38f, 0.35f, -0.71f, 0.75f, -0.99f, 1.22f)
                curveToRelative(-0.77f, -0.32f, -1.57f, -0.48f, -2.37f, -0.48f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.32f)
                reflectiveCurveToRelative(-1.78f, 2.0f, -2.08f, 3.38f)
                curveToRelative(-0.87f, 0.2f, -1.63f, 0.61f, -2.28f, 1.22f)
                curveToRelative(-0.65f, 0.62f, -1.11f, 1.35f, -1.36f, 2.21f)
                verticalLineToRelative(0.03f)
                curveTo(6.03f, 15.59f, 6.02f, 15.62f, 6.02f, 15.66f)
                close()
                moveTo(6.75f, 24.15f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.6f)
                curveTo(7.16f, 24.92f, 7.36f, 25.0f, 7.6f, 25.0f)
                horizontalLineToRelative(9.43f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.59f)
                curveToRelative(-0.17f, -0.16f, -0.37f, -0.24f, -0.61f, -0.24f)
                horizontalLineTo(7.6f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.24f)
                curveTo(6.83f, 23.72f, 6.75f, 23.92f, 6.75f, 24.15f)
                close()
                moveTo(19.33f, 8.78f)
                curveToRelative(0.34f, -0.55f, 0.79f, -0.98f, 1.35f, -1.28f)
                curveToRelative(0.55f, -0.3f, 1.12f, -0.45f, 1.7f, -0.44f)
                curveToRelative(0.11f, 0.0f, 0.2f, 0.0f, 0.25f, 0.01f)
                verticalLineToRelative(0.24f)
                curveToRelative(0.0f, 0.97f, 0.26f, 1.9f, 0.79f, 2.79f)
                curveToRelative(0.53f, 0.88f, 1.25f, 1.55f, 2.17f, 1.98f)
                curveToRelative(-0.17f, 0.4f, -0.43f, 0.76f, -0.76f, 1.07f)
                curveToRelative(-0.88f, -0.79f, -1.95f, -1.18f, -3.2f, -1.18f)
                horizontalLineToRelative(-0.32f)
                curveTo(21.06f, 10.77f, 20.4f, 9.71f, 19.33f, 8.78f)
                close()
            }
        }
        .build()
        return _nightAltCloudyWindy!!
    }

private var _nightAltCloudyWindy: ImageVector? = null
