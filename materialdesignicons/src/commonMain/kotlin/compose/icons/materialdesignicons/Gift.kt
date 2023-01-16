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

public val MaterialDesignIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.06f, 1.93f)
                curveTo(7.17f, 1.92f, 5.33f, 3.74f, 6.17f, 6.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 8.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 10.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 6.0f)
                horizontalLineTo(17.83f)
                curveTo(19.0f, 2.73f, 14.6f, 0.42f, 12.57f, 3.24f)
                lineTo(12.0f, 4.0f)
                lineTo(11.43f, 3.22f)
                curveTo(10.8f, 2.33f, 9.93f, 1.94f, 9.06f, 1.93f)
                moveTo(9.0f, 4.0f)
                curveTo(9.89f, 4.0f, 10.34f, 5.08f, 9.71f, 5.71f)
                curveTo(9.08f, 6.34f, 8.0f, 5.89f, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 4.0f)
                moveTo(15.0f, 4.0f)
                curveTo(15.89f, 4.0f, 16.34f, 5.08f, 15.71f, 5.71f)
                curveTo(15.08f, 6.34f, 14.0f, 5.89f, 14.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 4.0f)
                moveTo(2.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
