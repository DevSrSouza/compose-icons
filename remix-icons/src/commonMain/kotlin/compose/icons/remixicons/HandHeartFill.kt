package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HandHeartFill: ImageVector
    get() {
        if (_handHeartFill != null) {
            return _handHeartFill!!
        }
        _handHeartFill = Builder(name = "HandHeartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.33f, 11.5f)
                horizontalLineToRelative(2.17f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(8.999f, 16.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(5.578f, 5.578f, 0.0f, false, false, -0.886f, -3.0f)
                lineTo(19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.516f, 2.851f)
                curveTo(21.151f, 18.972f, 17.322f, 21.0f, 13.0f, 21.0f)
                curveToRelative(-2.761f, 0.0f, -5.1f, -0.59f, -7.0f, -1.625f)
                lineTo(6.0f, 10.071f)
                arcTo(6.967f, 6.967f, 0.0f, false, true, 9.33f, 11.5f)
                close()
                moveTo(4.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.646f, 3.575f)
                lineTo(14.0f, 3.93f)
                lineToRelative(0.354f, -0.354f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.535f, 3.536f)
                lineTo(14.0f, 11.0f)
                lineToRelative(-3.89f, -3.89f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.536f, -3.535f)
                close()
            }
        }
        .build()
        return _handHeartFill!!
    }

private var _handHeartFill: ImageVector? = null
