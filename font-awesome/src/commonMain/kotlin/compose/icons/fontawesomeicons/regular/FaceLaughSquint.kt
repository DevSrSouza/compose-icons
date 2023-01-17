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

public val RegularGroup.FaceLaughSquint: ImageVector
    get() {
        if (_faceLaughSquint != null) {
            return _faceLaughSquint!!
        }
        _faceLaughSquint = Builder(name = "FaceLaughSquint", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.7f, 313.9f)
                curveTo(126.5f, 300.4f, 137.8f, 288.0f, 151.1f, 288.0f)
                horizontalLineTo(364.5f)
                curveTo(378.7f, 288.0f, 389.9f, 300.4f, 385.8f, 313.9f)
                curveTo(368.1f, 368.4f, 318.2f, 408.0f, 258.2f, 408.0f)
                curveTo(198.2f, 408.0f, 147.5f, 368.4f, 130.7f, 313.9f)
                verticalLineTo(313.9f)
                close()
                moveTo(223.4f, 178.6f)
                curveTo(234.1f, 184.3f, 234.1f, 199.7f, 223.4f, 205.4f)
                lineTo(133.5f, 253.3f)
                curveTo(125.6f, 257.6f, 116.0f, 251.8f, 116.0f, 242.9f)
                curveTo(116.0f, 240.1f, 116.1f, 237.4f, 118.8f, 235.2f)
                lineTo(154.8f, 192.0f)
                lineTo(118.8f, 148.8f)
                curveTo(116.1f, 146.6f, 116.0f, 143.9f, 116.0f, 141.1f)
                curveTo(116.0f, 132.2f, 125.6f, 126.4f, 133.5f, 130.7f)
                lineTo(223.4f, 178.6f)
                close()
                moveTo(393.2f, 148.8f)
                lineTo(357.2f, 192.0f)
                lineTo(393.2f, 235.2f)
                curveTo(395.0f, 237.4f, 396.0f, 240.1f, 396.0f, 242.9f)
                curveTo(396.0f, 251.8f, 386.4f, 257.6f, 378.5f, 253.3f)
                lineTo(288.6f, 205.4f)
                curveTo(277.9f, 199.7f, 277.9f, 184.3f, 288.6f, 178.6f)
                lineTo(378.5f, 130.7f)
                curveTo(386.4f, 126.4f, 396.0f, 132.2f, 396.0f, 141.1f)
                curveTo(396.0f, 143.9f, 395.0f, 146.6f, 393.2f, 148.8f)
                verticalLineTo(148.8f)
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
        return _faceLaughSquint!!
    }

private var _faceLaughSquint: ImageVector? = null
