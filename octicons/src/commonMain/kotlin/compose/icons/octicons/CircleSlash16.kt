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

public val Octicons.CircleSlash16: ImageVector
    get() {
        if (_circleSlash16 != null) {
            return _circleSlash16!!
        }
        _circleSlash16 = Builder(name = "CircleSlash16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(3.965f, 13.096f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 9.131f, -9.131f)
                close()
                moveTo(1.5f, 8.0f)
                arcToRelative(6.474f, 6.474f, 0.0f, false, false, 1.404f, 4.035f)
                lineToRelative(9.131f, -9.131f)
                arcTo(6.499f, 6.499f, 0.0f, false, false, 1.5f, 8.0f)
                close()
            }
        }
        .build()
        return _circleSlash16!!
    }

private var _circleSlash16: ImageVector? = null
