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

public val RemixIcons.BearSmileLine: ImageVector
    get() {
        if (_bearSmileLine != null) {
            return _bearSmileLine!!
        }
        _bearSmileLine = Builder(name = "BearSmileLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.951f, 7.897f)
                curveToRelative(0.355f, 0.967f, 0.549f, 2.013f, 0.549f, 3.103f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 3.55f, 9.897f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 6.791f, -5.744f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, true, 3.32f, 0.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, true, 17.5f, 2.0f)
                close()
                moveTo(17.5f, 4.0f)
                curveToRelative(-0.823f, 0.0f, -1.575f, 0.4f, -2.038f, 1.052f)
                lineToRelative(-0.095f, 0.144f)
                lineToRelative(-0.718f, 1.176f)
                lineToRelative(-1.355f, -0.253f)
                arcToRelative(7.05f, 7.05f, 0.0f, false, false, -2.267f, -0.052f)
                lineToRelative(-0.316f, 0.052f)
                lineToRelative(-1.356f, 0.255f)
                lineToRelative(-0.72f, -1.176f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 4.73f, 8.265f)
                lineToRelative(0.131f, 0.123f)
                lineToRelative(1.041f, 0.904f)
                lineToRelative(-0.475f, 1.295f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 19.0f, 13.0f)
                curveToRelative(0.0f, -0.716f, -0.107f, -1.416f, -0.314f, -2.083f)
                lineToRelative(-0.112f, -0.33f)
                lineToRelative(-0.475f, -1.295f)
                lineToRelative(1.04f, -0.904f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 4.0f)
                close()
                moveTo(10.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bearSmileLine!!
    }

private var _bearSmileLine: ImageVector? = null
