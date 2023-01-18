package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9519f, 3.0475f)
                curveTo(19.5543f, 1.6499f, 17.2885f, 1.65f, 15.8911f, 3.0476f)
                lineTo(3.941f, 14.999f)
                curveTo(3.5347f, 15.4054f, 3.2491f, 15.9166f, 3.116f, 16.4756f)
                lineTo(2.0204f, 21.0771f)
                curveTo(1.9601f, 21.3304f, 2.0355f, 21.5969f, 2.2197f, 21.7811f)
                curveTo(2.4039f, 21.9653f, 2.6704f, 22.0407f, 2.9237f, 21.9804f)
                lineTo(7.525f, 20.8848f)
                curveTo(8.0842f, 20.7517f, 8.5955f, 20.466f, 9.0019f, 20.0595f)
                lineTo(18.9995f, 10.0607f)
                curveTo(19.6777f, 10.7446f, 19.676f, 11.8487f, 18.9943f, 12.5304f)
                lineTo(17.2109f, 14.3138f)
                curveTo(16.918f, 14.6067f, 16.918f, 15.0816f, 17.2109f, 15.3745f)
                curveTo(17.5038f, 15.6674f, 17.9786f, 15.6674f, 18.2715f, 15.3745f)
                lineTo(20.055f, 13.5911f)
                curveTo(21.3224f, 12.3236f, 21.3242f, 10.2697f, 20.0601f, 9.0f)
                lineTo(20.952f, 8.108f)
                curveTo(22.3493f, 6.7105f, 22.3493f, 4.4449f, 20.9519f, 3.0475f)
                close()
                moveTo(16.9518f, 4.1082f)
                curveTo(17.7634f, 3.2964f, 19.0795f, 3.2964f, 19.8912f, 4.1081f)
                curveTo(20.7028f, 4.9198f, 20.7029f, 6.2357f, 19.8913f, 7.0474f)
                lineTo(7.9412f, 18.9989f)
                curveTo(7.731f, 19.2091f, 7.4667f, 19.3568f, 7.1775f, 19.4256f)
                lineTo(3.7619f, 20.2389f)
                lineTo(4.5752f, 16.823f)
                curveTo(4.644f, 16.534f, 4.7917f, 16.2697f, 5.0017f, 16.0596f)
                lineTo(16.9518f, 4.1082f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
