package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BookmarkRemove: ImageVector
    get() {
        if (_bookmarkRemove != null) {
            return _bookmarkRemove!!
        }
        _bookmarkRemove = Builder(name = "BookmarkRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveTo(20.55f, 5.0f, 21.0f, 5.45f, 21.0f, 6.0f)
                close()
                moveTo(19.0f, 10.9f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.13f, 0.37f, -2.16f, 1.0f, -3.0f)
                lineTo(7.0f, 3.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineToRelative(14.48f)
                curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f)
                lineTo(12.0f, 18.0f)
                lineToRelative(5.61f, 2.4f)
                curveToRelative(0.66f, 0.28f, 1.39f, -0.2f, 1.39f, -0.92f)
                verticalLineTo(10.9f)
                close()
            }
        }
        .build()
        return _bookmarkRemove!!
    }

private var _bookmarkRemove: ImageVector? = null
