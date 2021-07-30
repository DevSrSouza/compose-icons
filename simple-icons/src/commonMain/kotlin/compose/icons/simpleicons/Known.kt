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

public val SimpleIcons.Known: ImageVector
    get() {
        if (_known != null) {
            return _known!!
        }
        _known = Builder(name = "Known", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.387f, 16.926f)
                horizontalLineToRelative(0.604f)
                verticalLineToRelative(1.936f)
                horizontalLineToRelative(-6.086f)
                verticalLineToRelative(-1.936f)
                horizontalLineToRelative(0.904f)
                reflectiveCurveToRelative(0.333f, -0.072f, 0.26f, -0.386f)
                lineToRelative(-2.392f, -3.776f)
                lineToRelative(-1.893f, 1.847f)
                verticalLineToRelative(1.322f)
                curveToRelative(0.0f, 0.653f, 0.324f, 0.993f, 0.687f, 0.993f)
                horizontalLineToRelative(0.844f)
                verticalLineToRelative(1.936f)
                lineTo(5.414f, 18.862f)
                verticalLineToRelative(-1.936f)
                horizontalLineToRelative(0.741f)
                curveToRelative(0.364f, 0.0f, 0.688f, -0.34f, 0.688f, -0.993f)
                lineTo(6.843f, 7.992f)
                curveToRelative(0.0f, -0.364f, -0.324f, -0.855f, -0.688f, -0.855f)
                horizontalLineToRelative(-0.741f)
                lineTo(5.414f, 5.201f)
                horizontalLineToRelative(5.901f)
                verticalLineToRelative(1.936f)
                horizontalLineToRelative(-0.844f)
                curveToRelative(-0.363f, 0.0f, -0.687f, 0.491f, -0.687f, 0.855f)
                verticalLineToRelative(3.83f)
                lineToRelative(4.087f, -4.144f)
                arcToRelative(0.316f, 0.316f, 0.0f, false, false, -0.219f, -0.541f)
                horizontalLineToRelative(-0.747f)
                lineTo(12.905f, 5.201f)
                lineTo(19.0f, 5.201f)
                verticalLineToRelative(1.936f)
                horizontalLineToRelative(-0.872f)
                curveToRelative(-0.363f, 0.0f, -0.867f, 0.176f, -1.225f, 0.525f)
                lineToRelative(-3.058f, 2.985f)
                lineToRelative(3.396f, 5.276f)
                curveToRelative(0.304f, 0.434f, 0.772f, 1.003f, 1.146f, 1.003f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(22.316f, 12.0f)
                curveToRelative(0.0f, -5.697f, -4.619f, -10.316f, -10.316f, -10.316f)
                curveTo(6.303f, 1.684f, 1.684f, 6.303f, 1.684f, 12.0f)
                curveToRelative(0.0f, 5.697f, 4.619f, 10.316f, 10.316f, 10.316f)
                curveToRelative(5.697f, 0.0f, 10.316f, -4.619f, 10.316f, -10.316f)
                close()
            }
        }
        .build()
        return _known!!
    }

private var _known: ImageVector? = null
