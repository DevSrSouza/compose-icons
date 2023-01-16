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

public val MaterialDesignIcons.CashLock: ImageVector
    get() {
        if (_cashLock != null) {
            return _cashLock!!
        }
        _cashLock = Builder(name = "CashLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 15.0f)
                curveTo(22.4f, 15.0f, 23.0f, 15.6f, 23.0f, 16.3f)
                verticalLineTo(19.8f)
                curveTo(23.0f, 20.4f, 22.4f, 21.0f, 21.7f, 21.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 21.0f, 15.0f, 20.4f, 15.0f, 19.7f)
                verticalLineTo(16.2f)
                curveTo(15.0f, 15.6f, 15.6f, 15.0f, 16.2f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11.0f, 19.0f, 11.0f)
                curveTo(20.4f, 11.0f, 21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(15.0f)
                moveTo(20.5f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19.0f, 12.2f)
                curveTo(18.2f, 12.2f, 17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                moveTo(2.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.1f)
                lineTo(19.0f, 9.0f)
                curveTo(18.18f, 9.0f, 17.41f, 9.2f, 16.73f, 9.54f)
                curveTo(16.28f, 9.18f, 16.0f, 8.62f, 16.0f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 9.11f, 5.11f, 10.0f, 4.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(5.11f, 14.0f, 6.0f, 14.9f, 6.0f, 16.0f)
                horizontalLineTo(13.04f)
                lineTo(13.0f, 16.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(11.0f, 9.0f)
                curveTo(12.66f, 9.0f, 14.0f, 10.34f, 14.0f, 12.0f)
                curveTo(14.0f, 13.66f, 12.66f, 15.0f, 11.0f, 15.0f)
                curveTo(9.34f, 15.0f, 8.0f, 13.66f, 8.0f, 12.0f)
                curveTo(8.0f, 10.34f, 9.34f, 9.0f, 11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cashLock!!
    }

private var _cashLock: ImageVector? = null
