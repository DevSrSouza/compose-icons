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

public val MaterialDesignIcons.AccountClockOutline: ImageVector
    get() {
        if (_accountClockOutline != null) {
            return _accountClockOutline!!
        }
        _accountClockOutline = Builder(name = "AccountClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16.0f, 17.69f)
                verticalLineTo(14.0f)
                moveTo(17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 12.0f)
                moveTo(17.0f, 10.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 24.0f, 17.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 17.0f, 24.0f)
                curveTo(14.21f, 24.0f, 11.8f, 22.36f, 10.67f, 20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 14.34f, 6.33f, 13.0f, 9.0f, 13.0f)
                curveTo(9.6f, 13.0f, 10.34f, 13.07f, 11.12f, 13.2f)
                curveTo(12.36f, 11.28f, 14.53f, 10.0f, 17.0f, 10.0f)
                moveTo(10.0f, 17.0f)
                curveTo(10.0f, 16.3f, 10.1f, 15.62f, 10.29f, 15.0f)
                curveTo(9.87f, 14.93f, 9.43f, 14.9f, 9.0f, 14.9f)
                curveTo(6.03f, 14.9f, 2.9f, 16.36f, 2.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(10.09f)
                curveTo(10.03f, 17.74f, 10.0f, 17.37f, 10.0f, 17.0f)
                moveTo(9.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 4.0f)
                moveTo(9.0f, 5.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 6.9f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 9.0f, 10.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 11.1f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 9.0f, 5.9f)
                close()
            }
        }
        .build()
        return _accountClockOutline!!
    }

private var _accountClockOutline: ImageVector? = null
