package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BookAlphabet: ImageVector
    get() {
        if (_bookAlphabet != null) {
            return _bookAlphabet!!
        }
        _bookAlphabet = Builder(name = "BookAlphabet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.81f, 2.0f)
                curveTo(4.83f, 2.09f, 4.0f, 3.0f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.05f, 4.95f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.05f, 22.0f, 20.0f, 21.05f, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.89f, 19.1f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.94f, 2.0f, 5.87f, 2.0f, 5.81f, 2.0f)
                moveTo(12.0f, 13.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                moveTo(12.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                lineTo(16.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                lineTo(17.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bookAlphabet!!
    }

private var _bookAlphabet: ImageVector? = null
