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

public val Octicons.Search24: ImageVector
    get() {
        if (_search24 != null) {
            return _search24!!
        }
        _search24 = Builder(name = "Search24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 2.0f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, true, 6.34f, 13.53f)
                lineToRelative(5.69f, 5.69f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-5.69f, -5.69f)
                arcTo(8.25f, 8.25f, 0.0f, true, true, 10.25f, 2.0f)
                close()
                moveTo(3.5f, 10.25f)
                arcToRelative(6.75f, 6.75f, 0.0f, true, false, 13.5f, 0.0f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, false, -13.5f, 0.0f)
                close()
            }
        }
        .build()
        return _search24!!
    }

private var _search24: ImageVector? = null
