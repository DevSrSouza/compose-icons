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

public val MaterialDesignIcons.ArrowCollapseDown: ImageVector
    get() {
        if (_arrowCollapseDown != null) {
            return _arrowCollapseDown!!
        }
        _arrowCollapseDown = Builder(name = "ArrowCollapseDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.92f, 12.08f)
                lineTo(12.0f, 20.0f)
                lineTo(4.08f, 12.08f)
                lineTo(5.5f, 10.67f)
                lineTo(11.0f, 16.17f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.17f)
                lineTo(18.5f, 10.66f)
                lineTo(19.92f, 12.08f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseDown!!
    }

private var _arrowCollapseDown: ImageVector? = null
