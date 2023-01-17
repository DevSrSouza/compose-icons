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

public val RegularGroup.FaceSmile: ImageVector
    get() {
        if (_faceSmile != null) {
            return _faceSmile!!
        }
        _faceSmile = Builder(name = "FaceSmile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                curveTo(293.2f, 352.0f, 319.2f, 334.5f, 334.4f, 318.1f)
                curveTo(343.3f, 308.4f, 358.5f, 307.7f, 368.3f, 316.7f)
                curveTo(378.0f, 325.7f, 378.6f, 340.9f, 369.6f, 350.6f)
                curveTo(347.7f, 374.5f, 309.7f, 400.0f, 256.0f, 400.0f)
                curveTo(202.3f, 400.0f, 164.3f, 374.5f, 142.4f, 350.6f)
                curveTo(133.4f, 340.9f, 133.1f, 325.7f, 143.7f, 316.7f)
                curveTo(153.5f, 307.7f, 168.7f, 308.4f, 177.6f, 318.1f)
                curveTo(192.8f, 334.5f, 218.8f, 352.0f, 256.0f, 352.0f)
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
        return _faceSmile!!
    }

private var _faceSmile: ImageVector? = null
