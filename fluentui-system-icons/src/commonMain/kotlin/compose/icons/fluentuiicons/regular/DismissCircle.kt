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

public val RegularGroup.DismissCircle: ImageVector
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
                moveTo(12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(15.4462f, 8.397f)
                lineTo(15.5303f, 8.4697f)
                curveTo(15.7966f, 8.7359f, 15.8208f, 9.1526f, 15.6029f, 9.4462f)
                lineTo(15.5303f, 9.5303f)
                lineTo(13.061f, 12.0f)
                lineTo(15.5303f, 14.4697f)
                curveTo(15.7966f, 14.7359f, 15.8208f, 15.1526f, 15.6029f, 15.4462f)
                lineTo(15.5303f, 15.5303f)
                curveTo(15.2641f, 15.7966f, 14.8474f, 15.8208f, 14.5538f, 15.6029f)
                lineTo(14.4697f, 15.5303f)
                lineTo(12.0f, 13.061f)
                lineTo(9.5303f, 15.5303f)
                curveTo(9.2641f, 15.7966f, 8.8474f, 15.8208f, 8.5538f, 15.6029f)
                lineTo(8.4697f, 15.5303f)
                curveTo(8.2034f, 15.2641f, 8.1792f, 14.8474f, 8.397f, 14.5538f)
                lineTo(8.4697f, 14.4697f)
                lineTo(10.939f, 12.0f)
                lineTo(8.4697f, 9.5303f)
                curveTo(8.2034f, 9.2641f, 8.1792f, 8.8474f, 8.397f, 8.5538f)
                lineTo(8.4697f, 8.4697f)
                curveTo(8.7359f, 8.2034f, 9.1526f, 8.1792f, 9.4462f, 8.397f)
                lineTo(9.5303f, 8.4697f)
                lineTo(12.0f, 10.939f)
                lineTo(14.4697f, 8.4697f)
                curveTo(14.7359f, 8.2034f, 15.1526f, 8.1792f, 15.4462f, 8.397f)
                close()
            }
        }
        .build()
        return _dismissCircle!!
    }

private var _dismissCircle: ImageVector? = null
