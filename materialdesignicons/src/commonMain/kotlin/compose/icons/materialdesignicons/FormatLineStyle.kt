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

public val MaterialDesignIcons.FormatLineStyle: ImageVector
    get() {
        if (_formatLineStyle != null) {
            return _formatLineStyle!!
        }
        _formatLineStyle = Builder(name = "FormatLineStyle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                moveTo(9.5f, 16.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(16.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                moveTo(3.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                moveTo(7.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                moveTo(3.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                moveTo(3.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _formatLineStyle!!
    }

private var _formatLineStyle: ImageVector? = null
