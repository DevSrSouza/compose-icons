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

public val SimpleIcons.Gumroad: ImageVector
    get() {
        if (_gumroad != null) {
            return _gumroad!!
        }
        _gumroad = Builder(name = "Gumroad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.826f, 15.069f)
                arcToRelative(1.018f, 1.018f, 0.0f, true, true, -0.001f, 2.036f)
                arcToRelative(1.018f, 1.018f, 0.0f, false, true, 0.0f, -2.036f)
                close()
                moveTo(21.327f, 1.11f)
                arcToRelative(1.018f, 1.018f, 0.0f, true, true, 0.001f, 2.036f)
                arcToRelative(1.018f, 1.018f, 0.0f, false, true, 0.0f, -2.036f)
                close()
                moveTo(3.322f, 3.107f)
                horizontalLineToRelative(16.116f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 1.89f, 1.151f)
                curveToRelative(1.174f, 0.0f, 2.129f, -0.955f, 2.129f, -2.13f)
                arcTo(2.131f, 2.131f, 0.0f, false, false, 21.327f, 0.0f)
                curveToRelative(-0.89f, 0.0f, -1.654f, 0.55f, -1.97f, 1.329f)
                horizontalLineTo(3.321f)
                curveTo(1.764f, 1.329f, 0.543f, 2.51f, 0.543f, 4.019f)
                verticalLineToRelative(17.156f)
                curveTo(0.543f, 22.706f, 1.816f, 24.0f, 3.322f, 24.0f)
                horizontalLineToRelative(17.155f)
                curveToRelative(1.51f, 0.0f, 2.738f, -1.267f, 2.738f, -2.825f)
                verticalLineTo(10.998f)
                curveToRelative(0.0f, -1.532f, -1.228f, -2.78f, -2.738f, -2.78f)
                horizontalLineTo(10.3f)
                curveToRelative(-1.553f, 0.0f, -2.866f, 1.274f, -2.866f, 2.78f)
                verticalLineToRelative(3.198f)
                curveToRelative(0.0f, 1.484f, 1.286f, 2.691f, 2.866f, 2.691f)
                horizontalLineToRelative(3.554f)
                arcToRelative(2.132f, 2.132f, 0.0f, false, false, 1.972f, 1.329f)
                curveToRelative(1.174f, 0.0f, 2.129f, -0.956f, 2.129f, -2.13f)
                reflectiveCurveToRelative(-0.955f, -2.129f, -2.13f, -2.129f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.889f, 1.152f)
                horizontalLineTo(10.3f)
                curveToRelative(-0.523f, 0.0f, -1.088f, -0.349f, -1.088f, -0.913f)
                verticalLineToRelative(-3.198f)
                curveToRelative(0.0f, -0.524f, 0.519f, -1.0f, 1.088f, -1.0f)
                horizontalLineToRelative(10.177f)
                curveToRelative(0.538f, 0.0f, 0.96f, 0.439f, 0.96f, 1.0f)
                verticalLineToRelative(10.177f)
                curveToRelative(0.0f, 0.567f, -0.44f, 1.047f, -0.96f, 1.047f)
                horizontalLineTo(3.322f)
                curveToRelative(-0.533f, 0.0f, -1.0f, -0.49f, -1.0f, -1.047f)
                verticalLineTo(4.02f)
                curveToRelative(0.0f, -0.52f, 0.43f, -0.912f, 1.0f, -0.912f)
            }
        }
        .build()
        return _gumroad!!
    }

private var _gumroad: ImageVector? = null
