package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Circle16: ImageVector
    get() {
        if (_circle16 != null) {
            return _circle16!!
        }
        _circle16 = Builder(name = "Circle16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.404f, 3.404f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 9.192f, 9.192f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.192f, -9.192f)
                close()
                moveTo(2.344f, 13.657f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 13.656f, 2.343f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.343f, 13.657f)
                close()
            }
        }
        .build()
        return _circle16!!
    }

private var _circle16: ImageVector? = null
