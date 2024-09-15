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

public val LineAwesomeIcons.ShieldAltSolid: ImageVector
    get() {
        if (_shieldAltSolid != null) {
            return _shieldAltSolid!!
        }
        _shieldAltSolid = Builder(name = "ShieldAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.75f, 4.0f, 12.234f, 4.887f, 10.875f, 5.625f)
                curveTo(9.516f, 6.363f, 8.281f, 7.0f, 6.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 8.0f)
                curveTo(5.0f, 15.719f, 7.609f, 20.742f, 10.25f, 23.781f)
                curveTo(12.891f, 26.82f, 15.625f, 27.938f, 15.625f, 27.938f)
                lineTo(16.0f, 28.063f)
                lineTo(16.375f, 27.938f)
                curveTo(16.375f, 27.938f, 19.109f, 26.844f, 21.75f, 23.813f)
                curveTo(24.391f, 20.781f, 27.0f, 15.746f, 27.0f, 8.0f)
                lineTo(27.0f, 7.0f)
                lineTo(26.0f, 7.0f)
                curveTo(23.73f, 7.0f, 22.484f, 6.363f, 21.125f, 5.625f)
                curveTo(19.766f, 4.887f, 18.25f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.75f, 6.0f, 18.754f, 6.613f, 20.156f, 7.375f)
                curveTo(21.34f, 8.02f, 22.91f, 8.637f, 24.938f, 8.844f)
                curveTo(24.746f, 15.609f, 22.508f, 19.91f, 20.25f, 22.5f)
                curveTo(18.203f, 24.848f, 16.484f, 25.629f, 16.0f, 25.844f)
                curveTo(15.512f, 25.625f, 13.797f, 24.824f, 11.75f, 22.469f)
                curveTo(9.492f, 19.871f, 7.254f, 15.578f, 7.063f, 8.844f)
                curveTo(9.098f, 8.637f, 10.66f, 8.02f, 11.844f, 7.375f)
                curveTo(13.246f, 6.613f, 14.25f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _shieldAltSolid!!
    }

private var _shieldAltSolid: ImageVector? = null
