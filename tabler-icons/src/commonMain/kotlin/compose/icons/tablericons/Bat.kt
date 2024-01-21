package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Bat: ImageVector
    get() {
        if (_bat != null) {
            return _bat!!
        }
        _bat = Builder(name = "Bat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                curveToRelative(0.74f, -2.286f, 2.778f, -3.762f, 5.0f, -3.0f)
                curveToRelative(-0.173f, -2.595f, 0.13f, -5.314f, -2.0f, -7.5f)
                curveToRelative(-1.708f, 2.648f, -3.358f, 2.557f, -5.0f, 2.5f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-1.642f, 0.057f, -3.292f, 0.148f, -5.0f, -2.5f)
                curveToRelative(-2.13f, 2.186f, -1.827f, 4.905f, -2.0f, 7.5f)
                curveToRelative(2.222f, -0.762f, 4.26f, 0.714f, 5.0f, 3.0f)
                curveToRelative(2.593f, 0.0f, 3.889f, 0.952f, 5.0f, 4.0f)
                curveToRelative(1.111f, -3.048f, 2.407f, -4.0f, 5.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
            }
        }
        .build()
        return _bat!!
    }

private var _bat: ImageVector? = null
