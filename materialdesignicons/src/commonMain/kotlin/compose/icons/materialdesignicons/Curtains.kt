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

public val MaterialDesignIcons.Curtains: ImageVector
    get() {
        if (_curtains != null) {
            return _curtains!!
        }
        _curtains = Builder(name = "Curtains", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(3.0f)
                moveTo(2.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 19.0f, 4.0f, 17.0f, 4.0f, 17.0f)
                curveTo(10.0f, 13.0f, 11.0f, 4.0f, 11.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 4.0f, 14.0f, 13.0f, 20.0f, 17.0f)
                curveTo(20.0f, 17.0f, 18.0f, 19.0f, 18.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _curtains!!
    }

private var _curtains: ImageVector? = null
