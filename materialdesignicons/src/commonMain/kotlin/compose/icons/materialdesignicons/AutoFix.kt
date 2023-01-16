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

public val MaterialDesignIcons.AutoFix: ImageVector
    get() {
        if (_autoFix != null) {
            return _autoFix!!
        }
        _autoFix = Builder(name = "AutoFix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 5.6f)
                lineTo(5.0f, 7.0f)
                lineTo(6.4f, 4.5f)
                lineTo(5.0f, 2.0f)
                lineTo(7.5f, 3.4f)
                lineTo(10.0f, 2.0f)
                lineTo(8.6f, 4.5f)
                lineTo(10.0f, 7.0f)
                lineTo(7.5f, 5.6f)
                moveTo(19.5f, 15.4f)
                lineTo(22.0f, 14.0f)
                lineTo(20.6f, 16.5f)
                lineTo(22.0f, 19.0f)
                lineTo(19.5f, 17.6f)
                lineTo(17.0f, 19.0f)
                lineTo(18.4f, 16.5f)
                lineTo(17.0f, 14.0f)
                lineTo(19.5f, 15.4f)
                moveTo(22.0f, 2.0f)
                lineTo(20.6f, 4.5f)
                lineTo(22.0f, 7.0f)
                lineTo(19.5f, 5.6f)
                lineTo(17.0f, 7.0f)
                lineTo(18.4f, 4.5f)
                lineTo(17.0f, 2.0f)
                lineTo(19.5f, 3.4f)
                lineTo(22.0f, 2.0f)
                moveTo(13.34f, 12.78f)
                lineTo(15.78f, 10.34f)
                lineTo(13.66f, 8.22f)
                lineTo(11.22f, 10.66f)
                lineTo(13.34f, 12.78f)
                moveTo(14.37f, 7.29f)
                lineTo(16.71f, 9.63f)
                curveTo(17.1f, 10.0f, 17.1f, 10.65f, 16.71f, 11.04f)
                lineTo(5.04f, 22.71f)
                curveTo(4.65f, 23.1f, 4.0f, 23.1f, 3.63f, 22.71f)
                lineTo(1.29f, 20.37f)
                curveTo(0.9f, 20.0f, 0.9f, 19.35f, 1.29f, 18.96f)
                lineTo(12.96f, 7.29f)
                curveTo(13.35f, 6.9f, 14.0f, 6.9f, 14.37f, 7.29f)
                close()
            }
        }
        .build()
        return _autoFix!!
    }

private var _autoFix: ImageVector? = null
