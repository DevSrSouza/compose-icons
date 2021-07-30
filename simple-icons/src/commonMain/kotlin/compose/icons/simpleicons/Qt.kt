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

public val SimpleIcons.Qt: ImageVector
    get() {
        if (_qt != null) {
            return _qt!!
        }
        _qt = Builder(name = "Qt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.693f, 3.162f)
                lineTo(3.33f, 3.162f)
                lineTo(0.0f, 6.49f)
                verticalLineToRelative(14.348f)
                horizontalLineToRelative(20.671f)
                lineTo(24.0f, 17.51f)
                lineTo(24.0f, 3.162f)
                close()
                moveTo(12.785f, 18.4f)
                lineToRelative(-1.562f, 0.728f)
                lineToRelative(-1.35f, -2.217f)
                curveToRelative(-0.196f, 0.057f, -0.499f, 0.09f, -0.924f, 0.09f)
                curveToRelative(-1.579f, 0.0f, -2.683f, -0.425f, -3.305f, -1.276f)
                curveToRelative(-0.622f, -0.85f, -0.932f, -2.2f, -0.932f, -4.033f)
                curveToRelative(0.0f, -1.84f, 0.319f, -3.206f, 0.949f, -4.098f)
                curveToRelative(0.63f, -0.892f, 1.726f, -1.341f, 3.288f, -1.341f)
                curveToRelative(1.562f, 0.0f, 2.658f, 0.441f, 3.28f, 1.333f)
                curveToRelative(0.63f, 0.883f, 0.94f, 2.25f, 0.94f, 4.098f)
                curveToRelative(0.0f, 1.219f, -0.13f, 2.2f, -0.384f, 2.945f)
                curveToRelative(-0.261f, 0.752f, -0.679f, 1.325f, -1.268f, 1.718f)
                close()
                moveTo(17.521f, 16.813f)
                curveToRelative(-0.858f, 0.0f, -1.447f, -0.196f, -1.766f, -0.59f)
                curveToRelative(-0.32f, -0.392f, -0.483f, -1.136f, -0.483f, -2.232f)
                verticalLineToRelative(-3.534f)
                lineTo(14.11f, 10.457f)
                lineTo(14.11f, 9.051f)
                horizontalLineToRelative(1.162f)
                lineTo(15.272f, 6.843f)
                horizontalLineToRelative(1.644f)
                lineTo(16.916f, 9.05f)
                horizontalLineToRelative(2.094f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(-2.094f)
                verticalLineToRelative(3.346f)
                curveToRelative(0.0f, 0.622f, 0.05f, 1.03f, 0.14f, 1.227f)
                curveToRelative(0.09f, 0.204f, 0.326f, 0.303f, 0.695f, 0.303f)
                lineToRelative(1.243f, -0.05f)
                lineToRelative(0.073f, 1.326f)
                curveToRelative(-0.67f, 0.13f, -1.186f, 0.196f, -1.546f, 0.196f)
                close()
                moveTo(8.941f, 7.733f)
                curveToRelative(-0.95f, 0.0f, -1.604f, 0.311f, -1.963f, 0.94f)
                curveToRelative(-0.352f, 0.63f, -0.532f, 1.629f, -0.532f, 3.011f)
                curveToRelative(0.0f, 1.374f, 0.172f, 2.364f, 0.515f, 2.953f)
                curveToRelative(0.344f, 0.589f, 1.006f, 0.892f, 1.98f, 0.892f)
                curveToRelative(0.973f, 0.0f, 1.628f, -0.295f, 1.971f, -0.876f)
                curveToRelative(0.335f, -0.58f, 0.507f, -1.57f, 0.507f, -2.953f)
                curveToRelative(0.0f, -1.39f, -0.172f, -2.396f, -0.523f, -3.026f)
                curveToRelative(-0.352f, -0.63f, -1.006f, -0.94f, -1.955f, -0.94f)
                close()
            }
        }
        .build()
        return _qt!!
    }

private var _qt: ImageVector? = null
