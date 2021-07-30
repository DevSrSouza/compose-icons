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

public val SimpleIcons.Deutschebahn: ImageVector
    get() {
        if (_deutschebahn != null) {
            return _deutschebahn!!
        }
        _deutschebahn = Builder(name = "Deutschebahn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6f, 3.6f)
                lineTo(2.4f, 3.6f)
                curveTo(1.08f, 3.6f, 0.0f, 4.68f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.32f, 1.08f, 2.4f, 2.4f, 2.4f)
                horizontalLineToRelative(19.2f)
                curveToRelative(1.32f, 0.0f, 2.4f, -1.08f, 2.4f, -2.424f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.32f, -1.08f, -2.4f, -2.4f, -2.4f)
                close()
                moveTo(22.248f, 17.976f)
                curveToRelative(0.024f, 0.36f, -0.264f, 0.672f, -0.648f, 0.696f)
                lineTo(2.4f, 18.672f)
                curveToRelative(-0.36f, 0.0f, -0.648f, -0.312f, -0.648f, -0.672f)
                lineTo(1.752f, 6.0f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, 0.624f, -0.696f)
                lineTo(21.6f, 5.304f)
                curveToRelative(0.36f, 0.0f, 0.648f, 0.312f, 0.648f, 0.672f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(7.344f, 6.504f)
                lineTo(3.312f, 6.504f)
                verticalLineToRelative(10.992f)
                horizontalLineToRelative(4.032f)
                curveToRelative(3.336f, -0.024f, 4.416f, -2.376f, 4.416f, -5.544f)
                curveToRelative(0.0f, -3.672f, -1.56f, -5.448f, -4.416f, -5.448f)
                close()
                moveTo(6.888f, 15.72f)
                horizontalLineToRelative(-0.936f)
                lineTo(5.952f, 8.232f)
                horizontalLineToRelative(0.528f)
                curveToRelative(2.376f, 0.0f, 2.616f, 1.728f, 2.616f, 3.936f)
                curveToRelative(0.0f, 2.424f, -0.816f, 3.552f, -2.208f, 3.552f)
                close()
                moveTo(18.72f, 11.736f)
                curveToRelative(1.128f, -0.336f, 1.896f, -1.368f, 1.92f, -2.568f)
                curveToRelative(0.0f, -0.24f, -0.048f, -2.688f, -3.144f, -2.688f)
                horizontalLineToRelative(-4.584f)
                verticalLineToRelative(10.992f)
                lineTo(16.8f, 17.472f)
                curveToRelative(1.032f, 0.0f, 4.248f, 0.0f, 4.248f, -3.096f)
                curveToRelative(0.0f, -0.744f, -0.336f, -2.208f, -2.328f, -2.64f)
                close()
                moveTo(16.368f, 8.208f)
                curveToRelative(1.176f, 0.0f, 1.656f, 0.408f, 1.656f, 1.32f)
                curveToRelative(0.0f, 0.72f, -0.528f, 1.32f, -1.44f, 1.32f)
                horizontalLineToRelative(-1.032f)
                verticalLineToRelative(-2.64f)
                horizontalLineToRelative(0.816f)
                close()
                moveTo(16.608f, 15.72f)
                horizontalLineToRelative(-1.08f)
                verticalLineToRelative(-2.832f)
                horizontalLineToRelative(1.152f)
                curveToRelative(1.368f, 0.0f, 1.704f, 0.792f, 1.704f, 1.416f)
                curveToRelative(0.0f, 1.416f, -1.344f, 1.416f, -1.776f, 1.416f)
                close()
            }
        }
        .build()
        return _deutschebahn!!
    }

private var _deutschebahn: ImageVector? = null
