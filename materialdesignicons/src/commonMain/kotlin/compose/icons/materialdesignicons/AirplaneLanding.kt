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

public val MaterialDesignIcons.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 19.0f)
                horizontalLineTo(21.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(19.0f)
                moveTo(9.68f, 13.27f)
                lineTo(14.03f, 14.43f)
                lineTo(19.34f, 15.85f)
                curveTo(20.14f, 16.06f, 20.96f, 15.59f, 21.18f, 14.79f)
                curveTo(21.39f, 14.0f, 20.92f, 13.17f, 20.12f, 12.95f)
                lineTo(14.81f, 11.53f)
                lineTo(12.05f, 2.5f)
                lineTo(10.12f, 2.0f)
                verticalLineTo(10.28f)
                lineTo(5.15f, 8.95f)
                lineTo(4.22f, 6.63f)
                lineTo(2.77f, 6.24f)
                verticalLineTo(11.41f)
                lineTo(4.37f, 11.84f)
                lineTo(9.68f, 13.27f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
