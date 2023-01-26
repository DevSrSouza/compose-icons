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

public val RoundGroup.AlignVerticalTop: ImageVector
    get() {
        if (_alignVerticalTop != null) {
            return _alignVerticalTop!!
        }
        _alignVerticalTop = Builder(name = "AlignVerticalTop", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 4.0f, 2.0f, 3.55f, 2.0f, 3.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveTo(21.55f, 2.0f, 22.0f, 2.45f, 22.0f, 3.0f)
                close()
                moveTo(8.5f, 22.0f)
                lineTo(8.5f, 22.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-13.0f)
                curveTo(10.0f, 6.67f, 9.33f, 6.0f, 8.5f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(7.67f, 6.0f, 7.0f, 6.67f, 7.0f, 7.5f)
                verticalLineToRelative(13.0f)
                curveTo(7.0f, 21.33f, 7.67f, 22.0f, 8.5f, 22.0f)
                close()
                moveTo(15.5f, 16.0f)
                lineTo(15.5f, 16.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveTo(17.0f, 6.67f, 16.33f, 6.0f, 15.5f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(14.67f, 6.0f, 14.0f, 6.67f, 14.0f, 7.5f)
                verticalLineToRelative(7.0f)
                curveTo(14.0f, 15.33f, 14.67f, 16.0f, 15.5f, 16.0f)
                close()
            }
        }
        .build()
        return _alignVerticalTop!!
    }

private var _alignVerticalTop: ImageVector? = null
