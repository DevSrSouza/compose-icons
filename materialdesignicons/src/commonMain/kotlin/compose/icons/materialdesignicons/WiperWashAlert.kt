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

public val MaterialDesignIcons.WiperWashAlert: ImageVector
    get() {
        if (_wiperWashAlert != null) {
            return _wiperWashAlert!!
        }
        _wiperWashAlert = Builder(name = "WiperWashAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveTo(11.0f, 5.7f, 11.1f, 4.6f, 11.8f, 3.8f)
                lineTo(10.0f, 2.4f)
                lineTo(8.2f, 3.9f)
                curveTo(8.9f, 4.6f, 9.0f, 5.7f, 9.0f, 6.0f)
                curveTo(2.7f, 6.4f, 0.0f, 11.0f, 0.0f, 11.0f)
                lineTo(7.0f, 18.0f)
                curveTo(7.0f, 18.0f, 7.7f, 16.7f, 9.0f, 16.2f)
                verticalLineTo(18.3f)
                curveTo(8.4f, 18.6f, 8.0f, 19.3f, 8.0f, 20.0f)
                curveTo(8.0f, 21.11f, 8.9f, 22.0f, 10.0f, 22.0f)
                reflectiveCurveTo(12.0f, 21.11f, 12.0f, 20.0f)
                curveTo(12.0f, 19.3f, 11.6f, 18.6f, 11.0f, 18.3f)
                verticalLineTo(16.2f)
                curveTo(12.3f, 16.7f, 13.0f, 18.0f, 13.0f, 18.0f)
                lineTo(20.0f, 11.0f)
                curveTo(20.0f, 11.0f, 17.3f, 6.5f, 11.0f, 6.0f)
                moveTo(9.0f, 14.1f)
                curveTo(8.2f, 14.3f, 7.5f, 14.6f, 6.9f, 15.1f)
                lineTo(2.7f, 10.9f)
                curveTo(3.8f, 9.8f, 5.8f, 8.3f, 9.0f, 8.1f)
                verticalLineTo(14.1f)
                moveTo(13.1f, 15.1f)
                curveTo(12.5f, 14.7f, 11.8f, 14.3f, 11.0f, 14.1f)
                verticalLineTo(8.1f)
                curveTo(14.2f, 8.4f, 16.2f, 9.8f, 17.3f, 10.9f)
                lineTo(13.1f, 15.1f)
                moveTo(16.0f, 1.3f)
                lineTo(15.3f, 3.2f)
                curveTo(14.6f, 2.9f, 13.5f, 2.9f, 12.7f, 3.2f)
                lineTo(12.0f, 1.3f)
                curveTo(13.2f, 0.9f, 14.8f, 0.9f, 16.0f, 1.3f)
                moveTo(19.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 6.0f, 17.0f, 4.7f, 16.2f, 3.9f)
                lineTo(17.7f, 2.6f)
                curveTo(19.0f, 4.0f, 19.0f, 5.9f, 19.0f, 6.0f)
                moveTo(2.2f, 2.6f)
                lineTo(3.7f, 3.9f)
                curveTo(3.0f, 4.7f, 3.0f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(1.0f)
                curveTo(1.0f, 5.9f, 1.0f, 4.0f, 2.2f, 2.6f)
                moveTo(8.0f, 1.3f)
                lineTo(7.3f, 3.2f)
                curveTo(6.6f, 2.9f, 5.5f, 2.9f, 4.7f, 3.2f)
                lineTo(4.0f, 1.3f)
                curveTo(5.2f, 0.9f, 6.8f, 0.9f, 8.0f, 1.3f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _wiperWashAlert!!
    }

private var _wiperWashAlert: ImageVector? = null
