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

public val MaterialDesignIcons.Dice6: ImageVector
    get() {
        if (_dice6 != null) {
            return _dice6!!
        }
        _dice6 = Builder(name = "Dice6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                moveTo(7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 5.0f)
                moveTo(17.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 15.0f)
                moveTo(17.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 10.0f)
                moveTo(17.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 5.0f)
                moveTo(7.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 10.0f)
                moveTo(7.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 15.0f)
                close()
            }
        }
        .build()
        return _dice6!!
    }

private var _dice6: ImageVector? = null
