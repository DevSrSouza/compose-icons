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

public val SimpleIcons.Stopstalk: ImageVector
    get() {
        if (_stopstalk != null) {
            return _stopstalk!!
        }
        _stopstalk = Builder(name = "Stopstalk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.951f, 2.953f)
                arcToRelative(9.046f, 9.046f, 0.0f, false, true, 0.049f, 0.0f)
                arcToRelative(9.046f, 9.046f, 0.0f, false, true, 3.46f, 0.688f)
                lineTo(13.57f, 6.42f)
                lineToRelative(2.72f, 0.047f)
                lineToRelative(1.14f, -1.703f)
                arcTo(9.046f, 9.046f, 0.0f, false, true, 21.047f, 12.0f)
                arcTo(9.046f, 9.046f, 0.0f, false, true, 12.0f, 21.047f)
                arcToRelative(9.046f, 9.046f, 0.0f, false, true, -2.916f, -0.483f)
                lineToRelative(1.937f, -2.828f)
                lineToRelative(-2.72f, -0.047f)
                lineToRelative(-1.258f, 1.88f)
                arcTo(9.046f, 9.046f, 0.0f, false, true, 2.953f, 12.0f)
                arcToRelative(9.046f, 9.046f, 0.0f, false, true, 8.998f, -9.047f)
                close()
                moveTo(13.664f, 7.025f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.42f, 0.172f)
                curveToRelative(-0.17f, 0.156f, -0.266f, 0.248f, -0.297f, 0.264f)
                curveToRelative(-0.653f, -0.28f, -1.196f, -0.42f, -1.662f, -0.42f)
                curveToRelative(-0.653f, 0.0f, -1.213f, 0.219f, -1.664f, 0.639f)
                curveToRelative(-0.45f, 0.435f, -0.684f, 0.994f, -0.684f, 1.724f)
                curveToRelative(0.0f, 0.638f, 0.204f, 1.26f, 0.577f, 1.866f)
                curveToRelative(0.388f, 0.606f, 1.024f, 1.429f, 1.957f, 2.455f)
                curveToRelative(0.373f, 0.42f, 0.7f, 0.808f, 0.965f, 1.166f)
                curveToRelative(0.264f, 0.342f, 0.404f, 0.638f, 0.404f, 0.902f)
                curveToRelative(0.0f, 0.14f, -0.063f, 0.264f, -0.188f, 0.357f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, -0.466f, 0.14f)
                curveToRelative(-0.513f, 0.0f, -1.025f, -0.483f, -1.538f, -1.462f)
                curveToRelative(-0.14f, -0.28f, -0.248f, -0.45f, -0.326f, -0.527f)
                curveToRelative(-0.077f, -0.078f, -0.328f, -0.11f, -0.732f, -0.11f)
                curveToRelative(-0.311f, 0.0f, -0.465f, 0.063f, -0.465f, 0.172f)
                curveToRelative(0.0f, 0.016f, 0.03f, 0.156f, 0.092f, 0.42f)
                lineToRelative(0.435f, 2.004f)
                curveToRelative(0.016f, 0.14f, 0.048f, 0.217f, 0.11f, 0.248f)
                curveToRelative(0.046f, 0.031f, 0.14f, 0.047f, 0.279f, 0.047f)
                curveToRelative(0.358f, 0.0f, 0.59f, -0.077f, 0.684f, -0.232f)
                curveToRelative(0.046f, -0.078f, 0.11f, -0.125f, 0.187f, -0.125f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, true, 0.358f, 0.109f)
                arcToRelative(3.19f, 3.19f, 0.0f, false, false, 1.212f, 0.248f)
                curveToRelative(0.653f, 0.0f, 1.243f, -0.217f, 1.772f, -0.621f)
                curveToRelative(0.528f, -0.42f, 0.809f, -1.01f, 0.809f, -1.787f)
                curveToRelative(0.0f, -0.669f, -0.156f, -1.259f, -0.467f, -1.787f)
                curveToRelative(-0.311f, -0.529f, -0.965f, -1.384f, -1.975f, -2.58f)
                curveToRelative(-0.87f, -1.026f, -1.305f, -1.711f, -1.305f, -2.069f)
                curveToRelative(0.0f, -0.28f, 0.14f, -0.42f, 0.436f, -0.42f)
                curveToRelative(0.404f, 0.0f, 0.87f, 0.405f, 1.383f, 1.213f)
                curveToRelative(0.248f, 0.389f, 0.42f, 0.606f, 0.498f, 0.653f)
                curveToRelative(0.093f, 0.062f, 0.279f, 0.078f, 0.574f, 0.078f)
                curveToRelative(0.264f, 0.0f, 0.42f, 0.0f, 0.482f, -0.032f)
                curveToRelative(0.063f, -0.03f, 0.094f, -0.076f, 0.094f, -0.154f)
                curveToRelative(0.0f, -0.015f, -0.016f, -0.079f, -0.031f, -0.187f)
                lineToRelative(-0.467f, -2.051f)
                curveToRelative(-0.03f, -0.14f, -0.078f, -0.22f, -0.14f, -0.266f)
                arcToRelative(9.706f, 9.706f, 0.0f, false, false, -0.48f, -0.047f)
                close()
            }
        }
        .build()
        return _stopstalk!!
    }

private var _stopstalk: ImageVector? = null
