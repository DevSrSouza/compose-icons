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
                moveTo(8.0f, 6.9834f)
                curveTo(7.4477f, 6.9834f, 7.0f, 7.4311f, 7.0f, 7.9834f)
                curveTo(7.0f, 8.5357f, 7.4477f, 8.9834f, 8.0f, 8.9834f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 8.9834f, 17.0f, 8.5357f, 17.0f, 7.9834f)
                curveTo(17.0f, 7.4311f, 16.5523f, 6.9834f, 16.0f, 6.9834f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.017f)
                curveTo(7.4477f, 15.017f, 7.0f, 15.4647f, 7.0f, 16.017f)
                curveTo(7.0f, 16.5693f, 7.4477f, 17.017f, 8.0f, 17.017f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 17.017f, 17.0f, 16.5693f, 17.0f, 16.017f)
                curveTo(17.0f, 15.4647f, 16.5523f, 15.017f, 16.0f, 15.017f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _menuRound!!
    }

private var _menuRound: ImageVector? = null
