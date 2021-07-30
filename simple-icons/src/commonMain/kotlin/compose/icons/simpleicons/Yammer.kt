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

public val SimpleIcons.Yammer: ImageVector
    get() {
        if (_yammer != null) {
            return _yammer!!
        }
        _yammer = Builder(name = "Yammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5094f, 7.391f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.859f, -0.527f)
                lineToRelative(-2.31f, 0.626f)
                arcTo(17.4135f, 17.4135f, 0.0f, false, false, 16.3897f, 0.226f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.509f, -0.225f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, false, -0.482f, 0.2f)
                lineTo(9.7667f, 5.8379f)
                lineTo(1.023f, 5.8379f)
                curveTo(0.458f, 5.838f, 0.0f, 6.296f, 0.0f, 6.862f)
                verticalLineToRelative(10.2368f)
                curveToRelative(0.0f, 0.566f, 0.458f, 1.025f, 1.023f, 1.025f)
                horizontalLineToRelative(8.7037f)
                lineToRelative(5.6719f, 5.6768f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.99f, -0.025f)
                arcToRelative(17.4305f, 17.4305f, 0.0f, false, false, 3.9509f, -7.2638f)
                lineToRelative(2.3109f, 0.626f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, 0.859f, -0.527f)
                arcToRelative(21.9024f, 21.9024f, 0.0f, false, false, 0.0f, -9.2198f)
                close()
                moveTo(15.8356f, 1.941f)
                arcToRelative(15.8536f, 15.8536f, 0.0f, false, true, 3.0229f, 5.9499f)
                lineToRelative(-6.5958f, 1.786f)
                verticalLineToRelative(-2.815f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, -0.48f, -0.865f)
                close()
                moveTo(9.2738f, 9.226f)
                lineToRelative(-2.205f, 3.8809f)
                verticalLineToRelative(2.0219f)
                arcToRelative(0.938f, 0.938f, 0.0f, true, true, -1.876f, 0.0f)
                verticalLineToRelative(-2.193f)
                lineTo(3.085f, 9.226f)
                arcToRelative(0.8637f, 0.8637f, 0.0f, true, true, 1.501f, -0.855f)
                lineToRelative(1.594f, 2.9779f)
                lineToRelative(1.5939f, -2.978f)
                arcToRelative(0.861f, 0.861f, 0.0f, false, true, 1.176f, -0.324f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, 0.324f, 1.179f)
                close()
                moveTo(18.8585f, 16.1108f)
                arcToRelative(15.8536f, 15.8536f, 0.0f, false, true, -3.023f, 5.9498f)
                lineToRelative(-4.0788f, -4.0819f)
                curveToRelative(0.301f, -0.178f, 0.506f, -0.504f, 0.506f, -0.88f)
                verticalLineToRelative(-2.7739f)
                close()
                moveTo(22.1745f, 15.4128f)
                lineToRelative(-9.9118f, -2.684f)
                verticalLineToRelative(-1.4559f)
                lineToRelative(9.9117f, -2.684f)
                arcToRelative(20.4075f, 20.4075f, 0.0f, false, true, 0.0f, 6.8239f)
                close()
            }
        }
        .build()
        return _yammer!!
    }

private var _yammer: ImageVector? = null
