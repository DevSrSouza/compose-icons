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

public val CssGgIcons.Polaroid: ImageVector
    get() {
        if (_polaroid != null) {
            return _polaroid!!
        }
        _polaroid = Builder(name = "Polaroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 2.8954f, 3.8954f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 2.0f, 21.0f, 2.8954f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.1046f, 20.1046f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 22.0f, 3.0f, 21.1046f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _polaroid!!
    }

private var _polaroid: ImageVector? = null
