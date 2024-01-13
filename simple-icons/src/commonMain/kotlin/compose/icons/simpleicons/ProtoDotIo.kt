package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Protodotio: ImageVector
    get() {
        if (_protodotio != null) {
            return _protodotio!!
        }
        _protodotio = Builder(name = "Protodotio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.997f)
                curveToRelative(-0.728f, 0.0f, -1.316f, -0.59f, -1.316f, -1.317f)
                reflectiveCurveTo(11.272f, 9.363f, 12.0f, 9.363f)
                reflectiveCurveToRelative(1.316f, 0.589f, 1.316f, 1.316f)
                reflectiveCurveToRelative(-0.588f, 1.318f, -1.316f, 1.318f)
                close()
                moveTo(14.916f, 11.976f)
                curveToRelative(0.0f, -2.828f, -1.109f, -5.397f, -2.916f, -7.298f)
                curveToRelative(-1.807f, 1.9f, -2.916f, 4.47f, -2.916f, 7.298f)
                curveToRelative(0.0f, 1.297f, 0.234f, 2.535f, 0.66f, 3.683f)
                curveToRelative(-0.618f, 0.9f, -1.074f, 2.16f, -1.275f, 3.616f)
                curveToRelative(0.639f, -0.767f, 1.422f, -1.306f, 2.292f, -1.591f)
                curveToRelative(0.363f, 0.555f, 0.78f, 1.096f, 1.239f, 1.574f)
                curveToRelative(0.461f, -0.494f, 0.876f, -1.02f, 1.239f, -1.59f)
                curveToRelative(0.87f, 0.271f, 1.653f, 0.826f, 2.29f, 1.576f)
                curveToRelative(-0.199f, -1.456f, -0.655f, -2.716f, -1.275f, -3.615f)
                curveToRelative(0.427f, -1.155f, 0.66f, -2.385f, 0.66f, -3.69f)
                lineToRelative(0.002f, 0.037f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _protodotio!!
    }

private var _protodotio: ImageVector? = null
