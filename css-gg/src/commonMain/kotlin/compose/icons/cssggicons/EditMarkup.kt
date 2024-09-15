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

public val CssGgIcons.EditMarkup: ImageVector
    get() {
        if (_editMarkup != null) {
            return _editMarkup!!
        }
        _editMarkup = Builder(name = "EditMarkup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 24.0f)
                curveTo(18.627f, 24.0f, 24.0f, 18.627f, 24.0f, 12.0f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveTo(0.0f, 18.627f, 5.373f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(18.579f, 19.531f)
                curveTo(20.676f, 17.698f, 22.0f, 15.004f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 14.962f, 3.287f, 17.622f, 5.333f, 19.454f)
                lineTo(7.0f, 10.974f)
                horizontalLineTo(9.17f)
                lineTo(12.0f, 6.073f)
                lineTo(14.83f, 10.974f)
                horizontalLineTo(17.0f)
                lineTo(18.579f, 19.531f)
                close()
                moveTo(16.092f, 21.127f)
                lineTo(15.206f, 12.974f)
                horizontalLineTo(8.794f)
                lineTo(7.908f, 21.127f)
                curveTo(9.157f, 21.688f, 10.542f, 22.0f, 12.0f, 22.0f)
                curveTo(13.458f, 22.0f, 14.843f, 21.688f, 16.092f, 21.127f)
                close()
            }
        }
        .build()
        return _editMarkup!!
    }

private var _editMarkup: ImageVector? = null
