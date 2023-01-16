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

public val MaterialDesignIcons.AlertRemoveOutline: ImageVector
    get() {
        if (_alertRemoveOutline != null) {
            return _alertRemoveOutline!!
        }
        _alertRemoveOutline = Builder(name = "AlertRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.5f)
                moveTo(14.0f, 19.0f)
                curveTo(14.0f, 18.86f, 14.0f, 18.73f, 14.0f, 18.6f)
                horizontalLineTo(5.4f)
                lineTo(12.0f, 7.3f)
                lineTo(16.11f, 14.44f)
                curveTo(16.62f, 14.0f, 17.2f, 13.65f, 17.84f, 13.41f)
                lineTo(12.0f, 3.3f)
                lineTo(2.0f, 20.6f)
                horizontalLineTo(14.22f)
                curveTo(14.08f, 20.09f, 14.0f, 19.56f, 14.0f, 19.0f)
                moveTo(13.0f, 10.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.5f)
                moveTo(22.12f, 15.46f)
                lineTo(20.0f, 17.59f)
                lineTo(17.88f, 15.46f)
                lineTo(16.47f, 16.88f)
                lineTo(18.59f, 19.0f)
                lineTo(16.47f, 21.12f)
                lineTo(17.88f, 22.54f)
                lineTo(20.0f, 20.41f)
                lineTo(22.12f, 22.54f)
                lineTo(23.54f, 21.12f)
                lineTo(21.41f, 19.0f)
                lineTo(23.54f, 16.88f)
                lineTo(22.12f, 15.46f)
                close()
            }
        }
        .build()
        return _alertRemoveOutline!!
    }

private var _alertRemoveOutline: ImageVector? = null
