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

public val MaterialDesignIcons.PoliceBadgeOutline: ImageVector
    get() {
        if (_policeBadgeOutline != null) {
            return _policeBadgeOutline!!
        }
        _policeBadgeOutline = Builder(name = "PoliceBadgeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.21f)
                curveTo(13.24f, 4.72f, 14.65f, 5.0f, 16.0f, 5.0f)
                curveTo(17.05f, 5.0f, 18.1f, 4.84f, 19.08f, 4.54f)
                curveTo(18.5f, 5.5f, 18.0f, 6.71f, 18.0f, 8.0f)
                curveTo(18.0f, 9.32f, 18.54f, 10.93f, 19.1f, 12.63f)
                curveTo(19.5f, 13.83f, 20.0f, 15.33f, 20.0f, 16.0f)
                curveTo(20.0f, 17.03f, 16.47f, 19.0f, 12.0f, 19.96f)
                curveTo(7.54f, 19.0f, 4.0f, 17.03f, 4.0f, 16.0f)
                curveTo(4.0f, 15.33f, 4.5f, 13.83f, 4.9f, 12.63f)
                curveTo(5.46f, 10.93f, 6.0f, 9.32f, 6.0f, 8.0f)
                curveTo(6.0f, 6.71f, 5.5f, 5.5f, 4.92f, 4.54f)
                curveTo(5.9f, 4.84f, 6.96f, 5.0f, 8.0f, 5.0f)
                curveTo(9.35f, 5.0f, 10.76f, 4.72f, 12.0f, 4.21f)
                moveTo(20.0f, 2.0f)
                curveTo(18.85f, 2.64f, 17.4f, 3.0f, 16.0f, 3.0f)
                curveTo(14.6f, 3.0f, 13.14f, 2.63f, 12.0f, 2.0f)
                curveTo(10.86f, 2.63f, 9.4f, 3.0f, 8.0f, 3.0f)
                curveTo(6.6f, 3.0f, 5.15f, 2.64f, 4.0f, 2.0f)
                lineTo(2.0f, 4.0f)
                curveTo(2.0f, 4.0f, 4.0f, 6.0f, 4.0f, 8.0f)
                reflectiveCurveTo(2.0f, 14.0f, 2.0f, 16.0f)
                curveTo(2.0f, 20.0f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 20.0f, 22.0f, 16.0f)
                curveTo(22.0f, 14.0f, 20.0f, 10.0f, 20.0f, 8.0f)
                reflectiveCurveTo(22.0f, 4.0f, 22.0f, 4.0f)
                lineTo(20.0f, 2.0f)
                moveTo(15.05f, 16.45f)
                lineTo(11.97f, 14.59f)
                lineTo(8.9f, 16.45f)
                lineTo(9.72f, 12.95f)
                lineTo(7.0f, 10.61f)
                lineTo(10.58f, 10.3f)
                lineTo(11.97f, 7.0f)
                lineTo(13.37f, 10.29f)
                lineTo(16.95f, 10.6f)
                lineTo(14.23f, 12.94f)
                lineTo(15.05f, 16.45f)
            }
        }
        .build()
        return _policeBadgeOutline!!
    }

private var _policeBadgeOutline: ImageVector? = null
