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

public val MaterialDesignIcons.WhiteBalanceAuto: ImageVector
    get() {
        if (_whiteBalanceAuto != null) {
            return _whiteBalanceAuto!!
        }
        _whiteBalanceAuto = Builder(name = "WhiteBalanceAuto", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3f, 16.0f)
                lineTo(9.6f, 14.0f)
                horizontalLineTo(6.4f)
                lineTo(5.7f, 16.0f)
                horizontalLineTo(3.8f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(9.0f)
                lineTo(12.2f, 16.0f)
                moveTo(22.0f, 7.0f)
                lineTo(20.8f, 13.29f)
                lineTo(19.3f, 7.0f)
                horizontalLineTo(17.7f)
                lineTo(16.21f, 13.29f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(14.24f)
                curveTo(12.77f, 5.17f, 10.5f, 4.0f, 8.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 20.0f)
                curveTo(11.13f, 20.0f, 13.84f, 18.19f, 15.15f, 15.57f)
                lineTo(15.25f, 16.0f)
                horizontalLineTo(17.0f)
                lineTo(18.5f, 9.9f)
                lineTo(20.0f, 16.0f)
                horizontalLineTo(21.75f)
                lineTo(23.8f, 7.0f)
                moveTo(6.85f, 12.65f)
                horizontalLineTo(9.15f)
                lineTo(8.0f, 9.0f)
                lineTo(6.85f, 12.65f)
                close()
            }
        }
        .build()
        return _whiteBalanceAuto!!
    }

private var _whiteBalanceAuto: ImageVector? = null
