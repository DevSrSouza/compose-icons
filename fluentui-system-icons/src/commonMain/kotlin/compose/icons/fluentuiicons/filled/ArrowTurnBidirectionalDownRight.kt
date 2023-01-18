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

public val FilledGroup.ArrowTurnBidirectionalDownRight: ImageVector
    get() {
        if (_arrowTurnBidirectionalDownRight != null) {
            return _arrowTurnBidirectionalDownRight!!
        }
        _arrowTurnBidirectionalDownRight = Builder(name = "ArrowTurnBidirectionalDownRight",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7071f, 3.2929f)
                curveTo(17.3166f, 2.9024f, 16.6834f, 2.9024f, 16.2929f, 3.2929f)
                curveTo(15.9024f, 3.6834f, 15.9024f, 4.3166f, 16.2929f, 4.7071f)
                lineTo(18.5867f, 7.001f)
                horizontalLineTo(11.5f)
                curveTo(9.0147f, 7.001f, 7.0f, 9.0157f, 7.0f, 11.501f)
                verticalLineTo(18.5866f)
                lineTo(4.707f, 16.2941f)
                curveTo(4.3165f, 15.9036f, 3.6833f, 15.9037f, 3.2928f, 16.2942f)
                curveTo(2.9023f, 16.6848f, 2.9024f, 17.318f, 3.293f, 17.7085f)
                lineTo(7.2934f, 21.7082f)
                curveTo(7.684f, 22.0986f, 8.3171f, 22.0986f, 8.7076f, 21.7081f)
                lineTo(12.7071f, 17.7084f)
                curveTo(13.0976f, 17.3178f, 13.0976f, 16.6847f, 12.7071f, 16.2942f)
                curveTo(12.3166f, 15.9036f, 11.6834f, 15.9037f, 11.2929f, 16.2942f)
                lineTo(9.0f, 18.5872f)
                verticalLineTo(11.501f)
                curveTo(9.0f, 10.1203f, 10.1193f, 9.001f, 11.5f, 9.001f)
                horizontalLineTo(18.5859f)
                lineTo(16.293f, 11.2936f)
                curveTo(15.9024f, 11.6841f, 15.9023f, 12.3172f, 16.2928f, 12.7078f)
                curveTo(16.6833f, 13.0983f, 17.3165f, 13.0984f, 17.707f, 12.7079f)
                lineTo(21.7077f, 8.7079f)
                curveTo(21.8953f, 8.5204f, 22.0007f, 8.266f, 22.0007f, 8.0008f)
                curveTo(22.0007f, 7.7355f, 21.8953f, 7.4812f, 21.7078f, 7.2936f)
                lineTo(17.7071f, 3.2929f)
                close()
            }
        }
        .build()
        return _arrowTurnBidirectionalDownRight!!
    }

private var _arrowTurnBidirectionalDownRight: ImageVector? = null
