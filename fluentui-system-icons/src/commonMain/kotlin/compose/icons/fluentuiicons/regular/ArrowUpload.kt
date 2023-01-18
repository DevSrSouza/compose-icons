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

public val RegularGroup.ArrowUpload: ImageVector
    get() {
        if (_arrowUpload != null) {
            return _arrowUpload!!
        }
        _arrowUpload = Builder(name = "ArrowUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2498f, 3.5096f)
                curveTo(18.664f, 3.5097f, 19.0f, 3.1741f, 19.0f, 2.7598f)
                curveTo(19.0f, 2.3456f, 18.6644f, 2.0097f, 18.2502f, 2.0096f)
                lineTo(5.2502f, 2.0059f)
                curveTo(4.836f, 2.0057f, 4.5f, 2.3414f, 4.5f, 2.7556f)
                curveTo(4.5f, 3.1699f, 4.8356f, 3.5057f, 5.2498f, 3.5059f)
                lineTo(18.2498f, 3.5096f)
                close()
                moveTo(11.6482f, 21.9978f)
                lineTo(11.75f, 22.0047f)
                curveTo(12.1297f, 22.0047f, 12.4435f, 21.7225f, 12.4932f, 21.3564f)
                lineTo(12.5f, 21.2547f)
                lineTo(12.499f, 7.5697f)
                lineTo(16.2208f, 11.29f)
                curveTo(16.4871f, 11.5562f, 16.9038f, 11.5804f, 17.1974f, 11.3625f)
                lineTo(17.2815f, 11.2899f)
                curveTo(17.5477f, 11.0236f, 17.5719f, 10.6069f, 17.354f, 10.3133f)
                lineTo(17.2814f, 10.2292f)
                lineTo(12.2837f, 5.2326f)
                curveTo(12.0176f, 4.9665f, 11.6012f, 4.9422f, 11.3076f, 5.1598f)
                lineTo(11.2235f, 5.2323f)
                lineTo(6.22f, 10.2289f)
                curveTo(5.9269f, 10.5216f, 5.9266f, 10.9965f, 6.2193f, 11.2896f)
                curveTo(6.4854f, 11.556f, 6.902f, 11.5805f, 7.1958f, 11.3629f)
                lineTo(7.28f, 11.2903f)
                lineTo(10.999f, 7.5767f)
                lineTo(11.0f, 21.2547f)
                curveTo(11.0f, 21.6344f, 11.2822f, 21.9482f, 11.6482f, 21.9978f)
                close()
            }
        }
        .build()
        return _arrowUpload!!
    }

private var _arrowUpload: ImageVector? = null
