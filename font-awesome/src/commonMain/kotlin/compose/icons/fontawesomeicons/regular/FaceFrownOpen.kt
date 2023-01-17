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

public val RegularGroup.FaceFrownOpen: ImageVector
    get() {
        if (_faceFrownOpen != null) {
            return _faceFrownOpen!!
        }
        _faceFrownOpen = Builder(name = "FaceFrownOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.3f, 369.3f)
                curveTo(166.1f, 374.5f, 153.1f, 365.1f, 158.4f, 352.9f)
                curveTo(175.1f, 314.7f, 214.3f, 287.8f, 259.9f, 287.8f)
                curveTo(305.6f, 287.8f, 344.8f, 314.7f, 361.4f, 352.1f)
                curveTo(366.7f, 365.2f, 352.9f, 374.5f, 340.6f, 369.3f)
                curveTo(316.2f, 359.0f, 288.8f, 353.2f, 259.9f, 353.2f)
                curveTo(231.0f, 353.2f, 203.7f, 358.1f, 179.3f, 369.3f)
                lineTo(179.3f, 369.3f)
                close()
                moveTo(208.4f, 208.0f)
                curveTo(208.4f, 225.7f, 194.0f, 240.0f, 176.4f, 240.0f)
                curveTo(158.7f, 240.0f, 144.4f, 225.7f, 144.4f, 208.0f)
                curveTo(144.4f, 190.3f, 158.7f, 176.0f, 176.4f, 176.0f)
                curveTo(194.0f, 176.0f, 208.4f, 190.3f, 208.4f, 208.0f)
                close()
                moveTo(304.4f, 208.0f)
                curveTo(304.4f, 190.3f, 318.7f, 176.0f, 336.4f, 176.0f)
                curveTo(354.0f, 176.0f, 368.4f, 190.3f, 368.4f, 208.0f)
                curveTo(368.4f, 225.7f, 354.0f, 240.0f, 336.4f, 240.0f)
                curveTo(318.7f, 240.0f, 304.4f, 225.7f, 304.4f, 208.0f)
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
        return _faceFrownOpen!!
    }

private var _faceFrownOpen: ImageVector? = null
