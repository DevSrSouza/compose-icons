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

public val RemixIcons.Map2Line: ImageVector
    get() {
        if (_map2Line != null) {
            return _map2Line!!
        }
        _map2Line = Builder(name = "Map2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineToRelative(7.0f, -3.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(6.303f, -2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.697f, 0.46f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-7.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-6.303f, 2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.697f, -0.46f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(16.0f, 19.395f)
                lineToRelative(4.0f, -1.714f)
                lineTo(20.0f, 5.033f)
                lineToRelative(-4.0f, 1.714f)
                verticalLineToRelative(12.648f)
                close()
                moveTo(14.0f, 19.264f)
                lineTo(14.0f, 6.736f)
                lineToRelative(-4.0f, -2.0f)
                verticalLineToRelative(12.528f)
                lineToRelative(4.0f, 2.0f)
                close()
                moveTo(8.0f, 17.253f)
                lineTo(8.0f, 4.605f)
                lineTo(4.0f, 6.319f)
                verticalLineToRelative(12.648f)
                lineToRelative(4.0f, -1.714f)
                close()
            }
        }
        .build()
        return _map2Line!!
    }

private var _map2Line: ImageVector? = null
