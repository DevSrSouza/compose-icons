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

public val MaterialDesignIcons.ArrowCollapseUp: ImageVector
    get() {
        if (_arrowCollapseUp != null) {
            return _arrowCollapseUp!!
        }
        _arrowCollapseUp = Builder(name = "ArrowCollapseUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.08f, 11.92f)
                lineTo(12.0f, 4.0f)
                lineTo(19.92f, 11.92f)
                lineTo(18.5f, 13.33f)
                lineTo(13.0f, 7.83f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.83f)
                lineTo(5.5f, 13.33f)
                lineTo(4.08f, 11.92f)
                moveTo(12.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseUp!!
    }

private var _arrowCollapseUp: ImageVector? = null
