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

public val MaterialDesignIcons.BookRemoveMultiple: ImageVector
    get() {
        if (_bookRemoveMultiple != null) {
            return _bookRemoveMultiple!!
        }
        _bookRemoveMultiple = Builder(name = "BookRemoveMultiple", defaultWidth = 24.0.dp,
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
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                lineTo(12.0f, 5.5f)
                lineTo(10.0f, 7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 18.0f)
                horizontalLineTo(13.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 21.0f, 13.34f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 2.0f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }
        .build()
        return _bookRemoveMultiple!!
    }

private var _bookRemoveMultiple: ImageVector? = null
