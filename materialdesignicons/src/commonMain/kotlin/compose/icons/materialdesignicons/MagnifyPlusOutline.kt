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

public val MaterialDesignIcons.MagnifyPlusOutline: ImageVector
    get() {
        if (_magnifyPlusOutline != null) {
            return _magnifyPlusOutline!!
        }
        _magnifyPlusOutline = Builder(name = "MagnifyPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                lineTo(20.5f, 19.0f)
                lineTo(19.0f, 20.5f)
                lineTo(14.0f, 15.5f)
                verticalLineTo(14.71f)
                lineTo(13.73f, 14.43f)
                curveTo(12.59f, 15.41f, 11.11f, 16.0f, 9.5f, 16.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 3.0f, 9.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 9.5f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 16.0f, 9.5f)
                curveTo(16.0f, 11.11f, 15.41f, 12.59f, 14.43f, 13.73f)
                lineTo(14.71f, 14.0f)
                horizontalLineTo(15.5f)
                moveTo(9.5f, 14.0f)
                curveTo(12.0f, 14.0f, 14.0f, 12.0f, 14.0f, 9.5f)
                curveTo(14.0f, 7.0f, 12.0f, 5.0f, 9.5f, 5.0f)
                curveTo(7.0f, 5.0f, 5.0f, 7.0f, 5.0f, 9.5f)
                curveTo(5.0f, 12.0f, 7.0f, 14.0f, 9.5f, 14.0f)
                moveTo(12.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _magnifyPlusOutline!!
    }

private var _magnifyPlusOutline: ImageVector? = null
