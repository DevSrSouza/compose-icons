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

public val MaterialDesignIcons.VectorSquareEdit: ImageVector
    get() {
        if (_vectorSquareEdit != null) {
            return _vectorSquareEdit!!
        }
        _vectorSquareEdit = Builder(name = "VectorSquareEdit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7f, 14.4f)
                lineTo(21.7f, 15.4f)
                lineTo(19.6f, 13.3f)
                lineTo(20.6f, 12.3f)
                curveTo(20.8f, 12.1f, 21.2f, 12.1f, 21.4f, 12.3f)
                lineTo(22.7f, 13.6f)
                curveTo(22.9f, 13.8f, 22.9f, 14.1f, 22.7f, 14.4f)
                moveTo(13.0f, 19.9f)
                lineTo(19.1f, 13.8f)
                lineTo(21.2f, 15.9f)
                lineTo(15.1f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.9f)
                moveTo(11.0f, 19.9f)
                verticalLineTo(19.1f)
                lineTo(11.6f, 18.5f)
                lineTo(12.1f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.1f)
                lineTo(19.1f, 11.0f)
                lineTo(19.3f, 10.8f)
                curveTo(19.5f, 10.6f, 19.8f, 10.4f, 20.1f, 10.3f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.1f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.1f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                lineTo(11.0f, 19.9f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(6.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _vectorSquareEdit!!
    }

private var _vectorSquareEdit: ImageVector? = null
