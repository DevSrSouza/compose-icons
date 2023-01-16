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

public val MaterialDesignIcons.Publish: ImageVector
    get() {
        if (_publish != null) {
            return _publish!!
        }
        _publish = Builder(name = "Publish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                lineTo(12.0f, 7.0f)
                lineTo(5.0f, 14.0f)
                close()
            }
        }
        .build()
        return _publish!!
    }

private var _publish: ImageVector? = null
