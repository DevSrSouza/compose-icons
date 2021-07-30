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

public val SimpleIcons.Coveralls: ImageVector
    get() {
        if (_coveralls != null) {
            return _coveralls!!
        }
        _coveralls = Builder(name = "Coveralls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(13.195f, 5.813f)
                lineToRelative(1.167f, 3.515f)
                lineToRelative(2.255f, 0.005f)
                curveToRelative(1.238f, 0.005f, 2.916f, 0.019f, 3.727f, 0.037f)
                lineToRelative(1.472f, 0.028f)
                lineToRelative(-2.968f, 2.152f)
                curveToRelative(-1.63f, 1.181f, -2.976f, 2.18f, -2.99f, 2.212f)
                curveToRelative(-0.01f, 0.033f, 0.487f, 1.627f, 1.106f, 3.54f)
                curveToRelative(0.619f, 1.917f, 1.12f, 3.487f, 1.116f, 3.492f)
                curveToRelative(-0.005f, 0.01f, -1.35f, -0.947f, -2.986f, -2.119f)
                curveToRelative(-1.636f, -1.177f, -3.0f, -2.147f, -3.033f, -2.161f)
                curveToRelative(-0.028f, -0.01f, -1.411f, 0.947f, -3.07f, 2.138f)
                curveToRelative(-1.655f, 1.185f, -3.02f, 2.151f, -3.024f, 2.142f)
                curveToRelative(-0.004f, -0.005f, 0.497f, -1.575f, 1.116f, -3.492f)
                curveToRelative(0.619f, -1.913f, 1.115f, -3.507f, 1.106f, -3.54f)
                curveToRelative(-0.014f, -0.032f, -1.36f, -1.03f, -2.99f, -2.212f)
                lineTo(2.23f, 9.398f)
                lineToRelative(1.472f, -0.028f)
                curveToRelative(0.811f, -0.018f, 2.49f, -0.032f, 3.727f, -0.037f)
                lineToRelative(2.254f, -0.005f)
                lineToRelative(1.168f, -3.515f)
                arcToRelative(512.54f, 512.54f, 0.0f, false, true, 1.171f, -3.516f)
                curveToRelative(0.005f, 0.0f, 0.53f, 1.58f, 1.172f, 3.516f)
                close()
            }
        }
        .build()
        return _coveralls!!
    }

private var _coveralls: ImageVector? = null
