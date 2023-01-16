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

public val MaterialDesignIcons.Skype: ImageVector
    get() {
        if (_skype != null) {
            return _skype!!
        }
        _skype = Builder(name = "Skype", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveTo(20.07f, 8.04f, 20.85f, 10.89f, 20.36f, 13.55f)
                curveTo(20.77f, 14.27f, 21.0f, 15.11f, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 21.0f)
                curveTo(15.11f, 21.0f, 14.27f, 20.77f, 13.55f, 20.36f)
                curveTo(10.89f, 20.85f, 8.04f, 20.07f, 6.0f, 18.0f)
                curveTo(3.93f, 15.96f, 3.15f, 13.11f, 3.64f, 10.45f)
                curveTo(3.23f, 9.73f, 3.0f, 8.89f, 3.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 3.0f)
                curveTo(8.89f, 3.0f, 9.73f, 3.23f, 10.45f, 3.64f)
                curveTo(13.11f, 3.15f, 15.96f, 3.93f, 18.0f, 6.0f)
                moveTo(12.04f, 17.16f)
                curveTo(14.91f, 17.16f, 16.34f, 15.78f, 16.34f, 13.92f)
                curveTo(16.34f, 12.73f, 15.78f, 11.46f, 13.61f, 10.97f)
                lineTo(11.62f, 10.53f)
                curveTo(10.86f, 10.36f, 10.0f, 10.13f, 10.0f, 9.42f)
                curveTo(10.0f, 8.7f, 10.6f, 8.2f, 11.7f, 8.2f)
                curveTo(13.93f, 8.2f, 13.72f, 9.73f, 14.83f, 9.73f)
                curveTo(15.41f, 9.73f, 15.91f, 9.39f, 15.91f, 8.8f)
                curveTo(15.91f, 7.43f, 13.72f, 6.4f, 11.86f, 6.4f)
                curveTo(9.85f, 6.4f, 7.7f, 7.26f, 7.7f, 9.54f)
                curveTo(7.7f, 10.64f, 8.09f, 11.81f, 10.25f, 12.35f)
                lineTo(12.94f, 13.03f)
                curveTo(13.75f, 13.23f, 13.95f, 13.68f, 13.95f, 14.1f)
                curveTo(13.95f, 14.78f, 13.27f, 15.45f, 12.04f, 15.45f)
                curveTo(9.63f, 15.45f, 9.96f, 13.6f, 8.67f, 13.6f)
                curveTo(8.09f, 13.6f, 7.67f, 14.0f, 7.67f, 14.57f)
                curveTo(7.67f, 15.68f, 9.0f, 17.16f, 12.04f, 17.16f)
                close()
            }
        }
        .build()
        return _skype!!
    }

private var _skype: ImageVector? = null
