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

public val WeatherIcons.NightAltLightning: ImageVector
    get() {
        if (_nightAltLightning != null) {
            return _nightAltLightning!!
        }
        _nightAltLightning = Builder(name = "NightAltLightning", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.12f, 16.91f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.43f)
                reflectiveCurveToRelative(2.06f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.37f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.18f, -0.17f, -0.18f)
                curveToRelative(-0.87f, -0.07f, -1.6f, -0.41f, -2.19f, -1.04f)
                curveToRelative(-0.59f, -0.62f, -0.89f, -1.36f, -0.89f, -2.21f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.85f, -2.19f)
                curveToRelative(0.57f, -0.62f, 1.26f, -0.97f, 2.1f, -1.04f)
                lineToRelative(0.53f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.85f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.36f, 2.85f, 1.09f)
                curveToRelative(0.81f, 0.72f, 1.27f, 1.63f, 1.39f, 2.72f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.18f, 0.18f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.28f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.89f, 2.21f)
                curveToRelative(-0.59f, 0.62f, -1.32f, 0.97f, -2.19f, 1.04f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.18f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.38f, -1.51f)
                reflectiveCurveToRelative(1.38f, -2.11f, 1.38f, -3.45f)
                curveToRelative(0.0f, -0.89f, -0.23f, -1.72f, -0.68f, -2.48f)
                curveToRelative(0.8f, -0.72f, 1.32f, -1.58f, 1.55f, -2.58f)
                lineToRelative(0.15f, -0.72f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.03f, 0.01f, -0.07f)
                curveToRelative(0.0f, -0.07f, -0.05f, -0.13f, -0.16f, -0.16f)
                lineToRelative(-0.58f, -0.17f)
                curveToRelative(-0.57f, -0.16f, -1.05f, -0.44f, -1.45f, -0.82f)
                curveToRelative(-0.4f, -0.39f, -0.68f, -0.8f, -0.85f, -1.23f)
                curveToRelative(-0.17f, -0.43f, -0.25f, -0.87f, -0.25f, -1.32f)
                curveToRelative(0.0f, -0.24f, 0.03f, -0.51f, 0.09f, -0.79f)
                lineToRelative(0.14f, -0.62f)
                curveToRelative(0.03f, -0.09f, -0.02f, -0.17f, -0.14f, -0.22f)
                lineToRelative(-0.79f, -0.24f)
                curveToRelative(-0.44f, -0.11f, -0.85f, -0.16f, -1.25f, -0.16f)
                curveToRelative(-0.36f, 0.0f, -0.73f, 0.04f, -1.12f, 0.13f)
                curveToRelative(-0.38f, 0.09f, -0.78f, 0.22f, -1.19f, 0.41f)
                curveToRelative(-0.41f, 0.18f, -0.81f, 0.45f, -1.2f, 0.8f)
                curveToRelative(-0.39f, 0.35f, -0.72f, 0.75f, -1.0f, 1.22f)
                curveToRelative(-0.71f, -0.3f, -1.48f, -0.45f, -2.33f, -0.45f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.31f)
                curveToRelative(-1.09f, 0.87f, -1.79f, 1.99f, -2.1f, 3.35f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.84f, -2.73f, 1.74f)
                curveTo(4.48f, 14.74f, 4.12f, 15.76f, 4.12f, 16.91f)
                close()
                moveTo(11.79f, 21.56f)
                curveToRelative(-0.05f, 0.14f, 0.0f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-1.31f, 4.14f)
                horizontalLineToRelative(0.3f)
                lineToRelative(4.17f, -5.59f)
                curveToRelative(0.04f, -0.04f, 0.05f, -0.09f, 0.03f, -0.14f)
                curveToRelative(-0.02f, -0.05f, -0.06f, -0.07f, -0.13f, -0.07f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(2.31f, -4.21f)
                curveToRelative(0.07f, -0.14f, 0.02f, -0.22f, -0.14f, -0.22f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.08f, 0.0f, -0.15f, 0.05f, -0.22f, 0.14f)
                lineTo(11.79f, 21.56f)
                close()
                moveTo(17.6f, 8.81f)
                curveToRelative(0.33f, -0.57f, 0.77f, -1.0f, 1.33f, -1.3f)
                curveToRelative(0.55f, -0.3f, 1.13f, -0.45f, 1.72f, -0.45f)
                curveToRelative(0.13f, 0.0f, 0.22f, 0.01f, 0.27f, 0.02f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 0.96f, 0.26f, 1.87f, 0.78f, 2.73f)
                curveToRelative(0.52f, 0.86f, 1.24f, 1.51f, 2.17f, 1.96f)
                curveToRelative(-0.16f, 0.37f, -0.41f, 0.73f, -0.75f, 1.07f)
                curveToRelative(-0.92f, -0.79f, -1.99f, -1.18f, -3.22f, -1.18f)
                horizontalLineToRelative(-0.32f)
                curveTo(19.29f, 10.71f, 18.63f, 9.66f, 17.6f, 8.81f)
                close()
            }
        }
        .build()
        return _nightAltLightning!!
    }

private var _nightAltLightning: ImageVector? = null
