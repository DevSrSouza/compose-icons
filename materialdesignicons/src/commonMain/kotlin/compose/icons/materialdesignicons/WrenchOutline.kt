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

public val MaterialDesignIcons.WrenchOutline: ImageVector
    get() {
        if (_wrenchOutline != null) {
            return _wrenchOutline!!
        }
        _wrenchOutline = Builder(name = "WrenchOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 19.0f)
                lineTo(13.53f, 9.91f)
                curveTo(14.46f, 7.57f, 14.0f, 4.81f, 12.09f, 2.91f)
                curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f)
                lineTo(7.5f, 6.11f)
                lineTo(6.08f, 7.5f)
                lineTo(2.25f, 3.69f)
                curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f)
                curveTo(4.76f, 13.97f, 7.47f, 14.46f, 9.79f, 13.59f)
                lineTo(18.9f, 22.7f)
                curveTo(19.29f, 23.09f, 19.92f, 23.09f, 20.31f, 22.7f)
                lineTo(22.61f, 20.4f)
                curveTo(23.0f, 20.0f, 23.0f, 19.39f, 22.61f, 19.0f)
                moveTo(19.61f, 20.59f)
                lineTo(10.15f, 11.13f)
                curveTo(9.54f, 11.58f, 8.86f, 11.85f, 8.15f, 11.95f)
                curveTo(6.79f, 12.15f, 5.36f, 11.74f, 4.32f, 10.7f)
                curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f)
                lineTo(6.09f, 10.35f)
                lineTo(10.33f, 6.11f)
                lineTo(7.24f, 3.0f)
                curveTo(8.5f, 2.95f, 9.73f, 3.39f, 10.68f, 4.33f)
                curveTo(11.76f, 5.41f, 12.17f, 6.9f, 11.92f, 8.29f)
                curveTo(11.8f, 9.0f, 11.5f, 9.66f, 11.04f, 10.25f)
                lineTo(20.5f, 19.7f)
                lineTo(19.61f, 20.59f)
                close()
            }
        }
        .build()
        return _wrenchOutline!!
    }

private var _wrenchOutline: ImageVector? = null
