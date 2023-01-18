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

public val RemixIcons.PoliceCarFill: ImageVector
    get() {
        if (_policeCarFill != null) {
            return _policeCarFill!!
        }
        _policeCarFill = Builder(name = "PoliceCarFill", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineToRelative(1.929f)
                lineTo(4.48f, 6.212f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.319f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.681f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.838f, 1.212f)
                lineTo(21.571f, 11.0f)
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
                moveTo(6.0f, 7.0f)
                lineToRelative(-1.451f, 3.629f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.477f, 12.0f)
                horizontalLineToRelative(13.046f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.928f, -1.371f)
                lineTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
            }
        }
        .build()
        return _policeCarFill!!
    }

private var _policeCarFill: ImageVector? = null
