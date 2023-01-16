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

public val MaterialDesignIcons.Penguin: ImageVector
    get() {
        if (_penguin != null) {
            return _penguin!!
        }
        _penguin = Builder(name = "Penguin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                curveTo(19.0f, 17.72f, 18.37f, 19.3f, 17.34f, 20.5f)
                curveTo(17.75f, 20.89f, 18.0f, 21.41f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 21.41f, 6.25f, 20.89f, 6.66f, 20.5f)
                curveTo(5.63f, 19.3f, 5.0f, 17.72f, 5.0f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 14.75f, 3.57f, 13.64f, 4.46f, 12.91f)
                lineTo(4.47f, 12.89f)
                curveTo(6.0f, 11.81f, 7.0f, 10.0f, 7.0f, 8.0f)
                verticalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 10.0f, 18.0f, 11.81f, 19.53f, 12.89f)
                lineTo(19.54f, 12.91f)
                curveTo(20.43f, 13.64f, 21.0f, 14.75f, 21.0f, 16.0f)
                horizontalLineTo(19.0f)
                moveTo(16.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 16.0f)
                moveTo(10.0f, 9.0f)
                lineTo(12.0f, 10.5f)
                lineTo(14.0f, 9.0f)
                lineTo(12.0f, 7.5f)
                lineTo(10.0f, 9.0f)
                moveTo(10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 5.0f)
                moveTo(14.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _penguin!!
    }

private var _penguin: ImageVector? = null
