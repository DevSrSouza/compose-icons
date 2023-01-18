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

public val RemixIcons.InvisionFill: ImageVector
    get() {
        if (_invisionFill != null) {
            return _invisionFill!!
        }
        _invisionFill = Builder(name = "InvisionFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(6.988f, 14.065f)
                curveToRelative(-0.06f, 0.267f, -0.09f, 0.555f, -0.09f, 0.79f)
                curveToRelative(0.0f, 0.927f, 0.482f, 1.542f, 1.508f, 1.542f)
                curveToRelative(0.851f, 0.0f, 1.541f, -0.526f, 2.038f, -1.375f)
                lineToRelative(-0.303f, 1.267f)
                horizontalLineToRelative(1.69f)
                lineToRelative(0.966f, -4.031f)
                curveToRelative(0.241f, -1.02f, 0.71f, -1.55f, 1.419f, -1.55f)
                curveToRelative(0.558f, 0.0f, 0.905f, 0.36f, 0.905f, 0.957f)
                curveToRelative(0.0f, 0.173f, -0.015f, 0.361f, -0.075f, 0.565f)
                lineToRelative(-0.498f, 1.853f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, -0.106f, 0.785f)
                curveToRelative(0.0f, 0.88f, 0.498f, 1.523f, 1.54f, 1.523f)
                curveToRelative(0.89f, 0.0f, 1.6f, -0.596f, 1.992f, -2.025f)
                lineToRelative(-0.664f, -0.267f)
                curveToRelative(-0.332f, 0.958f, -0.62f, 1.13f, -0.846f, 1.13f)
                curveToRelative(-0.226f, 0.0f, -0.347f, -0.156f, -0.347f, -0.47f)
                curveToRelative(0.0f, -0.141f, 0.03f, -0.298f, 0.076f, -0.487f)
                lineToRelative(0.483f, -1.805f)
                curveToRelative(0.12f, -0.424f, 0.166f, -0.8f, 0.166f, -1.145f)
                curveToRelative(0.0f, -1.35f, -0.785f, -2.055f, -1.736f, -2.055f)
                curveToRelative(-0.89f, 0.0f, -1.796f, 0.835f, -2.248f, 1.715f)
                lineToRelative(0.331f, -1.579f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-0.363f, 1.39f)
                horizontalLineToRelative(1.208f)
                lineToRelative(-0.744f, 3.098f)
                curveToRelative(-0.583f, 1.35f, -1.656f, 1.372f, -1.79f, 1.34f)
                curveToRelative(-0.222f, -0.051f, -0.363f, -0.139f, -0.363f, -0.438f)
                curveToRelative(0.0f, -0.172f, 0.03f, -0.42f, 0.106f, -0.718f)
                lineToRelative(1.132f, -4.672f)
                lineTo(6.927f, 9.403f)
                lineToRelative(-0.362f, 1.39f)
                horizontalLineToRelative(1.192f)
                lineToRelative(-0.77f, 3.272f)
                close()
                moveTo(8.625f, 8.625f)
                arcToRelative(1.125f, 1.125f, 0.0f, true, false, 0.0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, false, 0.0f, 2.25f)
                close()
            }
        }
        .build()
        return _invisionFill!!
    }

private var _invisionFill: ImageVector? = null
