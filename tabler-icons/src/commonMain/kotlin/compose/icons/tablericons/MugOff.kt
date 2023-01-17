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

public val TablerIcons.MugOff: ImageVector
    get() {
        if (_mugOff != null) {
            return _mugOff!!
        }
        _mugOff = Builder(name = "MugOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(5.917f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 1.083f, 1.077f)
                verticalLineToRelative(5.923f)
                moveToRelative(-0.167f, 3.88f)
                arcToRelative(4.33f, 4.33f, 0.0f, false, true, -4.166f, 3.12f)
                horizontalLineToRelative(-4.334f)
                curveToRelative(-2.393f, 0.0f, -4.333f, -1.929f, -4.333f, -4.308f)
                verticalLineToRelative(-8.615f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 1.083f, -1.077f)
                horizontalLineToRelative(0.917f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.045f, 2.5f, 2.333f)
                verticalLineToRelative(2.334f)
                curveToRelative(0.0f, 1.148f, -0.89f, 2.103f, -2.06f, 2.297f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _mugOff!!
    }

private var _mugOff: ImageVector? = null
