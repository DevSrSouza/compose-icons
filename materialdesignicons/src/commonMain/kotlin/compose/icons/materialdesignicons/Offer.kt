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

public val MaterialDesignIcons.Offer: ImageVector
    get() {
        if (_offer != null) {
            return _offer!!
        }
        _offer = Builder(name = "Offer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                curveTo(21.6f, 13.0f, 22.1f, 13.2f, 22.4f, 13.6f)
                curveTo(22.8f, 14.0f, 23.0f, 14.5f, 23.0f, 15.0f)
                lineTo(15.0f, 18.0f)
                lineTo(8.0f, 16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.9f)
                lineTo(17.2f, 9.7f)
                curveTo(17.7f, 9.9f, 18.0f, 10.3f, 18.0f, 10.8f)
                curveTo(18.0f, 11.1f, 17.9f, 11.4f, 17.7f, 11.6f)
                curveTo(17.5f, 11.8f, 17.2f, 12.0f, 16.8f, 12.0f)
                horizontalLineTo(14.0f)
                lineTo(12.3f, 11.3f)
                lineTo(12.0f, 12.2f)
                lineTo(14.0f, 13.0f)
                horizontalLineTo(21.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _offer!!
    }

private var _offer: ImageVector? = null
