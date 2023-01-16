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

public val MaterialDesignIcons.HomeAssistant: ImageVector
    get() {
        if (_homeAssistant != null) {
            return _homeAssistant!!
        }
        _homeAssistant = Builder(name = "HomeAssistant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.67f)
                lineTo(15.79f, 14.88f)
                lineTo(16.5f, 15.0f)
                curveTo(17.66f, 15.0f, 18.6f, 14.06f, 18.6f, 12.9f)
                curveTo(18.6f, 11.74f, 17.66f, 10.8f, 16.5f, 10.8f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 14.4f, 12.9f)
                lineTo(14.5f, 13.61f)
                lineTo(13.0f, 15.13f)
                verticalLineTo(9.65f)
                curveTo(13.66f, 9.29f, 14.1f, 8.6f, 14.1f, 7.8f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 12.0f, 5.7f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 9.9f, 7.8f)
                curveTo(9.9f, 8.6f, 10.34f, 9.29f, 11.0f, 9.65f)
                verticalLineTo(15.13f)
                lineTo(9.5f, 13.61f)
                lineTo(9.6f, 12.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 7.5f, 10.8f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 5.4f, 12.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 7.5f, 15.0f)
                lineTo(8.21f, 14.88f)
                lineTo(11.0f, 17.67f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.25f)
                curveTo(1.83f, 13.0f, 1.42f, 13.0f, 1.42f, 12.79f)
                curveTo(1.43f, 12.57f, 1.85f, 12.15f, 2.28f, 11.72f)
                lineTo(11.0f, 3.0f)
                curveTo(11.33f, 2.67f, 11.67f, 2.33f, 12.0f, 2.33f)
                curveTo(12.33f, 2.33f, 12.67f, 2.67f, 13.0f, 3.0f)
                lineTo(17.0f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                lineTo(21.78f, 11.78f)
                curveTo(22.18f, 12.18f, 22.59f, 12.59f, 22.6f, 12.8f)
                curveTo(22.6f, 13.0f, 22.2f, 13.0f, 21.8f, 13.0f)
                moveTo(7.5f, 12.0f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 8.4f, 12.9f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 7.5f, 13.8f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 6.6f, 12.9f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 7.5f, 12.0f)
                moveTo(16.5f, 12.0f)
                curveTo(17.0f, 12.0f, 17.4f, 12.4f, 17.4f, 12.9f)
                curveTo(17.4f, 13.4f, 17.0f, 13.8f, 16.5f, 13.8f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 15.6f, 12.9f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 16.5f, 12.0f)
                moveTo(12.0f, 6.9f)
                curveTo(12.5f, 6.9f, 12.9f, 7.3f, 12.9f, 7.8f)
                curveTo(12.9f, 8.3f, 12.5f, 8.7f, 12.0f, 8.7f)
                curveTo(11.5f, 8.7f, 11.1f, 8.3f, 11.1f, 7.8f)
                curveTo(11.1f, 7.3f, 11.5f, 6.9f, 12.0f, 6.9f)
                close()
            }
        }
        .build()
        return _homeAssistant!!
    }

private var _homeAssistant: ImageVector? = null
