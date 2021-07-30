package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.AnticlockwiseDashed: ImageVector
    get() {
        if (_anticlockwiseDashed != null) {
            return _anticlockwiseDashed!!
        }
        _anticlockwiseDashed = Builder(name = "AnticlockwiseDashed", defaultWidth = 64.0.dp,
                defaultHeight = 64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                curveToRelative(0.672f, 0.0f, 1.339f, 0.021f, 2.0f, 0.063f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.021f, 1.258f)
                curveTo(51.242f, 3.229f, 63.0f, 16.241f, 63.0f, 32.0f)
                curveToRelative(0.0f, 16.104f, -12.279f, 29.34f, -27.986f, 30.855f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.0f, 62.937f)
                curveTo(33.339f, 62.979f, 32.672f, 63.0f, 32.0f, 63.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                curveTo(14.879f, 1.0f, 1.0f, 14.879f, 1.0f, 32.0f)
                curveToRelative(0.0f, 6.713f, 2.134f, 12.926f, 5.759f, 18.0f)
                lineToRelative(5.62f, 5.621f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 45.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(-11.0f, 0.0f)
            }
        }
        .build()
        return _anticlockwiseDashed!!
    }

private var _anticlockwiseDashed: ImageVector? = null
