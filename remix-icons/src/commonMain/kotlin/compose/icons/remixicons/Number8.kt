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

public val RemixIcons.Number8: ImageVector
    get() {
        if (_number8 != null) {
            return _number8!!
        }
        _number8 = Builder(name = "Number8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 3.352f, 9.86f)
                curveTo(17.24f, 12.41f, 18.5f, 14.32f, 18.5f, 16.5f)
                curveToRelative(0.0f, 3.314f, -2.91f, 6.0f, -6.5f, 6.0f)
                reflectiveCurveToRelative(-6.5f, -2.686f, -6.5f, -6.0f)
                curveToRelative(0.0f, -2.181f, 1.261f, -4.09f, 3.147f, -5.141f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 12.5f)
                curveToRelative(-2.52f, 0.0f, -4.5f, 1.828f, -4.5f, 4.0f)
                curveToRelative(0.0f, 2.172f, 1.98f, 4.0f, 4.5f, 4.0f)
                reflectiveCurveToRelative(4.5f, -1.828f, 4.5f, -4.0f)
                curveToRelative(0.0f, -2.172f, -1.98f, -4.0f, -4.5f, -4.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
            }
        }
        .build()
        return _number8!!
    }

private var _number8: ImageVector? = null
