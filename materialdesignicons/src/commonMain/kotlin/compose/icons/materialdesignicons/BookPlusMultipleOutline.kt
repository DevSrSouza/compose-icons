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

public val MaterialDesignIcons.BookPlusMultipleOutline: ImageVector
    get() {
        if (_bookPlusMultipleOutline != null) {
            return _bookPlusMultipleOutline!!
        }
        _bookPlusMultipleOutline = Builder(name = "BookPlusMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(13.81f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 13.09f, 20.0f)
                moveTo(19.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 18.0f)
                horizontalLineTo(13.09f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 13.81f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                lineTo(13.5f, 7.75f)
                lineTo(16.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 21.0f, 13.34f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 2.0f)
                moveTo(20.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bookPlusMultipleOutline!!
    }

private var _bookPlusMultipleOutline: ImageVector? = null
