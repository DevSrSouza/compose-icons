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

public val CssGgIcons.InsertAfter: ImageVector
    get() {
        if (_insertAfter != null) {
            return _insertAfter!!
        }
        _insertAfter = Builder(name = "InsertAfter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(12.552f, 4.0f, 13.0f, 4.448f, 13.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 8.0f, 17.0f, 8.448f, 17.0f, 9.0f)
                curveTo(17.0f, 9.552f, 16.552f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.552f, 12.552f, 14.0f, 12.0f, 14.0f)
                curveTo(11.448f, 14.0f, 11.0f, 13.552f, 11.0f, 13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 10.0f, 7.0f, 9.552f, 7.0f, 9.0f)
                curveTo(7.0f, 8.448f, 7.448f, 8.0f, 8.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 4.448f, 11.448f, 4.0f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                curveTo(3.0f, 18.448f, 3.448f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 18.0f, 21.0f, 18.448f, 21.0f, 19.0f)
                curveTo(21.0f, 19.552f, 20.552f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 20.0f, 3.0f, 19.552f, 3.0f, 19.0f)
                close()
            }
        }
        .build()
        return _insertAfter!!
    }

private var _insertAfter: ImageVector? = null
