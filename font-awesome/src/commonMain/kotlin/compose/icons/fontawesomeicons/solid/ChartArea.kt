package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = Builder(name = "ChartArea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.0f, 384.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineTo(76.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(308.0f)
                horizontalLineToRelative(436.0f)
                close()
                moveTo(372.7f, 159.5f)
                lineTo(288.0f, 216.0f)
                lineToRelative(-85.3f, -113.7f)
                curveToRelative(-5.1f, -6.8f, -15.5f, -6.3f, -19.9f, 1.0f)
                lineTo(96.0f, 248.0f)
                verticalLineToRelative(104.0f)
                horizontalLineToRelative(384.0f)
                lineToRelative(-89.9f, -187.8f)
                curveToRelative(-3.2f, -6.5f, -11.4f, -8.7f, -17.4f, -4.7f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
