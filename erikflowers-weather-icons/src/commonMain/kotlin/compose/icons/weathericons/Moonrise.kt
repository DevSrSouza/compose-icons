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

public val WeatherIcons.Moonrise: ImageVector
    get() {
        if (_moonrise != null) {
            return _moonrise!!
        }
        _moonrise = Builder(name = "Moonrise", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 14.86f)
                curveToRelative(0.0f, -0.98f, 0.19f, -1.92f, 0.58f, -2.82f)
                curveToRelative(0.38f, -0.9f, 0.9f, -1.67f, 1.55f, -2.32f)
                curveToRelative(0.65f, -0.65f, 1.43f, -1.17f, 2.32f, -1.56f)
                reflectiveCurveToRelative(1.84f, -0.58f, 2.83f, -0.58f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.16f, 0.04f, 0.24f, 0.14f, 0.24f, 0.28f)
                lineToRelative(0.04f, 0.9f)
                curveToRelative(0.04f, 1.3f, 0.51f, 2.41f, 1.41f, 3.33f)
                reflectiveCurveToRelative(2.0f, 1.41f, 3.28f, 1.46f)
                lineToRelative(0.85f, 0.07f)
                curveToRelative(0.16f, 0.0f, 0.23f, 0.08f, 0.23f, 0.23f)
                verticalLineToRelative(1.01f)
                curveToRelative(0.01f, 1.03f, -0.19f, 2.0f, -0.58f, 2.92f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(0.51f, -0.74f, 0.83f, -1.59f, 0.97f, -2.53f)
                curveToRelative(-1.67f, -0.35f, -3.02f, -1.07f, -4.03f, -2.16f)
                reflectiveCurveToRelative(-1.59f, -2.37f, -1.75f, -3.83f)
                curveToRelative(-0.97f, 0.05f, -1.85f, 0.35f, -2.66f, 0.9f)
                curveToRelative(-0.8f, 0.55f, -1.43f, 1.24f, -1.87f, 2.08f)
                curveToRelative(-0.44f, 0.84f, -0.66f, 1.72f, -0.66f, 2.63f)
                curveToRelative(0.0f, 1.07f, 0.28f, 2.04f, 0.83f, 2.92f)
                horizontalLineTo(8.4f)
                curveTo(8.0f, 16.85f, 7.8f, 15.88f, 7.8f, 14.86f)
                close()
                moveTo(8.09f, 20.87f)
                curveToRelative(0.0f, -0.29f, 0.09f, -0.52f, 0.28f, -0.68f)
                curveToRelative(0.18f, -0.18f, 0.41f, -0.26f, 0.69f, -0.26f)
                horizontalLineToRelative(2.63f)
                lineTo(14.8f, 17.0f)
                curveToRelative(0.1f, -0.08f, 0.22f, -0.08f, 0.35f, 0.0f)
                lineToRelative(3.16f, 2.92f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.09f, 0.69f, 0.28f)
                curveToRelative(0.19f, 0.18f, 0.29f, 0.41f, 0.29f, 0.67f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.69f, 0.29f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.02f, -0.29f, -0.07f)
                lineToRelative(-2.41f, -2.27f)
                lineToRelative(-2.39f, 2.27f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.28f, 0.07f)
                horizontalLineTo(9.06f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.29f)
                reflectiveCurveTo(8.09f, 21.14f, 8.09f, 20.87f)
                close()
            }
        }
        .build()
        return _moonrise!!
    }

private var _moonrise: ImageVector? = null
