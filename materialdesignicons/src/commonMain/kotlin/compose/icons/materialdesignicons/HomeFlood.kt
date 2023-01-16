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

public val MaterialDesignIcons.HomeFlood: ImageVector
    get() {
        if (_homeFlood != null) {
            return _homeFlood!!
        }
        _homeFlood = Builder(name = "HomeFlood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.67f, 19.0f)
                curveTo(16.72f, 19.0f, 16.58f, 20.0f, 15.34f, 20.0f)
                curveTo(14.15f, 20.0f, 13.92f, 19.0f, 12.0f, 19.0f)
                curveTo(10.06f, 19.0f, 9.91f, 20.0f, 8.67f, 20.0f)
                reflectiveCurveTo(7.29f, 19.0f, 5.34f, 19.0f)
                reflectiveCurveTo(3.24f, 20.0f, 2.0f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(3.95f, 22.0f, 4.11f, 21.0f, 5.34f, 21.0f)
                curveTo(6.58f, 21.0f, 6.72f, 22.0f, 8.67f, 22.0f)
                reflectiveCurveTo(10.77f, 21.0f, 12.0f, 21.0f)
                curveTo(13.23f, 21.0f, 13.41f, 22.0f, 15.34f, 22.0f)
                reflectiveCurveTo(17.44f, 21.0f, 18.67f, 21.0f)
                curveTo(19.89f, 21.0f, 20.07f, 22.0f, 22.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f)
                moveTo(8.68f, 17.5f)
                curveTo(10.63f, 17.5f, 10.77f, 16.5f, 12.0f, 16.5f)
                curveTo(13.2f, 16.5f, 13.43f, 17.5f, 15.34f, 17.5f)
                curveTo(17.29f, 17.5f, 17.43f, 16.5f, 18.67f, 16.5f)
                curveTo(19.86f, 16.5f, 20.07f, 17.5f, 22.0f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(21.35f, 15.5f, 21.0f, 15.22f, 20.5f, 14.95f)
                lineTo(18.5f, 7.42f)
                lineTo(20.57f, 8.27f)
                lineTo(21.31f, 6.41f)
                lineTo(9.78f, 2.0f)
                lineTo(2.0f, 11.61f)
                lineTo(3.57f, 12.84f)
                lineTo(4.96f, 11.06f)
                lineTo(5.89f, 14.54f)
                curveTo(5.71f, 14.5f, 5.54f, 14.5f, 5.33f, 14.5f)
                curveTo(3.38f, 14.5f, 3.24f, 15.5f, 2.0f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(3.9f, 17.5f, 4.17f, 16.5f, 5.35f, 16.5f)
                curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f)
                moveTo(14.04f, 10.18f)
                lineTo(15.46f, 15.5f)
                curveTo(14.12f, 15.58f, 14.0f, 14.5f, 12.0f, 14.5f)
                curveTo(11.63f, 14.5f, 11.34f, 14.54f, 11.08f, 14.6f)
                lineTo(10.17f, 11.21f)
                lineTo(14.04f, 10.18f)
                close()
            }
        }
        .build()
        return _homeFlood!!
    }

private var _homeFlood: ImageVector? = null
