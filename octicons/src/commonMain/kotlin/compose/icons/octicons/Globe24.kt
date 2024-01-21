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

public val Octicons.Globe24: ImageVector
    get() {
        if (_globe24 != null) {
            return _globe24!!
        }
        _globe24 = Builder(name = "Globe24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(15.241f, 11.5f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.1f, -2.708f, -0.992f, -4.904f, -1.89f, -6.452f)
                arcToRelative(13.919f, 13.919f, 0.0f, false, false, -1.304f, -1.88f)
                lineTo(12.0f, 3.11f)
                lineToRelative(-0.047f, 0.059f)
                curveToRelative(-0.354f, 0.425f, -0.828f, 1.06f, -1.304f, 1.88f)
                curveToRelative(-0.898f, 1.547f, -1.79f, 3.743f, -1.89f, 6.451f)
                close()
                moveTo(2.513f, 11.5f)
                horizontalLineToRelative(4.745f)
                curveToRelative(0.1f, -3.037f, 1.1f, -5.49f, 2.093f, -7.204f)
                curveToRelative(0.39f, -0.672f, 0.78f, -1.233f, 1.119f, -1.673f)
                curveTo(6.11f, 3.329f, 2.746f, 7.0f, 2.513f, 11.5f)
                close()
                moveTo(21.487f, 11.5f)
                curveTo(21.254f, 7.0f, 17.89f, 3.329f, 13.53f, 2.623f)
                curveToRelative(0.339f, 0.44f, 0.729f, 1.001f, 1.119f, 1.673f)
                curveToRelative(0.993f, 1.714f, 1.993f, 4.167f, 2.093f, 7.204f)
                close()
                moveTo(8.787f, 13.0f)
                curveToRelative(0.182f, 2.478f, 1.02f, 4.5f, 1.862f, 5.953f)
                curveToRelative(0.382f, 0.661f, 0.818f, 1.29f, 1.304f, 1.88f)
                lineToRelative(0.047f, 0.057f)
                lineToRelative(0.047f, -0.059f)
                curveToRelative(0.354f, -0.425f, 0.828f, -1.06f, 1.304f, -1.88f)
                curveToRelative(0.842f, -1.451f, 1.679f, -3.471f, 1.862f, -5.951f)
                close()
                moveTo(7.283f, 13.0f)
                lineTo(2.552f, 13.0f)
                arcToRelative(9.505f, 9.505f, 0.0f, false, false, 7.918f, 8.377f)
                arcToRelative(15.773f, 15.773f, 0.0f, false, true, -1.119f, -1.673f)
                curveTo(8.413f, 18.085f, 7.47f, 15.807f, 7.283f, 13.0f)
                close()
                moveTo(16.717f, 13.0f)
                curveToRelative(-0.186f, 2.807f, -1.13f, 5.085f, -2.068f, 6.704f)
                curveToRelative(-0.39f, 0.672f, -0.78f, 1.233f, -1.118f, 1.673f)
                arcTo(9.506f, 9.506f, 0.0f, false, false, 21.447f, 13.0f)
                close()
            }
        }
        .build()
        return _globe24!!
    }

private var _globe24: ImageVector? = null
