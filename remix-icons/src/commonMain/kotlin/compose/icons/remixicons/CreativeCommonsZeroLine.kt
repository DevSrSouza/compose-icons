package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CreativeCommonsZeroLine: ImageVector
    get() {
        if (_creativeCommonsZeroLine != null) {
            return _creativeCommonsZeroLine!!
        }
        _creativeCommonsZeroLine = Builder(name = "CreativeCommonsZeroLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.415f, 0.0f, -8.0f, 3.585f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.585f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.585f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.585f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.686f, 5.0f, 6.0f)
                reflectiveCurveToRelative(-2.239f, 6.0f, -5.0f, 6.0f)
                reflectiveCurveToRelative(-5.0f, -2.686f, -5.0f, -6.0f)
                reflectiveCurveToRelative(2.239f, -6.0f, 5.0f, -6.0f)
                close()
                moveTo(14.325f, 9.472f)
                lineToRelative(-3.562f, 6.173f)
                curveToRelative(0.377f, 0.228f, 0.796f, 0.355f, 1.237f, 0.355f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.79f, 3.0f, -4.0f)
                curveToRelative(0.0f, -0.959f, -0.253f, -1.839f, -0.675f, -2.528f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.79f, -3.0f, 4.0f)
                curveToRelative(0.0f, 0.959f, 0.253f, 1.839f, 0.675f, 2.528f)
                lineToRelative(3.562f, -6.173f)
                arcTo(2.377f, 2.377f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsZeroLine!!
    }

private var _creativeCommonsZeroLine: ImageVector? = null
