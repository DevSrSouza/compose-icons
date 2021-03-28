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

public val Octicons.Search16: ImageVector
    get() {
        if (_search16 != null) {
            return _search16!!
        }
        _search16 = Builder(name = "Search16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 7.0f)
                arcToRelative(4.499f, 4.499f, 0.0f, true, true, -8.998f, 0.0f)
                arcTo(4.499f, 4.499f, 0.0f, false, true, 11.5f, 7.0f)
                close()
                moveTo(10.68f, 11.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(3.04f, 3.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.04f, -3.04f)
                close()
            }
        }
        .build()
        return _search16!!
    }

private var _search16: ImageVector? = null
