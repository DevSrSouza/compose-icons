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

public val RegularGroup.MailOpenPerson: ImageVector
    get() {
        if (_mailOpenPerson != null) {
            return _mailOpenPerson!!
        }
        _mailOpenPerson = Builder(name = "MailOpenPerson", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.6188f)
                verticalLineTo(3.6226f)
                lineTo(3.908f, 8.433f)
                lineTo(12.0f, 12.6541f)
                verticalLineTo(12.657f)
                lineTo(20.231f, 8.4322f)
                lineTo(12.0f, 3.6188f)
                close()
                moveTo(11.832f, 14.231f)
                curveTo(11.8229f, 14.2289f, 11.8139f, 14.2266f, 11.8049f, 14.2242f)
                curveTo(11.7915f, 14.2206f, 11.7781f, 14.2166f, 11.7649f, 14.2122f)
                curveTo(11.7232f, 14.1984f, 11.6827f, 14.181f, 11.644f, 14.1602f)
                lineTo(3.5f, 9.91f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.6682f, 4.2071f, 18.4212f, 5.1065f, 18.4942f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(13.3084f)
                curveTo(13.1113f, 18.8809f, 13.0f, 19.3134f, 13.0f, 19.772f)
                verticalLineTo(19.875f)
                curveTo(13.0f, 19.9167f, 13.0007f, 19.9583f, 13.002f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(9.1032f)
                curveTo(2.0f, 8.3664f, 2.3604f, 7.6801f, 2.958f, 7.2611f)
                lineTo(3.1001f, 7.1693f)
                lineTo(11.6038f, 2.113f)
                curveTo(11.6483f, 2.0854f, 11.6954f, 2.0626f, 11.7443f, 2.0449f)
                curveTo(11.7835f, 2.0307f, 11.8237f, 2.0198f, 11.8644f, 2.0124f)
                curveTo(12.0349f, 1.9809f, 12.2172f, 2.0082f, 12.3786f, 2.1026f)
                lineTo(21.3817f, 7.3674f)
                curveTo(22.2335f, 7.8655f, 22.1993f, 9.1079f, 21.3215f, 9.5585f)
                lineTo(18.5131f, 11.0f)
                lineTo(18.5f, 11.0f)
                curveTo(17.3236f, 11.0f, 16.2827f, 11.5804f, 15.6481f, 12.4705f)
                lineTo(12.3425f, 14.1672f)
                curveTo(12.1787f, 14.2513f, 11.9984f, 14.2693f, 11.832f, 14.231f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _mailOpenPerson!!
    }

private var _mailOpenPerson: ImageVector? = null
