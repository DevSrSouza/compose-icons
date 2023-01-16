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

public val MaterialDesignIcons.SortVariantOff: ImageVector
    get() {
        if (_sortVariantOff != null) {
            return _sortVariantOff!!
        }
        _sortVariantOff = Builder(name = "SortVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(11.11f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.11f)
                lineTo(6.11f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.11f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15.0f, 11.0f)
                horizontalLineTo(14.2f)
                lineTo(15.0f, 11.8f)
                verticalLineTo(11.0f)
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _sortVariantOff!!
    }

private var _sortVariantOff: ImageVector? = null
