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

public val MaterialDesignIcons.FormatPageSplit: ImageVector
    get() {
        if (_formatPageSplit != null) {
            return _formatPageSplit!!
        }
        _formatPageSplit = Builder(name = "FormatPageSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                moveTo(13.0f, 1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                moveTo(11.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(9.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(15.0f, 3.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _formatPageSplit!!
    }

private var _formatPageSplit: ImageVector? = null
