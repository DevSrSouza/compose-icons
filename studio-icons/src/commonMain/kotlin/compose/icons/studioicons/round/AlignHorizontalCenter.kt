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

public val RoundGroup.AlignHorizontalCenter: ImageVector
    get() {
        if (_alignHorizontalCenter != null) {
            return _alignHorizontalCenter!!
        }
        _alignHorizontalCenter = Builder(name = "AlignHorizontalCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(6.5f, 0.0f)
                curveTo(20.33f, 7.0f, 21.0f, 7.67f, 21.0f, 8.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(7.5f)
                curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f)
                verticalLineToRelative(0.0f)
                curveTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.5f)
                curveTo(3.67f, 10.0f, 3.0f, 9.33f, 3.0f, 8.5f)
                verticalLineToRelative(0.0f)
                curveTo(3.0f, 7.67f, 3.67f, 7.0f, 4.5f, 7.0f)
                horizontalLineTo(11.0f)
                lineToRelative(0.0f, -4.0f)
                curveTo(11.0f, 2.45f, 11.45f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalCenter!!
    }

private var _alignHorizontalCenter: ImageVector? = null
