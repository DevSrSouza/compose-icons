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

public val MaterialDesignIcons.SizeXxl: ImageVector
    get() {
        if (_sizeXxl != null) {
            return _sizeXxl!!
        }
        _sizeXxl = Builder(name = "SizeXxl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                horizontalLineTo(11.0f)
                lineTo(12.0f, 9.5f)
                lineTo(13.0f, 7.0f)
                horizontalLineTo(15.0f)
                lineTo(13.0f, 12.0f)
                lineTo(15.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(12.0f, 14.5f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(9.0f)
                lineTo(11.0f, 12.0f)
                lineTo(9.0f, 7.0f)
                moveTo(16.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineTo(4.0f)
                lineTo(5.0f, 9.5f)
                lineTo(6.0f, 7.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(5.0f, 14.5f)
                lineTo(4.0f, 17.0f)
                horizontalLineTo(2.0f)
                lineTo(4.0f, 12.0f)
                lineTo(2.0f, 7.0f)
                close()
            }
        }
        .build()
        return _sizeXxl!!
    }

private var _sizeXxl: ImageVector? = null
