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

public val MaterialDesignIcons.TriangleWave: ImageVector
    get() {
        if (_triangleWave != null) {
            return _triangleWave!!
        }
        _triangleWave = Builder(name = "TriangleWave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineTo(17.0f, 22.0f)
                lineTo(7.1f, 6.04f)
                lineTo(4.24f, 12.0f)
                horizontalLineTo(2.0f)
                lineTo(7.0f, 2.0f)
                lineTo(16.9f, 17.96f)
                lineTo(19.76f, 12.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _triangleWave!!
    }

private var _triangleWave: ImageVector? = null
