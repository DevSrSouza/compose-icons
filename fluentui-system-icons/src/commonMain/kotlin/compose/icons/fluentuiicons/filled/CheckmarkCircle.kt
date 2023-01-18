package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CheckmarkCircle: ImageVector
    get() {
        if (_checkmarkCircle != null) {
            return _checkmarkCircle!!
        }
        _checkmarkCircle = Builder(name = "CheckmarkCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.2197f, 8.9697f)
                lineTo(10.75f, 13.4393f)
                lineTo(8.7803f, 11.4697f)
                curveTo(8.4874f, 11.1768f, 8.0126f, 11.1768f, 7.7197f, 11.4697f)
                curveTo(7.4268f, 11.7626f, 7.4268f, 12.2374f, 7.7197f, 12.5303f)
                lineTo(10.2197f, 15.0303f)
                curveTo(10.5126f, 15.3232f, 10.9874f, 15.3232f, 11.2803f, 15.0303f)
                lineTo(16.2803f, 10.0303f)
                curveTo(16.5732f, 9.7374f, 16.5732f, 9.2626f, 16.2803f, 8.9697f)
                curveTo(15.9874f, 8.6768f, 15.5126f, 8.6768f, 15.2197f, 8.9697f)
                close()
            }
        }
        .build()
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
