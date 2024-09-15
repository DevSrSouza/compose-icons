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

public val LineAwesomeIcons.CompassSolid: ImageVector
    get() {
        if (_compassSolid != null) {
            return _compassSolid!!
        }
        _compassSolid = Builder(name = "CompassSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(14.969f, 6.063f)
                curveTo(14.98f, 6.063f, 14.988f, 6.063f, 15.0f, 6.063f)
                lineTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 6.063f)
                curveTo(21.738f, 6.527f, 25.473f, 10.262f, 25.938f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 17.0f)
                lineTo(25.938f, 17.0f)
                curveTo(25.473f, 21.738f, 21.738f, 25.473f, 17.0f, 25.938f)
                lineTo(17.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 25.938f)
                curveTo(10.262f, 25.473f, 6.527f, 21.738f, 6.063f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 15.0f)
                lineTo(6.063f, 15.0f)
                curveTo(6.527f, 10.27f, 10.246f, 6.539f, 14.969f, 6.063f)
                close()
                moveTo(22.5f, 9.5f)
                lineTo(14.156f, 14.156f)
                lineTo(9.5f, 22.5f)
                lineTo(17.844f, 17.844f)
                close()
                moveTo(16.0f, 14.5f)
                curveTo(16.828f, 14.5f, 17.5f, 15.172f, 17.5f, 16.0f)
                curveTo(17.5f, 16.828f, 16.828f, 17.5f, 16.0f, 17.5f)
                curveTo(15.172f, 17.5f, 14.5f, 16.828f, 14.5f, 16.0f)
                curveTo(14.5f, 15.172f, 15.172f, 14.5f, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _compassSolid!!
    }

private var _compassSolid: ImageVector? = null
