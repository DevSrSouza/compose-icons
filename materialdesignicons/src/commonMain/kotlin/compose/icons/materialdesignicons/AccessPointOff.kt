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

public val MaterialDesignIcons.AccessPointOff: ImageVector
    get() {
        if (_accessPointOff != null) {
            return _accessPointOff!!
        }
        _accessPointOff = Builder(name = "AccessPointOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(12.1f, 14.0f)
                curveTo(12.06f, 14.0f, 12.03f, 14.0f, 12.0f, 14.0f)
                curveTo(10.9f, 14.0f, 10.0f, 13.11f, 10.0f, 12.0f)
                curveTo(10.0f, 11.97f, 10.0f, 11.94f, 10.0f, 11.9f)
                lineTo(8.4f, 10.29f)
                curveTo(8.15f, 10.81f, 8.0f, 11.38f, 8.0f, 12.0f)
                curveTo(8.0f, 13.11f, 8.45f, 14.11f, 9.17f, 14.83f)
                lineTo(7.76f, 16.24f)
                curveTo(6.67f, 15.15f, 6.0f, 13.65f, 6.0f, 12.0f)
                curveTo(6.0f, 10.83f, 6.34f, 9.74f, 6.93f, 8.82f)
                lineTo(5.5f, 7.37f)
                curveTo(4.55f, 8.67f, 4.0f, 10.27f, 4.0f, 12.0f)
                curveTo(4.0f, 14.22f, 4.89f, 16.22f, 6.34f, 17.66f)
                lineTo(4.93f, 19.07f)
                curveTo(3.12f, 17.26f, 2.0f, 14.76f, 2.0f, 12.0f)
                curveTo(2.0f, 9.72f, 2.77f, 7.63f, 4.06f, 5.95f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15.93f, 12.73f)
                lineTo(17.53f, 14.33f)
                curveTo(17.83f, 13.61f, 18.0f, 12.83f, 18.0f, 12.0f)
                curveTo(18.0f, 10.35f, 17.33f, 8.85f, 16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.89f, 16.0f, 10.89f, 16.0f, 12.0f)
                curveTo(16.0f, 12.25f, 15.97f, 12.5f, 15.93f, 12.73f)
                moveTo(19.03f, 15.83f)
                lineTo(20.5f, 17.28f)
                curveTo(21.44f, 15.75f, 22.0f, 13.94f, 22.0f, 12.0f)
                curveTo(22.0f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20.0f, 9.79f, 20.0f, 12.0f)
                curveTo(20.0f, 13.39f, 19.65f, 14.7f, 19.03f, 15.83f)
                close()
            }
        }
        .build()
        return _accessPointOff!!
    }

private var _accessPointOff: ImageVector? = null
