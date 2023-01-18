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

public val RegularGroup.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = Builder(name = "Live", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9896f, 4.9286f)
                curveTo(6.2825f, 5.2215f, 6.2825f, 5.6964f, 5.9896f, 5.9893f)
                curveTo(2.6701f, 9.3088f, 2.6701f, 14.6907f, 5.9896f, 18.0101f)
                curveTo(6.2825f, 18.303f, 6.2825f, 18.7779f, 5.9896f, 19.0708f)
                curveTo(5.6967f, 19.3637f, 5.2218f, 19.3637f, 4.9289f, 19.0708f)
                curveTo(1.0237f, 15.1655f, 1.0237f, 8.8339f, 4.9289f, 4.9286f)
                curveTo(5.2218f, 4.6358f, 5.6967f, 4.6358f, 5.9896f, 4.9286f)
                close()
                moveTo(19.0711f, 4.9286f)
                curveTo(22.9763f, 8.8339f, 22.9763f, 15.1655f, 19.0711f, 19.0708f)
                curveTo(18.7782f, 19.3637f, 18.3033f, 19.3637f, 18.0104f, 19.0708f)
                curveTo(17.7175f, 18.7779f, 17.7175f, 18.303f, 18.0104f, 18.0101f)
                curveTo(21.3299f, 14.6907f, 21.3299f, 9.3088f, 18.0104f, 5.9893f)
                curveTo(17.7175f, 5.6964f, 17.7175f, 5.2215f, 18.0104f, 4.9286f)
                curveTo(18.3033f, 4.6358f, 18.7782f, 4.6358f, 19.0711f, 4.9286f)
                close()
                moveTo(8.818f, 7.7571f)
                curveTo(9.1109f, 8.05f, 9.1109f, 8.5248f, 8.818f, 8.8177f)
                curveTo(7.0607f, 10.5751f, 7.0607f, 13.4243f, 8.818f, 15.1817f)
                curveTo(9.1109f, 15.4746f, 9.1109f, 15.9495f, 8.818f, 16.2424f)
                curveTo(8.5251f, 16.5353f, 8.0503f, 16.5353f, 7.7574f, 16.2424f)
                curveTo(5.4142f, 13.8992f, 5.4142f, 10.1002f, 7.7574f, 7.7571f)
                curveTo(8.0503f, 7.4642f, 8.5251f, 7.4642f, 8.818f, 7.7571f)
                close()
                moveTo(16.2426f, 7.7571f)
                curveTo(18.5858f, 10.1002f, 18.5858f, 13.8992f, 16.2426f, 16.2424f)
                curveTo(15.9497f, 16.5353f, 15.4749f, 16.5353f, 15.182f, 16.2424f)
                curveTo(14.8891f, 15.9495f, 14.8891f, 15.4746f, 15.182f, 15.1817f)
                curveTo(16.9393f, 13.4243f, 16.9393f, 10.5751f, 15.182f, 8.8177f)
                curveTo(14.8891f, 8.5248f, 14.8891f, 8.05f, 15.182f, 7.7571f)
                curveTo(15.4749f, 7.4642f, 15.9497f, 7.4642f, 16.2426f, 7.7571f)
                close()
                moveTo(12.0f, 10.4997f)
                curveTo(12.8284f, 10.4997f, 13.5f, 11.1713f, 13.5f, 11.9997f)
                curveTo(13.5f, 12.8281f, 12.8284f, 13.4997f, 12.0f, 13.4997f)
                curveTo(11.1716f, 13.4997f, 10.5f, 12.8281f, 10.5f, 11.9997f)
                curveTo(10.5f, 11.1713f, 11.1716f, 10.4997f, 12.0f, 10.4997f)
                close()
            }
        }
        .build()
        return _live!!
    }

private var _live: ImageVector? = null
