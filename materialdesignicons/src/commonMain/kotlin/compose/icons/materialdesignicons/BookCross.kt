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

public val MaterialDesignIcons.BookCross: ImageVector
    get() {
        if (_bookCross != null) {
            return _bookCross!!
        }
        _bookCross = Builder(name = "BookCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.81f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.05f, 19.05f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.95f, 22.0f, 4.0f, 21.05f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.0f, 4.83f, 2.09f, 5.81f, 2.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bookCross!!
    }

private var _bookCross: ImageVector? = null
