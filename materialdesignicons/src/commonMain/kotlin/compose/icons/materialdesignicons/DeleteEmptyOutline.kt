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

public val MaterialDesignIcons.DeleteEmptyOutline: ImageVector
    get() {
        if (_deleteEmptyOutline != null) {
            return _deleteEmptyOutline!!
        }
        _deleteEmptyOutline = Builder(name = "DeleteEmptyOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.37f, 8.91f)
                lineTo(19.37f, 10.64f)
                lineTo(7.24f, 3.64f)
                lineTo(8.24f, 1.91f)
                lineTo(11.28f, 3.66f)
                lineTo(12.64f, 3.29f)
                lineTo(16.97f, 5.79f)
                lineTo(17.34f, 7.16f)
                lineTo(20.37f, 8.91f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.07f)
                lineTo(18.0f, 11.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.2f)
                lineTo(10.46f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _deleteEmptyOutline!!
    }

private var _deleteEmptyOutline: ImageVector? = null
