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

public val Octicons.Rss24: ImageVector
    get() {
        if (_rss24 != null) {
            return _rss24!!
        }
        _rss24 = Builder(name = "Rss24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                curveTo(14.053f, 2.5f, 22.0f, 10.447f, 22.0f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                curveTo(20.5f, 11.275f, 13.225f, 4.0f, 4.25f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(4.25f, 9.5f)
                curveTo(10.187f, 9.5f, 15.0f, 14.313f, 15.0f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 4.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(3.5f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.999f, -0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.5f, 19.0f)
                close()
            }
        }
        .build()
        return _rss24!!
    }

private var _rss24: ImageVector? = null
