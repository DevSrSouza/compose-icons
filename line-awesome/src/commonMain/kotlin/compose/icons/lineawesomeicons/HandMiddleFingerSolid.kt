package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HandMiddleFingerSolid: ImageVector
    get() {
        if (_handMiddleFingerSolid != null) {
            return _handMiddleFingerSolid!!
        }
        _handMiddleFingerSolid = Builder(name = "HandMiddleFingerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.3555f, 2.0f, 13.0f, 3.3555f, 13.0f, 5.0f)
                lineTo(13.0f, 10.1875f)
                curveTo(12.6836f, 10.0742f, 12.3516f, 10.0f, 12.0f, 10.0f)
                curveTo(10.3555f, 10.0f, 9.0f, 11.3555f, 9.0f, 13.0f)
                lineTo(9.0f, 16.6563f)
                lineTo(6.9063f, 19.3438f)
                curveTo(5.6289f, 20.9961f, 5.7148f, 23.3672f, 7.0938f, 24.9375f)
                lineTo(9.4688f, 27.625f)
                curveTo(10.7969f, 29.1367f, 12.707f, 30.0f, 14.7188f, 30.0f)
                lineTo(20.0f, 30.0f)
                curveTo(23.8555f, 30.0f, 27.0f, 26.8555f, 27.0f, 23.0f)
                lineTo(27.0f, 14.0f)
                curveTo(27.0f, 12.3555f, 25.6445f, 11.0f, 24.0f, 11.0f)
                curveTo(23.4648f, 11.0f, 22.9688f, 11.1563f, 22.5313f, 11.4063f)
                curveTo(21.9961f, 10.5625f, 21.0625f, 10.0f, 20.0f, 10.0f)
                curveTo(19.6484f, 10.0f, 19.3164f, 10.0742f, 19.0f, 10.1875f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.3555f, 17.6445f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.5664f, 4.0f, 17.0f, 4.4336f, 17.0f, 5.0f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 13.0f)
                curveTo(19.0f, 12.4336f, 19.4336f, 12.0f, 20.0f, 12.0f)
                curveTo(20.5664f, 12.0f, 21.0f, 12.4336f, 21.0f, 13.0f)
                lineTo(21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 14.0f)
                curveTo(23.0f, 13.4336f, 23.4336f, 13.0f, 24.0f, 13.0f)
                curveTo(24.5664f, 13.0f, 25.0f, 13.4336f, 25.0f, 14.0f)
                lineTo(25.0f, 23.0f)
                curveTo(25.0f, 25.7734f, 22.7734f, 28.0f, 20.0f, 28.0f)
                lineTo(14.7188f, 28.0f)
                curveTo(13.2813f, 28.0f, 11.918f, 27.3945f, 10.9688f, 26.3125f)
                lineTo(8.5938f, 23.5938f)
                curveTo(7.8398f, 22.7344f, 7.8008f, 21.5f, 8.5f, 20.5938f)
                lineTo(9.0f, 19.9375f)
                lineTo(9.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 13.0f)
                curveTo(11.0f, 12.4336f, 11.4336f, 12.0f, 12.0f, 12.0f)
                curveTo(12.5664f, 12.0f, 13.0f, 12.4336f, 13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.4336f, 15.4336f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handMiddleFingerSolid!!
    }

private var _handMiddleFingerSolid: ImageVector? = null
