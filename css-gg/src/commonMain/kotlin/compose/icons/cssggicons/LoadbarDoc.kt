package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.LoadbarDoc: ImageVector
    get() {
        if (_loadbarDoc != null) {
            return _loadbarDoc!!
        }
        _loadbarDoc = Builder(name = "LoadbarDoc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 5.0f, 6.0f, 5.4477f, 6.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 18.5523f, 6.4477f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 19.0f, 18.0f, 18.5523f, 18.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 5.4477f, 17.5523f, 5.0f, 17.0f, 5.0f)
                close()
                moveTo(7.0f, 3.0f)
                curveTo(5.3432f, 3.0f, 4.0f, 4.3432f, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.6569f, 5.3432f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 21.0f, 20.0f, 19.6569f, 20.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.3432f, 18.6569f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _loadbarDoc!!
    }

private var _loadbarDoc: ImageVector? = null
