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

public val SimpleIcons.Remark: ImageVector
    get() {
        if (_remark != null) {
            return _remark!!
        }
        _remark = Builder(name = "Remark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.204f, 18.089f)
                lineTo(4.204f, 12.66f)
                quadToRelative(0.0f, -2.477f, 1.156f, -3.947f)
                quadToRelative(1.156f, -1.47f, 3.108f, -1.47f)
                quadToRelative(0.494f, 0.0f, 1.03f, 0.092f)
                quadToRelative(0.54f, 0.088f, 0.953f, 0.245f)
                lineTo(10.451f, 5.976f)
                quadToRelative(-0.279f, -0.122f, -0.754f, -0.195f)
                quadToRelative(-0.478f, -0.073f, -1.007f, -0.073f)
                quadToRelative(-1.76f, 0.0f, -2.902f, 0.88f)
                quadToRelative(-1.144f, 0.881f, -1.458f, 2.497f)
                horizontalLineToRelative(-0.157f)
                lineTo(4.173f, 6.01f)
                lineTo(0.0f, 6.01f)
                verticalLineToRelative(1.186f)
                horizontalLineToRelative(2.737f)
                lineTo(2.737f, 18.09f)
                close()
                moveTo(0.245f, 18.089f)
                lineTo(8.04f, 18.089f)
                verticalLineToRelative(-1.187f)
                lineTo(0.245f, 16.902f)
                close()
                moveTo(19.1f, 7.109f)
                quadToRelative(1.604f, 0.0f, 2.507f, 1.095f)
                quadToRelative(0.904f, 1.091f, 0.904f, 3.02f)
                lineTo(15.6f, 11.224f)
                quadToRelative(0.0f, -1.94f, 0.93f, -3.027f)
                quadToRelative(0.93f, -1.088f, 2.569f, -1.088f)
                close()
                moveTo(23.946f, 15.107f)
                horizontalLineToRelative(-1.458f)
                quadToRelative(-0.28f, 0.884f, -1.133f, 1.378f)
                quadToRelative(-0.854f, 0.494f, -2.087f, 0.494f)
                quadToRelative(-1.68f, 0.0f, -2.676f, -1.114f)
                quadToRelative(-0.991f, -1.118f, -0.991f, -3.013f)
                verticalLineToRelative(-0.414f)
                lineTo(24.0f, 12.438f)
                verticalLineToRelative(-0.953f)
                quadToRelative(0.0f, -1.807f, -0.578f, -3.074f)
                quadToRelative(-0.574f, -1.267f, -1.67f, -1.933f)
                quadToRelative(-1.094f, -0.67f, -2.652f, -0.67f)
                quadToRelative(-1.493f, 0.0f, -2.615f, 0.658f)
                quadToRelative(-1.118f, 0.655f, -1.738f, 1.838f)
                quadToRelative(-0.617f, 1.183f, -0.617f, 2.775f)
                verticalLineToRelative(1.761f)
                quadToRelative(0.0f, 2.58f, 1.352f, 4.016f)
                quadToRelative(1.351f, 1.436f, 3.786f, 1.436f)
                quadToRelative(1.221f, 0.0f, 2.205f, -0.394f)
                quadToRelative(0.98f, -0.39f, 1.627f, -1.11f)
                quadToRelative(0.643f, -0.717f, 0.846f, -1.681f)
                close()
            }
        }
        .build()
        return _remark!!
    }

private var _remark: ImageVector? = null
