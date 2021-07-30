package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Search24: ImageVector
    get() {
        if (_search24 != null) {
            return _search24!!
        }
        _search24 = Builder(name = "Search24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.53f, 15.59f)
                arcToRelative(8.25f, 8.25f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(5.69f, 5.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-5.69f, -5.69f)
                close()
                moveTo(2.5f, 9.25f)
                arcToRelative(6.75f, 6.75f, 0.0f, true, true, 11.74f, 4.547f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, false, -0.443f, 0.442f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 2.5f, 9.25f)
                close()
            }
        }
        .build()
        return _search24!!
    }

private var _search24: ImageVector? = null
