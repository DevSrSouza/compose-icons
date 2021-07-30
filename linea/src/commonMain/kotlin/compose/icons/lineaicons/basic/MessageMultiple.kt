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

public val BasicGroup.MessageMultiple: ImageVector
    get() {
        if (_messageMultiple != null) {
            return _messageMultiple!!
        }
        _messageMultiple = Builder(name = "MessageMultiple", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.0f, 49.042f)
                lineToRelative(28.963f, 0.0f)
                lineToRelative(0.0f, -38.0f)
                lineToRelative(-53.963f, 0.0f)
                lineToRelative(0.0f, 38.0f)
                lineToRelative(13.0f, 0.0f)
                lineToRelative(0.0f, 10.444f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(57.0f, 41.042f)
                lineToRelative(5.963f, 0.0f)
                lineToRelative(0.0f, -38.0f)
                lineToRelative(-53.963f, 0.0f)
                lineToRelative(0.0f, 5.958f)
            }
        }
        .build()
        return _messageMultiple!!
    }

private var _messageMultiple: ImageVector? = null
