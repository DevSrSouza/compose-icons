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

public val RegularGroup.ArrowBounce: ImageVector
    get() {
        if (_arrowBounce != null) {
            return _arrowBounce!!
        }
        _arrowBounce = Builder(name = "ArrowBounce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0025f, 6.75f)
                curveTo(11.0025f, 6.3358f, 10.6667f, 6.0f, 10.2525f, 6.0f)
                horizontalLineTo(2.752f)
                curveTo(2.3377f, 6.0f, 2.002f, 6.3358f, 2.002f, 6.75f)
                verticalLineTo(14.25f)
                curveTo(2.002f, 14.6642f, 2.3377f, 15.0f, 2.752f, 15.0f)
                curveTo(3.1662f, 15.0f, 3.502f, 14.6642f, 3.502f, 14.25f)
                verticalLineTo(8.5609f)
                lineTo(12.2198f, 17.2803f)
                curveTo(12.3605f, 17.421f, 12.5513f, 17.5f, 12.7502f, 17.5f)
                curveTo(12.9491f, 17.5f, 13.1399f, 17.421f, 13.2806f, 17.2803f)
                lineTo(21.7804f, 8.7803f)
                curveTo(22.0733f, 8.4874f, 22.0733f, 8.0126f, 21.7804f, 7.7197f)
                curveTo(21.4875f, 7.4268f, 21.0126f, 7.4268f, 20.7197f, 7.7197f)
                lineTo(12.7503f, 15.6893f)
                lineTo(4.5624f, 7.5f)
                horizontalLineTo(10.2525f)
                curveTo(10.6667f, 7.5f, 11.0025f, 7.1642f, 11.0025f, 6.75f)
                close()
            }
        }
        .build()
        return _arrowBounce!!
    }

private var _arrowBounce: ImageVector? = null
