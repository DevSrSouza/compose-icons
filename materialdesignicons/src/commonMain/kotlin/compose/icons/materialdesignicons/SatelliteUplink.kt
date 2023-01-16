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

public val MaterialDesignIcons.SatelliteUplink: ImageVector
    get() {
        if (_satelliteUplink != null) {
            return _satelliteUplink!!
        }
        _satelliteUplink = Builder(name = "SatelliteUplink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.86f, 2.0f)
                lineTo(11.34f, 3.93f)
                curveTo(15.75f, 4.78f, 19.2f, 8.23f, 20.05f, 12.65f)
                lineTo(22.0f, 12.13f)
                curveTo(20.95f, 7.03f, 16.96f, 3.04f, 11.86f, 2.0f)
                moveTo(10.82f, 5.86f)
                lineTo(10.3f, 7.81f)
                curveTo(13.34f, 8.27f, 15.72f, 10.65f, 16.18f, 13.68f)
                lineTo(18.12f, 13.16f)
                curveTo(17.46f, 9.44f, 14.55f, 6.5f, 10.82f, 5.86f)
                moveTo(3.72f, 9.69f)
                curveTo(3.25f, 10.73f, 3.0f, 11.86f, 3.0f, 13.0f)
                curveTo(3.0f, 14.95f, 3.71f, 16.82f, 5.0f, 18.28f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.41f)
                curveTo(8.95f, 20.8f, 9.97f, 21.0f, 11.0f, 21.0f)
                curveTo(12.14f, 21.0f, 13.27f, 20.75f, 14.3f, 20.28f)
                lineTo(3.72f, 9.69f)
                moveTo(9.79f, 9.76f)
                lineTo(9.26f, 11.72f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.26f, 14.72f)
                lineTo(14.23f, 14.2f)
                curveTo(14.0f, 11.86f, 12.13f, 10.0f, 9.79f, 9.76f)
                close()
            }
        }
        .build()
        return _satelliteUplink!!
    }

private var _satelliteUplink: ImageVector? = null
