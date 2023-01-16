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

public val MaterialDesignIcons.CannabisOff: ImageVector
    get() {
        if (_cannabisOff != null) {
            return _cannabisOff!!
        }
        _cannabisOff = Builder(name = "CannabisOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.62f, 13.42f)
                lineTo(14.5f, 11.32f)
                curveTo(16.84f, 8.94f, 19.83f, 8.11f, 19.83f, 8.11f)
                curveTo(18.87f, 10.6f, 17.73f, 12.27f, 16.62f, 13.42f)
                moveTo(12.0f, 2.0f)
                curveTo(12.0f, 2.0f, 10.86f, 4.3f, 10.41f, 7.21f)
                lineTo(13.72f, 10.5f)
                curveTo(13.92f, 8.45f, 13.61f, 5.63f, 12.0f, 2.0f)
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(8.62f, 10.5f)
                curveTo(6.5f, 8.75f, 4.17f, 8.11f, 4.17f, 8.11f)
                curveTo(5.7f, 12.08f, 7.69f, 14.0f, 9.28f, 14.97f)
                curveTo(6.47f, 14.59f, 4.0f, 16.0f, 4.0f, 16.0f)
                curveTo(6.68f, 17.19f, 8.64f, 17.23f, 9.94f, 16.95f)
                curveTo(8.53f, 18.1f, 8.03f, 19.81f, 8.03f, 19.81f)
                curveTo(10.0f, 19.09f, 11.0f, 18.13f, 11.5f, 17.35f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(17.35f)
                curveTo(13.0f, 18.13f, 14.0f, 19.09f, 15.97f, 19.81f)
                curveTo(15.97f, 19.81f, 15.47f, 18.1f, 14.06f, 16.95f)
                curveTo(14.39f, 17.0f, 14.77f, 17.07f, 15.2f, 17.09f)
                lineTo(20.84f, 22.73f)
                close()
            }
        }
        .build()
        return _cannabisOff!!
    }

private var _cannabisOff: ImageVector? = null
