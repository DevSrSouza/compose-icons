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

public val WeatherIcons.WindBeaufort11: ImageVector
    get() {
        if (_windBeaufort11 != null) {
            return _windBeaufort11!!
        }
        _windBeaufort11 = Builder(name = "WindBeaufort11", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.68f, 13.5f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.31f, 0.17f, 0.4f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.17f, 0.42f, 0.17f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.19f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.28f, 0.2f, 0.46f)
                reflectiveCurveToRelative(-0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                curveToRelative(-0.18f, 0.0f, -0.34f, -0.07f, -0.47f, -0.21f)
                curveToRelative(-0.13f, -0.11f, -0.26f, -0.16f, -0.4f, -0.16f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.05f, -0.41f, 0.16f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.24f, -0.16f, 0.39f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.3f, 0.17f, 0.41f)
                curveToRelative(0.36f, 0.36f, 0.78f, 0.53f, 1.28f, 0.53f)
                reflectiveCurveToRelative(0.91f, -0.17f, 1.26f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.92f, -0.52f, -1.27f)
                curveToRelative(-0.35f, -0.35f, -0.77f, -0.53f, -1.26f, -0.53f)
                horizontalLineTo(5.27f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(4.74f, 13.21f, 4.68f, 13.34f, 4.68f, 13.5f)
                close()
                moveTo(4.68f, 11.48f)
                curveToRelative(0.0f, 0.17f, 0.06f, 0.3f, 0.17f, 0.39f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.16f, 0.42f, 0.16f)
                horizontalLineToRelative(13.81f)
                curveToRelative(0.49f, 0.0f, 0.92f, -0.18f, 1.27f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.91f, -0.52f, -1.26f)
                reflectiveCurveToRelative(-0.77f, -0.52f, -1.27f, -0.52f)
                curveToRelative(-0.49f, 0.0f, -0.91f, 0.17f, -1.27f, 0.51f)
                curveToRelative(-0.11f, 0.12f, -0.16f, 0.27f, -0.16f, 0.42f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.3f, 0.16f, 0.4f)
                curveToRelative(0.11f, 0.1f, 0.24f, 0.15f, 0.4f, 0.15f)
                curveToRelative(0.15f, 0.0f, 0.29f, -0.05f, 0.41f, -0.16f)
                curveToRelative(0.12f, -0.12f, 0.27f, -0.18f, 0.45f, -0.18f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.18f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.27f, 0.2f, 0.45f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                horizontalLineTo(5.27f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(4.74f, 11.18f, 4.68f, 11.32f, 4.68f, 11.48f)
                close()
                moveTo(17.57f, 21.9f)
                horizontalLineToRelative(2.47f)
                lineToRelative(1.65f, -7.99f)
                horizontalLineToRelative(-2.47f)
                lineTo(17.57f, 21.9f)
                close()
                moveTo(21.3f, 21.9f)
                horizontalLineToRelative(2.46f)
                lineToRelative(1.65f, -7.99f)
                horizontalLineToRelative(-2.45f)
                lineTo(21.3f, 21.9f)
                close()
            }
        }
        .build()
        return _windBeaufort11!!
    }

private var _windBeaufort11: ImageVector? = null
