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

public val MaterialDesignIcons.Atm: ImageVector
    get() {
        if (_atm != null) {
            return _atm!!
        }
        _atm = Builder(name = "Atm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 9.0f)
                moveTo(5.5f, 12.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.0f)
                moveTo(21.0f, 9.0f)
                horizontalLineTo(16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.5f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _atm!!
    }

private var _atm: ImageVector? = null
