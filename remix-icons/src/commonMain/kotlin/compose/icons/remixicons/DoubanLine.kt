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

public val RemixIcons.DoubanLine: ImageVector
    get() {
        if (_doubanLine != null) {
            return _doubanLine!!
        }
        _doubanLine = Builder(name = "DoubanLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.273f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.624f)
                lineToRelative(-1.3f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.612f)
                lineTo(6.8f, 16.5f)
                lineToRelative(1.902f, -0.618f)
                lineTo(9.715f, 19.0f)
                horizontalLineToRelative(4.259f)
                lineToRelative(1.3f, -4.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(7.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _doubanLine!!
    }

private var _doubanLine: ImageVector? = null
