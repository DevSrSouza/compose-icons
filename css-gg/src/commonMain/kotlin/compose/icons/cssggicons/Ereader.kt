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

public val CssGgIcons.Ereader: ImageVector
    get() {
        if (_ereader != null) {
            return _ereader!!
        }
        _ereader = Builder(name = "Ereader", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(15.4477f, 7.0f, 15.0f, 7.4477f, 15.0f, 8.0f)
                curveTo(15.0f, 8.5523f, 15.4477f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 9.0f, 20.0f, 8.5523f, 20.0f, 8.0f)
                curveTo(20.0f, 7.4477f, 19.5523f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 11.4477f, 15.4477f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5523f, 19.5523f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4477f, 13.0f, 15.0f, 12.5523f, 15.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveTo(15.4477f, 15.0f, 15.0f, 15.4477f, 15.0f, 16.0f)
                curveTo(15.0f, 16.5523f, 15.4477f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 16.5523f, 20.0f, 16.0f)
                curveTo(20.0f, 15.4477f, 19.5523f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                curveTo(1.3432f, 3.0f, 0.0f, 4.3432f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 19.6569f, 1.3432f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.6569f, 21.0f, 24.0f, 19.6569f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.3432f, 22.6569f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 19.0f, 22.0f, 18.5523f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _ereader!!
    }

private var _ereader: ImageVector? = null
