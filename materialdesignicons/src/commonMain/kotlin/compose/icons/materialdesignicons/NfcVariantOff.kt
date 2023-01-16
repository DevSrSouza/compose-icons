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

public val MaterialDesignIcons.NfcVariantOff: ImageVector
    get() {
        if (_nfcVariantOff != null) {
            return _nfcVariantOff!!
        }
        _nfcVariantOff = Builder(name = "NfcVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.25f, 2.05f)
                lineTo(21.95f, 22.75f)
                lineTo(20.7f, 24.0f)
                lineTo(18.7f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(5.3f)
                lineTo(0.0f, 3.3f)
                lineTo(1.25f, 2.05f)
                moveTo(3.81f, 2.0f)
                curveTo(3.87f, 2.0f, 3.94f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.89f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.06f, 22.0f, 20.13f, 22.0f, 20.19f)
                lineTo(20.0f, 18.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.8f)
                lineTo(3.81f, 2.0f)
                moveTo(6.0f, 9.3f)
                lineTo(4.0f, 7.3f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.7f)
                lineTo(14.7f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.3f)
                moveTo(18.0f, 16.2f)
                lineTo(16.0f, 14.2f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.28f)
                curveTo(13.6f, 10.62f, 14.0f, 11.26f, 14.0f, 12.0f)
                curveTo(14.0f, 12.06f, 14.0f, 12.13f, 14.0f, 12.19f)
                lineTo(11.0f, 9.2f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.2f)
                moveTo(8.0f, 16.0f)
                horizontalLineTo(12.7f)
                lineTo(8.0f, 11.3f)
                verticalLineTo(16.0f)
                moveTo(10.0f, 8.0f)
                horizontalLineTo(9.8f)
                lineTo(7.8f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _nfcVariantOff!!
    }

private var _nfcVariantOff: ImageVector? = null
