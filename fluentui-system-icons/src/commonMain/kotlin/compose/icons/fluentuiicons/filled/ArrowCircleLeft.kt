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

public val FilledGroup.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.2801f, 16.5307f)
                curveTo(12.0138f, 16.797f, 11.5972f, 16.8212f, 11.3036f, 16.6033f)
                lineTo(11.2195f, 16.5307f)
                lineTo(7.2186f, 12.5299f)
                curveTo(6.9523f, 12.2636f, 6.9282f, 11.8468f, 7.1461f, 11.5532f)
                lineTo(7.2187f, 11.4691f)
                lineTo(11.2203f, 7.4691f)
                curveTo(11.5132f, 7.1763f, 11.9881f, 7.1764f, 12.2809f, 7.4693f)
                curveTo(12.5471f, 7.7356f, 12.5713f, 8.1523f, 12.3534f, 8.4459f)
                lineTo(12.2807f, 8.53f)
                lineTo(9.5588f, 11.2507f)
                lineTo(16.2505f, 11.2504f)
                curveTo(16.6302f, 11.2504f, 16.944f, 11.5325f, 16.9936f, 11.8986f)
                lineTo(17.0005f, 12.0004f)
                curveTo(17.0005f, 12.3801f, 16.7183f, 12.6939f, 16.3523f, 12.7435f)
                lineTo(16.2505f, 12.7504f)
                lineTo(9.5608f, 12.7507f)
                lineTo(12.2801f, 15.47f)
                curveTo(12.5464f, 15.7363f, 12.5706f, 16.153f, 12.3527f, 16.4466f)
                lineTo(12.2801f, 16.5307f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
