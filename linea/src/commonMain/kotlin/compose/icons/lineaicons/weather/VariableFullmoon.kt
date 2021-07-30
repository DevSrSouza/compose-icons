package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.VariableFullmoon: ImageVector
    get() {
        if (_variableFullmoon != null) {
            return _variableFullmoon!!
        }
        _variableFullmoon = Builder(name = "VariableFullmoon", defaultWidth = 64.0.dp, defaultHeight
                = 64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 50.0f)
                curveToRelative(4.19f, 0.0f, 7.0f, -2.81f, 7.0f, -7.0f)
                curveToRelative(0.0f, -4.189f, -2.81f, -9.0f, -7.0f, -9.0f)
                curveToRelative(0.0f, -10.475f, -9.525f, -18.0f, -20.0f, -18.0f)
                curveToRelative(-9.271f, 0.0f, -17.348f, 6.211f, -19.0f, 15.0f)
                curveToRelative(0.0f, 0.0f, -1.232f, 0.0f, -2.0f, 0.0f)
                curveToRelative(-5.238f, 0.0f, -9.0f, 4.762f, -9.0f, 10.0f)
                reflectiveCurveToRelative(3.762f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.004f, 37.959f)
                curveToRelative(-1.59f, -1.017f, -2.943f, -2.37f, -3.961f, -3.96f)
                curveTo(1.75f, 31.979f, 1.0f, 29.577f, 1.0f, 27.0f)
                curveToRelative(0.0f, -7.18f, 5.82f, -13.0f, 13.0f, -13.0f)
                curveToRelative(4.604f, 0.0f, 8.646f, 2.392f, 10.957f, 6.001f)
            }
        }
        .build()
        return _variableFullmoon!!
    }

private var _variableFullmoon: ImageVector? = null
