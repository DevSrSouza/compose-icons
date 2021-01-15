package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
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
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 12.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0711f, 4.9289f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, -9.8995f, 4.2426f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, -4.2426f, 9.8995f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, 9.8995f, -4.2426f)
                arcToRelative(4.0f, 10.0f, 45.0f, false, false, 4.2426f, -9.8995f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9289f, 4.9289f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, 4.2426f, 9.8995f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, 9.8995f, 4.2426f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, -4.2426f, -9.8995f)
                arcToRelative(10.0f, 4.0f, 45.0f, false, false, -9.8995f, -4.2426f)
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
