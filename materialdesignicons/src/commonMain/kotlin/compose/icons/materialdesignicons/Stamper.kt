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

public val MaterialDesignIcons.Stamper: ImageVector
    get() {
        if (_stamper != null) {
            return _stamper!!
        }
        _stamper = Builder(name = "Stamper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 6.0f)
                curveTo(9.0f, 9.0f, 14.0f, 13.0f, 6.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 13.0f)
                curveTo(10.0f, 13.0f, 15.0f, 9.0f, 15.0f, 6.0f)
                curveTo(15.0f, 4.0f, 13.66f, 3.0f, 12.0f, 3.0f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _stamper!!
    }

private var _stamper: ImageVector? = null
