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

public val MaterialDesignIcons.FormatHeaderPound: ImageVector
    get() {
        if (_formatHeaderPound != null) {
            return _formatHeaderPound!!
        }
        _formatHeaderPound = Builder(name = "FormatHeaderPound", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(13.0f, 8.0f)
                horizontalLineTo(15.31f)
                lineTo(15.63f, 5.0f)
                horizontalLineTo(17.63f)
                lineTo(17.31f, 8.0f)
                horizontalLineTo(19.31f)
                lineTo(19.63f, 5.0f)
                horizontalLineTo(21.63f)
                lineTo(21.31f, 8.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.1f)
                lineTo(20.9f, 12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.69f)
                lineTo(20.37f, 17.0f)
                horizontalLineTo(18.37f)
                lineTo(18.69f, 14.0f)
                horizontalLineTo(16.69f)
                lineTo(16.37f, 17.0f)
                horizontalLineTo(14.37f)
                lineTo(14.69f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.9f)
                lineTo(15.1f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                moveTo(17.1f, 10.0f)
                lineTo(16.9f, 12.0f)
                horizontalLineTo(18.9f)
                lineTo(19.1f, 10.0f)
                horizontalLineTo(17.1f)
                close()
            }
        }
        .build()
        return _formatHeaderPound!!
    }

private var _formatHeaderPound: ImageVector? = null
