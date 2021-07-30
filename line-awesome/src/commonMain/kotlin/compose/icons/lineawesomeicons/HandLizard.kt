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

public val LineAwesomeIcons.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3125f, 4.0f)
                curveTo(12.5352f, 4.0f, 10.8633f, 4.9336f, 9.9688f, 6.4688f)
                lineTo(4.6875f, 15.5625f)
                curveTo(4.2422f, 16.3281f, 4.0f, 17.207f, 4.0f, 18.0938f)
                lineTo(4.0f, 28.0f)
                lineTo(14.0f, 28.0f)
                lineTo(14.0f, 23.6875f)
                curveTo(16.6289f, 22.8984f, 17.9844f, 21.5156f, 18.4063f, 21.0f)
                lineTo(24.7188f, 21.0f)
                curveTo(25.9961f, 21.0f, 26.9648f, 19.7383f, 26.6563f, 18.5f)
                lineTo(26.5313f, 18.0313f)
                curveTo(26.0859f, 16.2578f, 24.4844f, 15.0f, 22.6563f, 15.0f)
                lineTo(15.7813f, 15.0f)
                lineTo(15.2813f, 13.0f)
                lineTo(21.6563f, 13.0f)
                curveTo(23.4844f, 13.0f, 25.0859f, 11.7422f, 25.5313f, 9.9688f)
                lineTo(25.875f, 8.6563f)
                curveTo(27.0547f, 8.25f, 28.0f, 7.3086f, 28.0f, 6.0f)
                lineTo(28.0f, 4.0f)
                close()
                moveTo(14.3125f, 6.0f)
                lineTo(26.0f, 6.0f)
                curveTo(26.0f, 6.5664f, 25.5664f, 7.0f, 25.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(23.7188f, 9.0f)
                lineTo(23.5938f, 9.5f)
                curveTo(23.3711f, 10.3945f, 22.5781f, 11.0f, 21.6563f, 11.0f)
                lineTo(15.2813f, 11.0f)
                curveTo(14.0039f, 11.0f, 13.0352f, 12.2617f, 13.3438f, 13.5f)
                lineTo(13.8438f, 15.5f)
                curveTo(14.0664f, 16.3867f, 14.8672f, 17.0f, 15.7813f, 17.0f)
                lineTo(22.6563f, 17.0f)
                curveTo(23.5781f, 17.0f, 24.3711f, 17.6055f, 24.5938f, 18.5f)
                lineTo(24.7188f, 19.0f)
                lineTo(17.5f, 19.0f)
                lineTo(17.1875f, 19.4063f)
                curveTo(17.1875f, 19.4063f, 15.7461f, 21.4531f, 12.8125f, 22.0313f)
                lineTo(12.0f, 22.1875f)
                lineTo(12.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 18.0938f)
                curveTo(6.0f, 17.5625f, 6.1367f, 17.0234f, 6.4063f, 16.5625f)
                lineTo(11.7188f, 7.5f)
                curveTo(12.2578f, 6.5781f, 13.2422f, 6.0f, 14.3125f, 6.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
