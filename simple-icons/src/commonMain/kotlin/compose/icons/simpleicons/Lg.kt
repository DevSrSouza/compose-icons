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

public val SimpleIcons.Lg: ImageVector
    get() {
        if (_lg != null) {
            return _lg!!
        }
        _lg = Builder(name = "Lg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.522f, 14.078f)
                horizontalLineToRelative(3.27f)
                verticalLineToRelative(1.33f)
                horizontalLineToRelative(-4.847f)
                verticalLineToRelative(-6.83f)
                horizontalLineToRelative(1.577f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(21.262f, 12.804f)
                horizontalLineToRelative(1.284f)
                verticalLineToRelative(1.195f)
                curveToRelative(-0.236f, 0.09f, -0.698f, 0.18f, -1.137f, 0.18f)
                curveToRelative(-1.42f, 0.0f, -1.893f, -0.721f, -1.893f, -2.186f)
                curveToRelative(0.0f, -1.398f, 0.45f, -2.221f, 1.869f, -2.221f)
                curveToRelative(0.791f, 0.0f, 1.24f, 0.248f, 1.612f, 0.722f)
                lineToRelative(0.982f, -0.903f)
                curveToRelative(-0.6f, -0.855f, -1.646f, -1.114f, -2.629f, -1.114f)
                curveToRelative(-2.208f, 0.0f, -3.368f, 1.205f, -3.368f, 3.504f)
                curveToRelative(0.0f, 2.288f, 1.047f, 3.528f, 3.358f, 3.528f)
                curveToRelative(1.06f, 0.0f, 2.096f, -0.27f, 2.66f, -0.665f)
                lineTo(24.0f, 11.53f)
                horizontalLineToRelative(-2.739f)
                verticalLineToRelative(1.274f)
                close()
                moveTo(5.291f, 6.709f)
                arcToRelative(5.29f, 5.29f, 0.0f, true, true, 0.0f, 10.582f)
                arcToRelative(5.291f, 5.291f, 0.0f, true, true, 0.0f, -10.582f)
                moveToRelative(3.16f, 8.457f)
                arcToRelative(4.445f, 4.445f, 0.0f, false, false, 1.31f, -3.161f)
                verticalLineToRelative(-0.242f)
                lineToRelative(-0.22f, 0.001f)
                lineTo(6.596f, 11.764f)
                verticalLineToRelative(0.494f)
                horizontalLineToRelative(2.662f)
                lineToRelative(-0.001f, 0.015f)
                arcToRelative(3.985f, 3.985f, 0.0f, false, true, -3.965f, 3.708f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, -2.811f, -1.165f)
                arcToRelative(3.952f, 3.952f, 0.0f, false, true, -1.164f, -2.811f)
                curveToRelative(0.0f, -1.061f, 0.414f, -2.059f, 1.164f, -2.81f)
                arcToRelative(3.951f, 3.951f, 0.0f, false, true, 2.81f, -1.164f)
                lineToRelative(0.252f, 0.003f)
                verticalLineToRelative(-0.495f)
                lineToRelative(-0.251f, -0.003f)
                arcToRelative(4.475f, 4.475f, 0.0f, false, false, -4.47f, 4.469f)
                curveToRelative(0.0f, 1.194f, 0.465f, 2.316f, 1.309f, 3.161f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, false, 3.16f, 1.31f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, false, 3.162f, -1.31f)
                moveToRelative(-2.91f, -1.297f)
                lineTo(5.543f, 9.644f)
                lineTo(5.04f, 9.644f)
                verticalLineToRelative(4.72f)
                horizontalLineToRelative(1.556f)
                verticalLineToRelative(-0.495f)
                lineTo(5.543f, 13.869f)
                close()
                moveTo(4.278f, 10.317f)
                arcToRelative(0.676f, 0.676f, 0.0f, true, false, -0.675f, 0.674f)
                arcToRelative(0.676f, 0.676f, 0.0f, false, false, 0.675f, -0.674f)
            }
        }
        .build()
        return _lg!!
    }

private var _lg: ImageVector? = null
