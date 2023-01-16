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

public val MaterialDesignIcons.SyncCircle: ImageVector
    get() {
        if (_syncCircle != null) {
            return _syncCircle!!
        }
        _syncCircle = Builder(name = "SyncCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                moveTo(15.6f, 13.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                verticalLineTo(10.0f)
                lineTo(8.88f, 7.0f)
                lineTo(12.0f, 4.0f)
                verticalLineTo(6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 17.07f, 15.19f)
                moveTo(6.0f, 12.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 6.93f, 8.81f)
                lineTo(8.4f, 10.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                verticalLineTo(14.0f)
                lineTo(15.0f, 17.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _syncCircle!!
    }

private var _syncCircle: ImageVector? = null
