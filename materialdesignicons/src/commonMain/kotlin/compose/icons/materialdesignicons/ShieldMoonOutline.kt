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

public val MaterialDesignIcons.ShieldMoonOutline: ImageVector
    get() {
        if (_shieldMoonOutline != null) {
            return _shieldMoonOutline!!
        }
        _shieldMoonOutline = Builder(name = "ShieldMoonOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 16.55f, 17.16f, 21.74f, 12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 21.0f)
                curveTo(15.75f, 20.0f, 19.0f, 15.54f, 19.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5.0f, 15.54f, 8.25f, 20.0f, 12.0f, 21.0f)
                moveTo(9.0f, 14.33f)
                curveTo(10.76f, 16.5f, 14.13f, 16.57f, 15.97f, 14.4f)
                curveTo(16.2f, 14.13f, 16.05f, 13.72f, 15.71f, 13.66f)
                curveTo(14.42f, 13.45f, 13.23f, 12.68f, 12.53f, 11.46f)
                curveTo(11.82f, 10.24f, 11.75f, 8.83f, 12.21f, 7.6f)
                curveTo(12.33f, 7.27f, 12.05f, 6.94f, 11.7f, 7.0f)
                curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.0f, 14.33f)
            }
        }
        .build()
        return _shieldMoonOutline!!
    }

private var _shieldMoonOutline: ImageVector? = null
