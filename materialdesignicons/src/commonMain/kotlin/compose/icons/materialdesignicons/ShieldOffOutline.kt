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

public val MaterialDesignIcons.ShieldOffOutline: ImageVector
    get() {
        if (_shieldOffOutline != null) {
            return _shieldOffOutline!!
        }
        _shieldOffOutline = Builder(name = "ShieldOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(3.0f, 6.27f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.55f, 6.84f, 21.74f, 12.0f, 23.0f)
                curveTo(13.87f, 22.54f, 15.57f, 21.56f, 16.97f, 20.24f)
                lineTo(19.23f, 22.5f)
                lineTo(20.5f, 21.22f)
                lineTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                moveTo(12.0f, 21.0f)
                curveTo(8.25f, 20.0f, 5.0f, 15.54f, 5.0f, 11.22f)
                verticalLineTo(8.27f)
                lineTo(15.59f, 18.86f)
                curveTo(14.53f, 19.89f, 13.3f, 20.65f, 12.0f, 21.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 13.28f, 20.35f, 15.5f, 19.23f, 17.4f)
                lineTo(17.77f, 15.95f)
                curveTo(18.54f, 14.5f, 19.0f, 12.84f, 19.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                lineTo(7.16f, 5.34f)
                lineTo(5.65f, 3.82f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shieldOffOutline!!
    }

private var _shieldOffOutline: ImageVector? = null
