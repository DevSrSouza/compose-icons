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

public val MaterialDesignIcons.CandyOffOutline: ImageVector
    get() {
        if (_candyOffOutline != null) {
            return _candyOffOutline!!
        }
        _candyOffOutline = Builder(name = "CandyOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(7.7f, 9.6f)
                curveTo(6.6f, 11.5f, 6.9f, 14.0f, 8.5f, 15.6f)
                reflectiveCurveTo(12.6f, 17.5f, 14.5f, 16.4f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(9.9f, 14.1f)
                curveTo(9.1f, 13.3f, 8.8f, 12.1f, 9.2f, 11.0f)
                lineTo(13.0f, 14.8f)
                curveTo(11.9f, 15.2f, 10.7f, 15.0f, 9.9f, 14.1f)
                moveTo(14.8f, 6.3f)
                curveTo(14.5f, 5.2f, 14.6f, 3.6f, 15.9f, 2.4f)
                curveTo(16.8f, 3.3f, 17.3f, 4.3f, 17.4f, 5.3f)
                curveTo(18.5f, 4.6f, 19.4f, 4.5f, 19.4f, 4.5f)
                curveTo(19.3f, 5.3f, 19.0f, 6.0f, 18.6f, 6.5f)
                curveTo(19.6f, 6.7f, 20.7f, 7.2f, 21.5f, 8.0f)
                curveTo(20.3f, 9.2f, 18.7f, 9.4f, 17.6f, 9.1f)
                curveTo(17.3f, 7.8f, 16.2f, 6.7f, 14.8f, 6.3f)
                moveTo(12.2f, 9.0f)
                lineTo(10.4f, 7.2f)
                curveTo(12.1f, 6.6f, 14.1f, 7.0f, 15.5f, 8.4f)
                curveTo(16.9f, 9.8f, 17.3f, 11.7f, 16.7f, 13.5f)
                lineTo(15.0f, 11.8f)
                curveTo(14.9f, 11.1f, 14.7f, 10.4f, 14.1f, 9.9f)
                reflectiveCurveTo(12.9f, 9.1f, 12.2f, 9.0f)
                moveTo(9.2f, 17.7f)
                curveTo(9.5f, 18.8f, 9.4f, 20.4f, 8.1f, 21.6f)
                curveTo(7.2f, 20.7f, 6.7f, 19.7f, 6.6f, 18.7f)
                curveTo(5.5f, 19.4f, 4.6f, 19.5f, 4.6f, 19.5f)
                curveTo(4.7f, 18.7f, 5.0f, 18.0f, 5.4f, 17.5f)
                curveTo(4.4f, 17.3f, 3.3f, 16.8f, 2.5f, 16.0f)
                curveTo(3.7f, 14.8f, 5.3f, 14.6f, 6.4f, 14.9f)
                curveTo(6.7f, 16.2f, 7.8f, 17.3f, 9.2f, 17.7f)
                close()
            }
        }
        .build()
        return _candyOffOutline!!
    }

private var _candyOffOutline: ImageVector? = null
