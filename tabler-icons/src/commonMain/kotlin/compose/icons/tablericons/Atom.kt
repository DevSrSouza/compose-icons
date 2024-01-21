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

public val TablerIcons.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(name = "Atom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.071f, 4.929f)
                curveToRelative(-1.562f, -1.562f, -6.0f, 0.337f, -9.9f, 4.243f)
                curveToRelative(-3.905f, 3.905f, -5.804f, 8.337f, -4.242f, 9.9f)
                curveToRelative(1.562f, 1.561f, 6.0f, -0.338f, 9.9f, -4.244f)
                curveToRelative(3.905f, -3.905f, 5.804f, -8.337f, 4.242f, -9.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.929f, 4.929f)
                curveToRelative(-1.562f, 1.562f, 0.337f, 6.0f, 4.243f, 9.9f)
                curveToRelative(3.905f, 3.905f, 8.337f, 5.804f, 9.9f, 4.242f)
                curveToRelative(1.561f, -1.562f, -0.338f, -6.0f, -4.244f, -9.9f)
                curveToRelative(-3.905f, -3.905f, -8.337f, -5.804f, -9.9f, -4.242f)
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
