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

public val LineAwesomeIcons.HandHoldingSolid: ImageVector
    get() {
        if (_handHoldingSolid != null) {
            return _handHoldingSolid!!
        }
        _handHoldingSolid = Builder(name = "HandHoldingSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5156f, 18.0f)
                curveTo(9.4846f, 18.004f, 8.6992f, 18.2656f, 8.6992f, 18.2656f)
                lineTo(8.6797f, 18.2734f)
                lineTo(3.0078f, 20.4492f)
                lineTo(4.9922f, 26.0195f)
                lineTo(9.9219f, 24.1289f)
                lineTo(17.0586f, 28.0586f)
                lineTo(29.3828f, 22.9531f)
                lineTo(28.6172f, 21.1094f)
                lineTo(17.1797f, 25.8438f)
                lineTo(10.0781f, 21.9336f)
                lineTo(6.1875f, 23.4219f)
                lineTo(5.5469f, 21.6152f)
                lineTo(9.3438f, 20.1582f)
                curveTo(9.3527f, 20.1552f, 9.8196f, 20.0f, 10.5156f, 20.0f)
                curveTo(11.2186f, 20.0f, 12.0383f, 20.1561f, 12.7383f, 20.7891f)
                lineTo(12.752f, 20.7969f)
                lineTo(12.7559f, 20.8008f)
                curveTo(13.7869f, 21.6958f, 14.5645f, 22.3212f, 15.6465f, 22.6602f)
                curveTo(16.7285f, 23.0002f, 17.9559f, 23.0392f, 20.0059f, 23.0313f)
                lineTo(19.9961f, 21.0313f)
                curveTo(17.9841f, 21.0392f, 16.9331f, 20.968f, 16.2461f, 20.75f)
                curveTo(15.5581f, 20.539f, 15.0701f, 20.1598f, 14.0781f, 19.3008f)
                lineTo(14.0664f, 19.293f)
                curveTo(12.9094f, 18.254f, 11.5346f, 17.996f, 10.5156f, 18.0f)
                close()
            }
        }
        .build()
        return _handHoldingSolid!!
    }

private var _handHoldingSolid: ImageVector? = null
