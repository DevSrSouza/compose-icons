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

public val LineAwesomeIcons.LockSolid: ImageVector
    get() {
        if (_lockSolid != null) {
            return _lockSolid!!
        }
        _lockSolid = Builder(name = "LockSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(12.156f, 3.0f, 9.0f, 6.156f, 9.0f, 10.0f)
                lineTo(9.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 6.156f, 19.844f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(18.754f, 5.0f, 21.0f, 7.246f, 21.0f, 10.0f)
                lineTo(21.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 10.0f)
                curveTo(11.0f, 7.246f, 13.246f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(8.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
            }
        }
        .build()
        return _lockSolid!!
    }

private var _lockSolid: ImageVector? = null
