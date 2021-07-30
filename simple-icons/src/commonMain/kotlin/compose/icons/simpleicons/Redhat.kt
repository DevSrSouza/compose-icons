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

public val SimpleIcons.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.009f, 13.386f)
                curveToRelative(1.577f, 0.0f, 3.86f, -0.326f, 3.86f, -2.202f)
                arcToRelative(1.765f, 1.765f, 0.0f, false, false, -0.04f, -0.431f)
                lineToRelative(-0.94f, -4.08f)
                curveToRelative(-0.216f, -0.898f, -0.406f, -1.305f, -1.982f, -2.093f)
                curveToRelative(-1.223f, -0.625f, -3.888f, -1.658f, -4.676f, -1.658f)
                curveToRelative(-0.733f, 0.0f, -0.947f, 0.946f, -1.822f, 0.946f)
                curveToRelative(-0.842f, 0.0f, -1.467f, -0.706f, -2.255f, -0.706f)
                curveToRelative(-0.757f, 0.0f, -1.25f, 0.515f, -1.63f, 1.576f)
                curveToRelative(0.0f, 0.0f, -1.06f, 2.99f, -1.197f, 3.424f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, -0.028f, 0.245f)
                curveToRelative(0.0f, 1.162f, 4.577f, 4.974f, 10.71f, 4.974f)
                moveToRelative(4.101f, -1.435f)
                curveToRelative(0.218f, 1.032f, 0.218f, 1.14f, 0.218f, 1.277f)
                curveToRelative(0.0f, 1.765f, -1.984f, 2.745f, -4.593f, 2.745f)
                curveToRelative(-5.895f, 0.004f, -11.06f, -3.451f, -11.06f, -5.734f)
                arcToRelative(2.326f, 2.326f, 0.0f, false, true, 0.19f, -0.925f)
                curveTo(2.746f, 9.415f, 0.0f, 9.794f, 0.0f, 12.217f)
                curveToRelative(0.0f, 3.969f, 9.405f, 8.861f, 16.851f, 8.861f)
                curveToRelative(5.71f, 0.0f, 7.149f, -2.582f, 7.149f, -4.62f)
                curveToRelative(0.0f, -1.605f, -1.387f, -3.425f, -3.887f, -4.512f)
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
