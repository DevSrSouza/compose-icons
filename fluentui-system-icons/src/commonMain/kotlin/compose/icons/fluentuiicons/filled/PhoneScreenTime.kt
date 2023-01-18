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

public val FilledGroup.PhoneScreenTime: ImageVector
    get() {
        if (_phoneScreenTime != null) {
            return _phoneScreenTime!!
        }
        _phoneScreenTime = Builder(name = "PhoneScreenTime", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.9926f, 2.0f, 16.0f, 3.0074f, 16.0f, 4.25f)
                lineTo(16.0002f, 11.1739f)
                curveTo(13.1334f, 11.851f, 11.0f, 14.4264f, 11.0f, 17.5f)
                curveTo(11.0f, 17.6683f, 11.0064f, 17.8352f, 11.019f, 18.0003f)
                lineTo(8.75f, 18.0f)
                curveTo(8.3358f, 18.0f, 8.0f, 18.3358f, 8.0f, 18.75f)
                curveTo(8.0f, 19.1297f, 8.2822f, 19.4435f, 8.6482f, 19.4932f)
                lineTo(8.75f, 19.5f)
                horizontalLineTo(11.25f)
                lineTo(11.3124f, 19.4965f)
                curveTo(11.6182f, 20.4451f, 12.1362f, 21.2985f, 12.8104f, 22.0008f)
                lineTo(6.25f, 22.0f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 14.224f, 16.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(16.0f, 18.776f, 16.224f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(19.5015f)
                curveTo(19.7775f, 19.0f, 20.0015f, 18.776f, 20.0015f, 18.5f)
                curveTo(20.0015f, 18.224f, 19.7775f, 18.0f, 19.5015f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return _phoneScreenTime!!
    }

private var _phoneScreenTime: ImageVector? = null
