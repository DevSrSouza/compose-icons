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

public val MaterialDesignIcons.MagnifyPlus: ImageVector
    get() {
        if (_magnifyPlus != null) {
            return _magnifyPlus!!
        }
        _magnifyPlus = Builder(name = "MagnifyPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 9.0f)
                curveTo(16.0f, 10.57f, 15.5f, 12.0f, 14.61f, 13.19f)
                lineTo(15.41f, 14.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 20.0f)
                lineTo(20.0f, 22.0f)
                lineTo(14.0f, 16.0f)
                verticalLineTo(15.41f)
                lineTo(13.19f, 14.61f)
                curveTo(12.0f, 15.5f, 10.57f, 16.0f, 9.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 2.0f)
                moveTo(8.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _magnifyPlus!!
    }

private var _magnifyPlus: ImageVector? = null
