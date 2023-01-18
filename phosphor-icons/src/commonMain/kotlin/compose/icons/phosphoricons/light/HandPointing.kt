package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HandPointing: ImageVector
    get() {
        if (_handPointing != null) {
            return _handPointing!!
        }
        _handPointing = Builder(name = "HandPointing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 86.0f)
                arcToRelative(25.4f, 25.4f, 0.0f, false, false, -15.5f, 5.2f)
                arcTo(26.2f, 26.2f, 0.0f, false, false, 148.0f, 74.0f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -14.0f, 4.1f)
                lineTo(134.0f, 36.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(98.9f)
                lineTo(71.3f, 116.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -15.8f, -12.1f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -19.7f, 2.6f)
                arcToRelative(25.3f, 25.3f, 0.0f, false, false, -12.2f, 15.8f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 2.5f, 19.5f)
                curveTo(58.2f, 209.7f, 79.5f, 238.0f, 128.0f, 238.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, -86.0f)
                lineTo(214.0f, 112.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 188.0f, 86.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, 74.0f)
                curveToRelative(-38.8f, 0.0f, -57.5f, -18.4f, -91.1f, -89.3f)
                lineToRelative(-0.3f, -0.4f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -1.4f, -10.6f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 6.6f, -8.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.1f, 5.1f)
                lineToRelative(21.9f, 38.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 6.8f, 2.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.4f, -5.8f)
                lineTo(94.0f, 36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
