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

public val MaterialDesignIcons.PercentCircleOutline: ImageVector
    get() {
        if (_percentCircleOutline != null) {
            return _percentCircleOutline!!
        }
        _percentCircleOutline = Builder(name = "PercentCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.22f)
                curveTo(17.0f, 16.2f, 16.2f, 17.0f, 15.22f, 17.0f)
                curveTo(14.24f, 17.0f, 13.45f, 16.2f, 13.45f, 15.22f)
                curveTo(13.45f, 14.24f, 14.24f, 13.45f, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17.0f, 14.24f, 17.0f, 15.22f)
                moveTo(8.83f, 10.6f)
                curveTo(9.81f, 10.6f, 10.6f, 9.81f, 10.6f, 8.83f)
                curveTo(10.6f, 7.84f, 9.81f, 7.05f, 8.83f, 7.05f)
                curveTo(7.84f, 7.05f, 7.05f, 7.84f, 7.05f, 8.83f)
                curveTo(7.05f, 9.81f, 7.84f, 10.6f, 8.83f, 10.6f)
                moveTo(7.0f, 15.53f)
                lineTo(8.5f, 17.03f)
                lineTo(17.03f, 8.5f)
                lineTo(15.53f, 7.0f)
                lineTo(7.0f, 15.53f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.59f, 16.41f, 4.0f, 12.0f, 4.0f)
                curveTo(7.59f, 4.0f, 4.0f, 7.59f, 4.0f, 12.0f)
                curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f)
                curveTo(16.41f, 20.0f, 20.0f, 16.41f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _percentCircleOutline!!
    }

private var _percentCircleOutline: ImageVector? = null
