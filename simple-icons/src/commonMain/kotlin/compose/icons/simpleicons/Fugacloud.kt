package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fugacloud: ImageVector
    get() {
        if (_fugacloud != null) {
            return _fugacloud!!
        }
        _fugacloud = Builder(name = "Fugacloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0876f, 13.9765f)
                lineToRelative(-1.1014f, -0.6361f)
                verticalLineToRelative(-2.5345f)
                lineToRelative(1.1013f, 0.6389f)
                lineToRelative(3.1738f, -1.8305f)
                verticalLineToRelative(2.5275f)
                close()
                moveTo(4.9124f, 13.9865f)
                horizontalLineToRelative(-0.0067f)
                lineToRelative(-3.167f, -1.8341f)
                lineTo(1.7387f, 9.625f)
                lineToRelative(3.1702f, 1.8284f)
                lineToRelative(1.0982f, -0.6371f)
                verticalLineToRelative(2.5345f)
                close()
                moveTo(4.9716f, 10.4393f)
                lineTo(1.7387f, 8.5686f)
                lineTo(1.7387f, 5.9464f)
                lineToRelative(0.971f, -0.5568f)
                lineTo(11.9941f, 0.0f)
                lineToRelative(1.9539f, 1.1371f)
                lineToRelative(5.9567f, 3.4708f)
                lineToRelative(0.2013f, 0.1303f)
                lineToRelative(1.0303f, 0.5922f)
                lineToRelative(0.1657f, 0.095f)
                lineToRelative(0.9593f, 0.5686f)
                verticalLineToRelative(2.5597f)
                lineToRelative(-3.1738f, 1.8349f)
                lineToRelative(-1.1013f, -0.6353f)
                lineTo(17.9862f, 8.4341f)
                lineToRelative(-4.95f, -2.8903f)
                lineToRelative(-1.0421f, -0.6277f)
                lineToRelative(-0.971f, 0.5567f)
                lineToRelative(-5.033f, 2.9495f)
                verticalLineToRelative(1.4254f)
                lineToRelative(-1.0185f, 0.5883f)
                moveToRelative(0.0f, 4.4197f)
                lineToRelative(1.0184f, -0.5805f)
                verticalLineToRelative(1.2082f)
                lineToRelative(6.0633f, 3.5418f)
                lineToRelative(0.225f, -0.1421f)
                lineToRelative(0.0473f, -0.024f)
                lineToRelative(5.6725f, -3.3168f)
                lineToRelative(-0.0119f, -0.4264f)
                verticalLineToRelative(-0.8918f)
                lineToRelative(1.1014f, 0.6313f)
                lineToRelative(3.1737f, -1.833f)
                verticalLineToRelative(5.0193f)
                lineToRelative(-0.9593f, 0.5568f)
                lineToRelative(-1.196f, 0.6988f)
                lineToRelative(-0.2013f, 0.1185f)
                lineToRelative(-5.9567f, 3.4826f)
                lineTo(11.994f, 24.0f)
                lineToRelative(-1.9302f, -1.1371f)
                lineToRelative(-5.9685f, -3.4708f)
                lineToRelative(-0.2013f, -0.1303f)
                lineToRelative(-1.1842f, -0.687f)
                lineToRelative(-0.9711f, -0.5698f)
                verticalLineToRelative(-4.6197f)
                lineToRelative(0.0118f, -0.3971f)
                lineToRelative(3.2211f, 1.8673f)
            }
        }
        .build()
        return _fugacloud!!
    }

private var _fugacloud: ImageVector? = null
