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

public val MaterialDesignIcons.HexagramOutline: ImageVector
    get() {
        if (_hexagramOutline != null) {
            return _hexagramOutline!!
        }
        _hexagramOutline = Builder(name = "HexagramOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                lineTo(13.3f, 9.8f)
                lineTo(16.5f, 9.4f)
                lineTo(14.5f, 12.0f)
                lineTo(16.4f, 14.5f)
                lineTo(13.2f, 14.1f)
                lineTo(12.0f, 17.0f)
                lineTo(10.7f, 14.2f)
                lineTo(7.5f, 14.6f)
                lineTo(9.5f, 12.0f)
                lineTo(7.6f, 9.5f)
                lineTo(10.8f, 9.9f)
                lineTo(12.0f, 7.0f)
                moveTo(12.0f, 2.0f)
                lineTo(9.5f, 7.7f)
                lineTo(3.3f, 7.0f)
                lineTo(7.0f, 12.0f)
                lineTo(3.4f, 17.0f)
                lineTo(9.6f, 16.3f)
                lineTo(12.0f, 22.0f)
                lineTo(14.5f, 16.3f)
                lineTo(20.7f, 16.9f)
                lineTo(17.0f, 12.0f)
                lineTo(20.6f, 7.0f)
                lineTo(14.4f, 7.7f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _hexagramOutline!!
    }

private var _hexagramOutline: ImageVector? = null
