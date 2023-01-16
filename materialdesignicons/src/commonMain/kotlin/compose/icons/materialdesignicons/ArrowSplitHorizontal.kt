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

public val MaterialDesignIcons.ArrowSplitHorizontal: ImageVector
    get() {
        if (_arrowSplitHorizontal != null) {
            return _arrowSplitHorizontal!!
        }
        _arrowSplitHorizontal = Builder(name = "ArrowSplitHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                moveTo(12.0f, 2.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowSplitHorizontal!!
    }

private var _arrowSplitHorizontal: ImageVector? = null
