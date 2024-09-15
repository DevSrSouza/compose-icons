package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Touchpad: ImageVector
    get() {
        if (_touchpad != null) {
            return _touchpad!!
        }
        _touchpad = Builder(name = "Touchpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 21.0f)
                curveTo(21.657f, 21.0f, 23.0f, 19.657f, 23.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 4.343f, 21.657f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.343f, 3.0f, 1.0f, 4.343f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.657f, 2.343f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 18.552f, 3.448f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.552f, 20.552f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _touchpad!!
    }

private var _touchpad: ImageVector? = null
