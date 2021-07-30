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

public val SimpleIcons.Archlinux: ImageVector
    get() {
        if (_archlinux != null) {
            return _archlinux!!
        }
        _archlinux = Builder(name = "Archlinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.39f, 0.605f)
                curveTo(10.376f, 3.092f, 9.764f, 4.72f, 8.635f, 7.132f)
                curveToRelative(0.693f, 0.734f, 1.543f, 1.589f, 2.923f, 2.554f)
                curveToRelative(-1.484f, -0.61f, -2.496f, -1.224f, -3.252f, -1.86f)
                curveTo(6.86f, 10.842f, 4.596f, 15.138f, 0.0f, 23.395f)
                curveToRelative(3.612f, -2.085f, 6.412f, -3.37f, 9.021f, -3.862f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, true, -0.171f, -1.547f)
                lineToRelative(0.003f, -0.115f)
                curveToRelative(0.058f, -2.315f, 1.261f, -4.095f, 2.687f, -3.973f)
                curveToRelative(1.426f, 0.12f, 2.534f, 2.096f, 2.478f, 4.409f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -0.146f, 1.243f)
                curveToRelative(2.58f, 0.505f, 5.352f, 1.787f, 8.914f, 3.844f)
                curveToRelative(-0.702f, -1.293f, -1.33f, -2.459f, -1.929f, -3.57f)
                curveToRelative(-0.943f, -0.73f, -1.926f, -1.682f, -3.933f, -2.713f)
                curveToRelative(1.38f, 0.359f, 2.367f, 0.772f, 3.137f, 1.234f)
                curveToRelative(-6.09f, -11.334f, -6.582f, -12.84f, -8.67f, -17.74f)
                close()
                moveTo(22.898f, 21.36f)
                verticalLineToRelative(-0.623f)
                horizontalLineToRelative(-0.234f)
                verticalLineToRelative(-0.084f)
                horizontalLineToRelative(0.562f)
                verticalLineToRelative(0.084f)
                horizontalLineToRelative(-0.234f)
                verticalLineToRelative(0.623f)
                horizontalLineToRelative(0.331f)
                verticalLineToRelative(-0.707f)
                horizontalLineToRelative(0.142f)
                lineToRelative(0.167f, 0.5f)
                lineToRelative(0.034f, 0.107f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, true, 0.038f, -0.114f)
                lineToRelative(0.17f, -0.493f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(0.707f)
                horizontalLineToRelative(-0.091f)
                verticalLineToRelative(-0.593f)
                lineToRelative(-0.206f, 0.593f)
                horizontalLineToRelative(-0.084f)
                lineToRelative(-0.205f, -0.602f)
                verticalLineToRelative(0.602f)
                horizontalLineToRelative(-0.091f)
            }
        }
        .build()
        return _archlinux!!
    }

private var _archlinux: ImageVector? = null
