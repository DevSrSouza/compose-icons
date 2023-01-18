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

public val FilledGroup.SpeakerMute: ImageVector
    get() {
        if (_speakerMute != null) {
            return _speakerMute!!
        }
        _speakerMute = Builder(name = "SpeakerMute", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.2505f)
                curveTo(15.0f, 3.1719f, 13.7255f, 2.5996f, 12.9195f, 3.3163f)
                lineTo(8.4279f, 7.3096f)
                curveTo(8.2907f, 7.4317f, 8.1133f, 7.4991f, 7.9296f, 7.4991f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 7.4991f, 2.0f, 8.5064f, 2.0f, 9.7491f)
                verticalLineTo(14.247f)
                curveTo(2.0f, 15.4896f, 3.0074f, 16.497f, 4.25f, 16.497f)
                horizontalLineTo(7.9296f)
                curveTo(8.1133f, 16.497f, 8.2906f, 16.5644f, 8.4279f, 16.6865f)
                lineTo(12.9194f, 20.6802f)
                curveTo(13.7255f, 21.397f, 15.0f, 20.8247f, 15.0f, 19.7461f)
                verticalLineTo(4.2505f)
                close()
                moveTo(16.2197f, 9.2202f)
                curveTo(16.5126f, 8.9273f, 16.9874f, 8.9273f, 17.2803f, 9.2202f)
                lineTo(19.0f, 10.9398f)
                lineTo(20.7197f, 9.2202f)
                curveTo(21.0126f, 8.9273f, 21.4874f, 8.9273f, 21.7803f, 9.2202f)
                curveTo(22.0732f, 9.5131f, 22.0732f, 9.9879f, 21.7803f, 10.2808f)
                lineTo(20.0607f, 12.0005f)
                lineTo(21.7803f, 13.7202f)
                curveTo(22.0732f, 14.0131f, 22.0732f, 14.4879f, 21.7803f, 14.7808f)
                curveTo(21.4874f, 15.0737f, 21.0126f, 15.0737f, 20.7197f, 14.7808f)
                lineTo(19.0f, 13.0611f)
                lineTo(17.2803f, 14.7808f)
                curveTo(16.9874f, 15.0737f, 16.5126f, 15.0737f, 16.2197f, 14.7808f)
                curveTo(15.9268f, 14.4879f, 15.9268f, 14.0131f, 16.2197f, 13.7202f)
                lineTo(17.9393f, 12.0005f)
                lineTo(16.2197f, 10.2808f)
                curveTo(15.9268f, 9.9879f, 15.9268f, 9.5131f, 16.2197f, 9.2202f)
                close()
            }
        }
        .build()
        return _speakerMute!!
    }

private var _speakerMute: ImageVector? = null
