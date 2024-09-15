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

public val CssGgIcons.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 2.0f, 22.0f, 3.343f, 22.0f, 5.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.105f, 21.105f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(8.148f)
                curveTo(8.099f, 22.004f, 8.05f, 22.005f, 8.0f, 22.005f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 22.005f, 2.0f, 21.11f, 2.0f, 20.005f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                curveTo(14.895f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.005f)
                curveTo(10.0f, 14.901f, 9.105f, 14.005f, 8.0f, 14.005f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
