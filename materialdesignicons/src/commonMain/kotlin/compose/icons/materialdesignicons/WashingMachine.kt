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

public val MaterialDesignIcons.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) {
            return _washingMachine!!
        }
        _washingMachine = Builder(name = "WashingMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.83f, 11.17f)
                curveTo(16.39f, 12.73f, 16.39f, 15.27f, 14.83f, 16.83f)
                curveTo(13.27f, 18.39f, 10.73f, 18.39f, 9.17f, 16.83f)
                lineTo(14.83f, 11.17f)
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 4.0f)
                moveTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 4.0f)
                moveTo(12.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
