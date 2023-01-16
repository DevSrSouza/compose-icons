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

public val MaterialDesignIcons.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 8.0f)
                curveTo(9.85f, 8.0f, 7.45f, 9.0f, 5.6f, 10.6f)
                lineTo(2.0f, 7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                lineTo(7.38f, 12.38f)
                curveTo(8.77f, 11.22f, 10.54f, 10.5f, 12.5f, 10.5f)
                curveTo(16.04f, 10.5f, 19.05f, 12.81f, 20.1f, 16.0f)
                lineTo(22.47f, 15.22f)
                curveTo(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
