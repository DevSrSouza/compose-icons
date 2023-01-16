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

public val MaterialDesignIcons.Dns: ImageVector
    get() {
        if (_dns != null) {
            return _dns!!
        }
        _dns = Builder(name = "Dns", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.0f)
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 11.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 10.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 3.0f)
                moveTo(7.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 19.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 14.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 13.0f)
                close()
            }
        }
        .build()
        return _dns!!
    }

private var _dns: ImageVector? = null
