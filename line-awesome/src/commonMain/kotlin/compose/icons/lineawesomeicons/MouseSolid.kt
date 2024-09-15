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

public val LineAwesomeIcons.MouseSolid: ImageVector
    get() {
        if (_mouseSolid != null) {
            return _mouseSolid!!
        }
        _mouseSolid = Builder(name = "MouseSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.488f, 4.0f, 6.0f, 8.488f, 6.0f, 14.0f)
                lineTo(6.0f, 18.0f)
                curveTo(6.0f, 23.512f, 10.488f, 28.0f, 16.0f, 28.0f)
                curveTo(21.512f, 28.0f, 26.0f, 23.512f, 26.0f, 18.0f)
                lineTo(26.0f, 14.0f)
                curveTo(26.0f, 8.488f, 21.512f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.0f, 6.063f)
                lineTo(15.0f, 13.0f)
                lineTo(8.063f, 13.0f)
                curveTo(8.516f, 9.375f, 11.375f, 6.516f, 15.0f, 6.063f)
                close()
                moveTo(17.0f, 6.063f)
                curveTo(20.625f, 6.516f, 23.484f, 9.375f, 23.938f, 13.0f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(8.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(24.0f, 18.0f)
                curveTo(24.0f, 22.43f, 20.43f, 26.0f, 16.0f, 26.0f)
                curveTo(11.57f, 26.0f, 8.0f, 22.43f, 8.0f, 18.0f)
                close()
            }
        }
        .build()
        return _mouseSolid!!
    }

private var _mouseSolid: ImageVector? = null
