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

public val MaterialDesignIcons.Karate: ImageVector
    get() {
        if (_karate != null) {
            return _karate!!
        }
        _karate = Builder(name = "Karate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 2.0f)
                lineTo(11.6f, 8.7f)
                lineTo(10.39f, 7.66f)
                lineTo(14.0f, 5.58f)
                lineTo(9.41f, 1.0f)
                lineTo(8.0f, 2.41f)
                lineTo(10.74f, 5.15f)
                lineTo(5.0f, 8.46f)
                lineTo(3.81f, 12.75f)
                lineTo(6.27f, 17.0f)
                lineTo(8.0f, 16.0f)
                lineTo(5.97f, 12.5f)
                lineTo(6.32f, 11.18f)
                lineTo(9.5f, 13.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineTo(12.0f)
                lineTo(12.5f, 12.0f)
                lineTo(21.0f, 3.4f)
                lineTo(19.8f, 2.0f)
                moveTo(5.0f, 3.0f)
                curveTo(6.11f, 3.0f, 7.0f, 3.9f, 7.0f, 5.0f)
                reflectiveCurveTo(6.11f, 7.0f, 5.0f, 7.0f)
                reflectiveCurveTo(3.0f, 6.11f, 3.0f, 5.0f)
                reflectiveCurveTo(3.9f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _karate!!
    }

private var _karate: ImageVector? = null
