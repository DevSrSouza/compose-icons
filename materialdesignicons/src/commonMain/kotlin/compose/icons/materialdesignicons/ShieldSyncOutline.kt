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

public val MaterialDesignIcons.ShieldSyncOutline: ImageVector
    get() {
        if (_shieldSyncOutline != null) {
            return _shieldSyncOutline!!
        }
        _shieldSyncOutline = Builder(name = "ShieldSyncOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(8.25f, 20.0f, 5.0f, 15.54f, 5.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                lineTo(19.0f, 6.3f)
                verticalLineTo(12.07f)
                arcTo(6.45f, 6.45f, 0.0f, false, true, 20.91f, 12.67f)
                arcTo(11.63f, 11.63f, 0.0f, false, false, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.55f, 6.84f, 21.74f, 12.0f, 23.0f)
                curveTo(12.35f, 22.91f, 12.7f, 22.8f, 13.0f, 22.68f)
                arcTo(6.3f, 6.3f, 0.0f, false, true, 12.0f, 21.0f)
                moveTo(18.0f, 14.5f)
                verticalLineTo(13.0f)
                lineTo(15.75f, 15.25f)
                lineTo(18.0f, 17.5f)
                verticalLineTo(16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.24f, 19.62f)
                lineTo(21.33f, 20.71f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 14.5f)
                moveTo(18.0f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.76f, 17.38f)
                lineTo(14.67f, 16.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 22.5f)
                verticalLineTo(24.0f)
                lineTo(20.25f, 21.75f)
                lineTo(18.0f, 19.5f)
                close()
            }
        }
        .build()
        return _shieldSyncOutline!!
    }

private var _shieldSyncOutline: ImageVector? = null
