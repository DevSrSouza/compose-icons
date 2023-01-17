package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CloudOffline24: ImageVector
    get() {
        if (_cloudOffline24 != null) {
            return _cloudOffline24!!
        }
        _cloudOffline24 = Builder(name = "CloudOffline24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.78f, 2.22f)
                lineToRelative(19.5f, 19.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-2.845f, -2.845f)
                arcToRelative(6.932f, 6.932f, 0.0f, false, true, -0.944f, 0.065f)
                lineTo(5.017f, 20.0f)
                curveTo(2.229f, 20.0f, 0.0f, 17.831f, 0.0f, 15.059f)
                arcToRelative(4.899f, 4.899f, 0.0f, false, true, 3.111f, -4.58f)
                arcTo(7.52f, 7.52f, 0.0f, false, true, 4.36f, 5.922f)
                lineTo(1.72f, 3.28f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                close()
                moveTo(16.94f, 18.5f)
                lineTo(5.448f, 7.01f)
                arcToRelative(6.026f, 6.026f, 0.0f, false, false, -0.794f, 3.853f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.552f, 0.869f)
                curveToRelative(-1.52f, 0.385f, -2.603f, 1.712f, -2.603f, 3.328f)
                curveToRelative(0.0f, 1.917f, 1.532f, 3.44f, 3.517f, 3.44f)
                close()
                moveTo(10.836f, 2.5f)
                arcToRelative(7.865f, 7.865f, 0.0f, false, false, -3.638f, 0.88f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.692f, 1.331f)
                arcTo(6.365f, 6.365f, 0.0f, false, true, 10.836f, 4.0f)
                curveToRelative(2.588f, 0.0f, 4.77f, 1.5f, 5.72f, 3.655f)
                lineToRelative(0.179f, 0.445f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.696f, 0.471f)
                curveToRelative(2.843f, 0.0f, 5.069f, 2.206f, 5.069f, 4.965f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -1.684f, 3.716f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.986f, 1.13f)
                arcTo(6.396f, 6.396f, 0.0f, false, false, 24.0f, 13.536f)
                curveToRelative(0.0f, -3.44f, -2.652f, -6.191f, -6.054f, -6.445f)
                lineToRelative(-0.002f, -0.006f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.01f, -0.022f)
                curveTo(16.749f, 4.358f, 14.026f, 2.5f, 10.837f, 2.5f)
                close()
            }
        }
        .build()
        return _cloudOffline24!!
    }

private var _cloudOffline24: ImageVector? = null
