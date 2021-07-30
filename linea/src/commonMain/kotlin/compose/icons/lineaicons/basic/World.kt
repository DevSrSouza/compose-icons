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

public val BasicGroup.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
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
                moveTo(32.0f, 1.0f)
                lineTo(32.0f, 63.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 32.0f)
                lineTo(1.0f, 32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.0f, 1.0f)
                curveToRelative(0.0f, 0.0f, -14.0f, 11.0f, -14.0f, 31.0f)
                reflectiveCurveToRelative(14.0f, 31.0f, 14.0f, 31.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.0f, 1.0f)
                curveToRelative(0.0f, 0.0f, 14.0f, 11.0f, 14.0f, 31.0f)
                reflectiveCurveTo(34.0f, 63.0f, 34.0f, 63.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveToRelative(0.0f, 0.0f, 5.0f, 10.0f, 24.0f, 10.0f)
                reflectiveCurveToRelative(24.0f, -10.0f, 24.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 52.0f)
                curveToRelative(0.0f, 0.0f, 5.0f, -10.0f, 24.0f, -10.0f)
                reflectiveCurveToRelative(24.0f, 10.0f, 24.0f, 10.0f)
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
