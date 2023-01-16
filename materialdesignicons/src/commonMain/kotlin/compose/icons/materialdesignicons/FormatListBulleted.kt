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

public val MaterialDesignIcons.FormatListBulleted: ImageVector
    get() {
        if (_formatListBulleted != null) {
            return _formatListBulleted!!
        }
        _formatListBulleted = Builder(name = "FormatListBulleted", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                moveTo(7.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 4.5f)
                moveTo(4.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 10.5f)
                moveTo(7.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 16.5f)
                close()
            }
        }
        .build()
        return _formatListBulleted!!
    }

private var _formatListBulleted: ImageVector? = null
