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

public val MaterialDesignIcons.ShapePlus: ImageVector
    get() {
        if (_shapePlus != null) {
            return _shapePlus!!
        }
        _shapePlus = Builder(name = "ShapePlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                moveTo(17.5f, 2.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 6.5f)
                curveTo(22.0f, 9.0f, 20.0f, 11.0f, 17.5f, 11.0f)
                curveTo(15.0f, 11.0f, 13.0f, 9.0f, 13.0f, 6.5f)
                curveTo(13.0f, 4.0f, 15.0f, 2.0f, 17.5f, 2.0f)
                moveTo(6.5f, 14.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineTo(2.0f)
                lineTo(6.5f, 14.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _shapePlus!!
    }

private var _shapePlus: ImageVector? = null
