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

public val MaterialDesignIcons.TransmissionTowerExport: ImageVector
    get() {
        if (_transmissionTowerExport != null) {
            return _transmissionTowerExport!!
        }
        _transmissionTowerExport = Builder(name = "TransmissionTowerExport", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.18f, 5.45f)
                lineTo(3.4f, 4.55f)
                lineTo(4.66f, 2.0f)
                horizontalLineTo(13.13f)
                lineTo(14.4f, 4.55f)
                lineTo(12.62f, 5.44f)
                lineTo(11.9f, 4.0f)
                horizontalLineTo(5.9f)
                lineTo(5.18f, 5.45f)
                moveTo(15.5f, 8.0f)
                horizontalLineTo(11.0f)
                lineTo(10.2f, 5.0f)
                horizontalLineTo(7.6f)
                lineTo(6.81f, 8.0f)
                horizontalLineTo(2.28f)
                lineTo(1.0f, 10.55f)
                lineTo(2.79f, 11.44f)
                lineTo(3.5f, 10.0f)
                horizontalLineTo(14.28f)
                lineTo(15.0f, 11.45f)
                lineTo(16.79f, 10.56f)
                lineTo(15.5f, 8.0f)
                moveTo(14.67f, 22.0f)
                horizontalLineTo(12.6f)
                lineTo(12.36f, 21.1f)
                lineTo(8.9f, 15.9f)
                lineTo(5.43f, 21.1f)
                lineTo(5.2f, 22.0f)
                horizontalLineTo(3.13f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(8.09f)
                lineTo(7.73f, 12.35f)
                lineTo(8.9f, 14.1f)
                lineTo(10.06f, 12.35f)
                lineTo(9.71f, 11.0f)
                horizontalLineTo(11.78f)
                lineTo(14.67f, 22.0f)
                moveTo(8.3f, 15.0f)
                lineTo(7.4f, 13.65f)
                lineTo(6.22f, 18.13f)
                lineTo(8.3f, 15.0f)
                moveTo(11.58f, 18.12f)
                lineTo(10.4f, 13.64f)
                lineTo(9.5f, 15.0f)
                lineTo(11.58f, 18.12f)
                moveTo(23.0f, 16.0f)
                lineTo(19.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                lineTo(23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _transmissionTowerExport!!
    }

private var _transmissionTowerExport: ImageVector? = null
