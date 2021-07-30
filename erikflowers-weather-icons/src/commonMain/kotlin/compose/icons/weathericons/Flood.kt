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

public val WeatherIcons.Flood: ImageVector
    get() {
        if (_flood != null) {
            return _flood!!
        }
        _flood = Builder(name = "Flood", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.72f, 20.76f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.12f, 0.02f, -0.21f)
                verticalLineToRelative(-4.76f)
                curveToRelative(0.28f, 0.49f, 0.66f, 0.89f, 1.15f, 1.19f)
                curveToRelative(0.49f, 0.3f, 1.03f, 0.45f, 1.61f, 0.45f)
                curveToRelative(0.59f, 0.0f, 1.13f, -0.15f, 1.62f, -0.45f)
                curveToRelative(0.49f, -0.3f, 0.87f, -0.69f, 1.15f, -1.19f)
                curveToRelative(0.27f, 0.49f, 0.66f, 0.89f, 1.15f, 1.19f)
                curveToRelative(0.49f, 0.3f, 1.03f, 0.45f, 1.62f, 0.45f)
                curveToRelative(0.58f, 0.0f, 1.12f, -0.15f, 1.61f, -0.45f)
                curveToRelative(0.49f, -0.3f, 0.87f, -0.69f, 1.15f, -1.19f)
                curveToRelative(0.28f, 0.49f, 0.67f, 0.89f, 1.15f, 1.19f)
                curveToRelative(0.49f, 0.3f, 1.02f, 0.45f, 1.6f, 0.45f)
                curveToRelative(0.58f, 0.0f, 1.12f, -0.15f, 1.61f, -0.45f)
                curveToRelative(0.49f, -0.3f, 0.88f, -0.69f, 1.15f, -1.19f)
                verticalLineToRelative(4.81f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.05f, 0.0f, 0.08f)
                curveToRelative(0.0f, 0.03f, 0.0f, 0.06f, 0.0f, 0.08f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.04f, 0.0f, 0.07f)
                reflectiveCurveToRelative(0.0f, 0.06f, 0.0f, 0.08f)
                curveToRelative(-0.03f, 0.23f, -0.13f, 0.43f, -0.3f, 0.6f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.27f, -0.6f, 0.3f)
                curveToRelative(-0.02f, 0.0f, -0.05f, 0.0f, -0.08f, 0.01f)
                curveToRelative(-0.03f, 0.01f, -0.06f, 0.01f, -0.08f, 0.01f)
                curveToRelative(-0.01f, 0.0f, -0.04f, 0.0f, -0.07f, -0.01f)
                curveToRelative(-0.03f, -0.01f, -0.06f, -0.01f, -0.08f, -0.01f)
                horizontalLineTo(7.94f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.08f, 0.01f)
                curveToRelative(-0.03f, 0.01f, -0.06f, 0.01f, -0.07f, 0.01f)
                curveToRelative(-0.02f, 0.0f, -0.05f, 0.0f, -0.08f, -0.01f)
                curveToRelative(-0.03f, -0.01f, -0.06f, -0.01f, -0.07f, -0.01f)
                curveToRelative(-0.22f, -0.03f, -0.42f, -0.12f, -0.58f, -0.28f)
                curveToRelative(-0.16f, -0.16f, -0.27f, -0.34f, -0.32f, -0.56f)
                curveTo(6.73f, 20.88f, 6.72f, 20.81f, 6.72f, 20.76f)
                close()
                moveTo(12.23f, 9.67f)
                curveToRelative(0.0f, -0.16f, 0.06f, -0.3f, 0.17f, -0.42f)
                lineToRelative(2.21f, -2.22f)
                lineToRelative(0.03f, -0.02f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                reflectiveCurveToRelative(0.0f, -0.01f, 0.01f, -0.02f)
                horizontalLineToRelative(0.02f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.02f, -0.01f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.01f)
                lineToRelative(0.04f, -0.02f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, -0.01f)
                horizontalLineToRelative(0.07f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(0.12f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.02f, 0.01f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.01f, 0.01f, 0.01f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.01f, 0.01f, 0.02f, 0.02f, 0.03f, 0.02f)
                lineToRelative(0.02f, 0.01f)
                horizontalLineToRelative(0.02f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f)
                curveToRelative(0.01f, 0.01f, 0.01f, 0.01f, 0.02f, 0.01f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.01f, 0.02f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineToRelative(0.02f)
                lineToRelative(0.01f, 0.01f)
                lineTo(15.41f, 7.0f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.02f, 0.02f)
                lineToRelative(2.22f, 2.22f)
                curveToRelative(0.12f, 0.12f, 0.18f, 0.26f, 0.18f, 0.42f)
                curveToRelative(0.0f, 0.16f, -0.06f, 0.3f, -0.18f, 0.41f)
                curveToRelative(-0.11f, 0.12f, -0.25f, 0.18f, -0.41f, 0.18f)
                curveToRelative(-0.16f, 0.0f, -0.3f, -0.06f, -0.41f, -0.18f)
                lineToRelative(-1.23f, -1.22f)
                verticalLineToRelative(6.9f)
                curveToRelative(0.0f, 0.16f, -0.06f, 0.29f, -0.17f, 0.4f)
                curveToRelative(-0.11f, 0.11f, -0.25f, 0.17f, -0.41f, 0.17f)
                curveToRelative(-0.16f, 0.0f, -0.3f, -0.06f, -0.42f, -0.17f)
                curveToRelative(-0.12f, -0.11f, -0.17f, -0.25f, -0.17f, -0.4f)
                verticalLineToRelative(-6.9f)
                lineToRelative(-1.22f, 1.22f)
                curveToRelative(-0.12f, 0.12f, -0.26f, 0.18f, -0.42f, 0.18f)
                curveToRelative(-0.16f, 0.0f, -0.3f, -0.06f, -0.41f, -0.18f)
                curveTo(12.29f, 9.97f, 12.23f, 9.83f, 12.23f, 9.67f)
                close()
            }
        }
        .build()
        return _flood!!
    }

private var _flood: ImageVector? = null
