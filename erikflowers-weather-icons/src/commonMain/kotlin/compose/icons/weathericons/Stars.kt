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

public val WeatherIcons.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.37f, 16.18f)
                curveToRelative(0.65f, -0.03f, 1.2f, -0.28f, 1.65f, -0.75f)
                curveToRelative(0.45f, -0.47f, 0.68f, -1.03f, 0.68f, -1.68f)
                curveToRelative(0.0f, 0.65f, 0.22f, 1.21f, 0.67f, 1.68f)
                curveToRelative(0.45f, 0.47f, 1.0f, 0.72f, 1.65f, 0.75f)
                curveToRelative(-0.65f, 0.03f, -1.2f, 0.28f, -1.65f, 0.75f)
                curveToRelative(-0.45f, 0.47f, -0.67f, 1.03f, -0.67f, 1.68f)
                curveToRelative(0.0f, -0.65f, -0.22f, -1.21f, -0.68f, -1.68f)
                curveTo(6.57f, 16.46f, 6.02f, 16.21f, 5.37f, 16.18f)
                close()
                moveTo(7.7f, 8.98f)
                curveToRelative(1.26f, -0.06f, 2.33f, -0.55f, 3.21f, -1.47f)
                curveToRelative(0.88f, -0.92f, 1.32f, -2.01f, 1.32f, -3.28f)
                curveToRelative(0.0f, 1.27f, 0.44f, 2.36f, 1.32f, 3.28f)
                reflectiveCurveToRelative(1.95f, 1.4f, 3.22f, 1.47f)
                curveToRelative(-0.83f, 0.04f, -1.59f, 0.27f, -2.29f, 0.71f)
                curveToRelative(-0.69f, 0.43f, -1.24f, 1.01f, -1.65f, 1.73f)
                curveToRelative(-0.4f, 0.72f, -0.6f, 1.49f, -0.6f, 2.33f)
                curveToRelative(0.0f, -1.27f, -0.44f, -2.37f, -1.32f, -3.29f)
                curveTo(10.03f, 9.53f, 8.96f, 9.04f, 7.7f, 8.98f)
                close()
                moveTo(11.02f, 19.75f)
                curveToRelative(0.95f, -0.04f, 1.76f, -0.41f, 2.42f, -1.1f)
                curveToRelative(0.66f, -0.69f, 0.99f, -1.51f, 0.99f, -2.47f)
                curveToRelative(0.0f, 0.96f, 0.33f, 1.78f, 0.99f, 2.47f)
                curveToRelative(0.66f, 0.69f, 1.46f, 1.06f, 2.41f, 1.1f)
                curveToRelative(-0.95f, 0.04f, -1.75f, 0.41f, -2.41f, 1.1f)
                curveToRelative(-0.66f, 0.69f, -0.99f, 1.51f, -0.99f, 2.47f)
                curveToRelative(0.0f, -0.96f, -0.33f, -1.78f, -0.99f, -2.47f)
                curveTo(12.77f, 20.16f, 11.97f, 19.8f, 11.02f, 19.75f)
                close()
                moveTo(17.83f, 15.01f)
                curveToRelative(0.95f, -0.04f, 1.75f, -0.41f, 2.41f, -1.1f)
                curveToRelative(0.66f, -0.69f, 0.98f, -1.51f, 0.98f, -2.48f)
                curveToRelative(0.0f, 0.96f, 0.33f, 1.78f, 0.99f, 2.47f)
                reflectiveCurveToRelative(1.47f, 1.06f, 2.42f, 1.1f)
                curveToRelative(-0.95f, 0.04f, -1.76f, 0.41f, -2.42f, 1.1f)
                curveToRelative(-0.66f, 0.69f, -0.99f, 1.51f, -0.99f, 2.47f)
                curveToRelative(0.0f, -0.96f, -0.33f, -1.78f, -0.98f, -2.47f)
                curveTo(19.58f, 15.42f, 18.78f, 15.05f, 17.83f, 15.01f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
