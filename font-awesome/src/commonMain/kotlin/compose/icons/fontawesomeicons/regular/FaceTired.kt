package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceTired: ImageVector
    get() {
        if (_faceTired != null) {
            return _faceTired!!
        }
        _faceTired = Builder(name = "FaceTired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.5f, 320.3f)
                curveTo(196.1f, 302.1f, 223.8f, 288.0f, 256.0f, 288.0f)
                curveTo(288.2f, 288.0f, 315.9f, 302.1f, 335.5f, 320.3f)
                curveTo(354.5f, 338.1f, 368.0f, 362.0f, 368.0f, 384.0f)
                curveTo(368.0f, 389.4f, 365.3f, 394.4f, 360.8f, 397.4f)
                curveTo(356.2f, 400.3f, 350.5f, 400.8f, 345.6f, 398.7f)
                lineTo(328.4f, 391.1f)
                curveTo(305.6f, 381.2f, 280.9f, 376.0f, 256.0f, 376.0f)
                curveTo(231.1f, 376.0f, 206.4f, 381.2f, 183.6f, 391.1f)
                lineTo(166.4f, 398.7f)
                curveTo(161.5f, 400.8f, 155.8f, 400.3f, 151.2f, 397.4f)
                curveTo(146.7f, 394.4f, 144.0f, 389.4f, 144.0f, 384.0f)
                curveTo(144.0f, 362.0f, 157.5f, 338.1f, 176.5f, 320.3f)
                close()
                moveTo(223.4f, 194.6f)
                curveTo(234.1f, 200.3f, 234.1f, 215.7f, 223.4f, 221.4f)
                lineTo(133.5f, 269.3f)
                curveTo(125.6f, 273.6f, 116.0f, 267.8f, 116.0f, 258.9f)
                curveTo(116.0f, 256.1f, 116.1f, 253.4f, 118.8f, 251.2f)
                lineTo(154.8f, 208.0f)
                lineTo(118.8f, 164.8f)
                curveTo(116.1f, 162.6f, 116.0f, 159.9f, 116.0f, 157.1f)
                curveTo(116.0f, 148.2f, 125.6f, 142.4f, 133.5f, 146.7f)
                lineTo(223.4f, 194.6f)
                close()
                moveTo(393.2f, 164.8f)
                lineTo(357.2f, 208.0f)
                lineTo(393.2f, 251.2f)
                curveTo(395.0f, 253.4f, 396.0f, 256.1f, 396.0f, 258.9f)
                curveTo(396.0f, 267.8f, 386.4f, 273.6f, 378.5f, 269.3f)
                lineTo(288.6f, 221.4f)
                curveTo(277.9f, 215.7f, 277.9f, 200.3f, 288.6f, 194.6f)
                lineTo(378.5f, 146.7f)
                curveTo(386.4f, 142.4f, 396.0f, 148.2f, 396.0f, 157.1f)
                curveTo(396.0f, 159.9f, 395.0f, 162.6f, 393.2f, 164.8f)
                close()
                moveTo(512.0f, 256.0f)
                curveTo(512.0f, 397.4f, 397.4f, 512.0f, 256.0f, 512.0f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                curveTo(397.4f, 0.0f, 512.0f, 114.6f, 512.0f, 256.0f)
                close()
                moveTo(256.0f, 48.0f)
                curveTo(141.1f, 48.0f, 48.0f, 141.1f, 48.0f, 256.0f)
                curveTo(48.0f, 370.9f, 141.1f, 464.0f, 256.0f, 464.0f)
                curveTo(370.9f, 464.0f, 464.0f, 370.9f, 464.0f, 256.0f)
                curveTo(464.0f, 141.1f, 370.9f, 48.0f, 256.0f, 48.0f)
                close()
            }
        }
        .build()
        return _faceTired!!
    }

private var _faceTired: ImageVector? = null
