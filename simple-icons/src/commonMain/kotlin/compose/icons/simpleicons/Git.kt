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

public val SimpleIcons.Git: ImageVector
    get() {
        if (_git != null) {
            return _git!!
        }
        _git = Builder(name = "Git", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.546f, 10.93f)
                lineTo(13.067f, 0.452f)
                curveToRelative(-0.604f, -0.603f, -1.582f, -0.603f, -2.188f, 0.0f)
                lineTo(8.708f, 2.627f)
                lineToRelative(2.76f, 2.76f)
                curveToRelative(0.645f, -0.215f, 1.379f, -0.07f, 1.889f, 0.441f)
                curveToRelative(0.516f, 0.515f, 0.658f, 1.258f, 0.438f, 1.9f)
                lineToRelative(2.658f, 2.66f)
                curveToRelative(0.645f, -0.223f, 1.387f, -0.078f, 1.9f, 0.435f)
                curveToRelative(0.721f, 0.72f, 0.721f, 1.884f, 0.0f, 2.604f)
                curveToRelative(-0.719f, 0.719f, -1.881f, 0.719f, -2.6f, 0.0f)
                curveToRelative(-0.539f, -0.541f, -0.674f, -1.337f, -0.404f, -1.996f)
                lineTo(12.86f, 8.955f)
                verticalLineToRelative(6.525f)
                curveToRelative(0.176f, 0.086f, 0.342f, 0.203f, 0.488f, 0.348f)
                curveToRelative(0.713f, 0.721f, 0.713f, 1.883f, 0.0f, 2.6f)
                curveToRelative(-0.719f, 0.721f, -1.889f, 0.721f, -2.609f, 0.0f)
                curveToRelative(-0.719f, -0.719f, -0.719f, -1.879f, 0.0f, -2.598f)
                curveToRelative(0.182f, -0.18f, 0.387f, -0.316f, 0.605f, -0.406f)
                verticalLineTo(8.835f)
                curveToRelative(-0.217f, -0.091f, -0.424f, -0.222f, -0.6f, -0.401f)
                curveToRelative(-0.545f, -0.545f, -0.676f, -1.342f, -0.396f, -2.009f)
                lineTo(7.636f, 3.7f)
                lineTo(0.45f, 10.881f)
                curveToRelative(-0.6f, 0.605f, -0.6f, 1.584f, 0.0f, 2.189f)
                lineToRelative(10.48f, 10.477f)
                curveToRelative(0.604f, 0.604f, 1.582f, 0.604f, 2.186f, 0.0f)
                lineToRelative(10.43f, -10.43f)
                curveToRelative(0.605f, -0.603f, 0.605f, -1.582f, 0.0f, -2.187f)
            }
        }
        .build()
        return _git!!
    }

private var _git: ImageVector? = null
