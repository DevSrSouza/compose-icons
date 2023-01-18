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

public val RemixIcons.Key2Line: ImageVector
    get() {
        if (_key2Line != null) {
            return _key2Line!!
        }
        _key2Line = Builder(name = "Key2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.758f, 11.828f)
                lineToRelative(7.849f, -7.849f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(2.474f, 2.474f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-2.475f, -2.475f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-2.121f, -2.122f)
                lineToRelative(-2.192f, 2.192f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, -7.708f, 6.294f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 6.294f, -7.708f)
                close()
                moveTo(10.121f, 18.121f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 5.88f, 13.88f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 4.242f)
                close()
            }
        }
        .build()
        return _key2Line!!
    }

private var _key2Line: ImageVector? = null
