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

public val MaterialDesignIcons.ShieldAccountOutline: ImageVector
    get() {
        if (_shieldAccountOutline != null) {
            return _shieldAccountOutline!!
        }
        _shieldAccountOutline = Builder(name = "ShieldAccountOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 3.18f)
                lineTo(19.0f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(19.0f, 12.92f, 18.5f, 14.65f, 17.65f, 16.17f)
                curveTo(16.0f, 14.94f, 13.26f, 14.5f, 12.0f, 14.5f)
                curveTo(10.74f, 14.5f, 8.0f, 14.94f, 6.35f, 16.17f)
                curveTo(5.5f, 14.65f, 5.0f, 12.92f, 5.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                moveTo(12.0f, 6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 9.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 9.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(12.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 8.0f)
                moveTo(12.0f, 16.5f)
                curveTo(13.57f, 16.5f, 15.64f, 17.11f, 16.53f, 17.84f)
                curveTo(15.29f, 19.38f, 13.7f, 20.55f, 12.0f, 21.0f)
                curveTo(10.3f, 20.55f, 8.71f, 19.38f, 7.47f, 17.84f)
                curveTo(8.37f, 17.11f, 10.43f, 16.5f, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _shieldAccountOutline!!
    }

private var _shieldAccountOutline: ImageVector? = null
