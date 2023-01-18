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

public val FilledGroup.SpeakerEdit: ImageVector
    get() {
        if (_speakerEdit != null) {
            return _speakerEdit!!
        }
        _speakerEdit = Builder(name = "SpeakerEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9989f, 4.2522f)
                verticalLineTo(15.3549f)
                lineTo(12.4894f, 17.8641f)
                curveTo(12.0449f, 18.3085f, 11.7219f, 18.8588f, 11.5504f, 19.4622f)
                lineTo(8.4274f, 16.6856f)
                curveTo(8.2901f, 16.5635f, 8.1128f, 16.4961f, 7.9291f, 16.4961f)
                horizontalLineTo(4.2498f)
                curveTo(3.0073f, 16.4961f, 2.0f, 15.4889f, 2.0f, 14.2466f)
                verticalLineTo(9.7496f)
                curveTo(2.0f, 8.5072f, 3.0073f, 7.5001f, 4.2498f, 7.5001f)
                horizontalLineTo(7.9291f)
                curveTo(8.1128f, 7.5001f, 8.2901f, 7.4327f, 8.4274f, 7.3106f)
                lineTo(12.9185f, 3.3182f)
                curveTo(13.7246f, 2.6017f, 14.9989f, 3.1738f, 14.9989f, 4.2522f)
                close()
                moveTo(18.3913f, 11.9629f)
                curveTo(18.5732f, 11.781f, 18.7711f, 11.6249f, 18.9805f, 11.4946f)
                curveTo(18.9079f, 10.4798f, 18.6186f, 9.5235f, 18.1582f, 8.6731f)
                curveTo(17.961f, 8.3089f, 17.5059f, 8.1735f, 17.1417f, 8.3706f)
                curveTo(16.7774f, 8.5678f, 16.642f, 9.0228f, 16.8392f, 9.387f)
                curveTo(17.2597f, 10.1636f, 17.4987f, 11.0531f, 17.4987f, 12.0006f)
                curveTo(17.4987f, 12.319f, 17.4717f, 12.631f, 17.4199f, 12.9342f)
                lineTo(18.3913f, 11.9629f)
                close()
                moveTo(20.4416f, 11.012f)
                curveTo(20.9586f, 10.9692f, 21.4838f, 11.0483f, 21.9705f, 11.2494f)
                curveTo(21.8265f, 9.3128f, 21.1304f, 7.5285f, 20.0392f, 6.0554f)
                curveTo(19.7926f, 5.7226f, 19.323f, 5.6527f, 18.9902f, 5.8992f)
                curveTo(18.6573f, 6.1456f, 18.5874f, 6.6152f, 18.8339f, 6.948f)
                curveTo(19.6953f, 8.1108f, 20.2667f, 9.5005f, 20.4416f, 11.012f)
                close()
                moveTo(19.0984f, 12.6699f)
                lineTo(13.1965f, 18.5711f)
                curveTo(12.8524f, 18.9151f, 12.6083f, 19.3462f, 12.4902f, 19.8183f)
                lineTo(12.0326f, 21.6486f)
                curveTo(11.8336f, 22.4446f, 12.5547f, 23.1656f, 13.3507f, 22.9666f)
                lineTo(15.1813f, 22.509f)
                curveTo(15.6534f, 22.391f, 16.0846f, 22.1469f, 16.4287f, 21.8028f)
                lineTo(22.3306f, 15.9016f)
                curveTo(23.2231f, 15.0092f, 23.2231f, 13.5623f, 22.3306f, 12.6699f)
                curveTo(21.4381f, 11.7774f, 19.991f, 11.7774f, 19.0984f, 12.6699f)
                close()
            }
        }
        .build()
        return _speakerEdit!!
    }

private var _speakerEdit: ImageVector? = null
