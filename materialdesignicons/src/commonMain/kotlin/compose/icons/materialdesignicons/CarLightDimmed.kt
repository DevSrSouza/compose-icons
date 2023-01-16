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

public val MaterialDesignIcons.CarLightDimmed: ImageVector
    get() {
        if (_carLightDimmed != null) {
            return _carLightDimmed!!
        }
        _carLightDimmed = Builder(name = "CarLightDimmed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.8f)
                curveTo(9.0f, 4.8f, 9.0f, 19.2f, 13.0f, 19.2f)
                curveTo(17.0f, 19.2f, 22.0f, 16.5f, 22.0f, 12.0f)
                curveTo(22.0f, 7.5f, 17.0f, 4.8f, 13.0f, 4.8f)
                moveTo(13.1f, 17.2f)
                curveTo(12.7f, 16.8f, 12.0f, 15.0f, 12.0f, 12.0f)
                curveTo(12.0f, 9.0f, 12.7f, 7.2f, 13.1f, 6.8f)
                curveTo(16.0f, 6.9f, 20.0f, 8.7f, 20.0f, 12.0f)
                curveTo(20.0f, 15.3f, 15.9f, 17.1f, 13.1f, 17.2f)
                moveTo(8.0f, 10.5f)
                curveTo(8.0f, 11.0f, 7.9f, 11.5f, 7.9f, 12.0f)
                curveTo(7.9f, 12.2f, 7.9f, 12.4f, 7.9f, 12.6f)
                lineTo(2.4f, 14.0f)
                lineTo(1.9f, 12.1f)
                lineTo(8.0f, 10.5f)
                moveTo(2.0f, 7.0f)
                lineTo(9.4f, 5.1f)
                curveTo(9.2f, 5.4f, 9.0f, 5.8f, 8.9f, 6.3f)
                curveTo(8.8f, 6.6f, 8.7f, 7.0f, 8.6f, 7.4f)
                lineTo(2.5f, 8.9f)
                lineTo(2.0f, 7.0f)
                moveTo(8.2f, 15.5f)
                curveTo(8.3f, 16.2f, 8.5f, 16.9f, 8.7f, 17.4f)
                lineTo(2.4f, 19.0f)
                lineTo(1.9f, 17.1f)
                lineTo(8.2f, 15.5f)
                close()
            }
        }
        .build()
        return _carLightDimmed!!
    }

private var _carLightDimmed: ImageVector? = null
