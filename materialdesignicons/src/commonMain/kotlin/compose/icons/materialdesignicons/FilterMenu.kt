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

public val MaterialDesignIcons.FilterMenu: ImageVector
    get() {
        if (_filterMenu != null) {
            return _filterMenu!!
        }
        _filterMenu = Builder(name = "FilterMenu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                lineTo(16.76f, 3.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.59f, 2.22f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.38f, 2.22f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.21f, 3.62f)
                lineTo(7.0f, 11.0f)
                verticalLineTo(16.87f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.29f, 17.7f)
                lineTo(9.29f, 19.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.7f, 19.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.87f)
                verticalLineTo(11.0f)
                moveTo(13.0f, 16.0f)
                lineTo(18.0f, 21.0f)
                lineTo(23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _filterMenu!!
    }

private var _filterMenu: ImageVector? = null
