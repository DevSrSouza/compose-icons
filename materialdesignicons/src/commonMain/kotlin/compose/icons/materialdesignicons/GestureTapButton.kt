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

public val MaterialDesignIcons.GestureTapButton: ImageVector
    get() {
        if (_gestureTapButton != null) {
            return _gestureTapButton!!
        }
        _gestureTapButton = Builder(name = "GestureTapButton", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                curveTo(15.21f, 5.0f, 17.0f, 6.79f, 17.0f, 9.0f)
                curveTo(17.0f, 10.5f, 16.2f, 11.77f, 15.0f, 12.46f)
                verticalLineTo(11.24f)
                curveTo(15.61f, 10.69f, 16.0f, 9.89f, 16.0f, 9.0f)
                curveTo(16.0f, 7.34f, 14.66f, 6.0f, 13.0f, 6.0f)
                reflectiveCurveTo(10.0f, 7.34f, 10.0f, 9.0f)
                curveTo(10.0f, 9.89f, 10.39f, 10.69f, 11.0f, 11.24f)
                verticalLineTo(12.46f)
                curveTo(9.8f, 11.77f, 9.0f, 10.5f, 9.0f, 9.0f)
                curveTo(9.0f, 6.79f, 10.79f, 5.0f, 13.0f, 5.0f)
                moveTo(20.0f, 20.5f)
                curveTo(19.97f, 21.32f, 19.32f, 21.97f, 18.5f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.62f, 22.0f, 12.26f, 21.85f, 12.0f, 21.57f)
                lineTo(8.0f, 17.37f)
                lineTo(8.74f, 16.6f)
                curveTo(8.93f, 16.39f, 9.2f, 16.28f, 9.5f, 16.28f)
                horizontalLineTo(9.7f)
                lineTo(12.0f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 8.45f, 12.45f, 8.0f, 13.0f, 8.0f)
                reflectiveCurveTo(14.0f, 8.45f, 14.0f, 9.0f)
                verticalLineTo(13.47f)
                lineTo(15.21f, 13.6f)
                lineTo(19.15f, 15.79f)
                curveTo(19.68f, 16.03f, 20.0f, 16.56f, 20.0f, 17.14f)
                verticalLineTo(20.5f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 13.11f, 2.9f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.96f)
                lineTo(20.04f, 14.0f)
                curveTo(21.13f, 14.0f, 22.0f, 13.09f, 22.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                close()
            }
        }
        .build()
        return _gestureTapButton!!
    }

private var _gestureTapButton: ImageVector? = null
