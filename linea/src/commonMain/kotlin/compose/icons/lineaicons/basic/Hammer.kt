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

public val BasicGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                lineTo(41.0f, 39.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0008f, 54.9997f)
                lineToRelative(-5.9997f, 5.9997f)
                lineToRelative(-18.9998f, -18.9998f)
                lineToRelative(5.9997f, -5.9997f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 19.0f)
                lineTo(17.0f, 3.0f)
                curveToRelative(6.0f, 6.0f, 13.0f, 1.0f, 13.0f, 1.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(12.0f, 30.0f)
                lineTo(1.0f, 19.0f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
