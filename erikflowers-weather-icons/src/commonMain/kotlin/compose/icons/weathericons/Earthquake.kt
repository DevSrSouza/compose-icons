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

public val WeatherIcons.Earthquake: ImageVector
    get() {
        if (_earthquake != null) {
            return _earthquake!!
        }
        _earthquake = Builder(name = "Earthquake", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 15.3f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.29f, 0.17f, 0.4f)
                curveToRelative(0.11f, 0.11f, 0.25f, 0.16f, 0.4f, 0.16f)
                horizontalLineTo(8.8f)
                curveToRelative(0.14f, 0.0f, 0.27f, -0.04f, 0.38f, -0.13f)
                curveToRelative(0.11f, -0.09f, 0.17f, -0.2f, 0.2f, -0.34f)
                lineToRelative(0.9f, -5.27f)
                lineToRelative(1.62f, 13.18f)
                curveToRelative(0.02f, 0.14f, 0.09f, 0.26f, 0.19f, 0.36f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.36f, 0.14f)
                curveToRelative(0.15f, 0.0f, 0.28f, -0.05f, 0.38f, -0.14f)
                reflectiveCurveToRelative(0.17f, -0.21f, 0.2f, -0.36f)
                lineToRelative(1.25f, -9.67f)
                lineToRelative(1.04f, 2.8f)
                curveToRelative(0.04f, 0.11f, 0.1f, 0.2f, 0.2f, 0.27f)
                reflectiveCurveToRelative(0.2f, 0.1f, 0.32f, 0.1f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.12f, -0.01f, 0.23f, -0.05f, 0.32f, -0.13f)
                curveToRelative(0.1f, -0.08f, 0.16f, -0.18f, 0.19f, -0.31f)
                lineToRelative(1.53f, -6.86f)
                lineToRelative(0.71f, 13.18f)
                curveToRelative(0.01f, 0.14f, 0.06f, 0.27f, 0.15f, 0.37f)
                curveToRelative(0.09f, 0.1f, 0.21f, 0.16f, 0.36f, 0.17f)
                curveToRelative(0.14f, 0.01f, 0.27f, -0.02f, 0.38f, -0.1f)
                curveToRelative(0.11f, -0.08f, 0.18f, -0.19f, 0.22f, -0.33f)
                lineToRelative(1.65f, -6.94f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.16f, 0.0f, 0.29f, -0.05f, 0.4f, -0.16f)
                curveToRelative(0.11f, -0.11f, 0.17f, -0.24f, 0.17f, -0.4f)
                curveToRelative(0.0f, -0.16f, -0.06f, -0.29f, -0.17f, -0.4f)
                curveToRelative(-0.11f, -0.11f, -0.25f, -0.17f, -0.4f, -0.17f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-0.13f, 0.0f, -0.25f, 0.04f, -0.35f, 0.12f)
                reflectiveCurveToRelative(-0.17f, 0.18f, -0.2f, 0.31f)
                lineToRelative(-0.83f, 3.54f)
                lineTo(18.84f, 5.33f)
                curveToRelative(-0.01f, -0.14f, -0.06f, -0.27f, -0.16f, -0.37f)
                curveToRelative(-0.1f, -0.1f, -0.22f, -0.16f, -0.36f, -0.16f)
                curveToRelative(-0.14f, -0.01f, -0.27f, 0.02f, -0.39f, 0.11f)
                reflectiveCurveToRelative(-0.19f, 0.2f, -0.22f, 0.34f)
                lineToRelative(-2.0f, 8.97f)
                lineToRelative(-1.16f, -3.16f)
                curveToRelative(-0.04f, -0.12f, -0.12f, -0.21f, -0.24f, -0.28f)
                reflectiveCurveToRelative(-0.24f, -0.1f, -0.36f, -0.08f)
                curveToRelative(-0.13f, 0.01f, -0.24f, 0.07f, -0.33f, 0.16f)
                curveToRelative(-0.09f, 0.09f, -0.15f, 0.21f, -0.17f, 0.34f)
                lineToRelative(-0.98f, 7.51f)
                lineTo(10.94f, 6.15f)
                curveToRelative(-0.03f, -0.14f, -0.09f, -0.26f, -0.19f, -0.35f)
                curveToRelative(-0.1f, -0.09f, -0.22f, -0.14f, -0.36f, -0.15f)
                curveToRelative(-0.14f, -0.01f, -0.27f, 0.03f, -0.38f, 0.12f)
                curveToRelative(-0.11f, 0.09f, -0.18f, 0.2f, -0.2f, 0.35f)
                lineToRelative(-1.48f, 8.61f)
                horizontalLineTo(5.82f)
                curveToRelative(-0.16f, 0.0f, -0.29f, 0.06f, -0.4f, 0.17f)
                curveTo(5.31f, 15.01f, 5.25f, 15.14f, 5.25f, 15.3f)
                close()
            }
        }
        .build()
        return _earthquake!!
    }

private var _earthquake: ImageVector? = null
