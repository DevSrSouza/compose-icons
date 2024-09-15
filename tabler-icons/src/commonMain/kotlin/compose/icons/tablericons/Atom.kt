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
                lineTo(12.0f, 12.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.071f, 4.929f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, -9.899f, 4.243f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, -4.243f, 9.899f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, 9.899f, -4.243f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, 4.243f, -9.899f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.929f, 4.929f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, 4.243f, 9.899f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, 9.899f, 4.243f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, -4.243f, -9.899f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, -9.899f, -4.243f)
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
