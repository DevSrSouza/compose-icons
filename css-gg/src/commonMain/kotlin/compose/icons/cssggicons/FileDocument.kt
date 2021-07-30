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

public val CssGgIcons.FileDocument: ImageVector
    get() {
        if (_fileDocument != null) {
            return _fileDocument!!
        }
        _fileDocument = Builder(name = "FileDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 2.0f)
                curveTo(4.3432f, 2.0f, 3.0f, 3.3431f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.6569f, 4.3432f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 22.0f, 21.0f, 20.6569f, 21.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 5.134f, 17.866f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.5523f, 18.5523f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 20.0f, 5.0f, 19.5523f, 5.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.4477f, 5.4477f, 4.0f, 6.0f, 4.0f)
                close()
                moveTo(15.0f, 4.1f)
                curveTo(16.6113f, 4.4271f, 17.9413f, 5.5291f, 18.584f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.1f)
                close()
            }
        }
        .build()
        return _fileDocument!!
    }

private var _fileDocument: ImageVector? = null
