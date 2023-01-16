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

public val MaterialDesignIcons.CursorDefaultClickOutline: ImageVector
    get() {
        if (_cursorDefaultClickOutline != null) {
            return _cursorDefaultClickOutline!!
        }
        _cursorDefaultClickOutline = Builder(name = "CursorDefaultClickOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 11.0f)
                lineTo(17.88f, 16.37f)
                lineTo(17.0f, 16.55f)
                lineTo(16.36f, 16.67f)
                curveTo(15.73f, 16.8f, 15.37f, 17.5f, 15.65f, 18.07f)
                lineTo(15.92f, 18.65f)
                lineTo(17.28f, 21.59f)
                lineTo(15.86f, 22.25f)
                lineTo(14.5f, 19.32f)
                lineTo(14.24f, 18.74f)
                curveTo(13.97f, 18.15f, 13.22f, 17.97f, 12.72f, 18.38f)
                lineTo(12.21f, 18.78f)
                lineTo(11.5f, 19.35f)
                verticalLineTo(11.0f)
                moveTo(10.76f, 8.69f)
                arcTo(0.76f, 0.76f, 0.0f, false, false, 10.0f, 9.45f)
                verticalLineTo(20.9f)
                curveTo(10.0f, 21.32f, 10.34f, 21.66f, 10.76f, 21.66f)
                curveTo(10.95f, 21.66f, 11.11f, 21.6f, 11.24f, 21.5f)
                lineTo(13.15f, 19.95f)
                lineTo(14.81f, 23.57f)
                curveTo(14.94f, 23.84f, 15.21f, 24.0f, 15.5f, 24.0f)
                curveTo(15.61f, 24.0f, 15.72f, 24.0f, 15.83f, 23.92f)
                lineTo(18.59f, 22.64f)
                curveTo(18.97f, 22.46f, 19.15f, 22.0f, 18.95f, 21.63f)
                lineTo(17.28f, 18.0f)
                lineTo(19.69f, 17.55f)
                curveTo(19.85f, 17.5f, 20.0f, 17.43f, 20.12f, 17.29f)
                curveTo(20.39f, 16.97f, 20.35f, 16.5f, 20.0f, 16.21f)
                lineTo(11.26f, 8.86f)
                lineTo(11.25f, 8.87f)
                curveTo(11.12f, 8.76f, 10.95f, 8.69f, 10.76f, 8.69f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                moveTo(13.83f, 4.76f)
                lineTo(16.66f, 1.93f)
                lineTo(18.07f, 3.34f)
                lineTo(15.24f, 6.17f)
                lineTo(13.83f, 4.76f)
                moveTo(10.0f, 0.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(0.0f)
                moveTo(3.93f, 14.66f)
                lineTo(6.76f, 11.83f)
                lineTo(8.17f, 13.24f)
                lineTo(5.34f, 16.07f)
                lineTo(3.93f, 14.66f)
                moveTo(3.93f, 3.34f)
                lineTo(5.34f, 1.93f)
                lineTo(8.17f, 4.76f)
                lineTo(6.76f, 6.17f)
                lineTo(3.93f, 3.34f)
                moveTo(7.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
            }
        }
        .build()
        return _cursorDefaultClickOutline!!
    }

private var _cursorDefaultClickOutline: ImageVector? = null
