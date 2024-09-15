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

public val CssGgIcons.LockUnlock: ImageVector
    get() {
        if (_lockUnlock != null) {
            return _lockUnlock!!
        }
        _lockUnlock = Builder(name = "LockUnlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 4.791f, 15.209f, 3.0f, 13.0f, 3.0f)
                curveTo(10.791f, 3.0f, 9.0f, 4.791f, 9.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 10.0f, 21.0f, 11.343f, 21.0f, 13.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.657f, 19.657f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 22.0f, 3.0f, 20.657f, 3.0f, 19.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 11.343f, 4.343f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 3.686f, 9.686f, 1.0f, 13.0f, 1.0f)
                curveTo(16.314f, 1.0f, 19.0f, 3.686f, 19.0f, 7.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 12.0f, 5.0f, 12.448f, 5.0f, 13.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 19.552f, 5.448f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 20.0f, 19.0f, 19.552f, 19.0f, 19.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 12.448f, 18.552f, 12.0f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _lockUnlock!!
    }

private var _lockUnlock: ImageVector? = null
