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

public val MaterialDesignIcons.GesturePinch: ImageVector
    get() {
        if (_gesturePinch != null) {
            return _gesturePinch!!
        }
        _gesturePinch = Builder(name = "GesturePinch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 9.0f)
                verticalLineTo(13.47f)
                lineTo(16.21f, 13.6f)
                lineTo(21.15f, 15.8f)
                curveTo(21.67f, 16.04f, 22.0f, 16.56f, 22.0f, 17.14f)
                verticalLineTo(21.5f)
                curveTo(21.97f, 22.32f, 21.32f, 22.97f, 20.5f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(13.62f, 23.0f, 13.26f, 22.85f, 13.0f, 22.57f)
                lineTo(8.1f, 18.37f)
                lineTo(8.84f, 17.6f)
                curveTo(9.03f, 17.39f, 9.3f, 17.28f, 9.58f, 17.28f)
                horizontalLineTo(9.8f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(9.0f)
                moveTo(14.0f, 5.0f)
                curveTo(15.42f, 5.0f, 16.74f, 5.76f, 17.45f, 7.0f)
                curveTo(18.56f, 8.9f, 17.91f, 11.35f, 16.0f, 12.46f)
                verticalLineTo(11.23f)
                curveTo(16.64f, 10.67f, 17.0f, 9.85f, 17.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 9.0f)
                curveTo(11.0f, 9.85f, 11.36f, 10.67f, 12.0f, 11.23f)
                verticalLineTo(12.46f)
                curveTo(10.77f, 11.75f, 10.0f, 10.43f, 10.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 5.0f)
                moveTo(4.0f, 9.0f)
                lineTo(7.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.0f)
                lineTo(4.0f, 9.0f)
                moveTo(4.0f, 7.0f)
                lineTo(1.0f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                lineTo(4.0f, 7.0f)
                moveTo(9.0f, 14.0f)
                curveTo(9.73f, 14.0f, 10.41f, 14.19f, 11.0f, 14.54f)
                verticalLineTo(15.76f)
                curveTo(10.47f, 15.29f, 9.77f, 15.0f, 9.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 18.0f)
                curveTo(6.0f, 19.0f, 6.5f, 19.87f, 7.22f, 20.42f)
                lineTo(9.31f, 22.0f)
                horizontalLineTo(9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _gesturePinch!!
    }

private var _gesturePinch: ImageVector? = null
