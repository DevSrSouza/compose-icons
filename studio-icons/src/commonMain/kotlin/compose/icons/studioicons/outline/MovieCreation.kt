package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MovieCreation: ImageVector
    get() {
        if (_movieCreation != null) {
            return _movieCreation!!
        }
        _movieCreation = Builder(name = "MovieCreation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.76f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.47f)
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineTo(8.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _movieCreation!!
    }

private var _movieCreation: ImageVector? = null