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

public val MaterialDesignIcons.ElectricSwitchClosed: ImageVector
    get() {
        if (_electricSwitchClosed != null) {
            return _electricSwitchClosed!!
        }
        _electricSwitchClosed = Builder(name = "ElectricSwitchClosed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.83f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.18f, 11.0f)
                horizontalLineTo(8.82f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.17f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.17f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.82f, 13.0f)
                horizontalLineTo(15.18f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.83f, 13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                moveTo(6.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 7.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 13.0f)
                moveTo(18.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 19.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 13.0f)
                close()
            }
        }
        .build()
        return _electricSwitchClosed!!
    }

private var _electricSwitchClosed: ImageVector? = null
