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

public val WeatherIcons.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.09f, 19.39f)
                curveToRelative(0.0f, -0.13f, 0.0f, -0.23f, 0.01f, -0.29f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.04f, 0.0f, -0.06f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                reflectiveCurveToRelative(0.0f, -0.03f, 0.0f, -0.05f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.04f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.07f, 0.02f, -0.12f)
                curveToRelative(0.01f, -0.05f, 0.02f, -0.08f, 0.02f, -0.09f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.04f)
                lineToRelative(0.08f, -0.37f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, 0.01f, -0.02f)
                verticalLineToRelative(-0.02f)
                lineToRelative(0.04f, -0.14f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.04f, -0.12f, 0.07f, -0.22f, 0.1f, -0.28f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.06f, 0.05f, -0.15f)
                curveToRelative(0.17f, -0.38f, 0.38f, -0.74f, 0.63f, -1.08f)
                lineToRelative(0.06f, -0.07f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.04f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.03f, 0.03f, -0.04f)
                curveToRelative(0.01f, -0.01f, 0.03f, -0.03f, 0.07f, -0.06f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.04f, 0.04f, -0.06f)
                curveToRelative(0.02f, -0.02f, 0.03f, -0.04f, 0.04f, -0.06f)
                curveToRelative(0.04f, -0.02f, 0.06f, -0.05f, 0.07f, -0.07f)
                curveToRelative(0.01f, -0.01f, 0.03f, -0.02f, 0.07f, -0.06f)
                lineToRelative(0.07f, -0.07f)
                lineToRelative(7.6f, -8.33f)
                lineToRelative(-0.38f, 2.2f)
                lineToRelative(6.82f, -7.29f)
                lineToRelative(-4.18f, 8.14f)
                lineToRelative(4.18f, -3.16f)
                lineToRelative(-3.79f, 7.6f)
                lineToRelative(2.71f, -1.87f)
                lineToRelative(-4.68f, 8.33f)
                curveToRelative(0.0f, 0.01f, -0.01f, 0.02f, -0.02f, 0.04f)
                reflectiveCurveToRelative(-0.02f, 0.04f, -0.03f, 0.05f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.02f, -0.02f, 0.04f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.03f, -0.02f, 0.05f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.02f, -0.02f, 0.05f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.04f, -0.02f, 0.05f)
                curveToRelative(-0.43f, 0.84f, -1.05f, 1.51f, -1.86f, 2.02f)
                curveToRelative(-0.81f, 0.51f, -1.7f, 0.76f, -2.67f, 0.76f)
                curveToRelative(-0.92f, 0.0f, -1.77f, -0.23f, -2.55f, -0.68f)
                curveToRelative(-0.78f, -0.46f, -1.4f, -1.07f, -1.86f, -1.86f)
                reflectiveCurveTo(7.09f, 20.31f, 7.09f, 19.39f)
                close()
                moveTo(8.29f, 19.39f)
                curveToRelative(0.0f, 1.08f, 0.38f, 1.99f, 1.14f, 2.75f)
                curveToRelative(0.76f, 0.76f, 1.68f, 1.14f, 2.75f, 1.14f)
                curveToRelative(0.82f, 0.0f, 1.56f, -0.24f, 2.22f, -0.71f)
                curveToRelative(0.66f, -0.47f, 1.13f, -1.09f, 1.41f, -1.84f)
                curveToRelative(0.17f, -0.43f, 0.25f, -0.87f, 0.25f, -1.34f)
                curveToRelative(0.0f, -1.07f, -0.38f, -1.99f, -1.13f, -2.75f)
                curveToRelative(-0.76f, -0.76f, -1.67f, -1.13f, -2.75f, -1.13f)
                curveToRelative(-1.0f, 0.0f, -1.87f, 0.33f, -2.6f, 1.0f)
                curveToRelative(-0.41f, 0.36f, -0.72f, 0.78f, -0.95f, 1.28f)
                curveTo(8.4f, 18.3f, 8.29f, 18.83f, 8.29f, 19.39f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
