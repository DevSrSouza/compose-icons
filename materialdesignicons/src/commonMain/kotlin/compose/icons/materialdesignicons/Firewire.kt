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

public val MaterialDesignIcons.Firewire: ImageVector
    get() {
        if (_firewire != null) {
            return _firewire!!
        }
        _firewire = Builder(name = "Firewire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(13.1f, 10.0f, 14.0f, 10.9f, 14.0f, 12.0f)
                reflectiveCurveTo(13.1f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 8.0f)
                curveTo(9.8f, 8.0f, 8.0f, 9.8f, 8.0f, 12.0f)
                reflectiveCurveTo(9.8f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(16.0f, 14.2f, 16.0f, 12.0f)
                reflectiveCurveTo(14.2f, 8.0f, 12.0f, 8.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                moveTo(6.3f, 10.6f)
                lineTo(10.5f, 6.4f)
                lineTo(9.2f, 4.9f)
                lineTo(4.9f, 9.2f)
                lineTo(6.3f, 10.6f)
                moveTo(4.2f, 8.5f)
                lineTo(8.4f, 4.3f)
                lineTo(7.1f, 2.8f)
                lineTo(2.8f, 7.1f)
                lineTo(4.2f, 8.5f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                moveTo(13.4f, 6.3f)
                lineTo(17.6f, 10.5f)
                lineTo(21.1f, 7.0f)
                lineTo(16.9f, 2.8f)
                lineTo(13.4f, 6.3f)
                close()
            }
        }
        .build()
        return _firewire!!
    }

private var _firewire: ImageVector? = null
