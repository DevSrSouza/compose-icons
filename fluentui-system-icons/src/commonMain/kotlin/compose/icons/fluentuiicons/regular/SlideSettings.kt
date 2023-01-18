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

public val RegularGroup.SlideSettings: ImageVector
    get() {
        if (_slideSettings != null) {
            return _slideSettings!!
        }
        _slideSettings = Builder(name = "SlideSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(12.8096f)
                curveTo(21.5557f, 12.3832f, 21.051f, 12.0194f, 20.5f, 11.7322f)
                verticalLineTo(7.25f)
                curveTo(20.5f, 6.2835f, 19.7165f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 5.5f, 3.5f, 6.2835f, 3.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.7165f, 4.2835f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(11.0764f)
                curveTo(11.1572f, 19.0232f, 11.3004f, 19.5258f, 11.4982f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(14.2782f, 13.9756f)
                curveTo(14.593f, 15.0659f, 13.9386f, 16.1993f, 12.837f, 16.4718f)
                lineTo(12.2528f, 16.6164f)
                curveTo(12.2079f, 16.9041f, 12.1846f, 17.1992f, 12.1846f, 17.5001f)
                curveTo(12.1846f, 17.8147f, 12.2101f, 18.1232f, 12.2592f, 18.4235f)
                lineTo(12.7986f, 18.5534f)
                curveTo(13.9111f, 18.8213f, 14.5725f, 19.9663f, 14.2486f, 21.0639f)
                lineTo(14.0623f, 21.6951f)
                curveTo(14.5014f, 22.0808f, 15.0019f, 22.3939f, 15.5464f, 22.6167f)
                lineTo(16.0397f, 22.098f)
                curveTo(16.8283f, 21.2687f, 18.1506f, 21.2689f, 18.9388f, 22.0985f)
                lineTo(19.4375f, 22.6232f)
                curveTo(19.9811f, 22.403f, 20.4811f, 22.0928f, 20.9204f, 21.7103f)
                lineTo(20.7223f, 21.0244f)
                curveTo(20.4076f, 19.9342f, 21.062f, 18.8007f, 22.1635f, 18.5282f)
                lineTo(22.7472f, 18.3838f)
                curveTo(22.7922f, 18.0961f, 22.8155f, 17.8009f, 22.8155f, 17.5001f)
                curveTo(22.8155f, 17.1853f, 22.7899f, 16.8767f, 22.7409f, 16.5764f)
                lineTo(22.2019f, 16.4466f)
                curveTo(21.0894f, 16.1787f, 20.4281f, 15.0337f, 20.7519f, 13.9362f)
                lineTo(20.9381f, 13.3053f)
                curveTo(20.499f, 12.9196f, 19.9985f, 12.6064f, 19.4539f, 12.3835f)
                lineTo(18.9608f, 12.9021f)
                curveTo(18.1722f, 13.7313f, 16.85f, 13.7311f, 16.0617f, 12.9016f)
                lineTo(15.5629f, 12.3767f)
                curveTo(15.0193f, 12.5969f, 14.5194f, 12.9071f, 14.0801f, 13.2894f)
                lineTo(14.2782f, 13.9756f)
                close()
                moveTo(17.5f, 19.0001f)
                curveTo(16.6994f, 19.0001f, 16.0504f, 18.3285f, 16.0504f, 17.5001f)
                curveTo(16.0504f, 16.6716f, 16.6994f, 16.0001f, 17.5f, 16.0001f)
                curveTo(18.3007f, 16.0001f, 18.9497f, 16.6716f, 18.9497f, 17.5001f)
                curveTo(18.9497f, 18.3285f, 18.3007f, 19.0001f, 17.5f, 19.0001f)
                close()
            }
        }
        .build()
        return _slideSettings!!
    }

private var _slideSettings: ImageVector? = null
