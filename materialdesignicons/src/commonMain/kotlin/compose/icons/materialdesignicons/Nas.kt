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

public val MaterialDesignIcons.Nas: ImageVector
    get() {
        if (_nas != null) {
            return _nas!!
        }
        _nas = Builder(name = "Nas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(2.89f, 5.0f, 2.0f, 5.89f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.11f, 2.89f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 19.0f, 22.0f, 18.11f, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.89f, 21.11f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(4.0f)
                moveTo(4.5f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.5f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.5f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.5f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.5f, 7.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(8.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                moveTo(12.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                moveTo(16.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _nas!!
    }

private var _nas: ImageVector? = null
