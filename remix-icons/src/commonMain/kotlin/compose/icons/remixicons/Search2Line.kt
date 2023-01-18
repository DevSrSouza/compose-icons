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

public val RemixIcons.Search2Line: ImageVector
    get() {
        if (_search2Line != null) {
            return _search2Line!!
        }
        _search2Line = Builder(name = "Search2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveToRelative(4.968f, 0.0f, 9.0f, 4.032f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.032f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -4.032f, -9.0f, -9.0f)
                reflectiveCurveToRelative(4.032f, -9.0f, 9.0f, -9.0f)
                close()
                moveTo(11.0f, 18.0f)
                curveToRelative(3.867f, 0.0f, 7.0f, -3.133f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.868f, -3.133f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-3.868f, 0.0f, -7.0f, 3.132f, -7.0f, 7.0f)
                curveToRelative(0.0f, 3.867f, 3.132f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(19.485f, 18.071f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-2.828f, -2.829f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _search2Line!!
    }

private var _search2Line: ImageVector? = null
