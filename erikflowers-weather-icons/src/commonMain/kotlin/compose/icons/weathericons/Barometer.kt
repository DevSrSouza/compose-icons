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

public val WeatherIcons.Barometer: ImageVector
    get() {
        if (_barometer != null) {
            return _barometer!!
        }
        _barometer = Builder(name = "Barometer", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.69f, 13.2f)
                curveToRelative(0.0f, -0.99f, 0.19f, -1.94f, 0.58f, -2.85f)
                curveToRelative(0.39f, -0.91f, 0.91f, -1.68f, 1.57f, -2.33f)
                reflectiveCurveToRelative(1.44f, -1.17f, 2.34f, -1.56f)
                curveToRelative(0.9f, -0.39f, 1.85f, -0.58f, 2.84f, -0.58f)
                curveToRelative(0.99f, 0.0f, 1.94f, 0.19f, 2.85f, 0.58f)
                curveToRelative(0.9f, 0.39f, 1.68f, 0.91f, 2.33f, 1.56f)
                curveToRelative(0.65f, 0.65f, 1.17f, 1.43f, 1.56f, 2.33f)
                reflectiveCurveToRelative(0.58f, 1.85f, 0.58f, 2.85f)
                curveToRelative(0.0f, 1.62f, -0.48f, 3.06f, -1.44f, 4.34f)
                curveToRelative(-0.96f, 1.27f, -2.2f, 2.14f, -3.71f, 2.61f)
                verticalLineToRelative(3.29f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(-3.25f)
                curveToRelative(-1.54f, -0.45f, -2.81f, -1.32f, -3.79f, -2.61f)
                reflectiveCurveTo(7.69f, 14.83f, 7.69f, 13.2f)
                close()
                moveTo(9.3f, 13.2f)
                curveToRelative(0.0f, 1.55f, 0.56f, 2.88f, 1.69f, 3.99f)
                curveToRelative(1.11f, 1.12f, 2.45f, 1.68f, 4.02f, 1.68f)
                curveToRelative(1.03f, 0.0f, 1.99f, -0.25f, 2.86f, -0.76f)
                curveToRelative(0.88f, -0.51f, 1.57f, -1.2f, 2.09f, -2.07f)
                curveToRelative(0.51f, -0.87f, 0.77f, -1.82f, 0.77f, -2.85f)
                curveToRelative(0.0f, -0.77f, -0.15f, -1.5f, -0.45f, -2.21f)
                reflectiveCurveToRelative(-0.71f, -1.31f, -1.22f, -1.82f)
                curveToRelative(-0.51f, -0.51f, -1.12f, -0.92f, -1.83f, -1.22f)
                curveToRelative(-0.71f, -0.3f, -1.44f, -0.45f, -2.21f, -0.45f)
                curveToRelative(-0.77f, 0.0f, -1.5f, 0.15f, -2.21f, 0.45f)
                reflectiveCurveToRelative(-1.31f, 0.71f, -1.82f, 1.22f)
                curveToRelative(-0.51f, 0.51f, -0.92f, 1.12f, -1.22f, 1.82f)
                curveTo(9.45f, 11.7f, 9.3f, 12.43f, 9.3f, 13.2f)
                close()
                moveTo(9.88f, 13.56f)
                verticalLineToRelative(-0.72f)
                horizontalLineToRelative(2.17f)
                verticalLineToRelative(0.72f)
                horizontalLineTo(9.88f)
                close()
                moveTo(10.97f, 10.02f)
                lineToRelative(0.52f, -0.52f)
                lineToRelative(1.52f, 1.52f)
                lineToRelative(-0.52f, 0.53f)
                lineTo(10.97f, 10.02f)
                close()
                moveTo(13.5f, 14.95f)
                curveToRelative(0.0f, -0.42f, 0.15f, -0.78f, 0.44f, -1.09f)
                curveToRelative(0.29f, -0.31f, 0.65f, -0.47f, 1.06f, -0.48f)
                lineToRelative(2.73f, -4.49f)
                lineToRelative(0.66f, 0.35f)
                lineToRelative(-2.02f, 4.83f)
                curveToRelative(0.18f, 0.25f, 0.26f, 0.54f, 0.26f, 0.88f)
                curveToRelative(0.0f, 0.44f, -0.15f, 0.81f, -0.46f, 1.11f)
                curveToRelative(-0.31f, 0.3f, -0.68f, 0.45f, -1.12f, 0.45f)
                curveToRelative(-0.43f, 0.0f, -0.8f, -0.15f, -1.1f, -0.45f)
                curveTo(13.65f, 15.76f, 13.5f, 15.39f, 13.5f, 14.95f)
                close()
                moveTo(14.81f, 10.28f)
                verticalLineTo(8.12f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(2.17f)
                horizontalLineTo(14.81f)
                close()
                moveTo(17.75f, 13.55f)
                verticalLineToRelative(-0.74f)
                horizontalLineToRelative(2.17f)
                verticalLineToRelative(0.74f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _barometer!!
    }

private var _barometer: ImageVector? = null
