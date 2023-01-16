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

public val MaterialDesignIcons.HeadphonesBluetooth: ImageVector
    get() {
        if (_headphonesBluetooth != null) {
            return _headphonesBluetooth!!
        }
        _headphonesBluetooth = Builder(name = "HeadphonesBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineTo(16.8f)
                curveTo(2.0f, 17.46f, 2.54f, 18.0f, 3.2f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.8f)
                arcTo(1.2f, 1.2f, 0.0f, false, false, 14.0f, 16.8f)
                verticalLineTo(12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 6.0f)
                moveTo(19.0f, 7.0f)
                verticalLineTo(10.79f)
                lineTo(16.71f, 8.5f)
                lineTo(16.0f, 9.21f)
                lineTo(18.79f, 12.0f)
                lineTo(16.0f, 14.79f)
                lineTo(16.71f, 15.5f)
                lineTo(19.0f, 13.21f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 14.14f)
                lineTo(20.21f, 12.0f)
                lineTo(22.35f, 9.85f)
                lineTo(19.5f, 7.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 8.91f)
                lineTo(20.94f, 9.85f)
                lineTo(20.0f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(20.0f, 13.21f)
                lineTo(20.94f, 14.14f)
                lineTo(20.0f, 15.08f)
                verticalLineTo(13.21f)
                close()
            }
        }
        .build()
        return _headphonesBluetooth!!
    }

private var _headphonesBluetooth: ImageVector? = null
