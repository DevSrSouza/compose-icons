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

public val RemixIcons.RoadsterFill: ImageVector
    get() {
        if (_roadsterFill != null) {
            return _roadsterFill!!
        }
        _roadsterFill = Builder(name = "RoadsterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.5f)
                lineTo(22.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-1.243f, -0.31f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 12.22f)
                verticalLineToRelative(-0.72f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.875f)
                lineToRelative(2.138f, -5.702f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.386f, 4.0f)
                horizontalLineToRelative(11.228f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.873f, 1.298f)
                lineTo(21.625f, 11.0f)
                lineTo(23.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.757f, 0.97f)
                lineTo(22.0f, 13.5f)
                close()
                moveTo(4.0f, 15.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.245f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.44f, -0.736f)
                curveTo(7.88f, 15.754f, 6.318f, 15.0f, 4.0f, 15.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(-2.317f, 0.0f, -3.879f, 0.755f, -4.686f, 2.264f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.441f, 0.736f)
                lineTo(19.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineToRelative(-1.561f, 4.684f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.387f, 12.0f)
                horizontalLineToRelative(13.226f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.948f, -1.316f)
                lineTo(18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _roadsterFill!!
    }

private var _roadsterFill: ImageVector? = null
