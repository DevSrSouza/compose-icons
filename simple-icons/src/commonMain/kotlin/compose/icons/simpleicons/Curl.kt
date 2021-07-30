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

public val SimpleIcons.Curl: ImageVector
    get() {
        if (_curl != null) {
            return _curl!!
        }
        _curl = Builder(name = "Curl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.803f, 14.8169f)
                curveToRelative(0.0f, -0.5342f, 0.433f, -0.9665f, 0.9665f, -0.9665f)
                curveToRelative(0.5335f, 0.0f, 0.9665f, 0.4323f, 0.9665f, 0.9665f)
                curveToRelative(0.0f, 0.5335f, -0.433f, 0.9657f, -0.9665f, 0.9657f)
                curveToRelative(-0.5335f, 0.0f, -0.9666f, -0.4322f, -0.9666f, -0.9657f)
                moveToRelative(2.736f, 0.0f)
                curveToRelative(0.0f, -0.1963f, -0.0532f, -0.376f, -0.1119f, -0.5525f)
                curveToRelative(-0.2344f, -0.7024f, -0.876f, -1.2169f, -1.6575f, -1.2169f)
                curveToRelative(-0.1249f, 0.0f, -0.2344f, 0.0465f, -0.3524f, 0.0708f)
                curveTo(0.6149f, 13.2865f, 0.0f, 13.9646f, 0.0f, 14.817f)
                curveToRelative(0.0f, 0.9764f, 0.7923f, 1.7694f, 1.7695f, 1.7694f)
                curveToRelative(0.9772f, 0.0f, 1.7694f, -0.793f, 1.7694f, -1.7694f)
                moveToRelative(-1.7694f, -7.149f)
                curveToRelative(0.5335f, 0.0f, 0.9665f, 0.433f, 0.9665f, 0.9665f)
                curveToRelative(0.0f, 0.5335f, -0.433f, 0.9665f, -0.9665f, 0.9665f)
                curveToRelative(-0.5343f, 0.0f, -0.9666f, -0.433f, -0.9666f, -0.9665f)
                curveToRelative(0.0f, -0.5335f, 0.4323f, -0.9665f, 0.9666f, -0.9665f)
                moveToRelative(0.0f, 2.7359f)
                curveToRelative(0.9772f, 0.0f, 1.7694f, -0.7923f, 1.7694f, -1.7694f)
                curveToRelative(0.0f, -0.1956f, -0.0532f, -0.376f, -0.1119f, -0.5525f)
                curveToRelative(-0.2344f, -0.7024f, -0.8767f, -1.2169f, -1.6575f, -1.2169f)
                curveToRelative(-0.1249f, 0.0f, -0.2344f, 0.0465f, -0.3524f, 0.0716f)
                curveTo(0.6149f, 7.104f, 0.0f, 7.782f, 0.0f, 8.6344f)
                curveToRelative(0.0f, 0.9771f, 0.7923f, 1.7694f, 1.7695f, 1.7694f)
                moveToRelative(13.221f, -5.694f)
                curveToRelative(-0.5342f, 0.0f, -0.9665f, -0.433f, -0.9665f, -0.9664f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, 0.9666f, -0.9665f)
                curveToRelative(0.5335f, 0.0f, 0.9658f, 0.4322f, 0.9658f, 0.9665f)
                curveToRelative(0.0f, 0.5334f, -0.4323f, 0.9664f, -0.9658f, 0.9664f)
                moveToRelative(-9.6f, 16.5133f)
                curveToRelative(-0.5335f, 0.0f, -0.9666f, -0.433f, -0.9666f, -0.9665f)
                curveToRelative(0.0f, -0.5342f, 0.433f, -0.9665f, 0.9666f, -0.9665f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, 0.9665f, 0.9665f)
                curveToRelative(0.0f, 0.5335f, -0.4323f, 0.9665f, -0.9665f, 0.9665f)
                moveToRelative(9.6f, -19.2491f)
                curveToRelative(-0.978f, 0.0f, -1.7695f, 0.7922f, -1.7695f, 1.7694f)
                curveToRelative(0.0f, 0.2085f, 0.0525f, 0.4025f, 0.1187f, 0.5882f)
                lineTo(5.039f, 18.5581f)
                curveToRelative(-0.803f, 0.1681f, -1.4179f, 0.8462f, -1.4179f, 1.6985f)
                curveToRelative(0.0f, 0.9772f, 0.7923f, 1.7694f, 1.7695f, 1.7694f)
                curveToRelative(0.9772f, 0.0f, 1.7694f, -0.7922f, 1.7694f, -1.7694f)
                curveToRelative(0.0f, -0.1963f, -0.0525f, -0.3759f, -0.111f, -0.5525f)
                lineToRelative(8.3427f, -14.2728f)
                curveToRelative(0.7778f, -0.1865f, 1.3683f, -0.8531f, 1.3683f, -1.688f)
                curveToRelative(0.0f, -0.977f, -0.793f, -1.7693f, -1.7694f, -1.7693f)
                moveToRelative(7.24f, 2.7359f)
                curveToRelative(-0.5343f, 0.0f, -0.9666f, -0.433f, -0.9666f, -0.9665f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, 0.9665f, -0.9665f)
                curveToRelative(0.5335f, 0.0f, 0.9666f, 0.4322f, 0.9666f, 0.9665f)
                curveToRelative(0.0f, 0.5334f, -0.433f, 0.9665f, -0.9666f, 0.9665f)
                moveTo(12.6313f, 21.223f)
                curveToRelative(-0.5343f, 0.0f, -0.9665f, -0.433f, -0.9665f, -0.9665f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, 0.9665f, -0.9665f)
                curveToRelative(0.5335f, 0.0f, 0.9658f, 0.4323f, 0.9658f, 0.9665f)
                curveToRelative(0.0f, 0.5335f, -0.4323f, 0.9665f, -0.9658f, 0.9665f)
                moveTo(22.2305f, 1.974f)
                curveToRelative(-0.9772f, 0.0f, -1.7694f, 0.7922f, -1.7694f, 1.7694f)
                curveToRelative(0.0f, 0.2085f, 0.0525f, 0.4025f, 0.1187f, 0.5882f)
                lineToRelative(-8.3009f, 14.2265f)
                curveToRelative(-0.8021f, 0.1681f, -1.417f, 0.8462f, -1.417f, 1.6985f)
                curveToRelative(0.0f, 0.9772f, 0.7922f, 1.7694f, 1.7694f, 1.7694f)
                curveToRelative(0.9764f, 0.0f, 1.7687f, -0.7922f, 1.7687f, -1.7694f)
                curveToRelative(0.0f, -0.1963f, -0.0525f, -0.3759f, -0.1111f, -0.5525f)
                lineToRelative(8.3427f, -14.2728f)
                curveTo(23.4094f, 5.2448f, 24.0f, 4.5782f, 24.0f, 3.7433f)
                curveToRelative(0.0f, -0.977f, -0.7923f, -1.7693f, -1.7695f, -1.7693f)
            }
        }
        .build()
        return _curl!!
    }

private var _curl: ImageVector? = null
