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

public val RemixIcons.NetflixLine: ImageVector
    get() {
        if (_netflixLine != null) {
            return _netflixLine!!
        }
        _netflixLine = Builder(name = "NetflixLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.984f, 17.208f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(7.593f, 7.593f, 0.0f, false, false, -2.02f, -0.5f)
                lineTo(8.0f, 6.302f)
                verticalLineTo(21.5f)
                arcToRelative(7.335f, 7.335f, 0.0f, false, false, -2.0f, 0.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(7.984f, 15.208f)
                close()
            }
        }
        .build()
        return _netflixLine!!
    }

private var _netflixLine: ImageVector? = null
