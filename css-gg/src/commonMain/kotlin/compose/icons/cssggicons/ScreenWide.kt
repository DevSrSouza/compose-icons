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

public val CssGgIcons.ScreenWide: ImageVector
    get() {
        if (_screenWide != null) {
            return _screenWide!!
        }
        _screenWide = Builder(name = "ScreenWide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.343f, 16.0f, 0.0f, 14.657f, 0.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(0.0f, 6.343f, 1.343f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(22.657f, 5.0f, 24.0f, 6.343f, 24.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(24.0f, 14.657f, 22.657f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 17.0f, 16.0f, 17.448f, 16.0f, 18.0f)
                curveTo(16.0f, 18.552f, 15.552f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 19.0f, 8.0f, 18.552f, 8.0f, 18.0f)
                curveTo(8.0f, 17.448f, 8.448f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 7.0f, 22.0f, 7.448f, 22.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 13.552f, 21.552f, 14.0f, 21.0f, 14.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 14.0f, 2.0f, 13.552f, 2.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 7.448f, 2.448f, 7.0f, 3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _screenWide!!
    }

private var _screenWide: ImageVector? = null
