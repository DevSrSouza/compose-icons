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

public val MaterialDesignIcons.BugCheckOutline: ImageVector
    get() {
        if (_bugCheckOutline != null) {
            return _bugCheckOutline!!
        }
        _bugCheckOutline = Builder(name = "BugCheckOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(16.19f)
                curveTo(15.74f, 6.2f, 15.12f, 5.5f, 14.37f, 5.0f)
                lineTo(16.0f, 3.41f)
                lineTo(14.59f, 2.0f)
                lineTo(12.42f, 4.17f)
                curveTo(11.96f, 4.06f, 11.5f, 4.0f, 11.0f, 4.0f)
                reflectiveCurveTo(10.05f, 4.06f, 9.59f, 4.17f)
                lineTo(7.41f, 2.0f)
                lineTo(6.0f, 3.41f)
                lineTo(7.62f, 5.0f)
                curveTo(6.87f, 5.5f, 6.26f, 6.21f, 5.81f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.09f)
                curveTo(5.03f, 9.33f, 5.0f, 9.66f, 5.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 14.34f, 5.03f, 14.67f, 5.09f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.81f)
                curveTo(7.26f, 19.5f, 10.28f, 20.61f, 13.0f, 19.65f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 18.43f, 13.09f, 17.86f, 13.25f, 17.31f)
                curveTo(12.59f, 17.76f, 11.8f, 18.0f, 11.0f, 18.0f)
                curveTo(8.79f, 18.0f, 7.0f, 16.21f, 7.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 7.79f, 8.79f, 6.0f, 11.0f, 6.0f)
                reflectiveCurveTo(15.0f, 7.79f, 15.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 14.19f, 15.0f, 14.39f, 14.95f, 14.58f)
                curveTo(15.54f, 14.04f, 16.24f, 13.62f, 17.0f, 13.35f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 9.66f, 16.97f, 9.33f, 16.91f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(21.34f, 16.0f)
                lineTo(17.75f, 19.59f)
                lineTo(16.16f, 18.0f)
                lineTo(15.0f, 19.16f)
                lineTo(17.75f, 22.16f)
                lineTo(22.5f, 17.41f)
                lineTo(21.34f, 16.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bugCheckOutline!!
    }

private var _bugCheckOutline: ImageVector? = null
