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

public val MaterialDesignIcons.DeleteAlertOutline: ImageVector
    get() {
        if (_deleteAlertOutline != null) {
            return _deleteAlertOutline!!
        }
        _deleteAlertOutline = Builder(name = "DeleteAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.1f, 15.1f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 21.0f, 4.0f, 20.1f, 4.0f, 19.0f)
                moveTo(6.0f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                moveTo(13.5f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.5f)
                lineTo(7.5f, 3.0f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 4.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _deleteAlertOutline!!
    }

private var _deleteAlertOutline: ImageVector? = null
