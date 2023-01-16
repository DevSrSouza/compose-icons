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

public val MaterialDesignIcons.Dice2: ImageVector
    get() {
        if (_dice2 != null) {
            return _dice2!!
        }
        _dice2 = Builder(name = "Dice2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                close()
            }
        }
        .build()
        return _dice2!!
    }

private var _dice2: ImageVector? = null
