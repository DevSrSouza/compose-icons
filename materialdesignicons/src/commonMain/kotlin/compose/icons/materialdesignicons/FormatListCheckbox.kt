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

public val MaterialDesignIcons.FormatListCheckbox: ImageVector
    get() {
        if (_formatListCheckbox != null) {
            return _formatListCheckbox!!
        }
        _formatListCheckbox = Builder(name = "FormatListCheckbox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                moveTo(8.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                moveTo(4.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                moveTo(3.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 5.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 8.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 7.0f)
                verticalLineTo(5.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                moveTo(3.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 10.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 11.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 14.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 13.0f)
                verticalLineTo(11.0f)
                moveTo(4.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                moveTo(3.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 16.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 17.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _formatListCheckbox!!
    }

private var _formatListCheckbox: ImageVector? = null
