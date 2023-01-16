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

public val MaterialDesignIcons.Numeric9PlusBox: ImageVector
    get() {
        if (_numeric9PlusBox != null) {
            return _numeric9PlusBox!!
        }
        _numeric9PlusBox = Builder(name = "Numeric9PlusBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 12.11f, 6.9f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 7.89f, 11.1f, 7.0f, 10.0f, 7.0f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _numeric9PlusBox!!
    }

private var _numeric9PlusBox: ImageVector? = null
