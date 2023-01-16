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

public val MaterialDesignIcons.ScannerOff: ImageVector
    get() {
        if (_scannerOff != null) {
            return _scannerOff!!
        }
        _scannerOff = Builder(name = "ScannerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.73f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 18.0f)
                verticalLineTo(12.5f)
                curveTo(3.0f, 11.7f, 3.5f, 10.9f, 4.2f, 10.7f)
                lineTo(6.57f, 9.84f)
                lineTo(2.0f, 5.27f)
                moveTo(6.4f, 12.0f)
                horizontalLineTo(8.73f)
                lineTo(8.11f, 11.38f)
                lineTo(6.4f, 12.0f)
                moveTo(5.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15.0f)
                horizontalLineTo(5.0f)
                moveTo(19.8f, 5.0f)
                lineTo(20.5f, 6.9f)
                lineTo(11.85f, 10.03f)
                lineTo(10.3f, 8.47f)
                lineTo(19.8f, 5.0f)
                moveTo(19.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.34f, 20.91f, 18.66f, 20.76f, 18.94f)
                lineTo(19.0f, 17.18f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.82f)
                lineTo(13.82f, 12.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _scannerOff!!
    }

private var _scannerOff: ImageVector? = null
