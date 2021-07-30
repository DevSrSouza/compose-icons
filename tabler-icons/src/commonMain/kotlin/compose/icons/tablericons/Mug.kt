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

public val TablerIcons.Mug: ImageVector
    get() {
        if (_mug != null) {
            return _mug!!
        }
        _mug = Builder(name = "Mug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.083f, 5.0f)
                horizontalLineToRelative(10.834f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 1.083f, 1.077f)
                verticalLineToRelative(8.615f)
                curveToRelative(0.0f, 2.38f, -1.94f, 4.308f, -4.333f, 4.308f)
                horizontalLineToRelative(-4.334f)
                curveToRelative(-2.393f, 0.0f, -4.333f, -1.929f, -4.333f, -4.308f)
                verticalLineToRelative(-8.615f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 1.083f, -1.077f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.045f, 2.5f, 2.333f)
                verticalLineToRelative(2.334f)
                curveToRelative(0.0f, 1.288f, -1.12f, 2.333f, -2.5f, 2.333f)
                horizontalLineToRelative(-2.5f)
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null
