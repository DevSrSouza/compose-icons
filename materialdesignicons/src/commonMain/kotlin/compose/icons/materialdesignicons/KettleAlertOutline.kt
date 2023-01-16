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

public val MaterialDesignIcons.KettleAlertOutline: ImageVector
    get() {
        if (_kettleAlertOutline != null) {
            return _kettleAlertOutline!!
        }
        _kettleAlertOutline = Builder(name = "KettleAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 3.0f)
                curveTo(4.8f, 3.0f, 1.0f, 5.7f, 1.0f, 9.0f)
                curveTo(1.0f, 10.2f, 1.5f, 11.3f, 2.4f, 12.3f)
                curveTo(1.5f, 13.5f, 1.0f, 15.0f, 1.0f, 16.5f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 22.0f, 18.0f, 21.1f, 18.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(18.0f, 15.3f, 17.7f, 14.1f, 17.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                lineTo(16.0f, 8.0f)
                lineTo(13.9f, 10.1f)
                curveTo(11.0f, 8.5f, 7.4f, 8.6f, 4.6f, 10.4f)
                curveTo(4.2f, 10.0f, 4.0f, 9.5f, 4.0f, 9.0f)
                curveTo(4.0f, 7.2f, 6.5f, 5.7f, 9.5f, 5.7f)
                curveTo(10.9f, 5.7f, 12.3f, 6.1f, 13.3f, 6.7f)
                lineTo(15.3f, 4.7f)
                curveTo(13.6f, 3.5f, 11.6f, 3.0f, 9.5f, 3.0f)
                moveTo(9.5f, 11.0f)
                curveTo(13.0f, 11.0f, 16.0f, 14.0f, 16.0f, 16.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 14.0f, 6.0f, 11.0f, 9.5f, 11.0f)
                moveTo(10.0f, 12.5f)
                curveTo(7.0f, 12.5f, 5.0f, 14.0f, 5.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 16.0f, 7.0f, 13.5f, 10.0f, 12.5f)
                moveTo(21.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _kettleAlertOutline!!
    }

private var _kettleAlertOutline: ImageVector? = null
