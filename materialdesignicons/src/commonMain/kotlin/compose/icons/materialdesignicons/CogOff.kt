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

public val MaterialDesignIcons.CogOff: ImageVector
    get() {
        if (_cogOff != null) {
            return _cogOff!!
        }
        _cogOff = Builder(name = "CogOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.12f, 21.46f)
                lineTo(2.4f, 1.73f)
                lineTo(1.12f, 3.0f)
                lineTo(4.0f, 5.87f)
                lineTo(2.34f, 8.73f)
                curveTo(2.21f, 8.95f, 2.27f, 9.22f, 2.46f, 9.37f)
                lineTo(4.57f, 11.0f)
                curveTo(4.53f, 11.34f, 4.5f, 11.67f, 4.5f, 12.0f)
                reflectiveCurveTo(4.53f, 12.65f, 4.57f, 12.97f)
                lineTo(2.46f, 14.63f)
                curveTo(2.27f, 14.78f, 2.21f, 15.05f, 2.34f, 15.27f)
                lineTo(4.34f, 18.73f)
                curveTo(4.46f, 18.95f, 4.73f, 19.03f, 4.95f, 18.95f)
                lineTo(7.44f, 17.94f)
                curveTo(7.96f, 18.34f, 8.5f, 18.68f, 9.13f, 18.93f)
                lineTo(9.5f, 21.58f)
                curveTo(9.54f, 21.82f, 9.75f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(14.25f, 22.0f, 14.46f, 21.82f, 14.5f, 21.58f)
                lineTo(14.87f, 18.93f)
                curveTo(15.38f, 18.72f, 15.83f, 18.45f, 16.26f, 18.14f)
                lineTo(20.85f, 22.73f)
                lineTo(22.12f, 21.46f)
                moveTo(12.0f, 15.5f)
                curveTo(10.07f, 15.5f, 8.5f, 13.93f, 8.5f, 12.0f)
                curveTo(8.5f, 11.5f, 8.62f, 11.08f, 8.79f, 10.67f)
                lineTo(13.33f, 15.21f)
                curveTo(12.92f, 15.39f, 12.5f, 15.5f, 12.0f, 15.5f)
                moveTo(11.74f, 8.53f)
                lineTo(8.56f, 5.35f)
                curveTo(8.75f, 5.25f, 8.93f, 5.15f, 9.13f, 5.07f)
                lineTo(9.5f, 2.42f)
                curveTo(9.54f, 2.18f, 9.75f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.25f, 2.0f, 14.46f, 2.18f, 14.5f, 2.42f)
                lineTo(14.87f, 5.07f)
                curveTo(15.5f, 5.32f, 16.04f, 5.66f, 16.56f, 6.05f)
                lineTo(19.05f, 5.05f)
                curveTo(19.27f, 4.96f, 19.54f, 5.05f, 19.66f, 5.27f)
                lineTo(21.66f, 8.73f)
                curveTo(21.78f, 8.95f, 21.73f, 9.22f, 21.54f, 9.37f)
                lineTo(19.43f, 11.0f)
                curveTo(19.47f, 11.34f, 19.5f, 11.67f, 19.5f, 12.0f)
                reflectiveCurveTo(19.47f, 12.65f, 19.43f, 12.97f)
                lineTo(21.54f, 14.63f)
                curveTo(21.73f, 14.78f, 21.78f, 15.05f, 21.66f, 15.27f)
                lineTo(20.5f, 17.29f)
                lineTo(15.47f, 12.26f)
                curveTo(15.5f, 12.18f, 15.5f, 12.09f, 15.5f, 12.0f)
                curveTo(15.5f, 10.07f, 13.93f, 8.5f, 12.0f, 8.5f)
                curveTo(11.91f, 8.5f, 11.83f, 8.5f, 11.74f, 8.53f)
                close()
            }
        }
        .build()
        return _cogOff!!
    }

private var _cogOff: ImageVector? = null
