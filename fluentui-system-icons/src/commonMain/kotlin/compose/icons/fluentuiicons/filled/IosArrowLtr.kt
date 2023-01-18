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

public val FilledGroup.IosArrowLtr: ImageVector
    get() {
        if (_iosArrowLtr != null) {
            return _iosArrowLtr!!
        }
        _iosArrowLtr = Builder(name = "IosArrowLtr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7271f, 3.6866f)
                curveTo(13.1063f, 3.2851f, 13.0882f, 2.6522f, 12.6867f, 2.273f)
                curveTo(12.2852f, 1.8938f, 11.6523f, 1.9118f, 11.2731f, 2.3134f)
                lineTo(2.7728f, 11.3134f)
                curveTo(2.4088f, 11.6987f, 2.4088f, 12.3012f, 2.7727f, 12.6866f)
                lineTo(11.273f, 21.688f)
                curveTo(11.6522f, 22.0896f, 12.2851f, 22.1077f, 12.6866f, 21.7285f)
                curveTo(13.0882f, 21.3493f, 13.1063f, 20.7164f, 12.7271f, 20.3149f)
                lineTo(4.8752f, 12.0001f)
                lineTo(12.7271f, 3.6866f)
                close()
            }
        }
        .build()
        return _iosArrowLtr!!
    }

private var _iosArrowLtr: ImageVector? = null
