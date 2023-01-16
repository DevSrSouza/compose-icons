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

public val MaterialDesignIcons.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 11.0f, 2.0f, 11.89f, 2.0f, 13.0f)
                verticalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 17.0f)
                horizontalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 17.0f)
                verticalLineTo(13.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineTo(6.0f)
                moveTo(17.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                moveTo(7.5f, 5.5f)
                horizontalLineTo(11.2f)
                lineTo(14.5f, 13.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.5f)
                moveTo(5.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 15.5f)
                moveTo(13.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 15.5f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
