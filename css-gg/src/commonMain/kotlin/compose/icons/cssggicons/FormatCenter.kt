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

public val CssGgIcons.FormatCenter: ImageVector
    get() {
        if (_formatCenter != null) {
            return _formatCenter!!
        }
        _formatCenter = Builder(name = "FormatCenter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(3.448f, 5.0f, 3.0f, 5.448f, 3.0f, 6.0f)
                curveTo(3.0f, 6.552f, 3.448f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 7.0f, 21.0f, 6.552f, 21.0f, 6.0f)
                curveTo(21.0f, 5.448f, 20.552f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                curveTo(3.448f, 13.0f, 3.0f, 13.448f, 3.0f, 14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 15.0f, 21.0f, 14.552f, 21.0f, 14.0f)
                curveTo(21.0f, 13.448f, 20.552f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 9.0f, 18.0f, 9.448f, 18.0f, 10.0f)
                curveTo(18.0f, 10.552f, 17.552f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                curveTo(6.448f, 17.0f, 6.0f, 17.448f, 6.0f, 18.0f)
                curveTo(6.0f, 18.552f, 6.448f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 19.0f, 18.0f, 18.552f, 18.0f, 18.0f)
                curveTo(18.0f, 17.448f, 17.552f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatCenter!!
    }

private var _formatCenter: ImageVector? = null
