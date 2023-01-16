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

public val MaterialDesignIcons.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = Builder(name = "Record", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 15.86f, 15.86f, 19.0f, 12.0f, 19.0f)
                curveTo(8.14f, 19.0f, 5.0f, 15.86f, 5.0f, 12.0f)
                curveTo(5.0f, 8.14f, 8.14f, 5.0f, 12.0f, 5.0f)
                curveTo(15.86f, 5.0f, 19.0f, 8.14f, 19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _record!!
    }

private var _record: ImageVector? = null
