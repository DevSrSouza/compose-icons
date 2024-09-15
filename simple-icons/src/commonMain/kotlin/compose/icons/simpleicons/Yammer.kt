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
                moveTo(23.509f, 7.391f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.859f, -0.527f)
                lineToRelative(-2.31f, 0.626f)
                arcTo(17.413f, 17.413f, 0.0f, false, false, 16.39f, 0.226f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.509f, -0.225f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, false, -0.482f, 0.2f)
                lineTo(9.767f, 5.838f)
                lineTo(1.023f, 5.838f)
                curveTo(0.458f, 5.838f, 0.0f, 6.296f, 0.0f, 6.862f)
                verticalLineToRelative(10.237f)
                curveToRelative(0.0f, 0.566f, 0.458f, 1.025f, 1.023f, 1.025f)
                horizontalLineToRelative(8.704f)
                lineToRelative(5.672f, 5.677f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.99f, -0.025f)
                arcToRelative(17.431f, 17.431f, 0.0f, false, false, 3.951f, -7.264f)
                lineToRelative(2.311f, 0.626f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, 0.859f, -0.527f)
                arcToRelative(21.902f, 21.902f, 0.0f, false, false, 0.0f, -9.22f)
                close()
                moveTo(15.836f, 1.941f)
                arcToRelative(15.854f, 15.854f, 0.0f, false, true, 3.023f, 5.95f)
                lineToRelative(-6.596f, 1.786f)
                verticalLineToRelative(-2.815f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, -0.48f, -0.865f)
                close()
                moveTo(9.274f, 9.226f)
                lineToRelative(-2.205f, 3.881f)
                verticalLineToRelative(2.022f)
                arcToRelative(0.938f, 0.938f, 0.0f, true, true, -1.876f, 0.0f)
                verticalLineToRelative(-2.193f)
                lineTo(3.085f, 9.226f)
                arcToRelative(0.864f, 0.864f, 0.0f, true, true, 1.501f, -0.855f)
                lineToRelative(1.594f, 2.978f)
                lineToRelative(1.594f, -2.978f)
                arcToRelative(0.861f, 0.861f, 0.0f, false, true, 1.176f, -0.324f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, 0.324f, 1.179f)
                close()
                moveTo(18.858f, 16.111f)
                arcToRelative(15.854f, 15.854f, 0.0f, false, true, -3.023f, 5.95f)
                lineToRelative(-4.079f, -4.082f)
                curveToRelative(0.301f, -0.178f, 0.506f, -0.504f, 0.506f, -0.88f)
                verticalLineToRelative(-2.774f)
                close()
                moveTo(22.174f, 15.413f)
                lineToRelative(-9.912f, -2.684f)
                verticalLineToRelative(-1.456f)
                lineToRelative(9.912f, -2.684f)
                arcToRelative(20.407f, 20.407f, 0.0f, false, true, 0.0f, 6.824f)
                close()
            }
        }
        .build()
        return _yammer!!
    }

private var _yammer: ImageVector? = null
