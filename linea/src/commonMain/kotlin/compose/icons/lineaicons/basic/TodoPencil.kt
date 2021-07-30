package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.TodoPencil: ImageVector
    get() {
        if (_todoPencil != null) {
            return _todoPencil!!
        }
        _todoPencil = Builder(name = "TodoPencil", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.0f, 1.0f)
                lineToRelative(0.0f, 53.0f)
                lineToRelative(4.0f, 8.0f)
                lineToRelative(4.0f, -8.0f)
                lineToRelative(0.0f, -53.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.0f, 11.0f)
                lineTo(63.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                lineToRelative(-13.0f, 0.0f)
                lineToRelative(0.0f, 55.0f)
                lineToRelative(44.0f, 0.0f)
                lineToRelative(0.0f, -55.0f)
                lineToRelative(-13.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 5.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(-2.0f, 8.0f)
                lineToRelative(20.0f, 0.0f)
                lineToRelative(-2.0f, -8.0f)
                close()
            }
        }
        .build()
        return _todoPencil!!
    }

private var _todoPencil: ImageVector? = null
