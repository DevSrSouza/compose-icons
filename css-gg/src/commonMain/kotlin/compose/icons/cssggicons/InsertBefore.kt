package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.InsertBefore: ImageVector
    get() {
        if (_insertBefore != null) {
            return _insertBefore!!
        }
        _insertBefore = Builder(name = "InsertBefore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                curveTo(3.0f, 5.5523f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 5.5523f, 21.0f, 5.0f)
                curveTo(21.0f, 4.4477f, 20.5523f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 4.0f, 3.0f, 4.4477f, 3.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(12.5523f, 20.0f, 13.0f, 19.5523f, 13.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 16.0f, 17.0f, 15.5523f, 17.0f, 15.0f)
                curveTo(17.0f, 14.4477f, 16.5523f, 14.0f, 16.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 10.4477f, 11.0f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 14.0f, 7.0f, 14.4477f, 7.0f, 15.0f)
                curveTo(7.0f, 15.5523f, 7.4477f, 16.0f, 8.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.5523f, 11.4477f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _insertBefore!!
    }

private var _insertBefore: ImageVector? = null
