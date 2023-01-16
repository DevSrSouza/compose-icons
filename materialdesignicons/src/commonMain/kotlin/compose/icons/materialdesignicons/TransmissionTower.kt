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

public val MaterialDesignIcons.TransmissionTower: ImageVector
    get() {
        if (_transmissionTower != null) {
            return _transmissionTower!!
        }
        _transmissionTower = Builder(name = "TransmissionTower", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.28f, 5.45f)
                lineTo(6.5f, 4.55f)
                lineTo(7.76f, 2.0f)
                horizontalLineTo(16.23f)
                lineTo(17.5f, 4.55f)
                lineTo(15.72f, 5.44f)
                lineTo(15.0f, 4.0f)
                horizontalLineTo(9.0f)
                lineTo(8.28f, 5.45f)
                moveTo(18.62f, 8.0f)
                horizontalLineTo(14.09f)
                lineTo(13.3f, 5.0f)
                horizontalLineTo(10.7f)
                lineTo(9.91f, 8.0f)
                horizontalLineTo(5.38f)
                lineTo(4.1f, 10.55f)
                lineTo(5.89f, 11.44f)
                lineTo(6.62f, 10.0f)
                horizontalLineTo(17.38f)
                lineTo(18.1f, 11.45f)
                lineTo(19.89f, 10.56f)
                lineTo(18.62f, 8.0f)
                moveTo(17.77f, 22.0f)
                horizontalLineTo(15.7f)
                lineTo(15.46f, 21.1f)
                lineTo(12.0f, 15.9f)
                lineTo(8.53f, 21.1f)
                lineTo(8.3f, 22.0f)
                horizontalLineTo(6.23f)
                lineTo(9.12f, 11.0f)
                horizontalLineTo(11.19f)
                lineTo(10.83f, 12.35f)
                lineTo(12.0f, 14.1f)
                lineTo(13.16f, 12.35f)
                lineTo(12.81f, 11.0f)
                horizontalLineTo(14.88f)
                lineTo(17.77f, 22.0f)
                moveTo(11.4f, 15.0f)
                lineTo(10.5f, 13.65f)
                lineTo(9.32f, 18.13f)
                lineTo(11.4f, 15.0f)
                moveTo(14.68f, 18.12f)
                lineTo(13.5f, 13.64f)
                lineTo(12.6f, 15.0f)
                lineTo(14.68f, 18.12f)
                close()
            }
        }
        .build()
        return _transmissionTower!!
    }

private var _transmissionTower: ImageVector? = null
