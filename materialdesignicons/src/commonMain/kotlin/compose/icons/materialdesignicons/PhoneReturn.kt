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

public val MaterialDesignIcons.PhoneReturn: ImageVector
    get() {
        if (_phoneReturn != null) {
            return _phoneReturn!!
        }
        _phoneReturn = Builder(name = "PhoneReturn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(13.87f)
                lineTo(16.3f, 9.93f)
                lineTo(15.24f, 11.0f)
                lineTo(11.0f, 6.75f)
                lineTo(15.24f, 2.5f)
                lineTo(16.3f, 3.57f)
                lineTo(13.87f, 6.0f)
                horizontalLineTo(21.0f)
                moveTo(8.82f, 8.58f)
                curveTo(9.08f, 8.32f, 9.17f, 7.93f, 9.06f, 7.58f)
                curveTo(8.69f, 6.42f, 8.5f, 5.22f, 8.5f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 15.5f)
                curveTo(18.79f, 15.5f, 17.58f, 15.31f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.91f, 15.43f, 15.17f)
                lineTo(13.23f, 17.37f)
                curveTo(10.39f, 15.92f, 8.09f, 13.62f, 6.64f, 10.78f)
                lineTo(8.82f, 8.58f)
                close()
            }
        }
        .build()
        return _phoneReturn!!
    }

private var _phoneReturn: ImageVector? = null
