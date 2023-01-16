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

public val MaterialDesignIcons.ShieldAirplane: ImageVector
    get() {
        if (_shieldAirplane != null) {
            return _shieldAirplane!!
        }
        _shieldAirplane = Builder(name = "ShieldAirplane", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 5.68f)
                curveTo(12.5f, 5.68f, 12.95f, 6.11f, 12.95f, 6.63f)
                verticalLineTo(10.11f)
                lineTo(18.0f, 13.26f)
                verticalLineTo(14.53f)
                lineTo(12.95f, 12.95f)
                verticalLineTo(16.42f)
                lineTo(14.21f, 17.37f)
                verticalLineTo(18.32f)
                lineTo(12.0f, 17.68f)
                lineTo(9.79f, 18.32f)
                verticalLineTo(17.37f)
                lineTo(11.05f, 16.42f)
                verticalLineTo(12.95f)
                lineTo(6.0f, 14.53f)
                verticalLineTo(13.26f)
                lineTo(11.05f, 10.11f)
                verticalLineTo(6.63f)
                curveTo(11.05f, 6.11f, 11.5f, 5.68f, 12.0f, 5.68f)
                close()
            }
        }
        .build()
        return _shieldAirplane!!
    }

private var _shieldAirplane: ImageVector? = null
