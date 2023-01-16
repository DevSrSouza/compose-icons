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

public val MaterialDesignIcons.TransmissionTowerOff: ImageVector
    get() {
        if (_transmissionTowerOff != null) {
            return _transmissionTowerOff!!
        }
        _transmissionTowerOff = Builder(name = "TransmissionTowerOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(6.1f, 8.0f)
                horizontalLineTo(5.4f)
                lineTo(4.1f, 10.5f)
                lineTo(5.9f, 11.4f)
                lineTo(6.6f, 10.0f)
                horizontalLineTo(8.1f)
                lineTo(9.1f, 11.0f)
                lineTo(6.2f, 22.0f)
                horizontalLineTo(8.3f)
                lineTo(8.5f, 21.1f)
                lineTo(12.0f, 15.9f)
                lineTo(15.5f, 21.1f)
                lineTo(15.7f, 22.0f)
                horizontalLineTo(17.8f)
                lineTo(17.0f, 18.8f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(9.3f, 18.1f)
                lineTo(10.5f, 13.6f)
                lineTo(11.4f, 14.9f)
                lineTo(9.3f, 18.1f)
                moveTo(14.7f, 18.1f)
                lineTo(12.6f, 15.0f)
                lineTo(12.8f, 14.7f)
                lineTo(14.1f, 16.0f)
                lineTo(14.7f, 18.1f)
                moveTo(14.2f, 11.0f)
                horizontalLineTo(14.9f)
                lineTo(15.1f, 11.9f)
                lineTo(14.2f, 11.0f)
                moveTo(14.1f, 8.0f)
                horizontalLineTo(18.6f)
                lineTo(19.9f, 10.6f)
                lineTo(18.1f, 11.5f)
                lineTo(17.4f, 10.0f)
                horizontalLineTo(13.2f)
                lineTo(10.2f, 7.0f)
                lineTo(10.7f, 5.0f)
                horizontalLineTo(13.3f)
                lineTo(14.1f, 8.0f)
                moveTo(8.4f, 5.2f)
                lineTo(6.9f, 3.7f)
                lineTo(7.8f, 2.0f)
                horizontalLineTo(16.3f)
                lineTo(17.6f, 4.5f)
                lineTo(15.8f, 5.4f)
                lineTo(15.0f, 4.0f)
                horizontalLineTo(9.0f)
                lineTo(8.4f, 5.2f)
                close()
            }
        }
        .build()
        return _transmissionTowerOff!!
    }

private var _transmissionTowerOff: ImageVector? = null
