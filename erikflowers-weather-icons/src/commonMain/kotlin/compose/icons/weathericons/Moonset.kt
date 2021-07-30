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

public val WeatherIcons.Moonset: ImageVector
    get() {
        if (_moonset != null) {
            return _moonset!!
        }
        _moonset = Builder(name = "Moonset", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.74f, 14.86f)
                curveToRelative(0.0f, -0.98f, 0.19f, -1.92f, 0.58f, -2.82f)
                curveToRelative(0.38f, -0.9f, 0.9f, -1.67f, 1.55f, -2.32f)
                curveToRelative(0.65f, -0.65f, 1.43f, -1.17f, 2.32f, -1.56f)
                curveToRelative(0.9f, -0.39f, 1.84f, -0.58f, 2.83f, -0.58f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.16f, 0.04f, 0.24f, 0.14f, 0.24f, 0.28f)
                lineToRelative(0.05f, 0.9f)
                curveToRelative(0.02f, 0.64f, 0.15f, 1.25f, 0.4f, 1.83f)
                reflectiveCurveToRelative(0.58f, 1.08f, 1.0f, 1.5f)
                curveToRelative(0.42f, 0.43f, 0.91f, 0.77f, 1.48f, 1.03f)
                curveToRelative(0.57f, 0.26f, 1.17f, 0.4f, 1.8f, 0.43f)
                lineToRelative(0.85f, 0.07f)
                curveToRelative(0.16f, 0.0f, 0.24f, 0.08f, 0.24f, 0.23f)
                verticalLineToRelative(1.01f)
                curveToRelative(0.01f, 1.01f, -0.19f, 1.98f, -0.59f, 2.92f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(0.51f, -0.74f, 0.83f, -1.59f, 0.97f, -2.53f)
                curveToRelative(-1.68f, -0.35f, -3.02f, -1.07f, -4.03f, -2.16f)
                reflectiveCurveToRelative(-1.59f, -2.37f, -1.75f, -3.83f)
                curveToRelative(-0.97f, 0.05f, -1.85f, 0.35f, -2.66f, 0.9f)
                curveToRelative(-0.8f, 0.55f, -1.42f, 1.24f, -1.87f, 2.08f)
                curveToRelative(-0.44f, 0.84f, -0.66f, 1.72f, -0.66f, 2.63f)
                curveToRelative(0.0f, 1.07f, 0.28f, 2.04f, 0.83f, 2.92f)
                horizontalLineTo(8.34f)
                curveTo(7.94f, 16.85f, 7.74f, 15.88f, 7.74f, 14.86f)
                close()
                moveTo(7.99f, 20.89f)
                curveToRelative(0.0f, -0.26f, 0.1f, -0.49f, 0.3f, -0.69f)
                curveToRelative(0.18f, -0.18f, 0.41f, -0.27f, 0.68f, -0.27f)
                horizontalLineToRelative(3.22f)
                curveToRelative(0.11f, 0.0f, 0.2f, 0.02f, 0.28f, 0.08f)
                lineToRelative(2.35f, 2.22f)
                lineTo(17.21f, 20.0f)
                curveToRelative(0.07f, -0.05f, 0.17f, -0.08f, 0.29f, -0.08f)
                horizontalLineToRelative(3.3f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.09f, 0.69f, 0.28f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.42f, 0.29f, 0.68f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.69f, 0.29f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(-3.13f, 2.84f)
                curveToRelative(-0.12f, 0.09f, -0.24f, 0.09f, -0.34f, 0.0f)
                lineToRelative(-3.08f, -2.84f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.29f)
                curveTo(8.09f, 21.39f, 7.99f, 21.16f, 7.99f, 20.89f)
                close()
            }
        }
        .build()
        return _moonset!!
    }

private var _moonset: ImageVector? = null
