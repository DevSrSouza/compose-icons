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

public val FilledGroup.SpeakerOff: ImageVector
    get() {
        if (_speakerOff != null) {
            return _speakerOff!!
        }
        _speakerOff = Builder(name = "SpeakerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.4378f, 7.4986f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 7.4986f, 2.0f, 8.5059f, 2.0f, 9.7486f)
                verticalLineTo(14.2465f)
                curveTo(2.0f, 15.4891f, 3.0074f, 16.4965f, 4.25f, 16.4965f)
                horizontalLineTo(7.9296f)
                curveTo(8.1133f, 16.4965f, 8.2906f, 16.5639f, 8.4279f, 16.686f)
                lineTo(12.9194f, 20.6797f)
                curveTo(13.7255f, 21.3965f, 15.0f, 20.8243f, 15.0f, 19.7456f)
                verticalLineTo(16.0609f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.141f, 13.9593f)
                lineTo(18.279f, 15.0973f)
                curveTo(18.7408f, 14.1628f, 19.0f, 13.1107f, 19.0f, 12.0f)
                curveTo(19.0f, 10.7968f, 18.6958f, 9.6624f, 18.1596f, 8.6718f)
                curveTo(17.9624f, 8.3076f, 17.5072f, 8.1721f, 17.143f, 8.3693f)
                curveTo(16.7787f, 8.5665f, 16.6432f, 9.0217f, 16.8404f, 9.3859f)
                curveTo(17.2609f, 10.1627f, 17.5f, 11.0523f, 17.5f, 12.0f)
                curveTo(17.5f, 12.691f, 17.3729f, 13.3512f, 17.141f, 13.9593f)
                close()
                moveTo(19.3881f, 16.2064f)
                lineTo(20.4815f, 17.2999f)
                curveTo(21.4437f, 15.7631f, 22.0f, 13.9457f, 22.0f, 12.0f)
                curveTo(22.0f, 9.7739f, 21.2717f, 7.7157f, 20.0407f, 6.0536f)
                curveTo(19.7941f, 5.7208f, 19.3244f, 5.6508f, 18.9916f, 5.8973f)
                curveTo(18.6587f, 6.1439f, 18.5888f, 6.6136f, 18.8353f, 6.9464f)
                curveTo(19.8815f, 8.359f, 20.5f, 10.1062f, 20.5f, 12.0f)
                curveTo(20.5f, 13.5311f, 20.0958f, 14.9663f, 19.3881f, 16.2064f)
                close()
                moveTo(9.52f, 6.3381f)
                lineTo(15.0f, 11.8182f)
                verticalLineTo(4.25f)
                curveTo(15.0f, 3.1714f, 13.7255f, 2.5991f, 12.9195f, 3.3158f)
                lineTo(9.52f, 6.3381f)
                close()
            }
        }
        .build()
        return _speakerOff!!
    }

private var _speakerOff: ImageVector? = null
