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

public val ArrowsGroup.RotateDashed: ImageVector
    get() {
        if (_rotateDashed != null) {
            return _rotateDashed!!
        }
        _rotateDashed = Builder(name = "RotateDashed", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 1.0f)
                curveToRelative(0.666f, 0.0f, 1.333f, 0.022f, 1.998f, 0.066f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(37.071f, 1.276f)
                curveToRelative(6.27f, 0.854f, 12.321f, 3.691f, 17.141f, 8.511f)
                curveTo(64.91f, 20.484f, 65.841f, 37.248f, 57.003f, 49.0f)
                lineToRelative(-3.846f, 3.846f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(52.416f, 53.588f)
                lineTo(51.002f, 55.002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.0f, 63.0f)
                curveToRelative(-0.666f, 0.0f, -1.333f, -0.022f, -1.998f, -0.066f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.929f, 62.724f)
                curveToRelative(-6.27f, -0.854f, -12.321f, -3.691f, -17.141f, -8.511f)
                curveTo(-0.91f, 43.516f, -1.841f, 26.752f, 6.997f, 15.0f)
                lineToRelative(3.846f, -3.846f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.584f, 10.412f)
                lineTo(12.998f, 8.998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(51.0f, 44.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(11.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(-11.0f, 0.0f)
            }
        }
        .build()
        return _rotateDashed!!
    }

private var _rotateDashed: ImageVector? = null
