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

public val BasicGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.92f, 10.081f)
                curveToRelative(12.107f, 12.105f, 12.107f, 31.732f, 0.0f, 43.838f)
                curveToRelative(-12.106f, 12.108f, -31.734f, 12.108f, -43.84f, 0.0f)
                curveToRelative(-12.107f, -12.105f, -12.107f, -31.732f, 0.0f, -43.838f)
                curveTo(22.186f, -2.027f, 41.813f, -2.027f, 53.92f, 10.081f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-22.999f, 0.0f)
                arcToRelative(22.999f, 22.999f, 0.0f, true, true, 45.998f, 0.0f)
                arcToRelative(22.999f, 22.999f, 0.0f, true, true, -45.998f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-15.0f, 0.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, true, true, 30.0f, 0.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, true, true, -30.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-6.999f, 0.0f)
                arcToRelative(6.999f, 6.999f, 0.0f, true, true, 13.998f, 0.0f)
                arcToRelative(6.999f, 6.999f, 0.0f, true, true, -13.998f, 0.0f)
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
