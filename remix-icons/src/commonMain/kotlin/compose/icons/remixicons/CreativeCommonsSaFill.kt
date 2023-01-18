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

public val RemixIcons.CreativeCommonsSaFill: ImageVector
    get() {
        if (_creativeCommonsSaFill != null) {
            return _creativeCommonsSaFill!!
        }
        _creativeCommonsSaFill = Builder(name = "CreativeCommonsSaFill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 6.0f)
                curveTo(9.895f, 6.0f, 8.094f, 7.56f, 7.357f, 9.77f)
                lineToRelative(-0.073f, 0.23f)
                lineTo(6.0f, 10.0f)
                lineToRelative(2.5f, 3.0f)
                lineToRelative(2.5f, -3.0f)
                lineTo(9.401f, 10.0f)
                curveTo(9.92f, 8.805f, 10.89f, 8.0f, 12.0f, 8.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.79f, 3.0f, 4.0f)
                reflectiveCurveToRelative(-1.343f, 4.0f, -3.0f, 4.0f)
                curveToRelative(-1.048f, 0.0f, -1.971f, -0.717f, -2.508f, -1.803f)
                lineTo(9.402f, 14.0f)
                lineTo(7.285f, 14.0f)
                curveTo(7.97f, 16.33f, 9.823f, 18.0f, 12.0f, 18.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.686f, 5.0f, -6.0f)
                reflectiveCurveToRelative(-2.239f, -6.0f, -5.0f, -6.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsSaFill!!
    }

private var _creativeCommonsSaFill: ImageVector? = null
