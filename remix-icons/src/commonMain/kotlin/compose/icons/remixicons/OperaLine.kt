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

public val RemixIcons.OperaLine: ImageVector
    get() {
        if (_operaLine != null) {
            return _operaLine!!
        }
        _operaLine = Builder(name = "OperaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.766f, 19.51f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, 0.0f, -15.02f)
                curveTo(16.71f, 5.977f, 18.0f, 8.935f, 18.0f, 12.0f)
                reflectiveCurveToRelative(-1.289f, 6.024f, -3.234f, 7.51f)
                close()
                moveTo(9.234f, 4.49f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, 0.0f, 15.02f)
                curveTo(7.29f, 18.023f, 6.0f, 15.065f, 6.0f, 12.0f)
                reflectiveCurveToRelative(1.289f, -6.024f, 3.234f, -7.51f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 18.5f)
                curveToRelative(2.0f, 0.0f, 4.0f, -3.033f, 4.0f, -6.5f)
                reflectiveCurveToRelative(-2.0f, -6.5f, -4.0f, -6.5f)
                reflectiveCurveTo(8.0f, 8.533f, 8.0f, 12.0f)
                reflectiveCurveToRelative(2.0f, 6.5f, 4.0f, 6.5f)
                close()
            }
        }
        .build()
        return _operaLine!!
    }

private var _operaLine: ImageVector? = null
