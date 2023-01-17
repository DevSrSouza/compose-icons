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

public val SimpleIcons.Tsnode: ImageVector
    get() {
        if (_tsnode != null) {
            return _tsnode!!
        }
        _tsnode = Builder(name = "Tsnode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveToRelative(-0.196f, 0.0f, -0.392f, 0.05f, -0.568f, 0.153f)
                lineTo(2.026f, 5.58f)
                arcToRelative(1.135f, 1.135f, 0.0f, false, false, -0.568f, 0.983f)
                verticalLineTo(17.43f)
                curveToRelative(0.0f, 0.406f, 0.216f, 0.781f, 0.568f, 0.984f)
                lineToRelative(5.787f, 3.344f)
                verticalLineToRelative(-7.344f)
                horizontalLineTo(4.748f)
                verticalLineToRelative(-1.943f)
                horizontalLineToRelative(8.342f)
                verticalLineToRelative(1.943f)
                horizontalLineToRelative(-3.065f)
                verticalLineToRelative(8.622f)
                lineToRelative(1.406f, 0.812f)
                curveToRelative(0.351f, 0.203f, 0.784f, 0.203f, 1.136f, 0.0f)
                lineToRelative(2.317f, -1.338f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, true, -1.195f, -1.413f)
                lineToRelative(1.801f, -1.042f)
                curveToRelative(0.361f, 0.59f, 0.806f, 1.06f, 1.48f, 1.25f)
                lineToRelative(2.174f, -1.256f)
                curveToRelative(-0.127f, -0.568f, -0.698f, -0.823f, -1.584f, -1.21f)
                lineToRelative(-0.553f, -0.238f)
                curveToRelative(-1.596f, -0.68f, -2.655f, -1.532f, -2.655f, -3.334f)
                curveToRelative(0.0f, -1.658f, 1.265f, -2.922f, 3.24f, -2.922f)
                curveToRelative(1.406f, 0.0f, 2.417f, 0.49f, 3.144f, 1.77f)
                lineToRelative(-1.723f, 1.105f)
                curveToRelative(-0.379f, -0.68f, -0.79f, -0.948f, -1.421f, -0.948f)
                curveToRelative(-0.648f, 0.0f, -1.06f, 0.41f, -1.06f, 0.948f)
                curveToRelative(0.0f, 0.663f, 0.412f, 0.932f, 1.36f, 1.343f)
                lineToRelative(0.553f, 0.237f)
                curveToRelative(1.336f, 0.573f, 2.255f, 1.155f, 2.676f, 2.107f)
                lineToRelative(0.853f, -0.493f)
                curveToRelative(0.352f, -0.203f, 0.568f, -0.578f, 0.568f, -0.984f)
                verticalLineTo(6.565f)
                curveToRelative(0.0f, -0.406f, -0.216f, -0.782f, -0.568f, -0.984f)
                lineTo(12.567f, 0.153f)
                arcTo(1.134f, 1.134f, 0.0f, false, false, 11.999f, 0.0f)
                close()
            }
        }
        .build()
        return _tsnode!!
    }

private var _tsnode: ImageVector? = null
