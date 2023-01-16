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

public val MaterialDesignIcons.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                curveTo(6.0f, 11.0f, 6.25f, 10.03f, 6.7f, 9.2f)
                lineTo(5.24f, 7.74f)
                curveTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                verticalLineTo(23.0f)
                lineTo(16.0f, 19.0f)
                lineTo(12.0f, 15.0f)
                moveTo(12.0f, 4.0f)
                verticalLineTo(1.0f)
                lineTo(8.0f, 5.0f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 13.0f, 17.75f, 13.97f, 17.3f, 14.8f)
                lineTo(18.76f, 16.26f)
                curveTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
