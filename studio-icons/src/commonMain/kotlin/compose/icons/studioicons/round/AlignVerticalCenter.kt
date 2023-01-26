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

public val RoundGroup.AlignVerticalCenter: ImageVector
    get() {
        if (_alignVerticalCenter != null) {
            return _alignVerticalCenter!!
        }
        _alignVerticalCenter = Builder(name = "AlignVerticalCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 6.67f, 16.33f, 6.0f, 15.5f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(14.67f, 6.0f, 14.0f, 6.67f, 14.0f, 7.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 3.67f, 9.33f, 3.0f, 8.5f, 3.0f)
                horizontalLineToRelative(0.0f)
                curveTo(7.67f, 3.0f, 7.0f, 3.67f, 7.0f, 4.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.84f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(6.5f)
                curveTo(7.0f, 20.33f, 7.67f, 21.0f, 8.5f, 21.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(22.0f, 11.45f, 21.55f, 11.0f, 21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _alignVerticalCenter!!
    }

private var _alignVerticalCenter: ImageVector? = null
