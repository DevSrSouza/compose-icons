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

public val FilledGroup.ShieldBadge: ImageVector
    get() {
        if (_shieldBadge != null) {
            return _shieldBadge!!
        }
        _shieldBadge = Builder(name = "ShieldBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 6.2312f, 3.2312f, 5.0f, 4.75f, 5.0f)
                horizontalLineTo(17.25f)
                curveTo(18.7688f, 5.0f, 20.0f, 6.2312f, 20.0f, 7.75f)
                verticalLineTo(10.221f)
                curveTo(19.7033f, 10.0887f, 19.4348f, 9.9188f, 19.1971f, 9.7354f)
                curveTo(18.9327f, 9.5315f, 18.728f, 9.3265f, 18.5929f, 9.1766f)
                curveTo(18.5261f, 9.1026f, 18.4786f, 9.0444f, 18.4516f, 9.0101f)
                curveTo(18.4381f, 8.9931f, 18.4299f, 8.9822f, 18.4271f, 8.9784f)
                curveTo(18.0978f, 8.5183f, 17.5665f, 8.245f, 17.0001f, 8.245f)
                curveTo(16.4337f, 8.245f, 15.9025f, 8.5183f, 15.5731f, 8.9784f)
                curveTo(15.5703f, 8.9821f, 15.5621f, 8.9931f, 15.5487f, 9.0101f)
                curveTo(15.5216f, 9.0444f, 15.4741f, 9.1026f, 15.4074f, 9.1766f)
                curveTo(15.2723f, 9.3265f, 15.0676f, 9.5315f, 14.8032f, 9.7354f)
                curveTo(14.2659f, 10.1499f, 13.5716f, 10.495f, 12.7501f, 10.495f)
                curveTo(11.7809f, 10.495f, 10.9951f, 11.2807f, 10.9951f, 12.25f)
                verticalLineTo(15.0f)
                lineTo(4.75f, 15.0f)
                curveTo(3.2312f, 15.0f, 2.0f, 13.7688f, 2.0f, 12.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(15.5731f, 8.9784f)
                curveTo(15.5745f, 8.9765f, 15.5745f, 8.9765f, 15.5731f, 8.9784f)
                close()
                moveTo(18.5831f, 10.5312f)
                curveTo(18.2252f, 10.255f, 17.8812f, 9.9329f, 17.6125f, 9.5671f)
                curveTo(17.472f, 9.3679f, 17.2438f, 9.25f, 17.0f, 9.25f)
                curveTo(16.7565f, 9.25f, 16.5278f, 9.3688f, 16.3872f, 9.5675f)
                curveTo(16.118f, 9.933f, 15.7749f, 10.255f, 15.4169f, 10.5312f)
                curveTo(15.105f, 10.7718f, 14.7331f, 11.0055f, 14.3068f, 11.1831f)
                curveTo(13.8485f, 11.374f, 13.3274f, 11.5f, 12.75f, 11.5f)
                curveTo(12.3358f, 11.5f, 12.0f, 11.8358f, 12.0f, 12.25f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 16.6426f, 12.438f, 17.9471f, 13.2988f, 18.9801f)
                curveTo(14.1452f, 19.9957f, 15.3432f, 20.6797f, 16.7367f, 21.2022f)
                curveTo(16.9064f, 21.2659f, 17.0936f, 21.2659f, 17.2633f, 21.2022f)
                curveTo(18.6568f, 20.6797f, 19.8548f, 19.9957f, 20.7012f, 18.9801f)
                curveTo(21.562f, 17.9471f, 22.0f, 16.6426f, 22.0f, 15.0f)
                verticalLineTo(12.25f)
                curveTo(22.0f, 11.8358f, 21.6642f, 11.5f, 21.25f, 11.5f)
                curveTo(20.6726f, 11.5f, 20.1515f, 11.374f, 19.6932f, 11.1831f)
                curveTo(19.2669f, 11.0055f, 18.895f, 10.7718f, 18.5831f, 10.5312f)
                close()
            }
        }
        .build()
        return _shieldBadge!!
    }

private var _shieldBadge: ImageVector? = null
