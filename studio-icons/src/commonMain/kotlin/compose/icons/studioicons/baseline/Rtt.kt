package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Rtt: ImageVector
    get() {
        if (_rtt != null) {
            return _rtt!!
        }
        _rtt = Builder(name = "Rtt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.03f, 3.0f)
                lineToRelative(-1.11f, 7.07f)
                horizontalLineToRelative(2.62f)
                lineToRelative(0.7f, -4.5f)
                horizontalLineToRelative(2.58f)
                lineTo(11.8f, 18.43f)
                lineTo(9.47f, 18.43f)
                lineTo(9.06f, 21.0f)
                horizontalLineToRelative(7.27f)
                lineToRelative(0.4f, -2.57f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(2.0f, -12.86f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-0.71f, 4.5f)
                horizontalLineToRelative(2.65f)
                lineTo(22.0f, 3.0f)
                lineTo(9.03f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineToRelative(-0.31f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(7.39f, 9.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.31f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.31f, -2.0f)
                close()
                moveTo(8.31f, 17.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(2.0f, 19.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.31f, -2.0f)
                close()
                moveTo(8.93f, 13.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(-0.31f, 2.0f)
                horizontalLineToRelative(6.01f)
                lineToRelative(0.3f, -2.0f)
                close()
            }
        }
        .build()
        return _rtt!!
    }

private var _rtt: ImageVector? = null
