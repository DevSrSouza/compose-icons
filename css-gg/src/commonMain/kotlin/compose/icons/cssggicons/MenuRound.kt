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

public val CssGgIcons.MenuRound: ImageVector
    get() {
        if (_menuRound != null) {
            return _menuRound!!
        }
        _menuRound = Builder(name = "MenuRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.983f)
                curveTo(7.448f, 6.983f, 7.0f, 7.431f, 7.0f, 7.983f)
                curveTo(7.0f, 8.536f, 7.448f, 8.983f, 8.0f, 8.983f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 8.983f, 17.0f, 8.536f, 17.0f, 7.983f)
                curveTo(17.0f, 7.431f, 16.552f, 6.983f, 16.0f, 6.983f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 11.448f, 7.448f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 11.0f, 17.0f, 11.448f, 17.0f, 12.0f)
                curveTo(17.0f, 12.552f, 16.552f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 13.0f, 7.0f, 12.552f, 7.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.017f)
                curveTo(7.448f, 15.017f, 7.0f, 15.465f, 7.0f, 16.017f)
                curveTo(7.0f, 16.569f, 7.448f, 17.017f, 8.0f, 17.017f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 17.017f, 17.0f, 16.569f, 17.0f, 16.017f)
                curveTo(17.0f, 15.465f, 16.552f, 15.017f, 16.0f, 15.017f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _menuRound!!
    }

private var _menuRound: ImageVector? = null
