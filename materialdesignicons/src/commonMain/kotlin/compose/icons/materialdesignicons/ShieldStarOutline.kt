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

public val MaterialDesignIcons.ShieldStarOutline: ImageVector
    get() {
        if (_shieldStarOutline != null) {
            return _shieldStarOutline!!
        }
        _shieldStarOutline = Builder(name = "ShieldStarOutline", defaultWidth = 24.0.dp,
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
                moveTo(15.05f, 16.0f)
                lineTo(11.97f, 14.15f)
                lineTo(8.9f, 16.0f)
                lineTo(9.71f, 12.5f)
                lineTo(7.0f, 10.16f)
                lineTo(10.58f, 9.85f)
                lineTo(11.97f, 6.55f)
                lineTo(13.37f, 9.84f)
                lineTo(16.95f, 10.15f)
                lineTo(14.23f, 12.5f)
                lineTo(15.05f, 16.0f)
            }
        }
        .build()
        return _shieldStarOutline!!
    }

private var _shieldStarOutline: ImageVector? = null
