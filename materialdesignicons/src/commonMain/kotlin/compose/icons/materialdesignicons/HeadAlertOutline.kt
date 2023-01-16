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

public val MaterialDesignIcons.HeadAlertOutline: ImageVector
    get() {
        if (_headAlertOutline != null) {
            return _headAlertOutline!!
        }
        _headAlertOutline = Builder(name = "HeadAlertOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(16.9f, 3.0f, 20.0f, 6.1f, 20.0f, 10.0f)
                curveTo(20.0f, 12.8f, 18.4f, 15.2f, 16.0f, 16.3f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 18.0f, 6.0f, 17.1f, 6.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.5f)
                curveTo(4.1f, 13.0f, 3.8f, 12.5f, 4.1f, 12.2f)
                lineTo(6.0f, 9.7f)
                curveTo(6.2f, 5.9f, 9.2f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 1.0f)
                curveTo(8.4f, 1.0f, 4.6f, 4.4f, 4.1f, 8.9f)
                lineTo(2.5f, 11.0f)
                curveTo(1.9f, 11.8f, 1.9f, 12.8f, 2.3f, 13.6f)
                curveTo(2.7f, 14.3f, 3.3f, 14.8f, 4.0f, 14.9f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.9f, 5.3f, 19.4f, 7.0f, 19.9f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.8f, 22.0f, 13.1f, 22.0f, 10.0f)
                curveTo(22.0f, 5.0f, 18.0f, 1.0f, 13.0f, 1.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _headAlertOutline!!
    }

private var _headAlertOutline: ImageVector? = null
