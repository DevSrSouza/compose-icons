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

public val MaterialDesignIcons.HeartHalfOutline: ImageVector
    get() {
        if (_heartHalfOutline != null) {
            return _heartHalfOutline!!
        }
        _heartHalfOutline = Builder(name = "HeartHalfOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 11.2f, 6.75f, 13.87f, 11.0f, 17.74f)
                verticalLineTo(7.2f)
                curveTo(10.42f, 5.91f, 9.0f, 5.0f, 7.5f, 5.0f)
                curveTo(5.5f, 5.0f, 4.0f, 6.5f, 4.0f, 8.5f)
                moveTo(13.0f, 7.2f)
                verticalLineTo(17.74f)
                lineTo(13.0f, 20.44f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(10.0f, 3.0f, 13.0f, 5.0f, 13.0f, 7.2f)
                close()
            }
        }
        .build()
        return _heartHalfOutline!!
    }

private var _heartHalfOutline: ImageVector? = null
