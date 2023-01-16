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

public val MaterialDesignIcons.ShieldSun: ImageVector
    get() {
        if (_shieldSun != null) {
            return _shieldSun!!
        }
        _shieldSun = Builder(name = "ShieldSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.55f, 6.84f, 21.74f, 12.0f, 23.0f)
                curveTo(17.16f, 21.74f, 21.0f, 16.55f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                moveTo(12.0f, 8.89f)
                curveTo(13.6f, 8.89f, 14.89f, 10.18f, 14.89f, 11.78f)
                reflectiveCurveTo(13.6f, 14.67f, 12.0f, 14.67f)
                reflectiveCurveTo(9.11f, 13.37f, 9.11f, 11.78f)
                reflectiveCurveTo(10.41f, 8.89f, 12.0f, 8.89f)
                moveTo(12.0f, 6.0f)
                lineTo(13.38f, 8.0f)
                curveTo(12.96f, 7.82f, 12.5f, 7.73f, 12.0f, 7.73f)
                reflectiveCurveTo(11.05f, 7.82f, 10.62f, 8.0f)
                lineTo(12.0f, 6.0f)
                moveTo(7.0f, 8.89f)
                lineTo(9.4f, 8.69f)
                curveTo(9.06f, 9.0f, 8.74f, 9.34f, 8.5f, 9.76f)
                curveTo(8.25f, 10.18f, 8.1f, 10.62f, 8.0f, 11.08f)
                lineTo(7.0f, 8.89f)
                moveTo(7.0f, 14.67f)
                lineTo(8.03f, 12.5f)
                curveTo(8.11f, 12.93f, 8.27f, 13.38f, 8.5f, 13.8f)
                curveTo(8.75f, 14.23f, 9.06f, 14.59f, 9.4f, 14.88f)
                lineTo(7.0f, 14.67f)
                moveTo(17.0f, 8.89f)
                lineTo(16.0f, 11.08f)
                curveTo(15.9f, 10.62f, 15.74f, 10.18f, 15.5f, 9.76f)
                curveTo(15.26f, 9.34f, 14.95f, 9.0f, 14.6f, 8.68f)
                lineTo(17.0f, 8.89f)
                moveTo(17.0f, 14.67f)
                lineTo(14.6f, 14.87f)
                curveTo(14.94f, 14.58f, 15.25f, 14.22f, 15.5f, 13.8f)
                curveTo(15.74f, 13.38f, 15.89f, 12.93f, 15.97f, 12.5f)
                lineTo(17.0f, 14.67f)
                moveTo(12.0f, 17.55f)
                lineTo(10.61f, 15.57f)
                curveTo(11.04f, 15.72f, 11.5f, 15.82f, 12.0f, 15.82f)
                curveTo(12.5f, 15.82f, 12.95f, 15.72f, 13.37f, 15.57f)
                lineTo(12.0f, 17.55f)
                close()
            }
        }
        .build()
        return _shieldSun!!
    }

private var _shieldSun: ImageVector? = null
