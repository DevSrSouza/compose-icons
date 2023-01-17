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

public val RegularGroup.CircleXmark: ImageVector
    get() {
        if (_circleXmark != null) {
            return _circleXmark!!
        }
        _circleXmark = Builder(name = "CircleXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.0f, 175.0f)
                curveTo(184.4f, 165.7f, 199.6f, 165.7f, 208.1f, 175.0f)
                lineTo(255.1f, 222.1f)
                lineTo(303.0f, 175.0f)
                curveTo(312.4f, 165.7f, 327.6f, 165.7f, 336.1f, 175.0f)
                curveTo(346.3f, 184.4f, 346.3f, 199.6f, 336.1f, 208.1f)
                lineTo(289.9f, 255.1f)
                lineTo(336.1f, 303.0f)
                curveTo(346.3f, 312.4f, 346.3f, 327.6f, 336.1f, 336.1f)
                curveTo(327.6f, 346.3f, 312.4f, 346.3f, 303.0f, 336.1f)
                lineTo(255.1f, 289.9f)
                lineTo(208.1f, 336.1f)
                curveTo(199.6f, 346.3f, 184.4f, 346.3f, 175.0f, 336.1f)
                curveTo(165.7f, 327.6f, 165.7f, 312.4f, 175.0f, 303.0f)
                lineTo(222.1f, 255.1f)
                lineTo(175.0f, 208.1f)
                curveTo(165.7f, 199.6f, 165.7f, 184.4f, 175.0f, 175.0f)
                verticalLineTo(175.0f)
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
        return _circleXmark!!
    }

private var _circleXmark: ImageVector? = null
