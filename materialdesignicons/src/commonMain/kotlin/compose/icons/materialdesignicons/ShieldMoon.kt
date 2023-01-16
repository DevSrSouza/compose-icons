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

public val MaterialDesignIcons.ShieldMoon: ImageVector
    get() {
        if (_shieldMoon != null) {
            return _shieldMoon!!
        }
        _shieldMoon = Builder(name = "ShieldMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.55f, 6.84f, 21.74f, 12.0f, 23.0f)
                curveTo(17.16f, 21.74f, 21.0f, 16.55f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                moveTo(15.97f, 14.41f)
                curveTo(14.13f, 16.58f, 10.76f, 16.5f, 9.0f, 14.34f)
                curveTo(6.82f, 11.62f, 8.36f, 7.62f, 11.7f, 7.0f)
                curveTo(12.04f, 6.95f, 12.33f, 7.28f, 12.21f, 7.61f)
                curveTo(11.75f, 8.84f, 11.82f, 10.25f, 12.53f, 11.47f)
                curveTo(13.24f, 12.69f, 14.42f, 13.46f, 15.71f, 13.67f)
                curveTo(16.05f, 13.72f, 16.2f, 14.14f, 15.97f, 14.41f)
                close()
            }
        }
        .build()
        return _shieldMoon!!
    }

private var _shieldMoon: ImageVector? = null
