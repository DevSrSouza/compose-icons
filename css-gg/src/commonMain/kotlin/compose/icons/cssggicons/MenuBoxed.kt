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

public val CssGgIcons.MenuBoxed: ImageVector
    get() {
        if (_menuBoxed != null) {
            return _menuBoxed!!
        }
        _menuBoxed = Builder(name = "MenuBoxed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.016f, 6.982f)
                curveTo(7.463f, 6.982f, 7.016f, 7.433f, 7.016f, 7.985f)
                curveTo(7.016f, 8.537f, 7.463f, 8.988f, 8.016f, 8.988f)
                horizontalLineTo(15.966f)
                curveTo(16.518f, 8.988f, 16.966f, 8.537f, 16.966f, 7.985f)
                curveTo(16.966f, 7.433f, 16.518f, 6.982f, 15.966f, 6.982f)
                horizontalLineTo(8.016f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.016f, 12.0f)
                curveTo(7.016f, 11.448f, 7.463f, 10.997f, 8.016f, 10.997f)
                horizontalLineTo(15.966f)
                curveTo(16.518f, 10.997f, 16.966f, 11.448f, 16.966f, 12.0f)
                curveTo(16.966f, 12.552f, 16.518f, 13.003f, 15.966f, 13.003f)
                horizontalLineTo(8.016f)
                curveTo(7.463f, 13.003f, 7.016f, 12.552f, 7.016f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.025f, 15.012f)
                curveTo(7.473f, 15.012f, 7.025f, 15.463f, 7.025f, 16.015f)
                curveTo(7.025f, 16.568f, 7.473f, 17.019f, 8.025f, 17.019f)
                horizontalLineTo(15.975f)
                curveTo(16.528f, 17.019f, 16.975f, 16.568f, 16.975f, 16.015f)
                curveTo(16.975f, 15.463f, 16.528f, 15.012f, 15.975f, 15.012f)
                horizontalLineTo(8.025f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.552f, 18.552f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.448f, 5.448f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _menuBoxed!!
    }

private var _menuBoxed: ImageVector? = null
