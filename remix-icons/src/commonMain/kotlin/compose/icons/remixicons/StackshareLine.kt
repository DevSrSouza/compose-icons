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

public val RemixIcons.StackshareLine: ImageVector
    get() {
        if (_stackshareLine != null) {
            return _stackshareLine!!
        }
        _stackshareLine = Builder(name = "StackshareLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.536f, 13.0f)
                horizontalLineTo(7.329f)
                curveToRelative(-0.412f, 1.166f, -1.523f, 2.0f, -2.829f, 2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.306f, 0.0f, 2.418f, 0.835f, 2.83f, 2.0f)
                horizontalLineToRelative(2.206f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.412f, -1.165f, 1.524f, -2.0f, 2.83f, -2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, -0.834f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.017f)
                lineToRelative(-2.886f, 4.999f)
                lineTo(14.155f, 17.0f)
                horizontalLineToRelative(2.016f)
                curveToRelative(0.411f, -1.165f, 1.523f, -2.0f, 2.829f, -2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, -0.834f, -2.829f, -2.0f)
                horizontalLineTo(13.0f)
                lineToRelative(-3.464f, -6.0f)
                close()
                moveTo(19.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.5f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _stackshareLine!!
    }

private var _stackshareLine: ImageVector? = null
