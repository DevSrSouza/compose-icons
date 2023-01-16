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

public val MaterialDesignIcons.GestureTapBox: ImageVector
    get() {
        if (_gestureTapBox != null) {
            return _gestureTapBox!!
        }
        _gestureTapBox = Builder(name = "GestureTapBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(11.0f, 4.0f)
                curveTo(13.21f, 4.0f, 15.0f, 5.79f, 15.0f, 8.0f)
                curveTo(15.0f, 9.5f, 14.2f, 10.77f, 13.0f, 11.46f)
                verticalLineTo(10.24f)
                curveTo(13.61f, 9.69f, 14.0f, 8.89f, 14.0f, 8.0f)
                curveTo(14.0f, 6.34f, 12.66f, 5.0f, 11.0f, 5.0f)
                reflectiveCurveTo(8.0f, 6.34f, 8.0f, 8.0f)
                curveTo(8.0f, 8.89f, 8.39f, 9.69f, 9.0f, 10.24f)
                verticalLineTo(11.46f)
                curveTo(7.8f, 10.77f, 7.0f, 9.5f, 7.0f, 8.0f)
                curveTo(7.0f, 5.79f, 8.79f, 4.0f, 11.0f, 4.0f)
                moveTo(18.0f, 18.5f)
                curveTo(17.97f, 19.32f, 17.32f, 19.97f, 16.5f, 20.0f)
                horizontalLineTo(11.0f)
                curveTo(10.62f, 20.0f, 10.26f, 19.85f, 10.0f, 19.57f)
                lineTo(6.0f, 15.37f)
                lineTo(6.74f, 14.6f)
                curveTo(6.93f, 14.39f, 7.2f, 14.28f, 7.5f, 14.28f)
                horizontalLineTo(7.7f)
                lineTo(10.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(10.0f, 7.45f, 10.45f, 7.0f, 11.0f, 7.0f)
                reflectiveCurveTo(12.0f, 7.45f, 12.0f, 8.0f)
                verticalLineTo(12.47f)
                lineTo(13.21f, 12.6f)
                lineTo(17.15f, 14.79f)
                curveTo(17.68f, 15.03f, 18.0f, 15.56f, 18.0f, 16.14f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _gestureTapBox!!
    }

private var _gestureTapBox: ImageVector? = null
