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

public val RemixIcons.Refund2Fill: ImageVector
    get() {
        if (_refund2Fill != null) {
            return _refund2Fill!!
        }
        _refund2Fill = Builder(name = "Refund2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, true, -6.383f, -2.302f)
                lineToRelative(-0.244f, -0.209f)
                lineToRelative(0.902f, -1.902f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -2.27f, -5.837f)
                lineToRelative(-0.005f, 0.25f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-2.706f, 5.716f)
                arcTo(9.954f, 9.954f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.09f, 0.992f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.5f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(14.0f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.09f, -0.992f)
                lineTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _refund2Fill!!
    }

private var _refund2Fill: ImageVector? = null
