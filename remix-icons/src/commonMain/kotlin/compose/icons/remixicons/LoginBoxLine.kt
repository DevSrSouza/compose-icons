package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.LoginBoxLine: ImageVector
    get() {
        if (_loginBoxLine != null) {
            return _loginBoxLine!!
        }
        _loginBoxLine = Builder(name = "LoginBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 8.0f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(-5.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _loginBoxLine!!
    }

private var _loginBoxLine: ImageVector? = null