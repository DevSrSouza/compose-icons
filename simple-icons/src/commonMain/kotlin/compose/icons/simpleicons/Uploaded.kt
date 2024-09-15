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

public val SimpleIcons.Uploaded: ImageVector
    get() {
        if (_uploaded != null) {
            return _uploaded!!
        }
        _uploaded = Builder(name = "Uploaded", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.651f, 13.862f)
                curveToRelative(0.0f, 2.548f, -2.065f, 4.613f, -4.613f, 4.613f)
                curveToRelative(-2.548f, 0.0f, -4.613f, -2.065f, -4.613f, -4.613f)
                curveToRelative(0.0f, -6.151f, 9.226f, -6.151f, 9.226f, 0.0f)
                close()
                moveTo(18.148f, 19.902f)
                curveToRelative(-1.33f, 1.334f, -3.109f, 3.957f, -8.119f, 4.095f)
                curveToRelative(-5.451f, 0.148f, -9.959f, -4.484f, -9.978f, -10.282f)
                curveToRelative(-0.01f, -2.945f, 0.774f, -4.659f, 2.82f, -6.792f)
                curveToRelative(1.224f, -1.278f, 7.004f, -6.923f, 7.004f, -6.923f)
                curveToRelative(2.052f, 2.052f, 0.96f, 4.873f, -0.108f, 5.93f)
                lineToRelative(-3.732f, 3.705f)
                curveToRelative(-0.47f, 0.465f, -1.968f, 1.925f, -1.931f, 4.444f)
                curveToRelative(0.045f, 3.202f, 2.51f, 5.85f, 5.799f, 5.8f)
                curveToRelative(2.632f, -0.042f, 3.756f, -1.356f, 4.376f, -1.98f)
                lineToRelative(3.841f, -3.828f)
                curveToRelative(1.103f, -1.093f, 3.77f, -2.027f, 5.829f, 0.005f)
                close()
            }
        }
        .build()
        return _uploaded!!
    }

private var _uploaded: ImageVector? = null
