package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PasskeyFill16: ImageVector
    get() {
        if (_passkeyFill16 != null) {
            return _passkeyFill16!!
        }
        _passkeyFill16 = Builder(name = "PasskeyFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.743f, 4.757f)
                arcToRelative(3.757f, 3.757f, 0.0f, true, true, 5.851f, 3.119f)
                arcToRelative(5.991f, 5.991f, 0.0f, false, true, 2.15f, 1.383f)
                curveToRelative(0.17f, 0.17f, 0.257f, 0.405f, 0.258f, 0.646f)
                curveToRelative(0.003f, 0.598f, 0.001f, 1.197f, 0.0f, 1.795f)
                lineTo(11.0f, 12.778f)
                verticalLineToRelative(0.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(1.221f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.714f, -0.784f)
                arcToRelative(6.004f, 6.004f, 0.0f, false, true, 3.899f, -5.339f)
                arcToRelative(3.754f, 3.754f, 0.0f, false, true, -1.663f, -3.119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 6.875f)
                curveToRelative(0.0f, 0.874f, -0.448f, 1.643f, -1.127f, 2.09f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, false, -0.123f, 0.22f)
                verticalLineToRelative(0.59f)
                curveToRelative(0.0f, 0.067f, -0.026f, 0.13f, -0.073f, 0.177f)
                lineToRelative(-0.356f, 0.356f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, false, 0.0f, 0.177f)
                lineToRelative(0.356f, 0.356f)
                curveToRelative(0.047f, 0.047f, 0.073f, 0.11f, 0.073f, 0.176f)
                verticalLineToRelative(0.231f)
                curveToRelative(0.0f, 0.067f, -0.026f, 0.13f, -0.073f, 0.177f)
                lineToRelative(-0.356f, 0.356f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, false, 0.0f, 0.177f)
                lineToRelative(0.356f, 0.356f)
                curveToRelative(0.047f, 0.047f, 0.073f, 0.11f, 0.073f, 0.177f)
                verticalLineToRelative(0.287f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, true, -0.065f, 0.168f)
                lineToRelative(-0.8f, 0.88f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.77f, 0.0f)
                lineToRelative(-0.8f, -0.88f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, true, -0.065f, -0.168f)
                verticalLineTo(9.185f)
                arcToRelative(0.264f, 0.264f, 0.0f, false, false, -0.123f, -0.22f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.873f, -2.09f)
                close()
                moveTo(14.0f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _passkeyFill16!!
    }

private var _passkeyFill16: ImageVector? = null
