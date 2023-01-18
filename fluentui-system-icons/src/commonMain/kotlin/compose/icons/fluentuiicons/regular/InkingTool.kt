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

public val RegularGroup.InkingTool: ImageVector
    get() {
        if (_inkingTool != null) {
            return _inkingTool!!
        }
        _inkingTool = Builder(name = "InkingTool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 2.75f)
                curveTo(4.5f, 2.3358f, 4.1642f, 2.0f, 3.75f, 2.0f)
                curveTo(3.3358f, 2.0f, 3.0f, 2.3358f, 3.0f, 2.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 7.2165f, 3.7835f, 8.0f, 4.75f, 8.0f)
                horizontalLineTo(5.0151f)
                lineTo(9.0507f, 16.9681f)
                curveTo(9.255f, 17.4222f, 9.6381f, 17.759f, 10.0949f, 17.9108f)
                curveTo(10.027f, 18.262f, 10.0f, 18.6334f, 10.0f, 19.0f)
                curveTo(10.0f, 19.6711f, 10.0908f, 20.3658f, 10.3633f, 20.9213f)
                curveTo(10.6549f, 21.5158f, 11.1927f, 22.0f, 12.0f, 22.0f)
                curveTo(12.8073f, 22.0f, 13.3451f, 21.5158f, 13.6367f, 20.9213f)
                curveTo(13.9092f, 20.3658f, 14.0f, 19.6711f, 14.0f, 19.0f)
                curveTo(14.0f, 18.6334f, 13.973f, 18.262f, 13.9051f, 17.9108f)
                curveTo(14.3619f, 17.759f, 14.745f, 17.4222f, 14.9493f, 16.9681f)
                lineTo(18.9849f, 8.0f)
                horizontalLineTo(19.25f)
                curveTo(20.2165f, 8.0f, 21.0f, 7.2165f, 21.0f, 6.25f)
                verticalLineTo(2.75f)
                curveTo(21.0f, 2.3358f, 20.6642f, 2.0f, 20.25f, 2.0f)
                curveTo(19.8358f, 2.0f, 19.5f, 2.3358f, 19.5f, 2.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 6.3881f, 19.3881f, 6.5f, 19.25f, 6.5f)
                horizontalLineTo(18.5171f)
                curveTo(18.506f, 6.4998f, 18.4949f, 6.4998f, 18.4838f, 6.5f)
                horizontalLineTo(5.5162f)
                curveTo(5.5051f, 6.4998f, 5.494f, 6.4998f, 5.4829f, 6.5f)
                horizontalLineTo(4.75f)
                curveTo(4.6119f, 6.5f, 4.5f, 6.3881f, 4.5f, 6.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(6.6599f, 8.0f)
                horizontalLineTo(17.3401f)
                lineTo(13.5814f, 16.3526f)
                curveTo(13.541f, 16.4423f, 13.4518f, 16.5f, 13.3534f, 16.5f)
                horizontalLineTo(10.6466f)
                curveTo(10.5482f, 16.5f, 10.459f, 16.4423f, 10.4186f, 16.3526f)
                lineTo(6.6599f, 8.0f)
                close()
                moveTo(11.6133f, 18.0f)
                horizontalLineTo(12.3867f)
                curveTo(12.4582f, 18.2558f, 12.5f, 18.5937f, 12.5f, 19.0f)
                curveTo(12.5f, 19.5715f, 12.417f, 20.0019f, 12.29f, 20.2607f)
                curveTo(12.1822f, 20.4805f, 12.095f, 20.5f, 12.0f, 20.5f)
                curveTo(11.905f, 20.5f, 11.8178f, 20.4805f, 11.71f, 20.2607f)
                curveTo(11.583f, 20.0019f, 11.5f, 19.5715f, 11.5f, 19.0f)
                curveTo(11.5f, 18.5937f, 11.5418f, 18.2558f, 11.6133f, 18.0f)
                close()
            }
        }
        .build()
        return _inkingTool!!
    }

private var _inkingTool: ImageVector? = null
