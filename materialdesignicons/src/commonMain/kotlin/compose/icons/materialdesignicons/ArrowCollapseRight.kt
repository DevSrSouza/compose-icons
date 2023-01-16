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

public val MaterialDesignIcons.ArrowCollapseRight: ImageVector
    get() {
        if (_arrowCollapseRight != null) {
            return _arrowCollapseRight!!
        }
        _arrowCollapseRight = Builder(name = "ArrowCollapseRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.08f, 4.08f)
                lineTo(20.0f, 12.0f)
                lineTo(12.08f, 19.92f)
                lineTo(10.67f, 18.5f)
                lineTo(16.17f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.17f)
                lineTo(10.67f, 5.5f)
                lineTo(12.08f, 4.08f)
                moveTo(20.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseRight!!
    }

private var _arrowCollapseRight: ImageVector? = null
