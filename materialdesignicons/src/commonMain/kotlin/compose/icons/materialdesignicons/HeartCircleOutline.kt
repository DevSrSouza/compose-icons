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

public val MaterialDesignIcons.HeartCircleOutline: ImageVector
    get() {
        if (_heartCircleOutline != null) {
            return _heartCircleOutline!!
        }
        _heartCircleOutline = Builder(name = "HeartCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(9.75f, 7.82f)
                curveTo(8.21f, 7.82f, 7.0f, 9.03f, 7.0f, 10.57f)
                curveTo(7.0f, 12.46f, 8.7f, 14.0f, 11.28f, 16.34f)
                lineTo(12.0f, 17.0f)
                lineTo(12.72f, 16.34f)
                curveTo(15.3f, 14.0f, 17.0f, 12.46f, 17.0f, 10.57f)
                curveTo(17.0f, 9.03f, 15.79f, 7.82f, 14.25f, 7.82f)
                curveTo(13.38f, 7.82f, 12.55f, 8.23f, 12.0f, 8.87f)
                curveTo(11.45f, 8.23f, 10.62f, 7.82f, 9.75f, 7.82f)
                close()
            }
        }
        .build()
        return _heartCircleOutline!!
    }

private var _heartCircleOutline: ImageVector? = null
