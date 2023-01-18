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

public val RemixIcons.CreativeCommonsSaLine: ImageVector
    get() {
        if (_creativeCommonsSaLine != null) {
            return _creativeCommonsSaLine!!
        }
        _creativeCommonsSaLine = Builder(name = "CreativeCommonsSaLine", defaultWidth = 24.0.dp,
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
                curveToRelative(-2.177f, 0.0f, -4.029f, -1.67f, -4.715f, -4.0f)
                lineToRelative(2.117f, 0.001f)
                curveTo(9.92f, 15.196f, 10.89f, 16.0f, 12.0f, 16.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.79f, 3.0f, -4.0f)
                reflectiveCurveToRelative(-1.343f, -4.0f, -3.0f, -4.0f)
                curveToRelative(-1.11f, 0.0f, -2.08f, 0.805f, -2.599f, 2.0f)
                lineTo(11.0f, 10.0f)
                lineToRelative(-2.5f, 3.0f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(1.284f)
                curveTo(7.971f, 7.67f, 9.823f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsSaLine!!
    }

private var _creativeCommonsSaLine: ImageVector? = null
