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

public val MaterialDesignIcons.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(18.95f)
                lineTo(6.95f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 16.0f)
                horizontalLineTo(5.29f)
                lineTo(7.0f, 14.29f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(11.29f)
                lineTo(17.29f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 8.0f)
                moveTo(8.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 5.0f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
