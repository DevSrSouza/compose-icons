package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Settings3Line: ImageVector
    get() {
        if (_settings3Line != null) {
            return _settings3Line!!
        }
        _settings3Line = Builder(name = "Settings3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.34f, 17.0f)
                arcToRelative(10.018f, 10.018f, 0.0f, false, true, -0.978f, -2.326f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.002f, -5.347f)
                arcTo(9.99f, 9.99f, 0.0f, false, true, 4.865f, 4.99f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.631f, -2.674f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 5.007f, 0.002f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.632f, 2.672f)
                curveToRelative(0.579f, 0.59f, 1.093f, 1.261f, 1.525f, 2.01f)
                curveToRelative(0.433f, 0.749f, 0.757f, 1.53f, 0.978f, 2.326f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.002f, 5.347f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -2.501f, 4.337f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.631f, 2.674f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -5.007f, -0.002f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.632f, -2.672f)
                arcTo(10.018f, 10.018f, 0.0f, false, true, 3.34f, 17.0f)
                close()
                moveTo(9.0f, 17.196f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, 2.25f, 2.77f)
                curveToRelative(0.499f, 0.047f, 1.0f, 0.048f, 1.499f, 0.001f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 15.0f, 17.197f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, 3.525f, -0.565f)
                curveToRelative(0.29f, -0.408f, 0.54f, -0.843f, 0.748f, -1.298f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.26f, 0.47f, -2.437f, 1.273f, -3.334f)
                arcToRelative(8.126f, 8.126f, 0.0f, false, false, -0.75f, -1.298f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 15.0f, 6.804f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -2.25f, -2.77f)
                curveToRelative(-0.499f, -0.047f, -1.0f, -0.048f, -1.499f, -0.001f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 9.0f, 6.803f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -3.525f, 0.565f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -0.748f, 1.298f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 6.0f, 12.0f)
                curveToRelative(0.0f, 1.26f, -0.47f, 2.437f, -1.273f, 3.334f)
                arcToRelative(8.126f, 8.126f, 0.0f, false, false, 0.75f, 1.298f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 9.0f, 17.196f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _settings3Line!!
    }

private var _settings3Line: ImageVector? = null
