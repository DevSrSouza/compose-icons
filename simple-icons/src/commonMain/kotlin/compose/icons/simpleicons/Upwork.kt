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

public val SimpleIcons.Upwork: ImageVector
    get() {
        if (_upwork != null) {
            return _upwork!!
        }
        _upwork = Builder(name = "Upwork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.561f, 13.158f)
                curveToRelative(-1.102f, 0.0f, -2.135f, -0.467f, -3.074f, -1.227f)
                lineToRelative(0.228f, -1.076f)
                lineToRelative(0.008f, -0.042f)
                curveToRelative(0.207f, -1.143f, 0.849f, -3.06f, 2.839f, -3.06f)
                curveToRelative(1.492f, 0.0f, 2.703f, 1.212f, 2.703f, 2.703f)
                curveToRelative(-0.001f, 1.489f, -1.212f, 2.702f, -2.704f, 2.702f)
                close()
                moveTo(18.561f, 5.018f)
                curveToRelative(-2.539f, 0.0f, -4.51f, 1.649f, -5.31f, 4.366f)
                curveToRelative(-1.22f, -1.834f, -2.148f, -4.036f, -2.687f, -5.892f)
                lineTo(7.828f, 3.492f)
                verticalLineToRelative(7.112f)
                curveToRelative(-0.002f, 1.406f, -1.141f, 2.546f, -2.547f, 2.548f)
                curveToRelative(-1.405f, -0.002f, -2.543f, -1.143f, -2.545f, -2.548f)
                lineTo(2.736f, 3.492f)
                lineTo(0.0f, 3.492f)
                verticalLineToRelative(7.112f)
                curveToRelative(0.0f, 2.914f, 2.37f, 5.303f, 5.281f, 5.303f)
                curveToRelative(2.913f, 0.0f, 5.283f, -2.389f, 5.283f, -5.303f)
                verticalLineToRelative(-1.19f)
                curveToRelative(0.529f, 1.107f, 1.182f, 2.229f, 1.974f, 3.221f)
                lineToRelative(-1.673f, 7.873f)
                horizontalLineToRelative(2.797f)
                lineToRelative(1.213f, -5.71f)
                curveToRelative(1.063f, 0.679f, 2.285f, 1.109f, 3.686f, 1.109f)
                curveToRelative(3.0f, 0.0f, 5.439f, -2.452f, 5.439f, -5.45f)
                curveToRelative(0.0f, -3.0f, -2.439f, -5.439f, -5.439f, -5.439f)
                close()
            }
        }
        .build()
        return _upwork!!
    }

private var _upwork: ImageVector? = null
