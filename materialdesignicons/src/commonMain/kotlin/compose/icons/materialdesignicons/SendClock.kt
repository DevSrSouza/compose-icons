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

public val MaterialDesignIcons.SendClock: ImageVector
    get() {
        if (_sendClock != null) {
            return _sendClock!!
        }
        _sendClock = Builder(name = "SendClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                verticalLineTo(10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(2.0f, 14.0f)
                verticalLineTo(21.0f)
                lineTo(9.27f, 17.89f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 23.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                moveTo(16.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 11.0f)
                moveTo(15.0f, 12.5f)
                verticalLineTo(16.5f)
                lineTo(18.0f, 18.5f)
                lineTo(18.75f, 17.25f)
                lineTo(16.5f, 15.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _sendClock!!
    }

private var _sendClock: ImageVector? = null
