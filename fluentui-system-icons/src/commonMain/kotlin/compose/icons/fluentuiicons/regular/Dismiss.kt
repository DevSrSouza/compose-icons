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

public val RegularGroup.Dismiss: ImageVector
    get() {
        if (_dismiss != null) {
            return _dismiss!!
        }
        _dismiss = Builder(name = "Dismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.397f, 4.5538f)
                lineTo(4.4697f, 4.4697f)
                curveTo(4.7359f, 4.2034f, 5.1526f, 4.1792f, 5.4462f, 4.397f)
                lineTo(5.5303f, 4.4697f)
                lineTo(12.0f, 10.939f)
                lineTo(18.4697f, 4.4697f)
                curveTo(18.7626f, 4.1768f, 19.2374f, 4.1768f, 19.5303f, 4.4697f)
                curveTo(19.8232f, 4.7626f, 19.8232f, 5.2374f, 19.5303f, 5.5303f)
                lineTo(13.061f, 12.0f)
                lineTo(19.5303f, 18.4697f)
                curveTo(19.7966f, 18.7359f, 19.8208f, 19.1526f, 19.6029f, 19.4462f)
                lineTo(19.5303f, 19.5303f)
                curveTo(19.2641f, 19.7966f, 18.8474f, 19.8208f, 18.5538f, 19.6029f)
                lineTo(18.4697f, 19.5303f)
                lineTo(12.0f, 13.061f)
                lineTo(5.5303f, 19.5303f)
                curveTo(5.2374f, 19.8232f, 4.7626f, 19.8232f, 4.4697f, 19.5303f)
                curveTo(4.1768f, 19.2374f, 4.1768f, 18.7626f, 4.4697f, 18.4697f)
                lineTo(10.939f, 12.0f)
                lineTo(4.4697f, 5.5303f)
                curveTo(4.2034f, 5.2641f, 4.1792f, 4.8474f, 4.397f, 4.5538f)
                lineTo(4.4697f, 4.4697f)
                lineTo(4.397f, 4.5538f)
                close()
            }
        }
        .build()
        return _dismiss!!
    }

private var _dismiss: ImageVector? = null
