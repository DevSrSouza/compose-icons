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

public val RemixIcons.GroupFill: ImageVector
    get() {
        if (_groupFill != null) {
            return _groupFill!!
        }
        _groupFill = Builder(name = "GroupFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(17.363f, 15.233f)
                arcTo(7.505f, 7.505f, 0.0f, false, true, 22.983f, 22.0f)
                lineTo(20.0f, 22.0f)
                curveToRelative(0.0f, -2.61f, -1.0f, -4.986f, -2.637f, -6.767f)
                close()
                moveTo(15.34f, 12.957f)
                arcTo(7.98f, 7.98f, 0.0f, false, false, 18.0f, 7.0f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, false, -1.015f, -3.903f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 8.0f)
                arcToRelative(4.999f, 4.999f, 0.0f, false, true, -5.66f, 4.957f)
                close()
            }
        }
        .build()
        return _groupFill!!
    }

private var _groupFill: ImageVector? = null
