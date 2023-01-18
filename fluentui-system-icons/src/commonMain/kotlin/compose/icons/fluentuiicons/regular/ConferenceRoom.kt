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

public val RegularGroup.ConferenceRoom: ImageVector
    get() {
        if (_conferenceRoom != null) {
            return _conferenceRoom!!
        }
        _conferenceRoom = Builder(name = "ConferenceRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8214f, 2.0031f)
                lineTo(10.9218f, 2.0198f)
                lineTo(19.4218f, 4.0198f)
                curveTo(19.7267f, 4.0916f, 19.9511f, 4.3436f, 19.993f, 4.647f)
                lineTo(20.0f, 4.7499f)
                verticalLineTo(19.2499f)
                curveTo(20.0f, 19.5631f, 19.8061f, 19.8393f, 19.5203f, 19.9495f)
                lineTo(19.4218f, 19.9799f)
                lineTo(10.9218f, 21.9799f)
                curveTo(10.4846f, 22.0828f, 10.0645f, 21.7822f, 10.0067f, 21.3515f)
                lineTo(10.0f, 21.2499f)
                verticalLineTo(2.7499f)
                curveTo(10.0f, 2.3353f, 10.3313f, 2.0137f, 10.7225f, 2.0f)
                lineTo(10.8214f, 2.0031f)
                close()
                moveTo(11.5f, 3.6968f)
                verticalLineTo(20.3029f)
                lineTo(18.5f, 18.6559f)
                verticalLineTo(5.3439f)
                lineTo(11.5f, 3.6968f)
                close()
                moveTo(9.0f, 3.9999f)
                verticalLineTo(5.4999f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.4999f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.9999f)
                horizontalLineTo(4.75f)
                curveTo(4.3703f, 19.9999f, 4.0565f, 19.7177f, 4.0068f, 19.3517f)
                lineTo(4.0f, 19.2499f)
                verticalLineTo(4.7499f)
                curveTo(4.0f, 4.3702f, 4.2821f, 4.0564f, 4.6482f, 4.0067f)
                lineTo(4.75f, 3.9999f)
                horizontalLineTo(9.0f)
                close()
                moveTo(14.0f, 10.9999f)
                curveTo(14.5523f, 10.9999f, 15.0f, 11.4476f, 15.0f, 11.9999f)
                curveTo(15.0f, 12.5522f, 14.5523f, 12.9999f, 14.0f, 12.9999f)
                curveTo(13.4477f, 12.9999f, 13.0f, 12.5522f, 13.0f, 11.9999f)
                curveTo(13.0f, 11.4476f, 13.4477f, 10.9999f, 14.0f, 10.9999f)
                close()
            }
        }
        .build()
        return _conferenceRoom!!
    }

private var _conferenceRoom: ImageVector? = null
