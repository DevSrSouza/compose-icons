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

public val MaterialDesignIcons.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(8.17f, 3.0f, 8.82f, 3.12f, 9.44f, 3.33f)
                lineTo(13.0f, 9.35f)
                lineTo(9.0f, 14.35f)
                lineTo(12.0f, 21.35f)
                verticalLineTo(21.35f)
                moveTo(16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(11.0f, 14.35f)
                lineTo(15.5f, 9.35f)
                lineTo(12.85f, 4.27f)
                curveTo(13.87f, 3.47f, 15.17f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
