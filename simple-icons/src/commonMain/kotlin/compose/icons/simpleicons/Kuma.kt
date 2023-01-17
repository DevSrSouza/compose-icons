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

public val SimpleIcons.Kuma: ImageVector
    get() {
        if (_kuma != null) {
            return _kuma!!
        }
        _kuma = Builder(name = "Kuma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.02f, 0.0f)
                curveToRelative(-1.118f, 0.0f, -1.935f, 0.362f, -2.474f, 0.946f)
                arcTo(0.189f, 0.189f, 0.0f, false, true, 16.35f, 1.0f)
                arcToRelative(16.824f, 16.824f, 0.0f, false, false, -2.634f, -0.623f)
                arcToRelative(0.184f, 0.184f, 0.0f, false, false, -0.205f, 0.158f)
                arcToRelative(0.181f, 0.181f, 0.0f, false, false, 0.003f, 0.07f)
                curveToRelative(0.186f, 0.699f, 1.305f, 5.133f, 2.205f, 8.51f)
                curveToRelative(0.544f, 2.043f, -0.866f, 4.05f, -2.98f, 4.044f)
                horizontalLineToRelative(-1.31f)
                curveToRelative(-2.136f, 0.0f, -3.433f, -2.014f, -2.94f, -4.022f)
                curveToRelative(0.83f, -3.393f, 1.968f, -7.792f, 2.152f, -8.517f)
                arcToRelative(0.183f, 0.183f, 0.0f, false, false, -0.13f, -0.226f)
                arcToRelative(0.177f, 0.177f, 0.0f, false, false, -0.07f, -0.005f)
                arcToRelative(14.358f, 14.358f, 0.0f, false, false, -3.048f, 0.698f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, true, -0.208f, -0.056f)
                curveTo(6.646f, 0.398f, 5.806f, 0.003f, 4.643f, 0.003f)
                curveToRelative(-2.254f, 0.0f, -3.287f, 1.473f, -3.287f, 3.29f)
                curveToRelative(0.0f, 0.952f, 0.905f, 2.24f, 1.766f, 3.253f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, true, 0.034f, 0.18f)
                lineToRelative(-1.468f, 4.259f)
                arcToRelative(0.034f, 0.034f, 0.0f, false, false, 0.0f, 0.011f)
                curveToRelative(-0.038f, 0.148f, -0.604f, 2.662f, 3.699f, 6.661f)
                curveToRelative(1.286f, 1.2f, 5.77f, 5.52f, 6.576f, 6.293f)
                arcToRelative(0.182f, 0.182f, 0.0f, false, false, 0.251f, 0.0f)
                lineToRelative(6.774f, -6.293f)
                curveToRelative(4.648f, -4.334f, 3.54f, -6.672f, 3.54f, -6.672f)
                lineTo(20.882f, 6.27f)
                arcToRelative(0.183f, 0.183f, 0.0f, false, true, 0.028f, -0.175f)
                curveToRelative(0.733f, -0.925f, 1.4f, -1.991f, 1.4f, -2.808f)
                curveTo(22.31f, 1.473f, 21.274f, 0.0f, 19.02f, 0.0f)
                close()
                moveTo(10.995f, 7.132f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, -0.527f, 0.524f)
                lineToRelative(0.217f, 2.157f)
                verticalLineToRelative(0.003f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, 0.526f, 0.524f)
                horizontalLineToRelative(1.755f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, 0.524f, -0.53f)
                lineToRelative(0.208f, -2.154f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, -0.526f, -0.524f)
                close()
            }
        }
        .build()
        return _kuma!!
    }

private var _kuma: ImageVector? = null
