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

public val WeatherGroup.VariableHalfmoon: ImageVector
    get() {
        if (_variableHalfmoon != null) {
            return _variableHalfmoon!!
        }
        _variableHalfmoon = Builder(name = "VariableHalfmoon", defaultWidth = 64.0.dp, defaultHeight
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
                moveTo(24.957f, 20.001f)
                curveTo(22.646f, 16.392f, 18.604f, 14.0f, 14.0f, 14.0f)
                curveToRelative(-0.826f, 0.0f, -1.631f, 0.085f, -2.414f, 0.233f)
                curveToRelative(0.891f, 1.396f, 1.414f, 3.05f, 1.414f, 4.83f)
                curveToRelative(0.0f, 4.971f, -4.029f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-1.046f, 0.0f, -2.046f, -0.188f, -2.98f, -0.516f)
                curveToRelative(0.099f, 2.368f, 0.822f, 4.576f, 2.023f, 6.452f)
                curveToRelative(1.018f, 1.59f, 2.371f, 2.943f, 3.961f, 3.96f)
            }
        }
        .build()
        return _variableHalfmoon!!
    }

private var _variableHalfmoon: ImageVector? = null
