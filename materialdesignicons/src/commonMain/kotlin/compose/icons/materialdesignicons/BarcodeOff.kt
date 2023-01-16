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

public val MaterialDesignIcons.BarcodeOff: ImageVector
    get() {
        if (_barcodeOff != null) {
            return _barcodeOff!!
        }
        _barcodeOff = Builder(name = "BarcodeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(16.0f, 17.89f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.89f)
                lineTo(12.0f, 13.89f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.89f)
                lineTo(10.0f, 11.89f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.89f)
                lineTo(6.0f, 7.89f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(7.0f, 6.34f)
                lineTo(10.0f, 9.34f)
                lineTo(11.0f, 10.34f)
                lineTo(12.0f, 11.34f)
                lineTo(14.0f, 13.35f)
                verticalLineTo(13.34f)
                lineTo(16.0f, 15.34f)
                verticalLineTo(15.35f)
                lineTo(17.0f, 16.35f)
                verticalLineTo(16.34f)
                lineTo(18.66f, 18.0f)
                horizontalLineTo(18.65f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(16.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.8f)
                lineTo(16.0f, 12.8f)
                verticalLineTo(6.0f)
                moveTo(12.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.8f)
                lineTo(12.0f, 8.8f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(6.0f)
                moveTo(22.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.8f)
                lineTo(21.2f, 18.0f)
                horizontalLineTo(22.0f)
                moveTo(10.0f, 6.0f)
                horizontalLineTo(9.2f)
                lineTo(10.0f, 6.8f)
                verticalLineTo(6.0f)
                moveTo(2.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _barcodeOff!!
    }

private var _barcodeOff: ImageVector? = null
