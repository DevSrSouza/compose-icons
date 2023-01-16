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

public val MaterialDesignIcons.AirplaneMinus: ImageVector
    get() {
        if (_airplaneMinus != null) {
            return _airplaneMinus!!
        }
        _airplaneMinus = Builder(name = "AirplaneMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.97f, 13.83f)
                curveTo(15.08f, 14.35f, 14.34f, 15.09f, 13.82f, 16.0f)
                lineTo(11.55f, 11.63f)
                lineTo(7.66f, 15.5f)
                lineTo(8.0f, 18.0f)
                lineTo(6.95f, 19.06f)
                lineTo(5.18f, 15.87f)
                lineTo(2.0f, 14.11f)
                lineTo(3.06f, 13.05f)
                lineTo(5.54f, 13.4f)
                lineTo(9.43f, 9.5f)
                lineTo(2.0f, 5.62f)
                lineTo(3.41f, 4.21f)
                lineTo(12.61f, 6.33f)
                lineTo(16.5f, 2.44f)
                curveTo(17.08f, 1.85f, 18.03f, 1.85f, 18.62f, 2.44f)
                curveTo(19.2f, 3.03f, 19.2f, 4.0f, 18.62f, 4.56f)
                lineTo(14.73f, 8.45f)
                lineTo(15.97f, 13.83f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _airplaneMinus!!
    }

private var _airplaneMinus: ImageVector? = null
