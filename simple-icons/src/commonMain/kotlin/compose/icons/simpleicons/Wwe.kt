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

public val SimpleIcons.Wwe: ImageVector
    get() {
        if (_wwe != null) {
            return _wwe!!
        }
        _wwe = Builder(name = "Wwe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.047f)
                lineTo(15.67f, 18.08f)
                lineToRelative(-3.474f, -8.53f)
                lineToRelative(-3.474f, 8.53f)
                lineTo(0.393f, 1.048f)
                lineToRelative(3.228f, 8.977f)
                lineToRelative(3.286f, 8.5f)
                curveTo(3.874f, 19.334f, 1.332f, 20.46f, 0.0f, 21.75f)
                curveToRelative(0.443f, -0.168f, 3.47f, -1.24f, 7.409f, -1.927f)
                lineToRelative(1.21f, 3.129f)
                lineToRelative(1.552f, -3.518f)
                arcToRelative(36.769f, 36.769f, 0.0f, false, true, 3.96f, -0.204f)
                lineToRelative(1.644f, 3.722f)
                lineToRelative(1.4f, -3.62f)
                curveToRelative(2.132f, 0.145f, 3.861f, 0.426f, 4.675f, 0.692f)
                curveToRelative(0.0f, 0.0f, 0.92f, -1.962f, 1.338f, -2.866f)
                arcToRelative(54.838f, 54.838f, 0.0f, false, false, -5.138f, -0.092f)
                lineToRelative(2.722f, -7.042f)
                close()
                moveTo(2.16f, 1.073f)
                lineTo(8.64f, 13.86f)
                lineToRelative(3.568f, -9.155f)
                lineToRelative(3.567f, 9.155f)
                lineToRelative(6.481f, -12.788f)
                lineToRelative(-6.433f, 8.452f)
                lineToRelative(-3.615f, -8.22f)
                lineToRelative(-3.615f, 8.22f)
                close()
                moveTo(12.196f, 14.849f)
                lineToRelative(1.115f, 2.523f)
                arcToRelative(42.482f, 42.482f, 0.0f, false, false, -2.363f, 0.306f)
                close()
            }
        }
        .build()
        return _wwe!!
    }

private var _wwe: ImageVector? = null
