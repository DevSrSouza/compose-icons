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

public val SimpleIcons.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.66f, 9.553f)
                lineTo(5.66f, 5.254f)
                arcTo(6.794f, 6.794f, 0.0f, false, false, 1.606f, 16.34f)
                curveToRelative(2.379f, -1.152f, 4.042f, -3.755f, 4.054f, -6.787f)
                close()
                moveTo(6.792f, 13.668f)
                curveToRelative(-0.423f, 1.752f, -1.687f, 3.25f, -3.262f, 4.245f)
                arcToRelative(6.76f, 6.76f, 0.0f, false, false, 3.26f, 0.833f)
                arcToRelative(6.772f, 6.772f, 0.0f, false, false, 3.264f, -0.833f)
                curveToRelative(-1.575f, -0.996f, -2.84f, -2.494f, -3.262f, -4.245f)
                close()
                moveTo(11.976f, 7.565f)
                arcToRelative(6.79f, 6.79f, 0.0f, false, false, -4.052f, -2.31f)
                lineTo(7.924f, 9.52f)
                curveToRelative(0.0f, 3.045f, 1.667f, 5.663f, 4.051f, 6.818f)
                arcToRelative(6.767f, 6.767f, 0.0f, false, true, -1.607f, -4.387f)
                arcToRelative(6.755f, 6.755f, 0.0f, false, true, 1.608f, -4.386f)
                close()
                curveToRelative(1.003f, 1.183f, 1.655f, 2.714f, 1.655f, 4.387f)
                curveToRelative(0.0f, 1.674f, -0.65f, 3.203f, -1.655f, 4.388f)
                curveToRelative(2.38f, -1.15f, 4.088f, -3.755f, 4.1f, -6.787f)
                lineTo(16.076f, 5.254f)
                arcToRelative(6.9f, 6.901f, 0.0f, false, false, -4.1f, 2.31f)
                close()
                moveTo(18.34f, 9.52f)
                curveToRelative(0.0f, 3.046f, 1.667f, 5.663f, 4.053f, 6.82f)
                arcTo(6.793f, 6.793f, 0.0f, false, false, 18.34f, 5.255f)
                close()
                moveTo(17.208f, 13.668f)
                curveToRelative(-0.423f, 1.752f, -1.687f, 3.25f, -3.263f, 4.245f)
                arcToRelative(6.76f, 6.76f, 0.0f, false, false, 3.262f, 0.833f)
                arcToRelative(6.772f, 6.772f, 0.0f, false, false, 3.263f, -0.833f)
                curveToRelative(-1.575f, -0.996f, -2.839f, -2.494f, -3.262f, -4.245f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
