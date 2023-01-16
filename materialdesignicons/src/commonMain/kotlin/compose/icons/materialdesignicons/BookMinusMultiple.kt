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

public val MaterialDesignIcons.BookMinusMultiple: ImageVector
    get() {
        if (_bookMinusMultiple != null) {
            return _bookMinusMultiple!!
        }
        _bookMinusMultiple = Builder(name = "BookMinusMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.11f, 3.9f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.44f, 21.39f, 13.2f, 20.71f, 13.09f, 20.0f)
                moveTo(19.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                lineTo(12.0f, 5.5f)
                lineTo(10.0f, 7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 17.11f, 7.9f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.64f, 14.73f, 16.74f, 12.53f, 20.0f, 13.08f)
                curveTo(20.34f, 13.14f, 20.68f, 13.23f, 21.0f, 13.34f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 2.9f, 20.11f, 2.0f, 19.0f, 2.0f)
                moveTo(23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _bookMinusMultiple!!
    }

private var _bookMinusMultiple: ImageVector? = null
