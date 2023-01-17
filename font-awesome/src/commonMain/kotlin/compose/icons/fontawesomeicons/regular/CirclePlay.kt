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

public val RegularGroup.CirclePlay: ImageVector
    get() {
        if (_circlePlay != null) {
            return _circlePlay!!
        }
        _circlePlay = Builder(name = "CirclePlay", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.3f, 147.1f)
                curveTo(195.8f, 142.8f, 205.1f, 142.1f, 212.5f, 147.5f)
                lineTo(356.5f, 235.5f)
                curveTo(363.6f, 239.9f, 368.0f, 247.6f, 368.0f, 256.0f)
                curveTo(368.0f, 264.4f, 363.6f, 272.1f, 356.5f, 276.5f)
                lineTo(212.5f, 364.5f)
                curveTo(205.1f, 369.0f, 195.8f, 369.2f, 188.3f, 364.9f)
                curveTo(180.7f, 360.7f, 176.0f, 352.7f, 176.0f, 344.0f)
                verticalLineTo(167.1f)
                curveTo(176.0f, 159.3f, 180.7f, 151.3f, 188.3f, 147.1f)
                verticalLineTo(147.1f)
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
        return _circlePlay!!
    }

private var _circlePlay: ImageVector? = null
