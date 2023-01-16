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

public val MaterialDesignIcons.DanceBallroom: ImageVector
    get() {
        if (_danceBallroom != null) {
            return _danceBallroom!!
        }
        _danceBallroom = Builder(name = "DanceBallroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.5f)
                curveTo(14.0f, 4.33f, 13.33f, 5.0f, 12.5f, 5.0f)
                reflectiveCurveTo(11.0f, 4.33f, 11.0f, 3.5f)
                reflectiveCurveTo(11.67f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(14.0f, 2.67f, 14.0f, 3.5f)
                moveTo(8.5f, 5.0f)
                curveTo(7.67f, 5.0f, 7.0f, 5.67f, 7.0f, 6.5f)
                reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(10.0f, 7.33f, 10.0f, 6.5f)
                reflectiveCurveTo(9.33f, 5.0f, 8.5f, 5.0f)
                moveTo(14.0f, 12.0f)
                lineTo(13.22f, 9.75f)
                horizontalLineTo(16.18f)
                lineTo(18.34f, 8.67f)
                curveTo(18.71f, 8.5f, 18.86f, 8.04f, 18.67f, 7.67f)
                curveTo(18.5f, 7.3f, 18.04f, 7.14f, 17.67f, 7.33f)
                lineTo(16.85f, 7.74f)
                lineTo(16.36f, 6.9f)
                curveTo(16.07f, 6.25f, 15.36f, 5.88f, 14.66f, 6.04f)
                lineTo(12.19f, 6.57f)
                curveTo(11.5f, 6.72f, 11.0f, 7.35f, 11.0f, 8.07f)
                verticalLineTo(8.77f)
                lineTo(8.57f, 10.39f)
                horizontalLineTo(8.58f)
                curveTo(8.5f, 10.46f, 8.39f, 10.55f, 8.33f, 10.67f)
                lineTo(7.44f, 12.44f)
                lineTo(5.66f, 13.33f)
                curveTo(5.29f, 13.5f, 5.14f, 13.97f, 5.33f, 14.34f)
                curveTo(5.46f, 14.6f, 5.73f, 14.75f, 6.0f, 14.75f)
                curveTo(6.11f, 14.75f, 6.23f, 14.73f, 6.34f, 14.67f)
                lineTo(8.56f, 13.56f)
                lineTo(9.6f, 11.5f)
                lineTo(11.0f, 13.0f)
                curveTo(10.0f, 16.0f, 3.0f, 20.0f, 3.0f, 20.0f)
                reflectiveCurveTo(7.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(21.0f, 20.0f, 21.0f, 20.0f)
                reflectiveCurveTo(16.0f, 16.0f, 14.0f, 12.0f)
                moveTo(16.85f, 11.09f)
                lineTo(16.53f, 11.25f)
                horizontalLineTo(15.33f)
                lineTo(15.39f, 11.41f)
                curveTo(15.91f, 12.44f, 16.67f, 13.5f, 17.5f, 14.44f)
                lineTo(16.97f, 11.03f)
                lineTo(16.85f, 11.09f)
                close()
            }
        }
        .build()
        return _danceBallroom!!
    }

private var _danceBallroom: ImageVector? = null
