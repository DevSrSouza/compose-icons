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

public val MaterialDesignIcons.Liquor: ImageVector
    get() {
        if (_liquor != null) {
            return _liquor!!
        }
        _liquor = Builder(name = "Liquor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                curveTo(3.0f, 15.3f, 3.8f, 16.4f, 5.0f, 16.8f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.8f)
                curveTo(8.2f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                moveTo(20.6f, 8.5f)
                lineTo(19.6f, 8.2f)
                curveTo(19.3f, 8.1f, 19.0f, 7.7f, 19.0f, 7.3f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 2.5f, 18.5f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4f, 2.0f, 14.0f, 2.5f, 14.0f, 3.0f)
                verticalLineTo(7.3f)
                curveTo(14.0f, 7.7f, 13.7f, 8.1f, 13.3f, 8.3f)
                lineTo(12.4f, 8.6f)
                curveTo(11.6f, 8.9f, 11.0f, 9.6f, 11.0f, 10.5f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 21.1f, 11.9f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(10.4f)
                curveTo(22.0f, 9.6f, 21.5f, 8.8f, 20.6f, 8.5f)
                moveTo(16.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                moveTo(13.0f, 10.4f)
                lineTo(13.9f, 10.1f)
                curveTo(15.2f, 9.7f, 16.0f, 8.6f, 16.0f, 7.3f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.3f)
                curveTo(17.0f, 8.6f, 17.8f, 9.7f, 19.0f, 10.1f)
                lineTo(20.0f, 10.4f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.4f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _liquor!!
    }

private var _liquor: ImageVector? = null
