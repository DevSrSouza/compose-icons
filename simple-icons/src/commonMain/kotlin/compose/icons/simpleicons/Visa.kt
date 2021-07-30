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

public val SimpleIcons.Visa: ImageVector
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = Builder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.112f, 8.262f)
                lineTo(5.97f, 15.758f)
                lineTo(3.92f, 15.758f)
                lineTo(2.374f, 9.775f)
                curveToRelative(-0.094f, -0.368f, -0.175f, -0.503f, -0.461f, -0.658f)
                curveTo(1.447f, 8.864f, 0.677f, 8.627f, 0.0f, 8.479f)
                lineToRelative(0.046f, -0.217f)
                horizontalLineToRelative(3.3f)
                arcToRelative(0.904f, 0.904f, 0.0f, false, true, 0.894f, 0.764f)
                lineToRelative(0.817f, 4.338f)
                lineToRelative(2.018f, -5.102f)
                close()
                moveTo(17.145f, 13.311f)
                curveToRelative(0.008f, -1.979f, -2.736f, -2.088f, -2.717f, -2.972f)
                curveToRelative(0.006f, -0.269f, 0.262f, -0.555f, 0.822f, -0.628f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, true, 1.913f, 0.336f)
                lineToRelative(0.34f, -1.59f)
                arcToRelative(5.207f, 5.207f, 0.0f, false, false, -1.814f, -0.333f)
                curveToRelative(-1.917f, 0.0f, -3.266f, 1.02f, -3.278f, 2.479f)
                curveToRelative(-0.012f, 1.079f, 0.963f, 1.68f, 1.698f, 2.04f)
                curveToRelative(0.756f, 0.367f, 1.01f, 0.603f, 1.006f, 0.931f)
                curveToRelative(-0.005f, 0.504f, -0.602f, 0.725f, -1.16f, 0.734f)
                curveToRelative(-0.975f, 0.015f, -1.54f, -0.263f, -1.992f, -0.473f)
                lineToRelative(-0.351f, 1.642f)
                curveToRelative(0.453f, 0.208f, 1.289f, 0.39f, 2.156f, 0.398f)
                curveToRelative(2.037f, 0.0f, 3.37f, -1.006f, 3.377f, -2.564f)
                moveToRelative(5.061f, 2.447f)
                lineTo(24.0f, 15.758f)
                lineToRelative(-1.565f, -7.496f)
                horizontalLineToRelative(-1.656f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.826f, 0.55f)
                lineToRelative(-2.909f, 6.946f)
                horizontalLineToRelative(2.036f)
                lineToRelative(0.405f, -1.12f)
                horizontalLineToRelative(2.488f)
                close()
                moveTo(20.043f, 13.102f)
                lineToRelative(1.02f, -2.815f)
                lineToRelative(0.588f, 2.815f)
                close()
                moveTo(11.883f, 8.262f)
                lineToRelative(-1.603f, 7.496f)
                lineTo(8.34f, 15.758f)
                lineToRelative(1.605f, -7.496f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: ImageVector? = null
