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

public val LineAwesomeIcons.SignOutAltSolid: ImageVector
    get() {
        if (_signOutAltSolid != null) {
            return _signOutAltSolid!!
        }
        _signOutAltSolid = Builder(name = "SignOutAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(20.051f, 28.0f, 23.641f, 25.988f, 25.813f, 22.906f)
                lineTo(24.188f, 21.75f)
                curveTo(22.379f, 24.32f, 19.391f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                curveTo(19.391f, 6.0f, 22.375f, 7.68f, 24.188f, 10.25f)
                lineTo(25.813f, 9.094f)
                curveTo(23.641f, 6.012f, 20.051f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(23.344f, 11.281f)
                lineTo(21.906f, 12.719f)
                lineTo(24.188f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 17.0f)
                lineTo(24.188f, 17.0f)
                lineTo(21.906f, 19.281f)
                lineTo(23.344f, 20.719f)
                lineTo(27.344f, 16.719f)
                lineTo(28.031f, 16.0f)
                lineTo(27.344f, 15.281f)
                close()
            }
        }
        .build()
        return _signOutAltSolid!!
    }

private var _signOutAltSolid: ImageVector? = null
