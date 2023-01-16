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

public val MaterialDesignIcons.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.19f, 14.19f)
                lineTo(6.0f, 18.0f)
                lineTo(9.81f, 9.81f)
                lineTo(18.0f, 6.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 10.9f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 10.9f, 12.0f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 12.0f, 13.1f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 13.1f, 12.0f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 12.0f, 10.9f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
