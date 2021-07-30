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

public val SimpleIcons.Googleplay: ImageVector
    get() {
        if (_googleplay != null) {
            return _googleplay!!
        }
        _googleplay = Builder(name = "Googleplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.018f, 13.298f)
                lineToRelative(-3.919f, 2.218f)
                lineToRelative(-3.515f, -3.493f)
                lineToRelative(3.543f, -3.521f)
                lineToRelative(3.891f, 2.202f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 0.0f, 2.594f)
                close()
                moveTo(1.337f, 0.924f)
                arcToRelative(1.486f, 1.486f, 0.0f, false, false, -0.112f, 0.568f)
                verticalLineToRelative(21.017f)
                curveToRelative(0.0f, 0.217f, 0.045f, 0.419f, 0.124f, 0.6f)
                lineToRelative(11.155f, -11.087f)
                lineTo(1.337f, 0.924f)
                close()
                moveTo(13.544f, 10.989f)
                lineToRelative(3.258f, -3.238f)
                lineTo(3.45f, 0.195f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, -0.946f, -0.179f)
                lineToRelative(11.04f, 10.973f)
                close()
                moveTo(13.544f, 13.056f)
                lineToRelative(-11.0f, 10.933f)
                curveToRelative(0.298f, 0.036f, 0.612f, -0.016f, 0.906f, -0.183f)
                lineToRelative(13.324f, -7.54f)
                lineToRelative(-3.23f, -3.21f)
                close()
            }
        }
        .build()
        return _googleplay!!
    }

private var _googleplay: ImageVector? = null
