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

public val MaterialDesignIcons.ToyBrickSearch: ImageVector
    get() {
        if (_toyBrickSearch != null) {
            return _toyBrickSearch!!
        }
        _toyBrickSearch = Builder(name = "ToyBrickSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.81f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 10.81f)
                verticalLineTo(6.0f)
                moveTo(20.31f, 17.9f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 18.88f, 19.32f)
                lineTo(22.0f, 22.39f)
                lineTo(23.39f, 21.0f)
                moveTo(16.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _toyBrickSearch!!
    }

private var _toyBrickSearch: ImageVector? = null
