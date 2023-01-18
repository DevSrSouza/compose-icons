package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CheckmarkCircle: ImageVector
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
                moveTo(12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(10.75f, 13.4393f)
                lineTo(15.2197f, 8.9697f)
                curveTo(15.5126f, 8.6768f, 15.9874f, 8.6768f, 16.2803f, 8.9697f)
                curveTo(16.5466f, 9.2359f, 16.5708f, 9.6526f, 16.3529f, 9.9462f)
                lineTo(16.2803f, 10.0303f)
                lineTo(11.2803f, 15.0303f)
                curveTo(11.0141f, 15.2966f, 10.5974f, 15.3208f, 10.3038f, 15.1029f)
                lineTo(10.2197f, 15.0303f)
                lineTo(7.7197f, 12.5303f)
                curveTo(7.4268f, 12.2374f, 7.4268f, 11.7626f, 7.7197f, 11.4697f)
                curveTo(7.9859f, 11.2034f, 8.4026f, 11.1792f, 8.6962f, 11.3971f)
                lineTo(8.7803f, 11.4697f)
                lineTo(10.75f, 13.4393f)
                lineTo(15.2197f, 8.9697f)
                lineTo(10.75f, 13.4393f)
                close()
            }
        }
        .build()
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
