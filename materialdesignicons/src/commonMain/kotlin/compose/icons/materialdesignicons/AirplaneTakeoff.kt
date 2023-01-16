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

public val MaterialDesignIcons.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 19.0f)
                horizontalLineTo(21.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(19.0f)
                moveTo(22.07f, 9.64f)
                curveTo(21.86f, 8.84f, 21.03f, 8.36f, 20.23f, 8.58f)
                lineTo(14.92f, 10.0f)
                lineTo(8.0f, 3.57f)
                lineTo(6.09f, 4.08f)
                lineTo(10.23f, 11.25f)
                lineTo(5.26f, 12.58f)
                lineTo(3.29f, 11.04f)
                lineTo(1.84f, 11.43f)
                lineTo(3.66f, 14.59f)
                lineTo(4.43f, 15.92f)
                lineTo(6.03f, 15.5f)
                lineTo(11.34f, 14.07f)
                lineTo(15.69f, 12.91f)
                lineTo(21.0f, 11.5f)
                curveTo(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
