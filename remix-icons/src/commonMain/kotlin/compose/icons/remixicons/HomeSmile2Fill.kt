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

public val RemixIcons.HomeSmile2Fill: ImageVector
    get() {
        if (_homeSmile2Fill != null) {
            return _homeSmile2Fill!!
        }
        _homeSmile2Fill = Builder(name = "HomeSmile2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(9.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.38f, -0.785f)
                lineToRelative(8.0f, -6.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.24f, 0.0f)
                lineToRelative(8.0f, 6.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.38f, 0.786f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _homeSmile2Fill!!
    }

private var _homeSmile2Fill: ImageVector? = null
