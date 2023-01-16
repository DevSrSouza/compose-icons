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

public val MaterialDesignIcons.RadioactiveCircle: ImageVector
    get() {
        if (_radioactiveCircle != null) {
            return _radioactiveCircle!!
        }
        _radioactiveCircle = Builder(name = "RadioactiveCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 10.0f)
                curveTo(13.11f, 10.0f, 14.0f, 10.9f, 14.0f, 12.0f)
                reflectiveCurveTo(13.11f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.0f, 13.11f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 8.7f, 6.0f, 5.87f, 8.86f, 4.64f)
                lineTo(10.34f, 8.36f)
                curveTo(8.96f, 9.0f, 8.0f, 10.38f, 8.0f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(10.46f, 20.0f, 9.0f, 19.56f, 7.8f, 18.8f)
                lineTo(10.0f, 15.47f)
                curveTo(10.6f, 15.81f, 11.28f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(13.4f, 15.81f, 14.0f, 15.47f)
                lineTo(16.2f, 18.8f)
                curveTo(15.0f, 19.56f, 13.54f, 20.0f, 12.0f, 20.0f)
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 10.38f, 15.04f, 9.0f, 13.66f, 8.36f)
                lineTo(15.15f, 4.64f)
                curveTo(18.0f, 5.87f, 20.0f, 8.7f, 20.0f, 12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _radioactiveCircle!!
    }

private var _radioactiveCircle: ImageVector? = null
