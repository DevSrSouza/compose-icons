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

public val MaterialDesignIcons.SatelliteVariant: ImageVector
    get() {
        if (_satelliteVariant != null) {
            return _satelliteVariant!!
        }
        _satelliteVariant = Builder(name = "SatelliteVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.62f, 1.0f)
                lineTo(17.28f, 6.67f)
                lineTo(15.16f, 8.79f)
                lineTo(13.04f, 6.67f)
                lineTo(11.62f, 8.09f)
                lineTo(13.95f, 10.41f)
                lineTo(12.79f, 11.58f)
                lineTo(13.24f, 12.04f)
                curveTo(14.17f, 11.61f, 15.31f, 11.77f, 16.07f, 12.54f)
                lineTo(12.54f, 16.07f)
                curveTo(11.77f, 15.31f, 11.61f, 14.17f, 12.04f, 13.24f)
                lineTo(11.58f, 12.79f)
                lineTo(10.41f, 13.95f)
                lineTo(8.09f, 11.62f)
                lineTo(6.67f, 13.04f)
                lineTo(8.79f, 15.16f)
                lineTo(6.67f, 17.28f)
                lineTo(1.0f, 11.62f)
                lineTo(3.14f, 9.5f)
                lineTo(5.26f, 11.62f)
                lineTo(6.67f, 10.21f)
                lineTo(3.84f, 7.38f)
                curveTo(3.06f, 6.6f, 3.06f, 5.33f, 3.84f, 4.55f)
                lineTo(4.55f, 3.84f)
                curveTo(5.33f, 3.06f, 6.6f, 3.06f, 7.38f, 3.84f)
                lineTo(10.21f, 6.67f)
                lineTo(11.62f, 5.26f)
                lineTo(9.5f, 3.14f)
                lineTo(11.62f, 1.0f)
                moveTo(18.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 18.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 14.0f)
                horizontalLineTo(18.0f)
                moveTo(22.0f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 14.0f, 22.0f)
                verticalLineTo(20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 20.0f, 14.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _satelliteVariant!!
    }

private var _satelliteVariant: ImageVector? = null
