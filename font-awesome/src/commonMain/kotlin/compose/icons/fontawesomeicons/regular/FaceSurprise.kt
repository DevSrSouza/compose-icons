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

public val RegularGroup.FaceSurprise: ImageVector
    get() {
        if (_faceSurprise != null) {
            return _faceSurprise!!
        }
        _faceSurprise = Builder(name = "FaceSurprise", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.4f, 208.0f)
                curveTo(144.4f, 190.3f, 158.7f, 176.0f, 176.4f, 176.0f)
                curveTo(194.0f, 176.0f, 208.4f, 190.3f, 208.4f, 208.0f)
                curveTo(208.4f, 225.7f, 194.0f, 240.0f, 176.4f, 240.0f)
                curveTo(158.7f, 240.0f, 144.4f, 225.7f, 144.4f, 208.0f)
                close()
                moveTo(368.4f, 208.0f)
                curveTo(368.4f, 225.7f, 354.0f, 240.0f, 336.4f, 240.0f)
                curveTo(318.7f, 240.0f, 304.4f, 225.7f, 304.4f, 208.0f)
                curveTo(304.4f, 190.3f, 318.7f, 176.0f, 336.4f, 176.0f)
                curveTo(354.0f, 176.0f, 368.4f, 190.3f, 368.4f, 208.0f)
                close()
                moveTo(192.0f, 352.0f)
                curveTo(192.0f, 316.7f, 220.7f, 288.0f, 256.0f, 288.0f)
                curveTo(291.3f, 288.0f, 320.0f, 316.7f, 320.0f, 352.0f)
                curveTo(320.0f, 387.3f, 291.3f, 416.0f, 256.0f, 416.0f)
                curveTo(220.7f, 416.0f, 192.0f, 387.3f, 192.0f, 352.0f)
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
        return _faceSurprise!!
    }

private var _faceSurprise: ImageVector? = null
