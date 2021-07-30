package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                lineToRelative(28.0f, 0.0f)
                lineToRelative(0.0f, 61.0f)
                lineToRelative(-14.0f, -14.0f)
                lineToRelative(-14.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
