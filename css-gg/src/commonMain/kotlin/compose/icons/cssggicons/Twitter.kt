package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 3.0f)
                curveTo(9.105f, 3.0f, 10.0f, 3.895f, 10.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 8.0f, 18.0f, 8.895f, 18.0f, 10.0f)
                curveTo(18.0f, 11.105f, 17.105f, 12.0f, 16.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                curveTo(10.0f, 15.657f, 11.343f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 17.0f, 18.0f, 17.895f, 18.0f, 19.0f)
                curveTo(18.0f, 20.105f, 17.105f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(9.134f, 21.0f, 6.0f, 17.866f, 6.0f, 14.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 3.895f, 6.895f, 3.0f, 8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
