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

public val RemixIcons.RefreshFill: ImageVector
    get() {
        if (_refreshFill != null) {
            return _refreshFill!!
        }
        _refreshFill = Builder(name = "RefreshFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.82f, 17.076f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.032f, 5.658f)
                lineToRelative(0.975f, 1.755f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.82f, 5.076f)
                close()
                moveTo(14.968f, 18.342f)
                lineToRelative(-0.975f, -1.755f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.18f, 6.924f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.788f, 11.418f)
                close()
            }
        }
        .build()
        return _refreshFill!!
    }

private var _refreshFill: ImageVector? = null
