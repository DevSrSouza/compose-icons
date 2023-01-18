package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.IosArrowRtl: ImageVector
    get() {
        if (_iosArrowRtl != null) {
            return _iosArrowRtl!!
        }
        _iosArrowRtl = Builder(name = "IosArrowRtl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2727f, 3.6866f)
                curveTo(10.8935f, 3.2851f, 10.9115f, 2.6522f, 11.3131f, 2.273f)
                curveTo(11.7146f, 1.8938f, 12.3475f, 1.9118f, 12.7267f, 2.3134f)
                lineTo(21.227f, 11.3134f)
                curveTo(21.591f, 11.6987f, 21.591f, 12.3012f, 21.2271f, 12.6866f)
                lineTo(12.7267f, 21.688f)
                curveTo(12.3476f, 22.0896f, 11.7147f, 22.1077f, 11.3131f, 21.7285f)
                curveTo(10.9116f, 21.3493f, 10.8934f, 20.7164f, 11.2726f, 20.3149f)
                lineTo(19.1245f, 12.0001f)
                lineTo(11.2727f, 3.6866f)
                close()
            }
        }
        .build()
        return _iosArrowRtl!!
    }

private var _iosArrowRtl: ImageVector? = null
