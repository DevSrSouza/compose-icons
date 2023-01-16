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

public val MaterialDesignIcons.UmbrellaBeachOutline: ImageVector
    get() {
        if (_umbrellaBeachOutline != null) {
            return _umbrellaBeachOutline!!
        }
        _umbrellaBeachOutline = Builder(name = "UmbrellaBeachOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.57f)
                lineTo(19.57f, 21.0f)
                lineTo(13.13f, 14.56f)
                lineTo(14.56f, 13.13f)
                lineTo(21.0f, 19.57f)
                moveTo(13.12f, 3.0f)
                curveTo(10.54f, 3.0f, 7.96f, 4.0f, 6.0f, 5.95f)
                lineTo(5.97f, 5.96f)
                curveTo(2.0f, 9.91f, 2.0f, 16.32f, 5.97f, 20.27f)
                lineTo(20.27f, 5.96f)
                curveTo(18.3f, 4.0f, 15.71f, 3.0f, 13.12f, 3.0f)
                moveTo(6.14f, 17.27f)
                curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f)
                curveTo(5.0f, 12.19f, 5.16f, 11.3f, 5.46f, 10.45f)
                curveTo(5.65f, 12.36f, 6.35f, 14.24f, 7.53f, 15.89f)
                lineTo(6.14f, 17.27f)
                moveTo(9.0f, 14.43f)
                curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f)
                curveTo(8.18f, 7.5f, 8.76f, 7.42f, 9.35f, 7.42f)
                curveTo(11.15f, 7.42f, 12.9f, 7.97f, 14.43f, 9.0f)
                lineTo(9.0f, 14.43f)
                moveTo(10.45f, 5.46f)
                curveTo(11.3f, 5.16f, 12.19f, 5.0f, 13.12f, 5.0f)
                curveTo(14.61f, 5.0f, 16.03f, 5.4f, 17.27f, 6.14f)
                lineTo(15.88f, 7.53f)
                curveTo(14.23f, 6.35f, 12.36f, 5.65f, 10.45f, 5.46f)
                close()
            }
        }
        .build()
        return _umbrellaBeachOutline!!
    }

private var _umbrellaBeachOutline: ImageVector? = null
