package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Hubot24: ImageVector
    get() {
        if (_hubot24 != null) {
            return _hubot24!!
        }
        _hubot24 = Builder(name = "Hubot24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                curveTo(0.0f, 6.373f, 5.373f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                verticalLineToRelative(8.657f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -5.799f, -4.701f, -10.5f, -10.5f, -10.5f)
                reflectiveCurveTo(1.5f, 7.201f, 1.5f, 13.0f)
                verticalLineToRelative(8.657f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.25f, 9.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(5.25f, 16.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(5.47f, 10.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineTo(12.0f, 12.56f)
                lineToRelative(2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.734f, 0.215f)
                lineTo(15.0f, 13.44f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(9.0f, 13.44f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _hubot24!!
    }

private var _hubot24: ImageVector? = null
