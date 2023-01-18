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

public val FilledGroup.CallPause: ImageVector
    get() {
        if (_callPause != null) {
            return _callPause!!
        }
        _callPause = Builder(name = "CallPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4995f, 2.75f)
                curveTo(15.4995f, 2.3358f, 15.1637f, 2.0f, 14.7495f, 2.0f)
                curveTo(14.3353f, 2.0f, 13.9995f, 2.3358f, 13.9995f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(13.9995f, 10.6642f, 14.3353f, 11.0f, 14.7495f, 11.0f)
                curveTo(15.1637f, 11.0f, 15.4995f, 10.6642f, 15.4995f, 10.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(19.4995f, 2.75f)
                curveTo(19.4995f, 2.3358f, 19.1637f, 2.0f, 18.7495f, 2.0f)
                curveTo(18.3353f, 2.0f, 17.9995f, 2.3358f, 17.9995f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(17.9995f, 10.6642f, 18.3353f, 11.0f, 18.7495f, 11.0f)
                curveTo(19.1637f, 11.0f, 19.4995f, 10.6642f, 19.4995f, 10.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(10.2261f, 5.3399f)
                lineTo(9.3664f, 3.3126f)
                curveTo(8.9344f, 2.2938f, 7.8565f, 1.7729f, 6.8477f, 2.0952f)
                lineTo(5.7711f, 2.4392f)
                curveTo(4.7036f, 2.7803f, 3.8861f, 3.6948f, 3.6221f, 4.8431f)
                curveTo(2.9947f, 7.5721f, 3.7475f, 10.8947f, 5.8803f, 14.8109f)
                curveTo(8.0101f, 18.7214f, 10.3444f, 21.0726f, 12.8833f, 21.8645f)
                curveTo(13.9587f, 22.2f, 15.1212f, 21.9036f, 15.9352f, 21.0865f)
                lineTo(16.7529f, 20.2655f)
                curveTo(17.5159f, 19.4995f, 17.6265f, 18.2532f, 17.0116f, 17.3498f)
                lineTo(15.7792f, 15.5392f)
                curveTo(15.2502f, 14.762f, 14.311f, 14.4315f, 13.4486f, 14.7191f)
                lineTo(11.1734f, 15.4778f)
                curveTo(10.2655f, 14.7907f, 9.5085f, 13.9259f, 8.9024f, 12.8834f)
                curveTo(8.2962f, 11.8409f, 7.9347f, 10.7819f, 7.8178f, 9.7064f)
                lineTo(9.7121f, 7.9084f)
                curveTo(10.3929f, 7.2623f, 10.6008f, 6.2234f, 10.2261f, 5.3399f)
                close()
            }
        }
        .build()
        return _callPause!!
    }

private var _callPause: ImageVector? = null
