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

public val LineAwesomeIcons.UnderlineSolid: ImageVector
    get() {
        if (_underlineSolid != null) {
            return _underlineSolid!!
        }
        _underlineSolid = Builder(name = "UnderlineSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineTo(8.0f, 16.0f)
                curveTo(8.0f, 20.4297f, 11.5703f, 24.0f, 16.0f, 24.0f)
                curveTo(20.4297f, 24.0f, 24.0f, 20.4297f, 24.0f, 16.0f)
                lineTo(24.0f, 4.0f)
                lineTo(22.0f, 4.0f)
                lineTo(22.0f, 16.0f)
                curveTo(22.0f, 19.3711f, 19.3711f, 22.0f, 16.0f, 22.0f)
                curveTo(12.6289f, 22.0f, 10.0f, 19.3711f, 10.0f, 16.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(6.0f, 26.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 26.0f)
                close()
            }
        }
        .build()
        return _underlineSolid!!
    }

private var _underlineSolid: ImageVector? = null
