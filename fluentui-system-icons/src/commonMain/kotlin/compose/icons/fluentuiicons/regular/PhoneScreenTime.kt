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

public val RegularGroup.PhoneScreenTime: ImageVector
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
                curveTo(15.4723f, 11.2986f, 14.9693f, 11.4876f, 14.4999f, 11.7323f)
                lineTo(14.5f, 4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 3.5f, 5.5f, 3.8358f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                lineTo(11.7328f, 20.5011f)
                curveTo(12.02f, 21.052f, 12.384f, 21.5566f, 12.8104f, 22.0008f)
                lineTo(6.25f, 22.0f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(8.7489f, 17.5038f)
                lineTo(11.0f, 17.499f)
                curveTo(11.0f, 18.0162f, 11.0602f, 18.5184f, 11.1739f, 18.9998f)
                lineTo(8.7511f, 19.0038f)
                curveTo(8.3369f, 19.0044f, 8.0006f, 18.6691f, 8.0f, 18.2549f)
                curveTo(7.9994f, 17.8407f, 8.3347f, 17.5044f, 8.7489f, 17.5038f)
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
