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

public val BasicGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(37.004f, 32.166f)
                curveToRelative(1.224f, 0.533f, 2.576f, 0.829f, 3.997f, 0.828f)
                curveToRelative(3.271f, -0.003f, 6.175f, -1.576f, 7.998f, -4.006f)
                lineTo(60.99f, 16.98f)
                curveToRelative(1.255f, -1.673f, 1.998f, -3.751f, 1.996f, -6.002f)
                curveToRelative(-0.003f, -5.522f, -4.484f, -9.997f, -10.007f, -9.993f)
                curveToRelative(-2.251f, 0.002f, -4.327f, 0.747f, -5.999f, 2.004f)
                lineTo(33.989f, 15.998f)
                curveToRelative(-1.768f, 1.805f, -2.997f, 4.277f, -2.996f, 7.003f)
                curveToRelative(0.001f, 1.424f, 0.3f, 2.778f, 0.837f, 4.003f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(37.004f, 32.166f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.831f, 27.004f)
                curveToRelative(0.053f, 0.121f, 0.107f, 0.24f, 0.166f, 0.358f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.997f, 31.836f)
                curveToRelative(-1.225f, -0.535f, -2.577f, -0.831f, -3.998f, -0.83f)
                curveToRelative(-2.251f, 0.002f, -4.328f, 0.747f, -5.999f, 2.004f)
                lineTo(4.01f, 46.02f)
                curveToRelative(-1.768f, 1.804f, -2.997f, 4.276f, -2.995f, 7.002f)
                curveToRelative(0.003f, 5.522f, 4.484f, 9.997f, 10.007f, 9.993f)
                curveToRelative(3.271f, -0.003f, 6.174f, -1.576f, 7.997f, -4.006f)
                lineTo(31.01f, 47.001f)
                curveToRelative(1.255f, -1.673f, 1.998f, -3.751f, 1.996f, -6.002f)
                curveToRelative(-0.001f, -1.422f, -0.299f, -2.774f, -0.835f, -3.998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.006f, 41.006f)
                lineTo(40.994f, 22.994f)
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
