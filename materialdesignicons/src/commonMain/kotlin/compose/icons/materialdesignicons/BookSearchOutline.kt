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

public val MaterialDesignIcons.BookSearchOutline: ImageVector
    get() {
        if (_bookSearchOutline != null) {
            return _bookSearchOutline!!
        }
        _bookSearchOutline = Builder(name = "BookSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                curveTo(18.0f, 12.0f, 20.0f, 14.0f, 20.0f, 16.5f)
                curveTo(20.0f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22.0f)
                lineTo(21.0f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21.0f, 15.5f, 21.0f)
                curveTo(13.0f, 21.0f, 11.0f, 19.0f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0f, 13.0f, 12.0f, 15.5f, 12.0f)
                moveTo(15.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 14.0f)
                moveTo(13.0f, 4.0f)
                verticalLineTo(12.0f)
                lineTo(10.5f, 9.75f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(10.54f, 20.81f, 11.23f, 21.5f, 12.03f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(11.81f)
                curveTo(19.42f, 11.26f, 18.75f, 10.81f, 18.0f, 10.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bookSearchOutline!!
    }

private var _bookSearchOutline: ImageVector? = null
