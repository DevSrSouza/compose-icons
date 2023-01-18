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

public val RemixIcons.HandHeartLine: ImageVector
    get() {
        if (_handHeartLine != null) {
            return _handHeartLine!!
        }
        _handHeartLine = Builder(name = "HandHeartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 4.33f, 1.5f)
                horizontalLineToRelative(2.17f)
                curveToRelative(1.332f, 0.0f, 2.53f, 0.579f, 3.353f, 1.499f)
                lineTo(19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.516f, 2.851f)
                curveTo(21.151f, 18.972f, 17.322f, 21.0f, 13.0f, 21.0f)
                curveToRelative(-2.79f, 0.0f, -5.15f, -0.603f, -7.06f, -1.658f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 5.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.001f, 12.0f)
                lineTo(6.0f, 17.021f)
                lineToRelative(0.045f, 0.033f)
                curveTo(7.84f, 18.314f, 10.178f, 19.0f, 13.0f, 19.0f)
                curveToRelative(3.004f, 0.0f, 5.799f, -1.156f, 7.835f, -3.13f)
                lineToRelative(0.133f, -0.133f)
                lineToRelative(-0.12f, -0.1f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -1.643f, -0.63f)
                lineTo(19.0f, 15.0f)
                lineToRelative(-2.112f, -0.001f)
                curveToRelative(0.073f, 0.322f, 0.112f, 0.657f, 0.112f, 1.001f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(6.79f, -0.001f)
                lineToRelative(-0.034f, -0.078f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -2.092f, -1.416f)
                lineTo(12.5f, 13.5f)
                lineTo(9.57f, 13.5f)
                arcTo(4.985f, 4.985f, 0.0f, false, false, 6.002f, 12.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(13.646f, 3.575f)
                lineTo(14.0f, 3.93f)
                lineToRelative(0.354f, -0.354f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.535f, 3.536f)
                lineTo(14.0f, 11.0f)
                lineToRelative(-3.89f, -3.89f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.536f, -3.535f)
                close()
                moveTo(11.526f, 4.99f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.06f, 0.637f)
                lineToRelative(0.058f, 0.069f)
                lineTo(14.0f, 8.17f)
                lineToRelative(2.476f, -2.474f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.058f, -0.638f)
                lineToRelative(-0.058f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.638f, -0.057f)
                lineToRelative(-0.07f, 0.058f)
                lineToRelative(-1.769f, 1.768f)
                lineToRelative(-1.767f, -1.77f)
                lineToRelative(-0.068f, -0.056f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.638f, 0.058f)
                close()
            }
        }
        .build()
        return _handHeartLine!!
    }

private var _handHeartLine: ImageVector? = null
