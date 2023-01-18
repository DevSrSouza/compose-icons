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

public val FilledGroup.TextMore: ImageVector
    get() {
        if (_textMore != null) {
            return _textMore!!
        }
        _textMore = Builder(name = "TextMore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6716f, 2.6113f)
                curveTo(10.5153f, 2.2408f, 10.1523f, 2.0f, 9.7503f, 2.0f)
                curveTo(9.3482f, 2.0f, 8.9852f, 2.2408f, 8.8289f, 2.6113f)
                lineTo(2.0789f, 18.6113f)
                curveTo(1.8642f, 19.1202f, 2.1027f, 19.7067f, 2.6116f, 19.9214f)
                curveTo(3.1204f, 20.136f, 3.7069f, 19.8976f, 3.9216f, 19.3887f)
                lineTo(5.7731f, 15.0f)
                horizontalLineTo(13.7274f)
                lineTo(15.0131f, 18.0474f)
                curveTo(15.1706f, 18.0163f, 15.3335f, 18.0f, 15.5003f, 18.0f)
                curveTo(16.3182f, 18.0f, 17.0444f, 18.3928f, 17.5005f, 19.0001f)
                curveTo(17.5006f, 18.8703f, 17.4752f, 18.7384f, 17.4216f, 18.6113f)
                lineTo(10.6716f, 2.6113f)
                close()
                moveTo(12.8837f, 13.0f)
                horizontalLineTo(6.6169f)
                lineTo(9.7503f, 5.5727f)
                lineTo(12.8837f, 13.0f)
                close()
                moveTo(10.5f, 22.0f)
                curveTo(11.3284f, 22.0f, 12.0f, 21.3284f, 12.0f, 20.5f)
                curveTo(12.0f, 19.6716f, 11.3284f, 19.0f, 10.5f, 19.0f)
                curveTo(9.6716f, 19.0f, 9.0f, 19.6716f, 9.0f, 20.5f)
                curveTo(9.0f, 21.3284f, 9.6716f, 22.0f, 10.5f, 22.0f)
                close()
                moveTo(17.0f, 20.5f)
                curveTo(17.0f, 21.3284f, 16.3284f, 22.0f, 15.5f, 22.0f)
                curveTo(14.6716f, 22.0f, 14.0f, 21.3284f, 14.0f, 20.5f)
                curveTo(14.0f, 19.6716f, 14.6716f, 19.0f, 15.5f, 19.0f)
                curveTo(16.3284f, 19.0f, 17.0f, 19.6716f, 17.0f, 20.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveTo(22.0f, 21.3284f, 21.3284f, 22.0f, 20.5f, 22.0f)
                curveTo(19.6716f, 22.0f, 19.0f, 21.3284f, 19.0f, 20.5f)
                curveTo(19.0f, 19.6716f, 19.6716f, 19.0f, 20.5f, 19.0f)
                curveTo(21.3284f, 19.0f, 22.0f, 19.6716f, 22.0f, 20.5f)
                close()
            }
        }
        .build()
        return _textMore!!
    }

private var _textMore: ImageVector? = null
