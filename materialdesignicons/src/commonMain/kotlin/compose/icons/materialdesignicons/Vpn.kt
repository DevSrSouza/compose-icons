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

public val MaterialDesignIcons.Vpn: ImageVector
    get() {
        if (_vpn != null) {
            return _vpn!!
        }
        _vpn = Builder(name = "Vpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 8.0f)
                lineTo(9.0f, 5.0f)
                moveTo(10.5f, 14.66f)
                curveTo(10.2f, 15.0f, 10.0f, 15.5f, 10.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 16.0f)
                curveTo(14.0f, 15.45f, 13.78f, 14.95f, 13.41f, 14.59f)
                lineTo(14.83f, 13.17f)
                curveTo(15.55f, 13.9f, 16.0f, 14.9f, 16.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 16.0f)
                curveTo(8.0f, 14.93f, 8.42f, 13.96f, 9.1f, 13.25f)
                lineTo(9.09f, 13.24f)
                lineTo(16.17f, 6.17f)
                verticalLineTo(6.17f)
                curveTo(16.89f, 5.45f, 17.89f, 5.0f, 19.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 13.0f)
                curveTo(17.9f, 13.0f, 16.9f, 12.55f, 16.17f, 11.83f)
                lineTo(17.59f, 10.41f)
                curveTo(17.95f, 10.78f, 18.45f, 11.0f, 19.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 7.0f)
                curveTo(18.45f, 7.0f, 17.95f, 7.22f, 17.59f, 7.59f)
                lineTo(10.5f, 14.66f)
                moveTo(6.41f, 7.59f)
                curveTo(6.05f, 7.22f, 5.55f, 7.0f, 5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 11.0f)
                curveTo(5.55f, 11.0f, 6.05f, 10.78f, 6.41f, 10.41f)
                lineTo(7.83f, 11.83f)
                curveTo(7.1f, 12.55f, 6.1f, 13.0f, 5.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 1.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 5.0f)
                curveTo(6.11f, 5.0f, 7.11f, 5.45f, 7.83f, 6.17f)
                verticalLineTo(6.17f)
                lineTo(10.59f, 8.93f)
                lineTo(9.17f, 10.35f)
                lineTo(6.41f, 7.59f)
                close()
            }
        }
        .build()
        return _vpn!!
    }

private var _vpn: ImageVector? = null
