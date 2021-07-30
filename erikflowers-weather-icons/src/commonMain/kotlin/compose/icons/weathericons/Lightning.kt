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

public val WeatherIcons.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.96f, 24.51f)
                horizontalLineToRelative(0.39f)
                lineToRelative(6.88f, -10.18f)
                curveToRelative(0.09f, -0.18f, 0.04f, -0.27f, -0.15f, -0.27f)
                horizontalLineToRelative(-2.84f)
                lineToRelative(2.99f, -5.45f)
                curveToRelative(0.09f, -0.18f, 0.02f, -0.27f, -0.2f, -0.27f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-0.11f, 0.0f, -0.2f, 0.06f, -0.29f, 0.18f)
                lineToRelative(-2.78f, 7.4f)
                curveToRelative(-0.02f, 0.18f, 0.04f, 0.27f, 0.19f, 0.27f)
                horizontalLineToRelative(2.75f)
                lineTo(7.96f, 24.51f)
                close()
                moveTo(16.46f, 18.18f)
                horizontalLineToRelative(0.27f)
                lineToRelative(5.22f, -7.67f)
                curveToRelative(0.05f, -0.08f, 0.06f, -0.15f, 0.04f, -0.2f)
                reflectiveCurveToRelative(-0.08f, -0.07f, -0.17f, -0.07f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(2.18f, -4.03f)
                curveToRelative(0.12f, -0.2f, 0.06f, -0.3f, -0.18f, -0.3f)
                horizontalLineToRelative(-2.74f)
                curveToRelative(-0.13f, 0.0f, -0.23f, 0.06f, -0.3f, 0.19f)
                lineToRelative(-2.08f, 5.48f)
                curveToRelative(-0.03f, 0.09f, -0.03f, 0.16f, 0.01f, 0.21f)
                curveToRelative(0.04f, 0.05f, 0.1f, 0.07f, 0.19f, 0.07f)
                horizontalLineToRelative(2.04f)
                lineTo(16.46f, 18.18f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
