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

public val SimpleIcons.Celery: ImageVector
    get() {
        if (_celery != null) {
            return _celery!!
        }
        _celery = Builder(name = "Celery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.303f, 0.0f)
                arcTo(2.298f, 2.298f, 0.0f, false, false, 0.0f, 2.303f)
                verticalLineToRelative(19.394f)
                arcTo(2.298f, 2.298f, 0.0f, false, false, 2.303f, 24.0f)
                horizontalLineToRelative(19.394f)
                arcTo(2.298f, 2.298f, 0.0f, false, false, 24.0f, 21.697f)
                lineTo(24.0f, 2.303f)
                arcTo(2.298f, 2.298f, 0.0f, false, false, 21.697f, 0.0f)
                close()
                moveTo(10.48f, 3.072f)
                curveToRelative(4.098f, 0.0f, 7.028f, 1.438f, 7.68f, 1.764f)
                lineToRelative(-1.194f, 2.55f)
                curveToRelative(-2.442f, -1.057f, -4.993f, -1.41f, -5.672f, -1.41f)
                curveToRelative(-1.574f, 0.0f, -2.17f, 0.922f, -2.17f, 1.763f)
                verticalLineToRelative(8.494f)
                curveToRelative(0.0f, 0.869f, 0.596f, 1.791f, 2.17f, 1.791f)
                curveToRelative(0.679f, 0.0f, 3.23f, -0.38f, 5.672f, -1.41f)
                lineToRelative(1.194f, 2.496f)
                curveToRelative(-0.435f, 0.271f, -3.637f, 1.818f, -7.68f, 1.818f)
                curveToRelative(-1.112f, 0.0f, -4.64f, -0.244f, -4.64f, -4.64f)
                lineTo(5.84f, 7.713f)
                curveToRelative(0.0f, -4.397f, 3.528f, -4.64f, 4.64f, -4.64f)
                close()
            }
        }
        .build()
        return _celery!!
    }

private var _celery: ImageVector? = null
