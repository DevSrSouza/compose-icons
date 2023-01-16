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

public val MaterialDesignIcons.HeartHalfFull: ImageVector
    get() {
        if (_heartHalfFull != null) {
            return _heartHalfFull!!
        }
        _heartHalfFull = Builder(name = "HeartHalfFull", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 5.0f)
                curveTo(15.0f, 5.0f, 13.58f, 5.91f, 13.0f, 7.2f)
                verticalLineTo(17.74f)
                curveTo(17.25f, 13.87f, 20.0f, 11.2f, 20.0f, 8.5f)
                curveTo(20.0f, 6.5f, 18.5f, 5.0f, 16.5f, 5.0f)
                moveTo(16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heartHalfFull!!
    }

private var _heartHalfFull: ImageVector? = null
