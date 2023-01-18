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

public val RegularGroup.ArrowDownload: ImageVector
    get() {
        if (_arrowDownload != null) {
            return _arrowDownload!!
        }
        _arrowDownload = Builder(name = "ArrowDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2498f, 20.5009f)
                curveTo(18.664f, 20.5008f, 19.0f, 20.8365f, 19.0f, 21.2507f)
                curveTo(19.0f, 21.6649f, 18.6644f, 22.0008f, 18.2502f, 22.0009f)
                lineTo(5.2502f, 22.0047f)
                curveTo(4.836f, 22.0048f, 4.5f, 21.6691f, 4.5f, 21.2549f)
                curveTo(4.5f, 20.8407f, 4.8356f, 20.5048f, 5.2498f, 20.5047f)
                lineTo(18.2498f, 20.5009f)
                close()
                moveTo(11.6482f, 2.0127f)
                lineTo(11.75f, 2.0059f)
                curveTo(12.1297f, 2.0059f, 12.4435f, 2.288f, 12.4932f, 2.6541f)
                lineTo(12.5f, 2.7559f)
                lineTo(12.499f, 16.4409f)
                lineTo(16.2208f, 12.7205f)
                curveTo(16.4871f, 12.4543f, 16.9038f, 12.4301f, 17.1974f, 12.648f)
                lineTo(17.2815f, 12.7206f)
                curveTo(17.5477f, 12.9869f, 17.5719f, 13.4036f, 17.354f, 13.6972f)
                lineTo(17.2814f, 13.7813f)
                lineTo(12.2837f, 18.7779f)
                curveTo(12.0176f, 19.044f, 11.6012f, 19.0683f, 11.3076f, 18.8507f)
                lineTo(11.2235f, 18.7782f)
                lineTo(6.22f, 13.7816f)
                curveTo(5.9269f, 13.4889f, 5.9266f, 13.014f, 6.2193f, 12.7209f)
                curveTo(6.4854f, 12.4545f, 6.902f, 12.43f, 7.1958f, 12.6477f)
                lineTo(7.28f, 12.7202f)
                lineTo(10.999f, 16.4339f)
                lineTo(11.0f, 2.7559f)
                curveTo(11.0f, 2.3762f, 11.2822f, 2.0624f, 11.6482f, 2.0127f)
                lineTo(11.75f, 2.0059f)
                lineTo(11.6482f, 2.0127f)
                close()
            }
        }
        .build()
        return _arrowDownload!!
    }

private var _arrowDownload: ImageVector? = null
