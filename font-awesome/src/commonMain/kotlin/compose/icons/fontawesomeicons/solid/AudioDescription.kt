package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AudioDescription: ImageVector
    get() {
        if (_audioDescription != null) {
            return _audioDescription!!
        }
        _audioDescription = Builder(name = "AudioDescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.925f, 238.709f)
                lineToRelative(8.822f, 30.655f)
                horizontalLineToRelative(-25.606f)
                lineToRelative(9.041f, -30.652f)
                curveToRelative(1.277f, -4.421f, 2.651f, -9.994f, 3.872f, -15.245f)
                curveToRelative(1.22f, 5.251f, 2.594f, 10.823f, 3.871f, 15.242f)
                close()
                moveTo(329.399f, 206.61f)
                horizontalLineToRelative(-14.523f)
                verticalLineToRelative(98.781f)
                horizontalLineToRelative(14.523f)
                curveToRelative(29.776f, 0.0f, 46.175f, -17.678f, 46.175f, -49.776f)
                curveToRelative(0.0f, -32.239f, -17.49f, -49.005f, -46.175f, -49.005f)
                close()
                moveTo(512.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 448.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(245.459f, 336.139f)
                lineToRelative(-57.097f, -168.0f)
                arcTo(12.001f, 12.001f, 0.0f, false, false, 177.0f, 160.0f)
                horizontalLineToRelative(-35.894f)
                arcToRelative(12.001f, 12.001f, 0.0f, false, false, -11.362f, 8.139f)
                lineToRelative(-57.097f, 168.0f)
                curveTo(70.003f, 343.922f, 75.789f, 352.0f, 84.009f, 352.0f)
                horizontalLineToRelative(29.133f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.535f, -8.693f)
                lineToRelative(8.574f, -29.906f)
                horizontalLineToRelative(51.367f)
                lineToRelative(8.793f, 29.977f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.926f, 352.0f)
                horizontalLineToRelative(29.172f)
                curveToRelative(8.22f, 0.0f, 14.006f, -8.078f, 11.361f, -15.861f)
                close()
                moveTo(430.16f, 255.614f)
                curveToRelative(0.0f, -58.977f, -37.919f, -95.614f, -98.96f, -95.614f)
                horizontalLineToRelative(-57.366f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(168.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                lineTo(331.2f, 352.0f)
                curveToRelative(61.041f, 0.0f, 98.96f, -36.933f, 98.96f, -96.386f)
                close()
            }
        }
        .build()
        return _audioDescription!!
    }

private var _audioDescription: ImageVector? = null
