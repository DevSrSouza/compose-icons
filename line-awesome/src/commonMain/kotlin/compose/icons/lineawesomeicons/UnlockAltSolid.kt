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

public val LineAwesomeIcons.UnlockAltSolid: ImageVector
    get() {
        if (_unlockAltSolid != null) {
            return _unlockAltSolid!!
        }
        _unlockAltSolid = Builder(name = "UnlockAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(12.965f, 3.0f, 10.414f, 4.965f, 9.375f, 7.625f)
                lineTo(11.219f, 8.375f)
                curveTo(11.977f, 6.434f, 13.836f, 5.0f, 16.0f, 5.0f)
                curveTo(18.754f, 5.0f, 21.0f, 7.246f, 21.0f, 10.0f)
                lineTo(21.0f, 11.375f)
                curveTo(19.523f, 10.516f, 17.824f, 10.0f, 16.0f, 10.0f)
                curveTo(10.488f, 10.0f, 6.0f, 14.488f, 6.0f, 20.0f)
                curveTo(6.0f, 25.512f, 10.488f, 30.0f, 16.0f, 30.0f)
                curveTo(21.512f, 30.0f, 26.0f, 25.512f, 26.0f, 20.0f)
                curveTo(26.0f, 17.215f, 24.848f, 14.691f, 23.0f, 12.875f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 6.156f, 19.844f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(20.43f, 12.0f, 24.0f, 15.57f, 24.0f, 20.0f)
                curveTo(24.0f, 24.43f, 20.43f, 28.0f, 16.0f, 28.0f)
                curveTo(11.57f, 28.0f, 8.0f, 24.43f, 8.0f, 20.0f)
                curveTo(8.0f, 15.57f, 11.57f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(14.895f, 18.0f, 14.0f, 18.895f, 14.0f, 20.0f)
                curveTo(14.0f, 20.738f, 14.402f, 21.371f, 15.0f, 21.719f)
                lineTo(15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                lineTo(17.0f, 21.719f)
                curveTo(17.598f, 21.371f, 18.0f, 20.738f, 18.0f, 20.0f)
                curveTo(18.0f, 18.895f, 17.105f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _unlockAltSolid!!
    }

private var _unlockAltSolid: ImageVector? = null
