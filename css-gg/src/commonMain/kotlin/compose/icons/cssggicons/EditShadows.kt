package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.EditShadows: ImageVector
    get() {
        if (_editShadows != null) {
            return _editShadows!!
        }
        _editShadows = Builder(name = "EditShadows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.306f, 6.992f)
                curveTo(14.358f, 6.365f, 13.222f, 6.0f, 12.0f, 6.0f)
                curveTo(8.686f, 6.0f, 6.0f, 8.686f, 6.0f, 12.0f)
                curveTo(6.0f, 15.314f, 8.686f, 18.0f, 12.0f, 18.0f)
                curveTo(13.227f, 18.0f, 14.368f, 17.632f, 15.318f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.472f)
                curveTo(16.991f, 15.421f, 17.398f, 14.74f, 17.661f, 13.992f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.992f)
                horizontalLineTo(17.918f)
                curveTo(17.972f, 12.669f, 18.0f, 12.338f, 18.0f, 12.0f)
                curveTo(18.0f, 11.668f, 17.973f, 11.343f, 17.921f, 11.026f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.026f)
                horizontalLineTo(17.668f)
                curveTo(17.403f, 9.267f, 16.991f, 8.577f, 16.465f, 7.992f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.992f)
                horizontalLineTo(15.306f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _editShadows!!
    }

private var _editShadows: ImageVector? = null
