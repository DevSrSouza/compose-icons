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

public val MaterialDesignIcons.Reminder: ImageVector
    get() {
        if (_reminder != null) {
            return _reminder!!
        }
        _reminder = Builder(name = "Reminder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 3.0f)
                curveTo(7.9f, 3.0f, 8.5f, 3.21f, 9.0f, 3.56f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 3.0f)
                verticalLineTo(3.57f)
                curveTo(13.5f, 3.22f, 14.1f, 3.0f, 14.75f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.75f, 6.0f)
                curveTo(17.75f, 7.58f, 16.54f, 8.87f, 15.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.24f)
                lineTo(14.72f, 10.13f)
                lineTo(19.31f, 12.42f)
                curveTo(20.13f, 12.73f, 20.53f, 13.34f, 20.53f, 14.25f)
                lineTo(20.5f, 14.39f)
                verticalLineTo(14.53f)
                lineTo(19.5f, 21.28f)
                curveTo(19.44f, 21.75f, 19.22f, 22.16f, 18.84f, 22.5f)
                curveTo(18.47f, 22.84f, 18.05f, 23.0f, 17.58f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 23.0f, 9.0f, 22.81f, 8.58f, 22.41f)
                lineTo(2.0f, 15.84f)
                lineTo(3.05f, 14.77f)
                curveTo(3.33f, 14.5f, 3.69f, 14.34f, 4.13f, 14.34f)
                horizontalLineTo(4.45f)
                lineTo(9.0f, 15.33f)
                verticalLineTo(10.0f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                curveTo(5.46f, 8.86f, 4.25f, 7.57f, 4.25f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.25f, 3.0f)
                moveTo(9.0f, 6.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 7.25f, 4.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.5f, 6.0f)
                curveTo(5.5f, 6.88f, 6.15f, 7.61f, 7.0f, 7.73f)
                verticalLineTo(7.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 7.75f)
                verticalLineTo(7.74f)
                curveTo(15.85f, 7.62f, 16.5f, 6.89f, 16.5f, 6.0f)
                curveTo(16.5f, 5.04f, 15.72f, 4.26f, 14.75f, 4.26f)
                curveTo(13.78f, 4.26f, 13.0f, 5.04f, 13.0f, 6.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _reminder!!
    }

private var _reminder: ImageVector? = null
