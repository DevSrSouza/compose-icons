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

public val MaterialDesignIcons.CoatRack: ImageVector
    get() {
        if (_coatRack != null) {
            return _coatRack!!
        }
        _coatRack = Builder(name = "CoatRack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.33f, 7.78f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.66f, 8.89f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 13.0f, 10.0f)
                verticalLineTo(7.82f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 11.0f, 7.82f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 7.34f, 8.89f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 5.67f, 7.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 13.46f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 20.0f)
                verticalLineTo(13.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.33f, 7.78f)
                moveTo(12.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _coatRack!!
    }

private var _coatRack: ImageVector? = null
