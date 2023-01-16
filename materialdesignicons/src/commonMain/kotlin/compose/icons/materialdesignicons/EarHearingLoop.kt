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

public val MaterialDesignIcons.EarHearingLoop: ImageVector
    get() {
        if (_earHearingLoop != null) {
            return _earHearingLoop!!
        }
        _earHearingLoop = Builder(name = "EarHearingLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(10.62f, 6.5f, 9.5f, 7.62f, 9.5f, 9.0f)
                reflectiveCurveTo(10.62f, 11.5f, 12.0f, 11.5f)
                reflectiveCurveTo(14.5f, 10.38f, 14.5f, 9.0f)
                reflectiveCurveTo(13.38f, 6.5f, 12.0f, 6.5f)
                moveTo(16.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                moveTo(11.69f, 13.47f)
                lineTo(3.67f, 22.0f)
                lineTo(2.4f, 20.73f)
                lineTo(9.75f, 12.87f)
                curveTo(10.33f, 13.21f, 11.0f, 13.42f, 11.69f, 13.47f)
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 10.26f, 18.62f, 11.65f, 17.93f, 12.9f)
                curveTo(17.0f, 14.55f, 15.95f, 15.38f, 15.08f, 16.05f)
                curveTo(14.27f, 16.67f, 13.69f, 17.12f, 13.37f, 18.1f)
                curveTo(12.77f, 19.92f, 12.0f, 20.94f, 10.64f, 21.65f)
                curveTo(10.13f, 21.88f, 9.57f, 22.0f, 9.0f, 22.0f)
                curveTo(7.81f, 22.0f, 6.75f, 21.47f, 6.0f, 20.65f)
                lineTo(7.43f, 19.22f)
                curveTo(7.79f, 19.69f, 8.36f, 20.0f, 9.0f, 20.0f)
                curveTo(9.29f, 20.0f, 9.56f, 19.94f, 9.76f, 19.85f)
                curveTo(10.47f, 19.5f, 10.97f, 18.97f, 11.47f, 17.47f)
                curveTo(12.0f, 15.91f, 12.94f, 15.18f, 13.86f, 14.47f)
                curveTo(14.65f, 13.86f, 15.47f, 13.23f, 16.18f, 11.94f)
                curveTo(16.71f, 11.0f, 17.0f, 9.93f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2f, 14.8f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(7.0f, 6.2f, 7.0f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 5.07f, 8.07f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(19.0f, 5.07f, 19.0f, 9.0f)
                moveTo(18.37f, 4.12f)
                lineTo(20.72f, 1.73f)
                lineTo(22.0f, 3.0f)
                lineTo(19.32f, 5.72f)
                curveTo(19.06f, 5.15f, 18.74f, 4.61f, 18.37f, 4.12f)
                close()
            }
        }
        .build()
        return _earHearingLoop!!
    }

private var _earHearingLoop: ImageVector? = null
