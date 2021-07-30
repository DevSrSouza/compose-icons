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

public val CssGgIcons.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.9316f, 9.0089f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0089f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.9316f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0089f)
                horizontalLineTo(9.9316f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.9316f)
                verticalLineTo(7.0089f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0089f)
                horizontalLineTo(7.9316f)
                close()
                moveTo(9.9316f, 9.0089f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0089f)
                horizontalLineTo(9.9316f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
