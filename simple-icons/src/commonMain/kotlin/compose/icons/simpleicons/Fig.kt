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

public val SimpleIcons.Fig: ImageVector
    get() {
        if (_fig != null) {
            return _fig!!
        }
        _fig = Builder(name = "Fig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.543f, 0.0f)
                arcTo(4.543f, 4.543f, 0.0f, false, false, 0.0f, 4.543f)
                verticalLineToRelative(14.914f)
                arcTo(4.543f, 4.543f, 0.0f, false, false, 4.543f, 24.0f)
                horizontalLineToRelative(14.914f)
                arcTo(4.543f, 4.543f, 0.0f, false, false, 24.0f, 19.457f)
                lineTo(24.0f, 4.543f)
                arcTo(4.543f, 4.543f, 0.0f, false, false, 19.457f, 0.0f)
                lineTo(4.543f, 0.0f)
                close()
                moveTo(15.258f, 2.572f)
                horizontalLineToRelative(3.086f)
                arcToRelative(3.326f, 3.326f, 0.0f, false, true, 0.656f, 0.065f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 0.898f, 0.326f)
                curveToRelative(0.093f, 0.05f, 0.181f, 0.106f, 0.268f, 0.164f)
                curveToRelative(0.087f, 0.058f, 0.172f, 0.12f, 0.252f, 0.186f)
                arcToRelative(3.264f, 3.264f, 0.0f, false, true, 0.789f, 0.96f)
                curveToRelative(0.05f, 0.093f, 0.098f, 0.188f, 0.139f, 0.286f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 0.187f, 0.61f)
                arcToRelative(3.276f, 3.276f, 0.0f, false, true, 0.067f, 0.66f)
                verticalLineToRelative(12.343f)
                arcToRelative(3.276f, 3.276f, 0.0f, false, true, -0.146f, 0.97f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, -0.108f, 0.3f)
                arcToRelative(3.259f, 3.259f, 0.0f, false, true, -0.301f, 0.552f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, -0.627f, 0.694f)
                curveToRelative(-0.08f, 0.066f, -0.165f, 0.127f, -0.252f, 0.185f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, true, -0.553f, 0.3f)
                arcToRelative(3.222f, 3.222f, 0.0f, false, true, -1.27f, 0.255f)
                horizontalLineToRelative(-3.085f)
                arcToRelative(3.326f, 3.326f, 0.0f, false, true, -0.658f, -0.065f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, true, -2.344f, -1.922f)
                arcToRelative(3.222f, 3.222f, 0.0f, false, true, -0.256f, -1.27f)
                lineTo(12.0f, 5.829f)
                arcToRelative(3.324f, 3.324f, 0.0f, false, true, 0.393f, -1.555f)
                arcToRelative(3.221f, 3.221f, 0.0f, false, true, 1.04f, -1.146f)
                arcToRelative(3.241f, 3.241f, 0.0f, false, true, 0.553f, -0.3f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 1.272f, -0.255f)
                close()
            }
        }
        .build()
        return _fig!!
    }

private var _fig: ImageVector? = null
