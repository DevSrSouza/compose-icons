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

public val WeatherIcons.Windy: ImageVector
    get() {
        if (_windy != null) {
            return _windy!!
        }
        _windy = Builder(name = "Windy", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.65f, 15.5f)
                curveToRelative(0.0f, -0.22f, 0.08f, -0.41f, 0.23f, -0.56f)
                curveToRelative(0.16f, -0.15f, 0.35f, -0.22f, 0.57f, -0.22f)
                horizontalLineToRelative(12.08f)
                curveToRelative(0.22f, 0.0f, 0.4f, 0.07f, 0.54f, 0.22f)
                curveToRelative(0.14f, 0.15f, 0.22f, 0.34f, 0.22f, 0.57f)
                curveToRelative(0.0f, 0.22f, -0.07f, 0.4f, -0.22f, 0.54f)
                curveToRelative(-0.14f, 0.14f, -0.32f, 0.22f, -0.54f, 0.22f)
                horizontalLineTo(5.45f)
                curveToRelative(-0.22f, 0.0f, -0.42f, -0.07f, -0.57f, -0.22f)
                curveTo(4.72f, 15.9f, 4.65f, 15.72f, 4.65f, 15.5f)
                close()
                moveTo(7.06f, 12.6f)
                curveToRelative(0.0f, -0.22f, 0.08f, -0.4f, 0.23f, -0.55f)
                curveToRelative(0.15f, -0.15f, 0.34f, -0.23f, 0.56f, -0.23f)
                horizontalLineToRelative(12.09f)
                curveToRelative(0.21f, 0.0f, 0.39f, 0.08f, 0.54f, 0.23f)
                curveToRelative(0.15f, 0.15f, 0.22f, 0.33f, 0.22f, 0.55f)
                curveToRelative(0.0f, 0.22f, -0.07f, 0.4f, -0.22f, 0.56f)
                curveToRelative(-0.15f, 0.15f, -0.33f, 0.23f, -0.54f, 0.23f)
                horizontalLineTo(7.86f)
                curveToRelative(-0.22f, 0.0f, -0.41f, -0.08f, -0.56f, -0.23f)
                reflectiveCurveTo(7.06f, 12.82f, 7.06f, 12.6f)
                close()
                moveTo(8.68f, 18.34f)
                curveToRelative(0.0f, -0.21f, 0.08f, -0.39f, 0.24f, -0.54f)
                curveToRelative(0.14f, -0.14f, 0.32f, -0.22f, 0.54f, -0.22f)
                horizontalLineToRelative(12.1f)
                curveToRelative(0.22f, 0.0f, 0.41f, 0.07f, 0.56f, 0.22f)
                curveToRelative(0.15f, 0.14f, 0.22f, 0.32f, 0.22f, 0.54f)
                reflectiveCurveToRelative(-0.08f, 0.41f, -0.23f, 0.56f)
                reflectiveCurveToRelative(-0.34f, 0.23f, -0.56f, 0.23f)
                horizontalLineTo(9.46f)
                curveToRelative(-0.22f, 0.0f, -0.4f, -0.08f, -0.56f, -0.23f)
                reflectiveCurveTo(8.68f, 18.56f, 8.68f, 18.34f)
                close()
                moveTo(19.26f, 15.5f)
                curveToRelative(0.0f, -0.23f, 0.07f, -0.42f, 0.22f, -0.57f)
                curveToRelative(0.15f, -0.15f, 0.34f, -0.22f, 0.57f, -0.22f)
                horizontalLineToRelative(4.52f)
                curveToRelative(0.23f, 0.0f, 0.42f, 0.07f, 0.57f, 0.22f)
                curveToRelative(0.15f, 0.15f, 0.22f, 0.34f, 0.22f, 0.56f)
                curveToRelative(0.0f, 0.22f, -0.07f, 0.4f, -0.22f, 0.54f)
                curveToRelative(-0.15f, 0.14f, -0.34f, 0.22f, -0.56f, 0.22f)
                horizontalLineToRelative(-4.52f)
                curveToRelative(-0.23f, 0.0f, -0.42f, -0.07f, -0.57f, -0.22f)
                curveTo(19.33f, 15.9f, 19.26f, 15.72f, 19.26f, 15.5f)
                close()
            }
        }
        .build()
        return _windy!!
    }

private var _windy: ImageVector? = null
