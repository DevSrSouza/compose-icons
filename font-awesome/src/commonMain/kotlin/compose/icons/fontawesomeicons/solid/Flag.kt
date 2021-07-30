package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.565f, 98.783f)
                curveTo(295.978f, 98.783f, 251.721f, 64.0f, 184.348f, 64.0f)
                curveToRelative(-24.955f, 0.0f, -47.309f, 4.384f, -68.045f, 12.013f)
                arcToRelative(55.947f, 55.947f, 0.0f, false, false, 3.586f, -23.562f)
                curveTo(118.117f, 24.015f, 94.806f, 1.206f, 66.338f, 0.048f)
                curveTo(34.345f, -1.254f, 8.0f, 24.296f, 8.0f, 56.0f)
                curveToRelative(0.0f, 19.026f, 9.497f, 35.825f, 24.0f, 45.945f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-94.4f)
                curveToRelative(28.311f, -12.064f, 63.582f, -22.122f, 114.435f, -22.122f)
                curveToRelative(53.588f, 0.0f, 97.844f, 34.783f, 165.217f, 34.783f)
                curveToRelative(48.169f, 0.0f, 86.667f, -16.294f, 122.505f, -40.858f)
                curveTo(506.84f, 359.452f, 512.0f, 349.571f, 512.0f, 339.045f)
                verticalLineToRelative(-243.1f)
                curveToRelative(0.0f, -23.393f, -24.269f, -38.87f, -45.485f, -29.016f)
                curveToRelative(-34.338f, 15.948f, -76.454f, 31.854f, -116.95f, 31.854f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
