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

public val SimpleIcons.Codereview: ImageVector
    get() {
        if (_codereview != null) {
            return _codereview!!
        }
        _codereview = Builder(name = "Codereview", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.986f, 23.972f)
                curveTo(5.411f, 23.972f, 0.0f, 18.561f, 0.0f, 11.986f)
                curveTo(0.0f, 5.411f, 5.411f, 0.0f, 11.986f, 0.0f)
                curveToRelative(6.575f, 0.0f, 11.986f, 5.411f, 11.986f, 11.986f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -2.492f, 7.281f)
                lineToRelative(2.062f, 2.062f)
                curveToRelative(0.293f, 0.293f, 0.458f, 0.691f, 0.458f, 1.106f)
                curveToRelative(0.0f, 0.859f, -0.706f, 1.565f, -1.565f, 1.565f)
                curveToRelative(-0.415f, 0.0f, -0.813f, -0.165f, -1.106f, -0.458f)
                lineToRelative(-2.062f, -2.062f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.281f, 2.492f)
                close()
                moveTo(18.65f, 17.971f)
                arcToRelative(8.936f, 8.936f, 0.0f, false, false, 2.31f, -5.985f)
                curveToRelative(0.0f, -4.923f, -4.051f, -8.974f, -8.974f, -8.974f)
                curveToRelative(-2.702f, 0.0f, -5.141f, 1.22f, -6.792f, 3.135f)
                horizontalLineToRelative(5.255f)
                verticalLineToRelative(2.458f)
                lineTo(3.681f, 8.605f)
                arcToRelative(8.851f, 8.851f, 0.0f, false, false, -0.536f, 1.844f)
                lineTo(9.22f, 10.449f)
                verticalLineToRelative(2.459f)
                lineTo(3.06f, 12.908f)
                curveToRelative(0.087f, 0.845f, 0.297f, 1.673f, 0.621f, 2.459f)
                horizontalLineToRelative(4.31f)
                verticalLineToRelative(2.458f)
                lineTo(5.194f, 17.825f)
                curveToRelative(1.651f, 1.915f, 4.09f, 3.135f, 6.792f, 3.135f)
                curveToRelative(2.29f, 0.0f, 4.392f, -0.877f, 5.985f, -2.31f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.679f, -0.679f)
                close()
                moveTo(9.22f, 17.825f)
                horizontalLineToRelative(7.376f)
                verticalLineToRelative(-2.458f)
                lineTo(9.22f, 15.367f)
                verticalLineToRelative(2.458f)
                close()
                moveTo(15.367f, 12.908f)
                horizontalLineToRelative(4.917f)
                verticalLineToRelative(-2.459f)
                horizontalLineToRelative(-4.917f)
                verticalLineToRelative(2.459f)
                close()
                moveTo(10.449f, 12.908f)
                horizontalLineToRelative(3.074f)
                verticalLineToRelative(-2.459f)
                horizontalLineToRelative(-3.074f)
                verticalLineToRelative(2.459f)
                close()
                moveTo(12.293f, 8.605f)
                horizontalLineToRelative(4.918f)
                lineTo(17.211f, 6.147f)
                horizontalLineToRelative(-4.918f)
                verticalLineToRelative(2.458f)
                close()
            }
        }
        .build()
        return _codereview!!
    }

private var _codereview: ImageVector? = null
