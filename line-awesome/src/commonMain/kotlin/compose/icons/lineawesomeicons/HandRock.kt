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

public val LineAwesomeIcons.HandRock: ImageVector
    get() {
        if (_handRock != null) {
            return _handRock!!
        }
        _handRock = Builder(name = "HandRock", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                curveTo(13.9375f, 6.0f, 13.0039f, 6.5625f, 12.4688f, 7.4063f)
                curveTo(12.0313f, 7.1563f, 11.5352f, 7.0f, 11.0f, 7.0f)
                curveTo(9.3555f, 7.0f, 8.0f, 8.3555f, 8.0f, 10.0f)
                lineTo(8.0f, 13.6563f)
                lineTo(5.9063f, 16.3438f)
                curveTo(4.6289f, 17.9961f, 4.7148f, 20.3672f, 6.0938f, 21.9375f)
                lineTo(8.4688f, 24.625f)
                curveTo(9.7969f, 26.1367f, 11.707f, 27.0f, 13.7188f, 27.0f)
                lineTo(19.0f, 27.0f)
                curveTo(22.8555f, 27.0f, 26.0f, 23.8555f, 26.0f, 20.0f)
                lineTo(26.0f, 11.0f)
                curveTo(26.0f, 9.3555f, 24.6445f, 8.0f, 23.0f, 8.0f)
                curveTo(22.4648f, 8.0f, 21.9688f, 8.1563f, 21.5313f, 8.4063f)
                curveTo(20.9961f, 7.5625f, 20.0625f, 7.0f, 19.0f, 7.0f)
                curveTo(18.4648f, 7.0f, 17.9688f, 7.1563f, 17.5313f, 7.4063f)
                curveTo(16.9961f, 6.5625f, 16.0625f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveTo(15.5664f, 8.0f, 16.0f, 8.4336f, 16.0f, 9.0f)
                lineTo(16.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 10.0f)
                curveTo(18.0f, 9.4336f, 18.4336f, 9.0f, 19.0f, 9.0f)
                curveTo(19.5664f, 9.0f, 20.0f, 9.4336f, 20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.0f)
                curveTo(22.0f, 10.4336f, 22.4336f, 10.0f, 23.0f, 10.0f)
                curveTo(23.5664f, 10.0f, 24.0f, 10.4336f, 24.0f, 11.0f)
                lineTo(24.0f, 20.0f)
                curveTo(24.0f, 22.7734f, 21.7734f, 25.0f, 19.0f, 25.0f)
                lineTo(13.7188f, 25.0f)
                curveTo(12.2813f, 25.0f, 10.918f, 24.3945f, 9.9688f, 23.3125f)
                lineTo(7.5938f, 20.5938f)
                curveTo(6.8398f, 19.7344f, 6.8008f, 18.5f, 7.5f, 17.5938f)
                lineTo(8.0f, 16.9375f)
                lineTo(8.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 10.0f)
                curveTo(10.0f, 9.4336f, 10.4336f, 9.0f, 11.0f, 9.0f)
                curveTo(11.5664f, 9.0f, 12.0f, 9.4336f, 12.0f, 10.0f)
                lineTo(12.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                lineTo(14.0f, 9.0f)
                curveTo(14.0f, 8.4336f, 14.4336f, 8.0f, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _handRock!!
    }

private var _handRock: ImageVector? = null
