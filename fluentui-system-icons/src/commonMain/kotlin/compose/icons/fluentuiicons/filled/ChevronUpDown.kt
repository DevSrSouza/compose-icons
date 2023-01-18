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

public val FilledGroup.ChevronUpDown: ImageVector
    get() {
        if (_chevronUpDown != null) {
            return _chevronUpDown!!
        }
        _chevronUpDown = Builder(name = "ChevronUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7903f, 8.3871f)
                curveTo(19.0953f, 8.7794f, 19.0676f, 9.3466f, 18.7071f, 9.7071f)
                curveTo(18.3166f, 10.0976f, 17.6834f, 10.0976f, 17.2929f, 9.7071f)
                lineTo(12.0f, 4.4142f)
                lineTo(6.7071f, 9.7071f)
                lineTo(6.6129f, 9.7903f)
                curveTo(6.2206f, 10.0953f, 5.6534f, 10.0676f, 5.2929f, 9.7071f)
                curveTo(4.9024f, 9.3166f, 4.9024f, 8.6834f, 5.2929f, 8.2929f)
                lineTo(11.2929f, 2.2929f)
                lineTo(11.3871f, 2.2097f)
                curveTo(11.7794f, 1.9047f, 12.3466f, 1.9324f, 12.7071f, 2.2929f)
                lineTo(18.7071f, 8.2929f)
                lineTo(18.7903f, 8.3871f)
                close()
                moveTo(5.2097f, 15.6129f)
                curveTo(4.9047f, 15.2206f, 4.9324f, 14.6534f, 5.2929f, 14.2929f)
                curveTo(5.6834f, 13.9024f, 6.3166f, 13.9024f, 6.7071f, 14.2929f)
                lineTo(12.0f, 19.5858f)
                lineTo(17.2929f, 14.2929f)
                lineTo(17.3871f, 14.2097f)
                curveTo(17.7794f, 13.9047f, 18.3466f, 13.9324f, 18.7071f, 14.2929f)
                curveTo(19.0976f, 14.6834f, 19.0976f, 15.3166f, 18.7071f, 15.7071f)
                lineTo(12.7071f, 21.7071f)
                lineTo(12.6129f, 21.7903f)
                curveTo(12.2206f, 22.0953f, 11.6534f, 22.0676f, 11.2929f, 21.7071f)
                lineTo(5.2929f, 15.7071f)
                lineTo(5.2097f, 15.6129f)
                close()
            }
        }
        .build()
        return _chevronUpDown!!
    }

private var _chevronUpDown: ImageVector? = null
