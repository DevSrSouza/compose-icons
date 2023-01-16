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

public val MaterialDesignIcons.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.0f, 16.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.5f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(18.5f, 6.57f, 16.43f, 5.0f, 14.5f, 5.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 14.5f)
                verticalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
