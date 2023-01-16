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

public val MaterialDesignIcons.CogStop: ImageVector
    get() {
        if (_cogStop != null) {
            return _cogStop!!
        }
        _cogStop = Builder(name = "CogStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.53f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.75f, 22.0f, 9.54f, 21.82f, 9.5f, 21.58f)
                lineTo(9.13f, 18.93f)
                curveTo(8.5f, 18.68f, 7.96f, 18.34f, 7.44f, 17.94f)
                lineTo(4.95f, 18.95f)
                curveTo(4.73f, 19.03f, 4.46f, 18.95f, 4.34f, 18.73f)
                lineTo(2.34f, 15.27f)
                curveTo(2.21f, 15.05f, 2.27f, 14.78f, 2.46f, 14.63f)
                lineTo(4.57f, 12.97f)
                curveTo(4.53f, 12.65f, 4.5f, 12.33f, 4.5f, 12.0f)
                reflectiveCurveTo(4.53f, 11.34f, 4.57f, 11.0f)
                lineTo(2.46f, 9.37f)
                curveTo(2.27f, 9.22f, 2.21f, 8.95f, 2.34f, 8.73f)
                lineTo(4.34f, 5.27f)
                curveTo(4.46f, 5.05f, 4.73f, 4.96f, 4.95f, 5.05f)
                lineTo(7.44f, 6.05f)
                curveTo(7.96f, 5.66f, 8.5f, 5.32f, 9.13f, 5.07f)
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
                curveTo(19.5f, 12.06f, 19.5f, 12.12f, 19.5f, 12.19f)
                curveTo(19.0f, 12.07f, 18.5f, 12.0f, 18.0f, 12.0f)
                curveTo(17.08f, 12.0f, 16.22f, 12.21f, 15.44f, 12.58f)
                curveTo(15.47f, 12.39f, 15.5f, 12.2f, 15.5f, 12.0f)
                curveTo(15.5f, 10.07f, 13.93f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveTo(8.5f, 10.07f, 8.5f, 12.0f)
                reflectiveCurveTo(10.07f, 15.5f, 12.0f, 15.5f)
                curveTo(12.2f, 15.5f, 12.39f, 15.47f, 12.58f, 15.44f)
                curveTo(12.21f, 16.22f, 12.0f, 17.08f, 12.0f, 18.0f)
                curveTo(12.0f, 19.54f, 12.58f, 20.94f, 13.53f, 22.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _cogStop!!
    }

private var _cogStop: ImageVector? = null
