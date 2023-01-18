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

public val RegularGroup.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9519f, 3.0479f)
                curveTo(19.5543f, 1.6504f, 17.2885f, 1.6505f, 15.8911f, 3.0481f)
                lineTo(3.941f, 14.9995f)
                curveTo(3.5347f, 15.4059f, 3.2491f, 15.917f, 3.116f, 16.4761f)
                lineTo(2.0204f, 21.0775f)
                curveTo(1.9601f, 21.3309f, 2.0355f, 21.5974f, 2.2197f, 21.7816f)
                curveTo(2.4039f, 21.9657f, 2.6704f, 22.0412f, 2.9237f, 21.9808f)
                lineTo(7.525f, 20.8853f)
                curveTo(8.0842f, 20.7521f, 8.5955f, 20.4664f, 9.0019f, 20.0599f)
                lineTo(20.952f, 8.1084f)
                curveTo(22.3493f, 6.7109f, 22.3493f, 4.4453f, 20.9519f, 3.0479f)
                close()
                moveTo(16.9518f, 4.1087f)
                curveTo(17.7634f, 3.2969f, 19.0795f, 3.2969f, 19.8912f, 4.1086f)
                curveTo(20.7028f, 4.9202f, 20.7029f, 6.2361f, 19.8913f, 7.0478f)
                lineTo(19.0f, 7.9393f)
                lineTo(16.0606f, 4.9999f)
                lineTo(16.9518f, 4.1087f)
                close()
                moveTo(15.0f, 6.0607f)
                lineTo(17.9394f, 9.0f)
                lineTo(7.9412f, 18.9993f)
                curveTo(7.731f, 19.2095f, 7.4667f, 19.3572f, 7.1775f, 19.4261f)
                lineTo(3.7619f, 20.2393f)
                lineTo(4.5752f, 16.8235f)
                curveTo(4.644f, 16.5345f, 4.7917f, 16.2702f, 5.0017f, 16.0601f)
                lineTo(15.0f, 6.0607f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
