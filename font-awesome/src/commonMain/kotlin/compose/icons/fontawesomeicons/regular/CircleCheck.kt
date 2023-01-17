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

public val RegularGroup.CircleCheck: ImageVector
    get() {
        if (_circleCheck != null) {
            return _circleCheck!!
        }
        _circleCheck = Builder(name = "CircleCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.8f, 339.8f)
                curveTo(232.9f, 350.7f, 215.1f, 350.7f, 204.2f, 339.8f)
                lineTo(140.2f, 275.8f)
                curveTo(129.3f, 264.9f, 129.3f, 247.1f, 140.2f, 236.2f)
                curveTo(151.1f, 225.3f, 168.9f, 225.3f, 179.8f, 236.2f)
                lineTo(224.0f, 280.4f)
                lineTo(332.2f, 172.2f)
                curveTo(343.1f, 161.3f, 360.9f, 161.3f, 371.8f, 172.2f)
                curveTo(382.7f, 183.1f, 382.7f, 200.9f, 371.8f, 211.8f)
                lineTo(243.8f, 339.8f)
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
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
