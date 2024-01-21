package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.X12: ImageVector
    get() {
        if (_x12 != null) {
            return _x12!!
        }
        _x12 = Builder(name = "X12", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp, viewportWidth
                = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.22f, 2.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.06f, 0.0f)
                lineTo(6.0f, 4.939f)
                lineTo(8.72f, 2.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(7.061f, 6.0f)
                lineTo(9.78f, 8.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(6.0f, 7.061f)
                lineTo(3.28f, 9.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(4.939f, 6.0f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _x12!!
    }

private var _x12: ImageVector? = null
