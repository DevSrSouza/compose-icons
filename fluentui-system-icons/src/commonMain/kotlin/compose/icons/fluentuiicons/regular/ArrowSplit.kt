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

public val RegularGroup.ArrowSplit: ImageVector
    get() {
        if (_arrowSplit != null) {
            return _arrowSplit!!
        }
        _arrowSplit = Builder(name = "ArrowSplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9997f, 3.0f)
                curveTo(12.4139f, 3.0f, 12.7497f, 3.3358f, 12.7497f, 3.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(15.2451f)
                curveTo(16.7639f, 9.5f, 17.9951f, 10.7312f, 17.9951f, 12.25f)
                verticalLineTo(18.4416f)
                lineTo(19.7197f, 16.7193f)
                curveTo(20.0128f, 16.4266f, 20.4877f, 16.4269f, 20.7804f, 16.72f)
                curveTo(21.0731f, 17.0131f, 21.0727f, 17.488f, 20.7796f, 17.7807f)
                lineTo(17.7751f, 20.7812f)
                curveTo(17.4821f, 21.0737f, 17.0075f, 21.0736f, 16.7148f, 20.7808f)
                lineTo(13.7143f, 17.7803f)
                curveTo(13.4214f, 17.4874f, 13.4214f, 17.0126f, 13.7143f, 16.7197f)
                curveTo(14.0072f, 16.4268f, 14.482f, 16.4268f, 14.7749f, 16.7197f)
                lineTo(16.4951f, 18.4398f)
                verticalLineTo(12.25f)
                curveTo(16.4951f, 11.5596f, 15.9355f, 11.0f, 15.2451f, 11.0f)
                horizontalLineTo(8.7496f)
                curveTo(8.0592f, 11.0f, 7.4996f, 11.5596f, 7.4996f, 12.25f)
                verticalLineTo(18.4398f)
                lineTo(9.2198f, 16.7197f)
                curveTo(9.5127f, 16.4268f, 9.9875f, 16.4268f, 10.2804f, 16.7197f)
                curveTo(10.5733f, 17.0126f, 10.5733f, 17.4874f, 10.2804f, 17.7803f)
                lineTo(7.2799f, 20.7808f)
                curveTo(6.987f, 21.0737f, 6.5122f, 21.0737f, 6.2193f, 20.7808f)
                lineTo(3.2187f, 17.7803f)
                curveTo(2.9258f, 17.4874f, 2.9258f, 17.0126f, 3.2187f, 16.7197f)
                curveTo(3.5116f, 16.4268f, 3.9864f, 16.4268f, 4.2793f, 16.7197f)
                lineTo(5.9996f, 18.4399f)
                verticalLineTo(12.25f)
                curveTo(5.9996f, 10.7312f, 7.2308f, 9.5f, 8.7496f, 9.5f)
                horizontalLineTo(11.2497f)
                verticalLineTo(3.75f)
                curveTo(11.2497f, 3.3358f, 11.5855f, 3.0f, 11.9997f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowSplit!!
    }

private var _arrowSplit: ImageVector? = null
