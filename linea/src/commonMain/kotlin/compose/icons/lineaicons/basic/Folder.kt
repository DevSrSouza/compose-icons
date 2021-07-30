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

public val BasicGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 18.0f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(-62.0f, 0.0f)
                lineToRelative(0.0f, -44.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
