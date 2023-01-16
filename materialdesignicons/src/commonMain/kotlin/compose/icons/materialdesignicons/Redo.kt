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

public val MaterialDesignIcons.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4f, 10.6f)
                curveTo(16.55f, 9.0f, 14.15f, 8.0f, 11.5f, 8.0f)
                curveTo(6.85f, 8.0f, 2.92f, 11.03f, 1.54f, 15.22f)
                lineTo(3.9f, 16.0f)
                curveTo(4.95f, 12.81f, 7.95f, 10.5f, 11.5f, 10.5f)
                curveTo(13.45f, 10.5f, 15.23f, 11.22f, 16.62f, 12.38f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                lineTo(18.4f, 10.6f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
