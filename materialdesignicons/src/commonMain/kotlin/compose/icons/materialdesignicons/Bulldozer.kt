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

public val MaterialDesignIcons.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) {
            return _bulldozer!!
        }
        _bulldozer = Builder(name = "Bulldozer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(10.0f)
                curveTo(2.54f, 10.0f, 2.14f, 10.31f, 2.03f, 10.76f)
                verticalLineTo(13.97f)
                horizontalLineTo(2.29f)
                curveTo(2.65f, 13.37f, 3.3f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(13.7f, 13.0f, 14.35f, 13.37f, 14.71f, 13.97f)
                horizontalLineTo(16.03f)
                lineTo(16.0f, 11.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(5.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                lineTo(7.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                moveTo(17.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                lineTo(19.0f, 17.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(17.0f)
                moveTo(4.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 15.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
