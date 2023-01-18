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

public val RegularGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9993f, 17.0004f)
                curveTo(12.9993f, 16.4489f, 12.5522f, 16.0018f, 12.0006f, 16.0018f)
                curveTo(11.4491f, 16.0018f, 11.002f, 16.4489f, 11.002f, 17.0004f)
                curveTo(11.002f, 17.552f, 11.4491f, 17.9991f, 12.0006f, 17.9991f)
                curveTo(12.5522f, 17.9991f, 12.9993f, 17.552f, 12.9993f, 17.0004f)
                close()
                moveTo(12.7401f, 9.1472f)
                curveTo(12.6901f, 8.7811f, 12.3761f, 8.4993f, 11.9964f, 8.4995f)
                curveTo(11.5822f, 8.4999f, 11.2467f, 8.8359f, 11.247f, 9.2501f)
                lineTo(11.2506f, 13.7517f)
                lineTo(11.2575f, 13.8535f)
                curveTo(11.3075f, 14.2195f, 11.6215f, 14.5014f, 12.0012f, 14.5011f)
                curveTo(12.4154f, 14.5008f, 12.7509f, 14.1648f, 12.7506f, 13.7505f)
                lineTo(12.747f, 9.249f)
                lineTo(12.7401f, 9.1472f)
                close()
                moveTo(13.9693f, 3.6594f)
                curveTo(13.113f, 2.1116f, 10.8878f, 2.1116f, 10.0316f, 3.6594f)
                lineTo(2.2863f, 17.6609f)
                curveTo(1.4568f, 19.1605f, 2.5414f, 21.0f, 4.2552f, 21.0f)
                horizontalLineTo(19.7462f)
                curveTo(21.46f, 21.0f, 22.5446f, 19.1605f, 21.715f, 17.6608f)
                lineTo(13.9693f, 3.6594f)
                close()
                moveTo(11.3442f, 4.3855f)
                curveTo(11.6296f, 3.8696f, 12.3713f, 3.8695f, 12.6567f, 4.3855f)
                lineTo(20.4025f, 18.3869f)
                curveTo(20.679f, 18.8868f, 20.3175f, 19.5f, 19.7462f, 19.5f)
                horizontalLineTo(4.2552f)
                curveTo(3.6839f, 19.5f, 3.3224f, 18.8868f, 3.5989f, 18.387f)
                lineTo(11.3442f, 4.3855f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
