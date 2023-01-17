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

public val RegularGroup.FaceGrinWide: ImageVector
    get() {
        if (_faceGrinWide != null) {
            return _faceGrinWide!!
        }
        _faceGrinWide = Builder(name = "FaceGrinWide", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.5f, 308.4f)
                curveTo(368.2f, 303.1f, 385.4f, 320.4f, 374.1f, 336.5f)
                curveTo(350.4f, 374.6f, 306.3f, 399.1f, 255.9f, 399.1f)
                curveTo(205.6f, 399.1f, 161.5f, 374.6f, 136.9f, 336.5f)
                curveTo(126.5f, 320.4f, 143.7f, 303.1f, 162.3f, 308.4f)
                curveTo(191.3f, 315.1f, 222.8f, 318.8f, 255.9f, 318.8f)
                curveTo(289.0f, 318.8f, 320.6f, 315.1f, 349.5f, 308.4f)
                close()
                moveTo(224.0f, 192.0f)
                curveTo(224.0f, 227.3f, 209.7f, 256.0f, 192.0f, 256.0f)
                curveTo(174.3f, 256.0f, 160.0f, 227.3f, 160.0f, 192.0f)
                curveTo(160.0f, 156.7f, 174.3f, 128.0f, 192.0f, 128.0f)
                curveTo(209.7f, 128.0f, 224.0f, 156.7f, 224.0f, 192.0f)
                close()
                moveTo(288.0f, 192.0f)
                curveTo(288.0f, 156.7f, 302.3f, 128.0f, 320.0f, 128.0f)
                curveTo(337.7f, 128.0f, 352.0f, 156.7f, 352.0f, 192.0f)
                curveTo(352.0f, 227.3f, 337.7f, 256.0f, 320.0f, 256.0f)
                curveTo(302.3f, 256.0f, 288.0f, 227.3f, 288.0f, 192.0f)
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
        return _faceGrinWide!!
    }

private var _faceGrinWide: ImageVector? = null
