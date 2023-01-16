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

public val MaterialDesignIcons.SackPercent: ImageVector
    get() {
        if (_sackPercent != null) {
            return _sackPercent!!
        }
        _sackPercent = Builder(name = "SackPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                lineTo(6.0f, 2.0f)
                lineTo(10.0f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(14.0f, 4.0f)
                lineTo(18.0f, 2.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineTo(8.0f)
                moveTo(16.0f, 22.0f)
                curveTo(10.0f, 22.0f, 8.0f, 22.0f, 8.0f, 22.0f)
                curveTo(2.0f, 22.0f, 3.0f, 18.0f, 3.0f, 18.0f)
                curveTo(3.0f, 18.0f, 4.0f, 11.0f, 8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 11.0f, 21.0f, 18.0f, 21.0f, 18.0f)
                curveTo(21.0f, 18.0f, 22.0f, 22.0f, 16.0f, 22.0f)
                moveTo(7.5f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 12.5f)
                moveTo(16.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 18.5f)
                moveTo(16.5f, 12.35f)
                lineTo(15.15f, 11.0f)
                lineTo(7.5f, 18.65f)
                lineTo(8.87f, 20.0f)
                lineTo(16.5f, 12.35f)
                close()
            }
        }
        .build()
        return _sackPercent!!
    }

private var _sackPercent: ImageVector? = null
