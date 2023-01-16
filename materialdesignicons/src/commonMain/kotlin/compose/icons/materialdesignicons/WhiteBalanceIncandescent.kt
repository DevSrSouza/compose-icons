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

public val MaterialDesignIcons.WhiteBalanceIncandescent: ImageVector
    get() {
        if (_whiteBalanceIncandescent != null) {
            return _whiteBalanceIncandescent!!
        }
        _whiteBalanceIncandescent = Builder(name = "WhiteBalanceIncandescent", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.24f, 18.15f)
                lineTo(19.04f, 19.95f)
                lineTo(20.45f, 18.53f)
                lineTo(18.66f, 16.74f)
                moveTo(20.0f, 12.5f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.0f)
                moveTo(15.0f, 6.31f)
                verticalLineTo(1.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.31f)
                curveTo(7.21f, 7.35f, 6.0f, 9.28f, 6.0f, 11.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 17.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 11.5f)
                curveTo(18.0f, 9.28f, 16.79f, 7.35f, 15.0f, 6.31f)
                moveTo(4.0f, 10.5f)
                horizontalLineTo(1.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(4.0f)
                moveTo(11.0f, 22.45f)
                curveTo(11.32f, 22.45f, 13.0f, 22.45f, 13.0f, 22.45f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.0f)
                moveTo(3.55f, 18.53f)
                lineTo(4.96f, 19.95f)
                lineTo(6.76f, 18.15f)
                lineTo(5.34f, 16.74f)
                lineTo(3.55f, 18.53f)
                close()
            }
        }
        .build()
        return _whiteBalanceIncandescent!!
    }

private var _whiteBalanceIncandescent: ImageVector? = null
