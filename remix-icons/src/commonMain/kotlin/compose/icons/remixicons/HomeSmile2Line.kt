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

public val RemixIcons.HomeSmile2Line: ImageVector
    get() {
        if (_homeSmile2Line != null) {
            return _homeSmile2Line!!
        }
        _homeSmile2Line = Builder(name = "HomeSmile2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                lineTo(19.0f, 9.799f)
                lineToRelative(-7.0f, -5.522f)
                lineToRelative(-7.0f, 5.522f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 9.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.38f, -0.785f)
                lineToRelative(8.0f, -6.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.24f, 0.0f)
                lineToRelative(8.0f, 6.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.38f, 0.786f)
                lineTo(21.0f, 20.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                close()
            }
        }
        .build()
        return _homeSmile2Line!!
    }

private var _homeSmile2Line: ImageVector? = null
