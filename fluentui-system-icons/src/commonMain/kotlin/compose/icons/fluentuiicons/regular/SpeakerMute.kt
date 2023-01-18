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

public val RegularGroup.SpeakerMute: ImageVector
    get() {
        if (_speakerMute != null) {
            return _speakerMute!!
        }
        _speakerMute = Builder(name = "SpeakerMute", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9195f, 3.3153f)
                curveTo(13.7255f, 2.5987f, 15.0f, 3.1709f, 15.0f, 4.2495f)
                verticalLineTo(19.7451f)
                curveTo(15.0f, 20.8238f, 13.7255f, 21.396f, 12.9194f, 20.6792f)
                lineTo(8.4279f, 16.6855f)
                curveTo(8.2906f, 16.5634f, 8.1133f, 16.496f, 7.9296f, 16.496f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 16.496f, 2.0f, 15.4886f, 2.0f, 14.246f)
                verticalLineTo(9.7481f)
                curveTo(2.0f, 8.5055f, 3.0074f, 7.4981f, 4.25f, 7.4981f)
                horizontalLineTo(7.9296f)
                curveTo(8.1133f, 7.4981f, 8.2907f, 7.4307f, 8.4279f, 7.3086f)
                lineTo(12.9195f, 3.3153f)
                close()
                moveTo(13.5f, 4.8063f)
                lineTo(9.4246f, 8.4296f)
                curveTo(9.0127f, 8.7958f, 8.4808f, 8.9981f, 7.9296f, 8.9981f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 8.9981f, 3.5f, 9.3339f, 3.5f, 9.7481f)
                verticalLineTo(14.246f)
                curveTo(3.5f, 14.6602f, 3.8358f, 14.996f, 4.25f, 14.996f)
                horizontalLineTo(7.9296f)
                curveTo(8.4807f, 14.996f, 9.0127f, 15.1983f, 9.4247f, 15.5646f)
                lineTo(13.5f, 19.1883f)
                verticalLineTo(4.8063f)
                close()
                moveTo(16.2197f, 9.2192f)
                curveTo(16.5126f, 8.9263f, 16.9874f, 8.9263f, 17.2803f, 9.2192f)
                lineTo(19.0f, 10.9389f)
                lineTo(20.7197f, 9.2192f)
                curveTo(21.0126f, 8.9263f, 21.4874f, 8.9263f, 21.7803f, 9.2192f)
                curveTo(22.0732f, 9.5121f, 22.0732f, 9.987f, 21.7803f, 10.2799f)
                lineTo(20.0607f, 11.9995f)
                lineTo(21.7803f, 13.7192f)
                curveTo(22.0732f, 14.0121f, 22.0732f, 14.487f, 21.7803f, 14.7799f)
                curveTo(21.4874f, 15.0728f, 21.0126f, 15.0728f, 20.7197f, 14.7799f)
                lineTo(19.0f, 13.0602f)
                lineTo(17.2803f, 14.7799f)
                curveTo(16.9874f, 15.0728f, 16.5126f, 15.0728f, 16.2197f, 14.7799f)
                curveTo(15.9268f, 14.487f, 15.9268f, 14.0121f, 16.2197f, 13.7192f)
                lineTo(17.9393f, 11.9995f)
                lineTo(16.2197f, 10.2799f)
                curveTo(15.9268f, 9.987f, 15.9268f, 9.5121f, 16.2197f, 9.2192f)
                close()
            }
        }
        .build()
        return _speakerMute!!
    }

private var _speakerMute: ImageVector? = null
