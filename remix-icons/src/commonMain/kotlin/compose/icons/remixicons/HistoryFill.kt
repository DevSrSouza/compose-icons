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

public val RemixIcons.HistoryFill: ImageVector
    get() {
        if (_historyFill != null) {
            return _historyFill!!
        }
        _historyFill = Builder(name = "HistoryFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.582f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.582f, -8.0f, -8.0f, -8.0f)
                curveTo(9.536f, 4.0f, 7.332f, 5.114f, 5.865f, 6.865f)
                lineTo(8.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                lineToRelative(2.447f, 2.446f)
                curveTo(6.28f, 3.336f, 8.984f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(4.585f)
                lineToRelative(3.243f, 3.243f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(11.0f, 12.413f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _historyFill!!
    }

private var _historyFill: ImageVector? = null
