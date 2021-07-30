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

public val WeatherGroup.VariableSun: ImageVector
    get() {
        if (_variableSun != null) {
            return _variableSun!!
        }
        _variableSun = Builder(name = "VariableSun", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 50.0f)
                curveToRelative(4.19f, 0.0f, 7.0f, -2.81f, 7.0f, -7.0f)
                curveToRelative(0.0f, -4.189f, -2.81f, -9.0f, -7.0f, -9.0f)
                curveToRelative(0.0f, -10.475f, -9.525f, -18.0f, -20.0f, -18.0f)
                curveToRelative(-9.271f, 0.0f, -17.348f, 6.211f, -19.0f, 15.0f)
                curveToRelative(0.0f, 0.0f, -1.233f, 0.0f, -2.0f, 0.0f)
                curveToRelative(-5.238f, 0.0f, -9.0f, 4.762f, -9.0f, 10.0f)
                reflectiveCurveToRelative(3.762f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.999f, 16.752f)
                curveTo(27.793f, 15.028f, 25.017f, 14.0f, 22.0f, 14.0f)
                curveToRelative(-7.18f, 0.0f, -13.0f, 5.82f, -13.0f, 13.0f)
                curveToRelative(0.0f, 2.577f, 0.707f, 3.979f, 2.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 27.0f)
                lineTo(0.0f, 27.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                lineTo(4.0f, 9.0f)
            }
        }
        .build()
        return _variableSun!!
    }

private var _variableSun: ImageVector? = null
