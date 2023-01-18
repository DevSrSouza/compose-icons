package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(2.8954f, 4.0f, 2.0f, 4.8954f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1046f, 2.8954f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(10.7684f, 20.0f, 11.4692f, 19.7111f, 12.0f, 19.2361f)
                curveTo(12.5308f, 19.7111f, 13.2316f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(13.2316f, 4.0f, 12.5308f, 4.2888f, 12.0f, 4.7639f)
                curveTo(11.4692f, 4.2888f, 10.7684f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.5523f, 10.5523f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 6.0f, 11.0f, 6.4477f, 11.0f, 7.0f)
                close()
                moveTo(13.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.4477f, 13.4477f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
