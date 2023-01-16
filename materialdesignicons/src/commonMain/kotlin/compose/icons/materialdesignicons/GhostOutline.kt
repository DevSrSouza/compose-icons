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

public val MaterialDesignIcons.GhostOutline: ImageVector
    get() {
        if (_ghostOutline != null) {
            return _ghostOutline!!
        }
        _ghostOutline = Builder(name = "GhostOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.03f, 2.0f, 3.0f, 6.03f, 3.0f, 11.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 19.0f)
                lineTo(9.0f, 22.0f)
                lineTo(12.0f, 19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(18.0f, 19.0f)
                lineTo(21.0f, 22.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 6.03f, 16.97f, 2.0f, 12.0f, 2.0f)
                moveTo(19.0f, 17.17f)
                lineTo(18.0f, 16.17f)
                lineTo(16.59f, 17.59f)
                lineTo(15.0f, 19.17f)
                lineTo(13.41f, 17.59f)
                lineTo(12.0f, 16.17f)
                lineTo(10.59f, 17.59f)
                lineTo(9.0f, 19.17f)
                lineTo(7.41f, 17.59f)
                lineTo(6.0f, 16.17f)
                lineTo(5.0f, 17.17f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.14f, 8.14f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(19.0f, 7.14f, 19.0f, 11.0f)
                verticalLineTo(17.17f)
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 11.11f, 10.11f, 12.0f, 9.0f, 12.0f)
                reflectiveCurveTo(7.0f, 11.11f, 7.0f, 10.0f)
                reflectiveCurveTo(7.9f, 8.0f, 9.0f, 8.0f)
                reflectiveCurveTo(11.0f, 8.9f, 11.0f, 10.0f)
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 11.11f, 16.11f, 12.0f, 15.0f, 12.0f)
                reflectiveCurveTo(13.0f, 11.11f, 13.0f, 10.0f)
                reflectiveCurveTo(13.9f, 8.0f, 15.0f, 8.0f)
                reflectiveCurveTo(17.0f, 8.9f, 17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _ghostOutline!!
    }

private var _ghostOutline: ImageVector? = null
