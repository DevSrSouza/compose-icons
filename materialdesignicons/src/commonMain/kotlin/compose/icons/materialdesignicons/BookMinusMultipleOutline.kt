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

public val MaterialDesignIcons.BookMinusMultipleOutline: ImageVector
    get() {
        if (_bookMinusMultipleOutline != null) {
            return _bookMinusMultipleOutline!!
        }
        _bookMinusMultipleOutline = Builder(name = "BookMinusMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                horizontalLineTo(9.0f)
                curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 17.11f, 7.9f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.2f, 17.29f, 13.44f, 16.61f, 13.81f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                lineTo(13.5f, 7.75f)
                lineTo(16.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                curveTo(19.68f, 13.0f, 20.36f, 13.11f, 21.0f, 13.34f)
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
        return _bookMinusMultipleOutline!!
    }

private var _bookMinusMultipleOutline: ImageVector? = null
