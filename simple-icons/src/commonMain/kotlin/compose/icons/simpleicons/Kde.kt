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

public val SimpleIcons.Kde: ImageVector
    get() {
        if (_kde != null) {
            return _kde!!
        }
        _kde = Builder(name = "Kde", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.881f, 0.0f)
                lineTo(9.89f, 0.382f)
                verticalLineToRelative(16.435f)
                lineToRelative(3.949f, -0.594f)
                verticalLineTo(9.216f)
                lineToRelative(5.308f, 7.772f)
                lineToRelative(4.162f, -1.317f)
                lineToRelative(-5.436f, -7.475f)
                lineToRelative(5.479f, -7.05f)
                lineTo(19.105f, 0.17f)
                lineTo(13.84f, 7.22f)
                close()
                moveTo(4.834f, 4.005f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, -0.123f, 0.059f)
                lineTo(3.145f, 5.63f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, -0.03f, 0.248f)
                lineTo(4.949f, 8.9f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, -0.772f, 1.759f)
                lineToRelative(-3.367f, 0.7f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, -0.162f, 0.199f)
                verticalLineToRelative(2.215f)
                curveToRelative(0.0f, 0.093f, 0.064f, 0.174f, 0.155f, 0.196f)
                lineToRelative(3.268f, 0.8f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.801f, 2.03f)
                lineTo(2.98f, 19.683f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, 0.027f, 0.254f)
                lineToRelative(1.566f, 1.567f)
                arcToRelative(0.204f, 0.204f, 0.0f, false, false, 0.249f, 0.03f)
                lineToRelative(2.964f, -1.8f)
                curveToRelative(0.582f, 0.336f, 1.21f, 0.6f, 1.874f, 0.78f)
                lineToRelative(0.692f, 3.325f)
                curveToRelative(0.02f, 0.094f, 0.102f, 0.161f, 0.198f, 0.161f)
                horizontalLineToRelative(2.215f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.197f, -0.155f)
                lineToRelative(0.815f, -3.332f)
                arcToRelative(7.807f, 7.807f, 0.0f, false, false, 1.927f, -0.811f)
                lineToRelative(2.922f, 1.915f)
                curveToRelative(0.08f, 0.053f, 0.186f, 0.042f, 0.254f, -0.026f)
                lineToRelative(1.567f, -1.566f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.03f, -0.248f)
                lineToRelative(-1.067f, -1.758f)
                lineToRelative(-0.345f, 0.11f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, true, -0.135f, -0.047f)
                lineTo(17.371f, 15.8f)
                arcToRelative(6.347f, 6.347f, 0.0f, true, true, -8.255f, -8.674f)
                verticalLineTo(5.488f)
                curveToRelative(-0.401f, 0.14f, -0.79f, 0.31f, -1.159f, 0.511f)
                lineToRelative(-0.001f, -0.002f)
                lineToRelative(-2.99f, -1.96f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, -0.132f, -0.033f)
                close()
            }
        }
        .build()
        return _kde!!
    }

private var _kde: ImageVector? = null
