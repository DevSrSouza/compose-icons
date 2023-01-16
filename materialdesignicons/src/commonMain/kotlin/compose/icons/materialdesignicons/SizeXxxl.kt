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

public val MaterialDesignIcons.SizeXxxl: ImageVector
    get() {
        if (_sizeXxxl != null) {
            return _sizeXxxl!!
        }
        _sizeXxxl = Builder(name = "SizeXxxl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 15.0f)
                curveTo(8.0f, 16.11f, 7.11f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(7.1f, 7.0f, 8.0f, 7.89f, 8.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 11.33f, 7.33f, 12.0f, 6.5f, 12.0f)
                curveTo(7.33f, 12.0f, 8.0f, 12.67f, 8.0f, 13.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _sizeXxxl!!
    }

private var _sizeXxxl: ImageVector? = null
