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

public val MaterialDesignIcons.TabRemove: ImageVector
    get() {
        if (_tabRemove != null) {
            return _tabRemove!!
        }
        _tabRemove = Builder(name = "TabRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.46f, 11.88f)
                lineTo(8.88f, 10.46f)
                lineTo(11.0f, 12.59f)
                lineTo(13.12f, 10.46f)
                lineTo(14.54f, 11.88f)
                lineTo(12.41f, 14.0f)
                lineTo(14.54f, 16.12f)
                lineTo(13.12f, 17.54f)
                lineTo(11.0f, 15.41f)
                lineTo(8.88f, 17.54f)
                lineTo(7.46f, 16.12f)
                lineTo(9.59f, 14.0f)
                lineTo(7.46f, 11.88f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 3.0f)
                moveTo(3.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _tabRemove!!
    }

private var _tabRemove: ImageVector? = null
