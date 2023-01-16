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

public val MaterialDesignIcons.MovieOpenSettingsOutline: ImageVector
    get() {
        if (_movieOpenSettingsOutline != null) {
            return _movieOpenSettingsOutline!!
        }
        _movieOpenSettingsOutline = Builder(name = "MovieOpenSettingsOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.65f, 4.5f)
                lineTo(16.91f, 0.96f)
                lineTo(20.84f, 0.18f)
                lineTo(21.62f, 4.1f)
                lineTo(19.65f, 4.5f)
                moveTo(16.71f, 5.07f)
                lineTo(13.97f, 1.54f)
                lineTo(12.0f, 1.93f)
                lineTo(14.75f, 5.46f)
                lineTo(16.71f, 5.07f)
                moveTo(11.81f, 6.05f)
                lineTo(9.07f, 2.5f)
                lineTo(7.1f, 2.91f)
                lineTo(9.85f, 6.44f)
                lineTo(11.81f, 6.05f)
                moveTo(4.16f, 3.5f)
                lineTo(3.18f, 3.69f)
                curveTo(2.1f, 3.9f, 1.39f, 4.96f, 1.61f, 6.04f)
                lineTo(2.0f, 8.0f)
                lineTo(6.9f, 7.03f)
                lineTo(4.16f, 3.5f)
                moveTo(22.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.11f, 21.11f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _movieOpenSettingsOutline!!
    }

private var _movieOpenSettingsOutline: ImageVector? = null
