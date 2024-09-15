package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.KickstarterK: ImageVector
    get() {
        if (_kickstarterK != null) {
            return _kickstarterK!!
        }
        _kickstarterK = Builder(name = "KickstarterK", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                curveTo(9.343f, 5.0f, 8.0f, 6.343f, 8.0f, 8.0f)
                lineTo(8.0f, 24.0f)
                curveTo(8.0f, 25.657f, 9.343f, 27.0f, 11.0f, 27.0f)
                curveTo(12.657f, 27.0f, 14.0f, 25.657f, 14.0f, 24.0f)
                lineTo(14.0f, 19.414f)
                lineTo(19.742f, 25.977f)
                curveTo(20.335f, 26.654f, 21.167f, 27.0f, 22.002f, 27.0f)
                curveTo(22.703f, 27.0f, 23.407f, 26.756f, 23.977f, 26.258f)
                curveTo(25.224f, 25.167f, 25.349f, 23.272f, 24.258f, 22.025f)
                lineTo(18.859f, 15.855f)
                lineTo(23.4f, 9.801f)
                curveTo(24.394f, 8.476f, 24.127f, 6.594f, 22.801f, 5.6f)
                curveTo(21.476f, 4.606f, 19.594f, 4.873f, 18.6f, 6.199f)
                lineTo(14.0f, 12.334f)
                lineTo(14.0f, 8.0f)
                curveTo(14.0f, 6.343f, 12.657f, 5.0f, 11.0f, 5.0f)
                close()
            }
        }
        .build()
        return _kickstarterK!!
    }

private var _kickstarterK: ImageVector? = null
