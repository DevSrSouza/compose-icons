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

public val MaterialDesignIcons.TimerMusicOutline: ImageVector
    get() {
        if (_timerMusicOutline != null) {
            return _timerMusicOutline!!
        }
        _timerMusicOutline = Builder(name = "TimerMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                moveTo(13.05f, 19.91f)
                curveTo(12.71f, 19.97f, 12.36f, 20.0f, 12.0f, 20.0f)
                curveTo(8.13f, 20.0f, 5.0f, 16.87f, 5.0f, 13.0f)
                reflectiveCurveTo(8.13f, 6.0f, 12.0f, 6.0f)
                curveTo(15.17f, 6.0f, 17.85f, 8.11f, 18.71f, 11.0f)
                horizontalLineTo(20.77f)
                curveTo(20.46f, 9.66f, 19.86f, 8.43f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20.0f, 5.46f, 19.55f, 5.0f, 19.04f, 4.56f)
                lineTo(17.62f, 6.0f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                reflectiveCurveTo(7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(12.42f, 22.0f, 12.83f, 21.96f, 13.24f, 21.91f)
                curveTo(13.09f, 21.46f, 13.0f, 21.0f, 13.0f, 20.5f)
                curveTo(13.0f, 20.3f, 13.03f, 20.11f, 13.05f, 19.91f)
                moveTo(18.5f, 13.0f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18.0f, 17.5f, 18.0f)
                curveTo(16.12f, 18.0f, 15.0f, 19.12f, 15.0f, 20.5f)
                reflectiveCurveTo(16.12f, 23.0f, 17.5f, 23.0f)
                reflectiveCurveTo(20.0f, 21.88f, 20.0f, 20.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _timerMusicOutline!!
    }

private var _timerMusicOutline: ImageVector? = null
