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

public val LineAwesomeIcons.MicrophoneAltSolid: ImageVector
    get() {
        if (_microphoneAltSolid != null) {
            return _microphoneAltSolid!!
        }
        _microphoneAltSolid = Builder(name = "MicrophoneAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(17.4219f, 4.0f, 14.4688f, 6.7148f, 14.0625f, 10.1875f)
                lineTo(6.0f, 21.5938f)
                lineTo(5.5313f, 22.2813f)
                lineTo(6.0938f, 22.875f)
                lineTo(6.9063f, 23.6875f)
                lineTo(4.2813f, 26.2813f)
                lineTo(5.7188f, 27.7188f)
                lineTo(8.2813f, 25.125f)
                lineTo(9.6563f, 26.5f)
                lineTo(10.375f, 26.0f)
                lineTo(21.8438f, 17.9375f)
                curveTo(25.3047f, 17.5195f, 28.0f, 14.5703f, 28.0f, 11.0f)
                curveTo(28.0f, 7.1445f, 24.8555f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(21.0f, 6.0f)
                curveTo(23.7734f, 6.0f, 26.0f, 8.2266f, 26.0f, 11.0f)
                curveTo(26.0f, 12.0156f, 25.7031f, 12.9648f, 25.1875f, 13.75f)
                lineTo(18.25f, 6.8125f)
                curveTo(19.0352f, 6.2969f, 19.9844f, 6.0f, 21.0f, 6.0f)
                close()
                moveTo(16.8125f, 8.25f)
                lineTo(23.75f, 15.1875f)
                curveTo(22.9648f, 15.7031f, 22.0156f, 16.0f, 21.0f, 16.0f)
                curveTo(18.2266f, 16.0f, 16.0f, 13.7734f, 16.0f, 11.0f)
                curveTo(16.0f, 9.9844f, 16.2969f, 9.0352f, 16.8125f, 8.25f)
                close()
                moveTo(14.375f, 13.1875f)
                curveTo(15.0703f, 15.2617f, 16.707f, 16.9219f, 18.7813f, 17.625f)
                lineTo(9.9063f, 23.9063f)
                lineTo(8.125f, 22.0625f)
                close()
            }
        }
        .build()
        return _microphoneAltSolid!!
    }

private var _microphoneAltSolid: ImageVector? = null
