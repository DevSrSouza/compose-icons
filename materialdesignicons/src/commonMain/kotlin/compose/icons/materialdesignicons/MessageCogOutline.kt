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

public val MaterialDesignIcons.MessageCogOutline: ImageVector
    get() {
        if (_messageCogOutline != null) {
            return _messageCogOutline!!
        }
        _messageCogOutline = Builder(name = "MessageCogOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(5.2f)
                lineTo(4.0f, 17.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(16.8f, 11.3f)
                lineTo(15.7f, 10.5f)
                verticalLineTo(10.0f)
                verticalLineTo(9.5f)
                lineTo(16.8f, 8.7f)
                curveTo(16.9f, 8.6f, 16.9f, 8.5f, 16.9f, 8.4f)
                lineTo(15.9f, 6.7f)
                curveTo(15.8f, 6.6f, 15.7f, 6.5f, 15.6f, 6.6f)
                lineTo(14.3f, 7.0f)
                curveTo(14.0f, 6.8f, 13.8f, 6.6f, 13.4f, 6.5f)
                lineTo(13.2f, 5.2f)
                curveTo(13.2f, 5.1f, 13.1f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(10.9f, 5.0f, 10.8f, 5.1f, 10.8f, 5.2f)
                lineTo(10.6f, 6.5f)
                curveTo(10.3f, 6.7f, 10.0f, 6.8f, 9.7f, 7.0f)
                lineTo(8.5f, 6.5f)
                curveTo(8.4f, 6.5f, 8.3f, 6.5f, 8.2f, 6.6f)
                lineTo(7.2f, 8.3f)
                curveTo(7.1f, 8.4f, 7.2f, 8.5f, 7.3f, 8.6f)
                lineTo(8.4f, 9.4f)
                verticalLineTo(10.4f)
                lineTo(7.3f, 11.2f)
                curveTo(7.2f, 11.3f, 7.2f, 11.4f, 7.2f, 11.5f)
                lineTo(8.2f, 13.2f)
                curveTo(8.3f, 13.3f, 8.4f, 13.4f, 8.5f, 13.3f)
                lineTo(9.7f, 13.0f)
                curveTo(10.0f, 13.2f, 10.2f, 13.4f, 10.5f, 13.5f)
                lineTo(10.7f, 14.8f)
                curveTo(10.7f, 14.9f, 10.8f, 15.0f, 11.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(13.1f, 15.0f, 13.2f, 14.9f, 13.2f, 14.8f)
                lineTo(13.4f, 13.5f)
                curveTo(13.7f, 13.4f, 14.0f, 13.2f, 14.2f, 13.0f)
                lineTo(15.4f, 13.5f)
                curveTo(15.5f, 13.5f, 15.6f, 13.5f, 15.7f, 13.4f)
                lineTo(16.7f, 11.7f)
                curveTo(16.9f, 11.5f, 16.9f, 11.4f, 16.8f, 11.3f)
                moveTo(12.0f, 11.5f)
                curveTo(11.2f, 11.5f, 10.5f, 10.8f, 10.5f, 10.0f)
                reflectiveCurveTo(11.2f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveTo(13.5f, 9.2f, 13.5f, 10.0f)
                reflectiveCurveTo(12.8f, 11.5f, 12.0f, 11.5f)
                close()
            }
        }
        .build()
        return _messageCogOutline!!
    }

private var _messageCogOutline: ImageVector? = null
