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

public val MaterialDesignIcons.TransmissionTowerImport: ImageVector
    get() {
        if (_transmissionTowerImport != null) {
            return _transmissionTowerImport!!
        }
        _transmissionTowerImport = Builder(name = "TransmissionTowerImport", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.39f, 5.45f)
                lineTo(9.61f, 4.55f)
                lineTo(10.87f, 2.0f)
                horizontalLineTo(19.34f)
                lineTo(20.61f, 4.55f)
                lineTo(18.83f, 5.44f)
                lineTo(18.11f, 4.0f)
                horizontalLineTo(12.11f)
                lineTo(11.39f, 5.45f)
                moveTo(21.73f, 8.0f)
                horizontalLineTo(17.2f)
                lineTo(16.41f, 5.0f)
                horizontalLineTo(13.81f)
                lineTo(13.0f, 8.0f)
                horizontalLineTo(8.5f)
                lineTo(7.21f, 10.55f)
                lineTo(9.0f, 11.44f)
                lineTo(9.73f, 10.0f)
                horizontalLineTo(20.5f)
                lineTo(21.21f, 11.45f)
                lineTo(23.0f, 10.56f)
                lineTo(21.73f, 8.0f)
                moveTo(20.88f, 22.0f)
                horizontalLineTo(18.81f)
                lineTo(18.57f, 21.1f)
                lineTo(15.11f, 15.9f)
                lineTo(11.64f, 21.1f)
                lineTo(11.41f, 22.0f)
                horizontalLineTo(9.34f)
                lineTo(12.23f, 11.0f)
                horizontalLineTo(14.3f)
                lineTo(13.94f, 12.35f)
                lineTo(15.11f, 14.1f)
                lineTo(16.27f, 12.35f)
                lineTo(15.92f, 11.0f)
                horizontalLineTo(18.0f)
                lineTo(20.88f, 22.0f)
                moveTo(14.5f, 15.0f)
                lineTo(13.61f, 13.65f)
                lineTo(12.43f, 18.13f)
                lineTo(14.5f, 15.0f)
                moveTo(17.79f, 18.12f)
                lineTo(16.61f, 13.64f)
                lineTo(15.71f, 15.0f)
                lineTo(17.79f, 18.12f)
                moveTo(9.0f, 16.0f)
                lineTo(5.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                lineTo(9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _transmissionTowerImport!!
    }

private var _transmissionTowerImport: ImageVector? = null
