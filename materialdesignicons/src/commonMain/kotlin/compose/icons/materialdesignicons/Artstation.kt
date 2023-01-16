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

public val MaterialDesignIcons.Artstation: ImageVector
    get() {
        if (_artstation != null) {
            return _artstation!!
        }
        _artstation = Builder(name = "Artstation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.77f, 16.88f)
                lineTo(3.5f, 19.86f)
                curveTo(3.84f, 20.54f, 4.54f, 21.0f, 5.33f, 21.0f)
                horizontalLineTo(16.79f)
                lineTo(14.43f, 16.88f)
                horizontalLineTo(1.77f)
                moveTo(22.23f, 16.9f)
                curveTo(22.23f, 16.5f, 22.11f, 16.11f, 21.9f, 15.78f)
                lineTo(15.17f, 4.1f)
                curveTo(14.82f, 3.44f, 14.15f, 3.0f, 13.35f, 3.0f)
                horizontalLineTo(9.8f)
                lineTo(20.18f, 21.0f)
                lineTo(21.82f, 18.14f)
                curveTo(22.13f, 17.6f, 22.23f, 17.36f, 22.23f, 16.9f)
                moveTo(12.73f, 13.94f)
                lineTo(8.1f, 5.92f)
                lineTo(3.45f, 13.94f)
                horizontalLineTo(12.73f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
