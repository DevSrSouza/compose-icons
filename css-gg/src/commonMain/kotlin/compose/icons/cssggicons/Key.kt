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

public val CssGgIcons.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 8.0f)
                curveTo(4.3432f, 8.0f, 3.0f, 9.3432f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.6569f, 4.3432f, 16.0f, 6.0f, 16.0f)
                curveTo(7.6568f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 9.3432f, 7.6568f, 8.0f, 6.0f, 8.0f)
                close()
                moveTo(7.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 10.4477f, 6.5523f, 10.0f, 6.0f, 10.0f)
                curveTo(5.4477f, 10.0f, 5.0f, 10.4477f, 5.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 13.5523f, 5.4477f, 14.0f, 6.0f, 14.0f)
                curveTo(6.5523f, 14.0f, 7.0f, 13.5523f, 7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
