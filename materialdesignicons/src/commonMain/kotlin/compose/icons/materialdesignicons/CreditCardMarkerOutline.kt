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

public val MaterialDesignIcons.CreditCardMarkerOutline: ImageVector
    get() {
        if (_creditCardMarkerOutline != null) {
            return _creditCardMarkerOutline!!
        }
        _creditCardMarkerOutline = Builder(name = "CreditCardMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.3f)
                curveTo(15.3f, 10.8f, 16.8f, 10.0f, 18.5f, 10.0f)
                curveTo(19.8f, 10.0f, 21.0f, 10.5f, 22.0f, 11.3f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(14.6f)
                curveTo(14.2f, 19.4f, 13.8f, 18.7f, 13.5f, 18.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.6f, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                curveTo(18.5f, 22.0f, 22.0f, 18.1f, 22.0f, 15.5f)
                curveTo(22.0f, 13.6f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                curveTo(19.1f, 14.4f, 19.7f, 15.0f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                close()
            }
        }
        .build()
        return _creditCardMarkerOutline!!
    }

private var _creditCardMarkerOutline: ImageVector? = null
