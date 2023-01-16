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

public val MaterialDesignIcons.PowerSocketFr: ImageVector
    get() {
        if (_powerSocketFr != null) {
            return _powerSocketFr!!
        }
        _powerSocketFr = Builder(name = "PowerSocketFr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.22f, 2.0f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 2.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 4.22f, 22.0f)
                horizontalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 22.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.78f, 2.0f)
                horizontalLineTo(4.22f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(7.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 12.0f)
                curveTo(6.0f, 12.83f, 6.66f, 13.5f, 7.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 10.5f)
                moveTo(16.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 10.5f)
                close()
            }
        }
        .build()
        return _powerSocketFr!!
    }

private var _powerSocketFr: ImageVector? = null
