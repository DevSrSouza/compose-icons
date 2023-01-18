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

public val RemixIcons.MoonFoggyLine: ImageVector
    get() {
        if (_moonFoggyLine != null) {
            return _moonFoggyLine!!
        }
        _moonFoggyLine = Builder(name = "MoonFoggyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.334f)
                verticalLineToRelative(-2.199f)
                arcToRelative(7.522f, 7.522f, 0.0f, false, false, 3.623f, -4.281f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -10.622f, -8.99f)
                arcTo(7.518f, 7.518f, 0.0f, false, false, 5.151f, 10.0f)
                lineTo(3.117f, 10.0f)
                arcToRelative(9.505f, 9.505f, 0.0f, false, true, 8.538f, -7.963f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 10.316f, 8.728f)
                arcTo(9.503f, 9.503f, 0.0f, false, true, 16.0f, 20.335f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _moonFoggyLine!!
    }

private var _moonFoggyLine: ImageVector? = null
