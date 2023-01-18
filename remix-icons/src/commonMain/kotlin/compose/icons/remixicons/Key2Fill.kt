package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Key2Fill: ImageVector
    get() {
        if (_key2Fill != null) {
            return _key2Fill!!
        }
        _key2Fill = Builder(name = "Key2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.313f, 11.566f)
                lineToRelative(7.94f, -7.94f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.535f, 3.536f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.99f, 2.99f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, -7.97f, 5.849f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.848f, -7.97f)
                close()
                moveTo(9.414f, 17.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.828f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 2.828f)
                close()
            }
        }
        .build()
        return _key2Fill!!
    }

private var _key2Fill: ImageVector? = null
