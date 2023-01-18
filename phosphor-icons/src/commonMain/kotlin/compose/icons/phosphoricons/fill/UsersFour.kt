package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.UsersFour: ImageVector
    get() {
        if (_usersFour != null) {
            return _usersFour!!
        }
        _usersFour = Builder(name = "UsersFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.6f, 115.2f)
                arcTo(67.8f, 67.8f, 0.0f, false, true, 53.0f, 93.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 54.0f, 0.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 21.0f, 14.3f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 21.0f, -14.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 54.0f, 0.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, 27.4f, 21.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.6f, 11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.2f, -1.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -83.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.6f, 0.6f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, 0.5f)
                lineToRelative(-0.3f, 0.2f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.3f, 0.2f)
                lineToRelative(-0.3f, 0.2f)
                lineToRelative(-0.5f, 0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-1.7f, 0.6f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(-0.8f, -0.2f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-0.9f, -0.4f)
                lineToRelative(-0.3f, -0.2f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -0.9f, -0.6f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.3f, -0.3f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-0.2f, -0.2f, -0.4f, -0.3f, -0.5f, -0.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, -0.7f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -83.1f, 0.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 128.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -4.8f, -1.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 25.6f, 115.2f)
                close()
                moveTo(203.0f, 197.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -54.0f, 0.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -21.0f, 14.3f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -21.0f, -14.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -54.0f, 0.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, false, -27.4f, 21.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 232.0f)
                horizontalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.4f, -12.8f)
                arcTo(67.8f, 67.8f, 0.0f, false, false, 203.0f, 197.5f)
                close()
            }
        }
        .build()
        return _usersFour!!
    }

private var _usersFour: ImageVector? = null
