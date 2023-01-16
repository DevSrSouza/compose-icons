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

public val MaterialDesignIcons.KeyWireless: ImageVector
    get() {
        if (_keyWireless != null) {
            return _keyWireless!!
        }
        _keyWireless = Builder(name = "KeyWireless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9f, 5.9f)
                lineTo(6.3f, 7.3f)
                curveTo(9.4f, 4.2f, 14.5f, 4.2f, 17.6f, 7.3f)
                lineTo(19.0f, 5.9f)
                curveTo(15.2f, 2.0f, 8.8f, 2.0f, 4.9f, 5.9f)
                moveTo(7.8f, 8.8f)
                lineTo(9.2f, 10.2f)
                curveTo(10.8f, 8.6f, 13.3f, 8.6f, 14.9f, 10.2f)
                lineTo(16.3f, 8.8f)
                curveTo(13.9f, 6.4f, 10.1f, 6.4f, 7.8f, 8.8f)
                moveTo(11.8f, 15.0f)
                curveTo(11.0f, 12.7f, 8.4f, 11.4f, 6.1f, 12.3f)
                reflectiveCurveTo(2.4f, 15.7f, 3.3f, 18.0f)
                reflectiveCurveTo(6.7f, 21.6f, 9.0f, 20.7f)
                curveTo(10.3f, 20.2f, 11.3f, 19.2f, 11.7f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                moveTo(7.5f, 18.0f)
                curveTo(6.7f, 18.0f, 6.0f, 17.3f, 6.0f, 16.5f)
                curveTo(6.0f, 15.7f, 6.7f, 15.0f, 7.5f, 15.0f)
                reflectiveCurveTo(9.0f, 15.7f, 9.0f, 16.5f)
                curveTo(9.0f, 17.3f, 8.3f, 18.0f, 7.5f, 18.0f)
                close()
            }
        }
        .build()
        return _keyWireless!!
    }

private var _keyWireless: ImageVector? = null
