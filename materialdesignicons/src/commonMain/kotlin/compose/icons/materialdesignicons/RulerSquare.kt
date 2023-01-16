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

public val MaterialDesignIcons.RulerSquare: ImageVector
    get() {
        if (_rulerSquare != null) {
            return _rulerSquare!!
        }
        _rulerSquare = Builder(name = "RulerSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                moveTo(6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                close()
            }
        }
        .build()
        return _rulerSquare!!
    }

private var _rulerSquare: ImageVector? = null
