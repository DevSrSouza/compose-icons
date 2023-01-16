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

public val MaterialDesignIcons.CornOff: ImageVector
    get() {
        if (_cornOff != null) {
            return _cornOff!!
        }
        _cornOff = Builder(name = "CornOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(7.2f, 9.1f)
                curveTo(7.1f, 9.7f, 7.0f, 10.3f, 7.0f, 11.0f)
                curveTo(5.5f, 10.4f, 3.8f, 10.0f, 2.0f, 10.0f)
                curveTo(7.9f, 12.6f, 6.0f, 22.0f, 12.0f, 22.0f)
                curveTo(14.5f, 22.0f, 15.7f, 20.5f, 16.6f, 18.5f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(8.1f, 10.0f)
                lineTo(9.1f, 11.0f)
                horizontalLineTo(8.0f)
                lineTo(8.1f, 10.0f)
                moveTo(8.8f, 12.0f)
                horizontalLineTo(10.1f)
                lineTo(11.0f, 12.9f)
                verticalLineTo(13.7f)
                curveTo(10.3f, 13.1f, 9.6f, 12.5f, 8.8f, 12.0f)
                moveTo(14.3f, 19.2f)
                curveTo(14.1f, 18.0f, 13.4f, 16.4f, 12.2f, 15.0f)
                horizontalLineTo(13.1f)
                lineTo(15.2f, 17.1f)
                curveTo(15.0f, 17.9f, 14.7f, 18.6f, 14.3f, 19.2f)
                moveTo(11.0f, 6.0f)
                verticalLineTo(7.8f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                curveTo(14.1f, 3.0f, 15.9f, 7.0f, 16.0f, 11.8f)
                verticalLineTo(12.8f)
                lineTo(18.0f, 14.8f)
                curveTo(18.8f, 12.8f, 19.9f, 10.9f, 22.0f, 10.0f)
                curveTo(20.2f, 10.0f, 18.5f, 10.4f, 17.0f, 11.1f)
                curveTo(16.8f, 5.9f, 14.7f, 2.0f, 12.0f, 2.0f)
                curveTo(10.5f, 2.0f, 9.2f, 3.2f, 8.3f, 5.1f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 3.3f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.5f)
                curveTo(10.0f, 4.2f, 10.5f, 3.6f, 11.0f, 3.3f)
                moveTo(15.0f, 11.8f)
                lineTo(14.2f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.8f)
                close()
            }
        }
        .build()
        return _cornOff!!
    }

private var _cornOff: ImageVector? = null
