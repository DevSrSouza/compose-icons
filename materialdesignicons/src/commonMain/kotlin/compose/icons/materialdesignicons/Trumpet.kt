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

public val MaterialDesignIcons.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                curveTo(21.0f, 11.0f, 15.0f, 11.0f, 15.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.0f, 11.0f, 2.0f, 10.0f, 2.0f, 10.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 14.0f, 3.0f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(4.3f)
                curveTo(4.1f, 13.3f, 4.0f, 13.6f, 4.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.1f, 4.9f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 18.0f, 18.0f, 17.1f, 18.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 13.9f, 18.0f, 13.7f, 17.9f, 13.6f)
                curveTo(19.6f, 14.2f, 21.4f, 15.4f, 22.0f, 18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                moveTo(6.0f, 16.5f)
                curveTo(5.7f, 16.5f, 5.5f, 16.3f, 5.5f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(5.5f, 13.7f, 5.7f, 13.5f, 6.0f, 13.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(12.0f)
                moveTo(16.5f, 16.0f)
                curveTo(16.5f, 16.3f, 16.3f, 16.5f, 16.0f, 16.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.0f)
                curveTo(16.3f, 13.5f, 16.5f, 13.7f, 16.5f, 14.0f)
                verticalLineTo(16.0f)
                moveTo(9.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                moveTo(12.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null
