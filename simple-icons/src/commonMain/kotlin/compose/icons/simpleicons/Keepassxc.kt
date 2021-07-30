package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Keepassxc: ImageVector
    get() {
        if (_keepassxc != null) {
            return _keepassxc!!
        }
        _keepassxc = Builder(name = "Keepassxc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.378f, 0.0f, 0.0f, 5.378f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.623f, 5.378f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.623f, 0.0f, 12.0f, -5.377f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.622f, -5.377f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 0.791f)
                arcToRelative(11.203f, 11.203f, 0.0f, false, true, 11.209f, 11.21f)
                arcTo(11.202f, 11.202f, 0.0f, false, true, 12.0f, 23.208f)
                arcTo(11.203f, 11.203f, 0.0f, false, true, 0.791f, 12.0f)
                arcTo(11.203f, 11.203f, 0.0f, false, true, 12.001f, 0.791f)
                close()
                moveTo(12.0f, 2.662f)
                arcToRelative(9.356f, 9.356f, 0.0f, false, false, -1.705f, 0.162f)
                arcTo(1.746f, 1.746f, 0.0f, false, false, 12.0f, 4.95f)
                arcToRelative(1.746f, 1.746f, 0.0f, false, false, 1.706f, -2.126f)
                arcTo(9.342f, 9.342f, 0.0f, false, false, 12.0f, 2.662f)
                close()
                moveTo(7.2f, 4.0f)
                arcToRelative(9.338f, 9.338f, 0.0f, false, false, -4.54f, 8.0f)
                arcToRelative(9.338f, 9.338f, 0.0f, false, false, 18.677f, 0.0f)
                arcToRelative(9.338f, 9.338f, 0.0f, false, false, -4.54f, -7.998f)
                arcToRelative(4.888f, 4.888f, 0.0f, false, true, -2.701f, 5.365f)
                lineToRelative(-0.12f, 2.066f)
                lineToRelative(1.482f, 1.483f)
                lineToRelative(-1.483f, 1.482f)
                lineToRelative(0.989f, 0.989f)
                lineToRelative(-0.989f, 0.988f)
                lineToRelative(0.12f, 1.857f)
                lineTo(12.0f, 20.328f)
                lineToRelative(-2.096f, -2.096f)
                lineTo(9.904f, 9.367f)
                arcTo(4.89f, 4.89f, 0.0f, false, true, 7.2f, 4.0f)
                close()
                moveTo(10.6f, 10.543f)
                verticalLineToRelative(6.99f)
                horizontalLineToRelative(0.7f)
                verticalLineToRelative(-6.99f)
                close()
            }
        }
        .build()
        return _keepassxc!!
    }

private var _keepassxc: ImageVector? = null
