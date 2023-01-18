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

public val RemixIcons.CreativeCommonsZeroFill: ImageVector
    get() {
        if (_creativeCommonsZeroFill != null) {
            return _creativeCommonsZeroFill!!
        }
        _creativeCommonsZeroFill = Builder(name = "CreativeCommonsZeroFill", defaultWidth = 24.0.dp,
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
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.686f, -5.0f, 6.0f)
                reflectiveCurveToRelative(2.239f, 6.0f, 5.0f, 6.0f)
                reflectiveCurveToRelative(5.0f, -2.686f, 5.0f, -6.0f)
                reflectiveCurveToRelative(-2.239f, -6.0f, -5.0f, -6.0f)
                close()
                moveTo(14.325f, 9.472f)
                curveToRelative(0.422f, 0.69f, 0.675f, 1.57f, 0.675f, 2.528f)
                curveToRelative(0.0f, 2.21f, -1.343f, 4.0f, -3.0f, 4.0f)
                curveToRelative(-0.378f, 0.0f, -0.74f, -0.093f, -1.073f, -0.263f)
                lineToRelative(-0.164f, -0.092f)
                lineToRelative(3.562f, -6.173f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.378f, 0.0f, 0.74f, 0.093f, 1.073f, 0.263f)
                lineToRelative(0.164f, 0.092f)
                lineToRelative(-3.562f, 6.173f)
                curveTo(9.253f, 13.838f, 9.0f, 12.958f, 9.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, 1.343f, -4.0f, 3.0f, -4.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsZeroFill!!
    }

private var _creativeCommonsZeroFill: ImageVector? = null
