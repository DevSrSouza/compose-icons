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

public val MaterialDesignIcons.ScissorsCutting: ImageVector
    get() {
        if (_scissorsCutting != null) {
            return _scissorsCutting!!
        }
        _scissorsCutting = Builder(name = "ScissorsCutting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                moveTo(15.5f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.2f)
                lineTo(11.8f, 12.9f)
                lineTo(9.3f, 13.5f)
                curveTo(9.2f, 14.0f, 9.0f, 14.4f, 8.8f, 14.8f)
                curveTo(7.9f, 16.3f, 6.0f, 16.7f, 4.5f, 15.8f)
                curveTo(3.0f, 14.9f, 2.6f, 13.0f, 3.5f, 11.5f)
                curveTo(4.4f, 10.0f, 6.3f, 9.6f, 7.8f, 10.5f)
                curveTo(8.2f, 10.7f, 8.5f, 11.1f, 8.7f, 11.4f)
                lineTo(11.2f, 10.8f)
                lineTo(10.6f, 8.3f)
                curveTo(10.2f, 8.2f, 9.8f, 8.0f, 9.4f, 7.8f)
                curveTo(8.0f, 6.9f, 7.5f, 5.0f, 8.4f, 3.5f)
                curveTo(9.3f, 2.0f, 11.2f, 1.6f, 12.7f, 2.5f)
                curveTo(14.2f, 3.4f, 14.6f, 5.3f, 13.7f, 6.8f)
                curveTo(13.5f, 7.2f, 13.1f, 7.5f, 12.8f, 7.7f)
                lineTo(15.5f, 19.0f)
                moveTo(7.0f, 11.8f)
                curveTo(6.3f, 11.3f, 5.3f, 11.6f, 4.8f, 12.3f)
                curveTo(4.3f, 13.0f, 4.6f, 14.0f, 5.3f, 14.4f)
                curveTo(6.0f, 14.9f, 7.0f, 14.7f, 7.5f, 13.9f)
                curveTo(7.9f, 13.2f, 7.7f, 12.2f, 7.0f, 11.8f)
                moveTo(12.4f, 6.0f)
                curveTo(12.9f, 5.3f, 12.6f, 4.3f, 11.9f, 3.8f)
                curveTo(11.2f, 3.3f, 10.2f, 3.6f, 9.7f, 4.3f)
                curveTo(9.3f, 5.0f, 9.5f, 6.0f, 10.3f, 6.5f)
                curveTo(11.0f, 6.9f, 12.0f, 6.7f, 12.4f, 6.0f)
                moveTo(12.8f, 11.3f)
                curveTo(12.6f, 11.2f, 12.4f, 11.2f, 12.3f, 11.4f)
                curveTo(12.2f, 11.6f, 12.2f, 11.8f, 12.4f, 11.9f)
                curveTo(12.6f, 12.0f, 12.8f, 12.0f, 12.9f, 11.8f)
                curveTo(13.1f, 11.6f, 13.0f, 11.4f, 12.8f, 11.3f)
                moveTo(21.0f, 8.5f)
                lineTo(14.5f, 10.0f)
                lineTo(15.0f, 12.2f)
                lineTo(22.5f, 10.4f)
                lineTo(23.0f, 9.7f)
                lineTo(21.0f, 8.5f)
                moveTo(23.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                moveTo(5.0f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _scissorsCutting!!
    }

private var _scissorsCutting: ImageVector? = null
