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

public val MaterialDesignIcons.LayersSearchOutline: ImageVector
    get() {
        if (_layersSearchOutline != null) {
            return _layersSearchOutline!!
        }
        _layersSearchOutline = Builder(name = "LayersSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 18.9f)
                curveTo(19.75f, 18.21f, 20.0f, 17.38f, 20.0f, 16.5f)
                curveTo(20.0f, 14.0f, 18.0f, 12.0f, 15.5f, 12.0f)
                reflectiveCurveTo(11.0f, 14.0f, 11.0f, 16.5f)
                reflectiveCurveTo(13.0f, 21.0f, 15.5f, 21.0f)
                curveTo(16.37f, 21.0f, 17.19f, 20.75f, 17.88f, 20.32f)
                lineTo(21.0f, 23.39f)
                lineTo(22.39f, 22.0f)
                lineTo(19.31f, 18.9f)
                moveTo(15.5f, 19.0f)
                curveTo(14.12f, 19.0f, 13.0f, 17.88f, 13.0f, 16.5f)
                reflectiveCurveTo(14.12f, 14.0f, 15.5f, 14.0f)
                reflectiveCurveTo(18.0f, 15.12f, 18.0f, 16.5f)
                reflectiveCurveTo(16.88f, 19.0f, 15.5f, 19.0f)
                moveTo(9.59f, 19.2f)
                lineTo(3.0f, 14.07f)
                lineTo(4.62f, 12.81f)
                lineTo(9.0f, 16.22f)
                curveTo(9.0f, 16.32f, 9.0f, 16.41f, 9.0f, 16.5f)
                curveTo(9.0f, 17.46f, 9.22f, 18.38f, 9.59f, 19.2f)
                moveTo(9.5f, 14.04f)
                lineTo(3.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(21.0f, 9.0f)
                lineTo(18.66f, 10.82f)
                curveTo(17.96f, 10.44f, 17.19f, 10.18f, 16.37f, 10.07f)
                lineTo(17.74f, 9.0f)
                lineTo(12.0f, 4.53f)
                lineTo(6.26f, 9.0f)
                lineTo(10.53f, 12.32f)
                curveTo(10.1f, 12.84f, 9.74f, 13.42f, 9.5f, 14.04f)
                close()
            }
        }
        .build()
        return _layersSearchOutline!!
    }

private var _layersSearchOutline: ImageVector? = null
