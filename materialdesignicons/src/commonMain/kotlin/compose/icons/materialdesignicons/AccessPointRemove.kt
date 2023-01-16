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

public val MaterialDesignIcons.AccessPointRemove: ImageVector
    get() {
        if (_accessPointRemove != null) {
            return _accessPointRemove!!
        }
        _accessPointRemove = Builder(name = "AccessPointRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 10.89f, 15.55f, 9.89f, 14.83f, 9.17f)
                lineTo(16.24f, 7.76f)
                curveTo(17.33f, 8.85f, 18.0f, 10.35f, 18.0f, 12.0f)
                curveTo(17.28f, 12.0f, 16.6f, 12.13f, 15.96f, 12.36f)
                curveTo(15.97f, 12.24f, 16.0f, 12.12f, 16.0f, 12.0f)
                moveTo(6.34f, 6.34f)
                lineTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f)
                reflectiveCurveTo(3.12f, 17.26f, 4.93f, 19.07f)
                lineTo(6.34f, 17.66f)
                curveTo(4.89f, 16.22f, 4.0f, 14.22f, 4.0f, 12.0f)
                curveTo(4.0f, 9.79f, 4.89f, 7.78f, 6.34f, 6.34f)
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20.0f, 9.79f, 20.0f, 12.0f)
                curveTo(20.0f, 12.12f, 20.0f, 12.23f, 20.0f, 12.34f)
                curveTo(20.68f, 12.59f, 21.33f, 12.96f, 21.88f, 13.43f)
                curveTo(21.95f, 12.96f, 22.0f, 12.5f, 22.0f, 12.0f)
                curveTo(22.0f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(14.0f, 13.1f, 14.0f, 12.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                moveTo(7.76f, 7.76f)
                curveTo(6.67f, 8.85f, 6.0f, 10.35f, 6.0f, 12.0f)
                reflectiveCurveTo(6.67f, 15.15f, 7.76f, 16.24f)
                lineTo(9.17f, 14.83f)
                curveTo(8.45f, 14.11f, 8.0f, 13.11f, 8.0f, 12.0f)
                reflectiveCurveTo(8.45f, 9.89f, 9.17f, 9.17f)
                lineTo(7.76f, 7.76f)
                moveTo(20.12f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(15.88f, 14.47f)
                lineTo(14.47f, 15.88f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 20.12f)
                lineTo(15.88f, 21.53f)
                lineTo(18.0f, 19.41f)
                lineTo(20.12f, 21.53f)
                lineTo(21.53f, 20.12f)
                lineTo(19.41f, 18.0f)
                lineTo(21.53f, 15.88f)
                lineTo(20.12f, 14.46f)
                close()
            }
        }
        .build()
        return _accessPointRemove!!
    }

private var _accessPointRemove: ImageVector? = null
