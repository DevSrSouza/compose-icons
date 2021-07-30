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

public val BasicGroup.Accelerator: ImageVector
    get() {
        if (_accelerator != null) {
            return _accelerator!!
        }
        _accelerator = Builder(name = "Accelerator", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.001f, 0.887f)
                curveToRelative(17.184f, 0.0f, 31.113f, 13.929f, 31.112f, 31.113f)
                curveTo(63.114f, 49.185f, 49.184f, 63.115f, 32.0f, 63.113f)
                curveTo(14.815f, 63.114f, 0.887f, 49.185f, 0.888f, 32.001f)
                curveTo(0.885f, 14.816f, 14.815f, 0.887f, 32.001f, 0.887f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 32.0f)
                curveToRelative(0.0f, -5.63f, 2.148f, -11.26f, 6.444f, -15.556f)
                curveToRelative(8.591f, -8.593f, 22.521f, -8.593f, 31.112f, 0.0f)
                curveTo(51.852f, 20.74f, 54.0f, 26.37f, 54.0f, 32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 26.0f)
                lineTo(30.333f, 33.333f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 35.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _accelerator!!
    }

private var _accelerator: ImageVector? = null
