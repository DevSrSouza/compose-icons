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

public val RegularGroup.PenProhibited: ImageVector
    get() {
        if (_penProhibited != null) {
            return _penProhibited!!
        }
        _penProhibited = Builder(name = "PenProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8911f, 3.0476f)
                curveTo(17.2885f, 1.65f, 19.5543f, 1.6499f, 20.9519f, 3.0475f)
                curveTo(22.3493f, 4.4449f, 22.3493f, 6.7105f, 20.952f, 8.108f)
                lineTo(17.9075f, 11.1528f)
                curveTo(17.4543f, 11.0527f, 16.9833f, 11.0f, 16.5f, 11.0f)
                curveTo(16.3021f, 11.0f, 16.1063f, 11.0088f, 15.913f, 11.0262f)
                lineTo(19.8913f, 7.0474f)
                curveTo(20.7029f, 6.2357f, 20.7028f, 4.9198f, 19.8912f, 4.1081f)
                curveTo(19.0795f, 3.2964f, 17.7634f, 3.2964f, 16.9518f, 4.1082f)
                lineTo(5.0017f, 16.0596f)
                curveTo(4.7917f, 16.2697f, 4.644f, 16.534f, 4.5752f, 16.823f)
                lineTo(3.7619f, 20.2389f)
                lineTo(7.1775f, 19.4256f)
                curveTo(7.4667f, 19.3568f, 7.731f, 19.2091f, 7.9412f, 18.9989f)
                lineTo(10.0261f, 16.9137f)
                curveTo(10.0088f, 17.1068f, 10.0f, 17.3024f, 10.0f, 17.5f)
                curveTo(10.0f, 17.9836f, 10.0528f, 18.4548f, 10.153f, 18.9083f)
                lineTo(9.0019f, 20.0595f)
                curveTo(8.5955f, 20.466f, 8.0842f, 20.7517f, 7.525f, 20.8848f)
                lineTo(2.9237f, 21.9804f)
                curveTo(2.6704f, 22.0407f, 2.4039f, 21.9653f, 2.2197f, 21.7811f)
                curveTo(2.0355f, 21.5969f, 1.9601f, 21.3304f, 2.0204f, 21.0771f)
                lineTo(3.116f, 16.4756f)
                curveTo(3.2491f, 15.9166f, 3.5347f, 15.4054f, 3.941f, 14.999f)
                lineTo(15.8911f, 3.0476f)
                close()
                moveTo(22.0f, 17.5f)
                curveTo(22.0f, 14.4624f, 19.5376f, 12.0f, 16.5f, 12.0f)
                curveTo(13.4624f, 12.0f, 11.0f, 14.4624f, 11.0f, 17.5f)
                curveTo(11.0f, 20.5376f, 13.4624f, 23.0f, 16.5f, 23.0f)
                curveTo(19.5376f, 23.0f, 22.0f, 20.5376f, 22.0f, 17.5f)
                close()
                moveTo(12.5f, 17.5f)
                curveTo(12.5f, 15.2909f, 14.2909f, 13.5f, 16.5f, 13.5f)
                curveTo(17.3335f, 13.5f, 18.1075f, 13.755f, 18.7482f, 14.1911f)
                lineTo(13.1911f, 19.7482f)
                curveTo(12.755f, 19.1075f, 12.5f, 18.3335f, 12.5f, 17.5f)
                close()
                moveTo(16.5f, 21.5f)
                curveTo(15.6665f, 21.5f, 14.8925f, 21.245f, 14.2518f, 20.8089f)
                lineTo(19.8089f, 15.2518f)
                curveTo(20.245f, 15.8925f, 20.5f, 16.6665f, 20.5f, 17.5f)
                curveTo(20.5f, 19.7091f, 18.7091f, 21.5f, 16.5f, 21.5f)
                close()
            }
        }
        .build()
        return _penProhibited!!
    }

private var _penProhibited: ImageVector? = null
