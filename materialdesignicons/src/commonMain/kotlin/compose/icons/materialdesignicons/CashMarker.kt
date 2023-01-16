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

public val MaterialDesignIcons.CashMarker: ImageVector
    get() {
        if (_cashMarker != null) {
            return _cashMarker!!
        }
        _cashMarker = Builder(name = "CashMarker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                curveTo(19.1f, 14.4f, 19.7f, 15.0f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.6f, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                curveTo(18.5f, 22.0f, 22.0f, 18.1f, 22.0f, 15.5f)
                curveTo(22.0f, 13.6f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(14.9f, 11.3f)
                curveTo(14.6f, 10.0f, 13.4f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3f, 9.0f, 9.0f, 10.3f, 9.0f, 12.0f)
                curveTo(9.0f, 13.7f, 10.3f, 15.0f, 12.0f, 15.0f)
                curveTo(12.4f, 15.0f, 12.7f, 14.9f, 13.0f, 14.8f)
                curveTo(13.2f, 13.4f, 13.9f, 12.2f, 14.9f, 11.3f)
                moveTo(13.0f, 16.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                curveTo(19.0f, 10.0f, 20.0f, 10.0f, 21.0f, 10.6f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                curveTo(13.3f, 17.3f, 13.1f, 16.7f, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cashMarker!!
    }

private var _cashMarker: ImageVector? = null