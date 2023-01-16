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

public val MaterialDesignIcons.LavaLamp: ImageVector
    get() {
        if (_lavaLamp != null) {
            return _lavaLamp!!
        }
        _lavaLamp = Builder(name = "LavaLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(16.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineTo(10.0f)
                moveTo(11.5f, 5.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.25f, 6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.5f, 7.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.75f, 6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.5f, 5.75f)
                moveTo(12.5f, 8.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.5f, 9.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 10.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 9.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 8.5f)
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 12.0f)
                moveTo(8.0f, 17.0f)
                lineTo(10.0f, 19.0f)
                lineTo(8.0f, 21.0f)
                horizontalLineTo(16.0f)
                lineTo(14.0f, 19.0f)
                lineTo(16.0f, 17.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _lavaLamp!!
    }

private var _lavaLamp: ImageVector? = null
