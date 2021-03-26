package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.ThermometerExterior: ImageVector
    get() {
        if (_thermometerExterior != null) {
            return _thermometerExterior!!
        }
        _thermometerExterior = Builder(name = "ThermometerExterior", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.91f, 19.56f)
                curveToRelative(0.0f, -0.85f, 0.2f, -1.64f, 0.59f, -2.38f)
                reflectiveCurveToRelative(0.94f, -1.35f, 1.65f, -1.84f)
                verticalLineTo(5.42f)
                curveToRelative(0.0f, -0.8f, 0.27f, -1.48f, 0.82f, -2.03f)
                reflectiveCurveTo(14.2f, 2.55f, 15.0f, 2.55f)
                curveToRelative(0.81f, 0.0f, 1.49f, 0.28f, 2.04f, 0.83f)
                curveToRelative(0.55f, 0.56f, 0.83f, 1.23f, 0.83f, 2.03f)
                verticalLineToRelative(9.92f)
                curveToRelative(0.71f, 0.49f, 1.25f, 1.11f, 1.64f, 1.84f)
                reflectiveCurveToRelative(0.58f, 1.53f, 0.58f, 2.38f)
                curveToRelative(0.0f, 0.92f, -0.23f, 1.78f, -0.68f, 2.56f)
                reflectiveCurveToRelative(-1.07f, 1.4f, -1.85f, 1.85f)
                reflectiveCurveToRelative(-1.63f, 0.68f, -2.56f, 0.68f)
                curveToRelative(-0.92f, 0.0f, -1.77f, -0.23f, -2.55f, -0.68f)
                reflectiveCurveToRelative(-1.4f, -1.07f, -1.86f, -1.85f)
                reflectiveCurveTo(9.91f, 20.48f, 9.91f, 19.56f)
                close()
                moveTo(11.67f, 19.56f)
                curveToRelative(0.0f, 0.93f, 0.33f, 1.73f, 0.98f, 2.39f)
                curveToRelative(0.65f, 0.66f, 1.44f, 0.99f, 2.36f, 0.99f)
                curveToRelative(0.93f, 0.0f, 1.73f, -0.33f, 2.4f, -1.0f)
                reflectiveCurveToRelative(1.01f, -1.46f, 1.01f, -2.37f)
                curveToRelative(0.0f, -0.62f, -0.16f, -1.2f, -0.48f, -1.73f)
                curveToRelative(-0.32f, -0.53f, -0.76f, -0.94f, -1.32f, -1.23f)
                lineToRelative(-0.28f, -0.14f)
                curveToRelative(-0.1f, -0.04f, -0.15f, -0.14f, -0.15f, -0.29f)
                verticalLineTo(5.42f)
                curveToRelative(0.0f, -0.32f, -0.11f, -0.59f, -0.34f, -0.81f)
                curveTo(15.62f, 4.4f, 15.34f, 4.29f, 15.0f, 4.29f)
                curveToRelative(-0.32f, 0.0f, -0.6f, 0.11f, -0.83f, 0.32f)
                curveToRelative(-0.23f, 0.21f, -0.34f, 0.48f, -0.34f, 0.81f)
                verticalLineToRelative(10.74f)
                curveToRelative(0.0f, 0.15f, -0.05f, 0.25f, -0.14f, 0.29f)
                lineToRelative(-0.27f, 0.14f)
                curveToRelative(-0.55f, 0.29f, -0.98f, 0.7f, -1.29f, 1.23f)
                curveTo(11.82f, 18.35f, 11.67f, 18.92f, 11.67f, 19.56f)
                close()
            }
        }
        .build()
        return _thermometerExterior!!
    }

private var _thermometerExterior: ImageVector? = null
