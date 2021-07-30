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

public val BasicGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                curveToRelative(0.0f, 20.0f, 31.0f, 38.0f, 31.0f, 38.0f)
                reflectiveCurveToRelative(31.0f, -18.0f, 31.0f, -38.0f)
                curveToRelative(0.0f, -8.285f, -6.0f, -16.0f, -15.0f, -16.0f)
                curveToRelative(-8.285f, 0.0f, -16.0f, 5.715f, -16.0f, 14.0f)
                curveToRelative(0.0f, -8.285f, -7.715f, -14.0f, -16.0f, -14.0f)
                curveTo(7.0f, 5.0f, 1.0f, 12.715f, 1.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.0f, 57.0f)
                lineToRelative(7.0f, -7.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(-6.0f, -5.0f)
                lineToRelative(0.0f, -2.0f)
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
