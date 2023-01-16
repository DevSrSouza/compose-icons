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

public val MaterialDesignIcons.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineTo(10.67f, 8.09f)
                curveTo(9.81f, 7.07f, 7.4f, 4.5f, 5.0f, 4.5f)
                curveTo(5.0f, 4.5f, 3.03f, 7.46f, 4.96f, 11.41f)
                curveTo(4.41f, 12.24f, 4.07f, 12.67f, 4.0f, 13.66f)
                lineTo(2.07f, 13.95f)
                lineTo(2.28f, 14.93f)
                lineTo(4.04f, 14.67f)
                lineTo(4.18f, 15.38f)
                lineTo(2.61f, 16.32f)
                lineTo(3.08f, 17.21f)
                lineTo(4.53f, 16.32f)
                curveTo(5.68f, 18.76f, 8.59f, 20.0f, 12.0f, 20.0f)
                curveTo(15.41f, 20.0f, 18.32f, 18.76f, 19.47f, 16.32f)
                lineTo(20.92f, 17.21f)
                lineTo(21.39f, 16.32f)
                lineTo(19.82f, 15.38f)
                lineTo(19.96f, 14.67f)
                lineTo(21.72f, 14.93f)
                lineTo(21.93f, 13.95f)
                lineTo(20.0f, 13.66f)
                curveTo(19.93f, 12.67f, 19.59f, 12.24f, 19.04f, 11.41f)
                curveTo(20.97f, 7.46f, 19.0f, 4.5f, 19.0f, 4.5f)
                curveTo(16.6f, 4.5f, 14.19f, 7.07f, 13.33f, 8.09f)
                lineTo(12.0f, 8.0f)
                moveTo(9.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 11.0f)
                moveTo(15.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 11.0f)
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                lineTo(12.3f, 15.39f)
                curveTo(12.5f, 16.03f, 13.06f, 16.5f, 13.75f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.25f, 15.0f)
                horizontalLineTo(15.75f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.75f, 17.0f)
                curveTo(13.0f, 17.0f, 12.35f, 16.59f, 12.0f, 16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                curveTo(11.65f, 16.59f, 11.0f, 17.0f, 10.25f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.25f, 15.0f)
                horizontalLineTo(8.75f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.25f, 16.5f)
                curveTo(10.94f, 16.5f, 11.5f, 16.03f, 11.7f, 15.39f)
                lineTo(11.0f, 14.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
