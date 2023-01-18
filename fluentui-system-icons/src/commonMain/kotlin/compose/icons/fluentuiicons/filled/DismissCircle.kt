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

public val FilledGroup.DismissCircle: ImageVector
    get() {
        if (_dismissCircle != null) {
            return _dismissCircle!!
        }
        _dismissCircle = Builder(name = "DismissCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.5303f, 8.4697f)
                lineTo(15.4462f, 8.397f)
                curveTo(15.1852f, 8.2034f, 14.827f, 8.201f, 14.5636f, 8.3899f)
                lineTo(14.4697f, 8.4697f)
                lineTo(12.0f, 10.939f)
                lineTo(9.5303f, 8.4697f)
                lineTo(9.4462f, 8.397f)
                curveTo(9.1852f, 8.2034f, 8.827f, 8.201f, 8.5636f, 8.3899f)
                lineTo(8.4697f, 8.4697f)
                lineTo(8.397f, 8.5538f)
                curveTo(8.2034f, 8.8148f, 8.201f, 9.173f, 8.3899f, 9.4364f)
                lineTo(8.4697f, 9.5303f)
                lineTo(10.939f, 12.0f)
                lineTo(8.4697f, 14.4697f)
                lineTo(8.397f, 14.5538f)
                curveTo(8.2034f, 14.8148f, 8.201f, 15.173f, 8.3899f, 15.4364f)
                lineTo(8.4697f, 15.5303f)
                lineTo(8.5538f, 15.6029f)
                curveTo(8.8148f, 15.7966f, 9.173f, 15.799f, 9.4364f, 15.6101f)
                lineTo(9.5303f, 15.5303f)
                lineTo(12.0f, 13.061f)
                lineTo(14.4697f, 15.5303f)
                lineTo(14.5538f, 15.6029f)
                curveTo(14.8148f, 15.7966f, 15.173f, 15.799f, 15.4364f, 15.6101f)
                lineTo(15.5303f, 15.5303f)
                lineTo(15.6029f, 15.4462f)
                curveTo(15.7966f, 15.1852f, 15.799f, 14.827f, 15.6101f, 14.5636f)
                lineTo(15.5303f, 14.4697f)
                lineTo(13.061f, 12.0f)
                lineTo(15.5303f, 9.5303f)
                lineTo(15.6029f, 9.4462f)
                curveTo(15.7966f, 9.1852f, 15.799f, 8.827f, 15.6101f, 8.5636f)
                lineTo(15.5303f, 8.4697f)
                lineTo(15.4462f, 8.397f)
                lineTo(15.5303f, 8.4697f)
                close()
            }
        }
        .build()
        return _dismissCircle!!
    }

private var _dismissCircle: ImageVector? = null
