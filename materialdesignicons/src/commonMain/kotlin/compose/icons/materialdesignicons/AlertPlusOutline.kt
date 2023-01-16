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

public val MaterialDesignIcons.AlertPlusOutline: ImageVector
    get() {
        if (_alertPlusOutline != null) {
            return _alertPlusOutline!!
        }
        _alertPlusOutline = Builder(name = "AlertPlusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(19.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _alertPlusOutline!!
    }

private var _alertPlusOutline: ImageVector? = null
