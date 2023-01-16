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

public val MaterialDesignIcons.AirplaneEdit: ImageVector
    get() {
        if (_airplaneEdit != null) {
            return _airplaneEdit!!
        }
        _airplaneEdit = Builder(name = "AirplaneEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.55f, 11.63f)
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
                lineTo(16.03f, 14.1f)
                lineTo(13.94f, 16.19f)
                lineTo(11.55f, 11.63f)
                moveTo(13.0f, 19.96f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13.0f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21.0f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14.0f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }
        .build()
        return _airplaneEdit!!
    }

private var _airplaneEdit: ImageVector? = null
