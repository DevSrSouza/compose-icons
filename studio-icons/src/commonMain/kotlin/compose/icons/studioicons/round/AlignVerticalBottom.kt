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

public val RoundGroup.AlignVerticalBottom: ImageVector
    get() {
        if (_alignVerticalBottom != null) {
            return _alignVerticalBottom!!
        }
        _alignVerticalBottom = Builder(name = "AlignVerticalBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(22.0f, 21.55f, 21.55f, 22.0f, 21.0f, 22.0f)
                close()
                moveTo(8.5f, 2.0f)
                lineTo(8.5f, 2.0f)
                curveTo(7.67f, 2.0f, 7.0f, 2.67f, 7.0f, 3.5f)
                verticalLineToRelative(13.0f)
                curveTo(7.0f, 17.33f, 7.67f, 18.0f, 8.5f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-13.0f)
                curveTo(10.0f, 2.67f, 9.33f, 2.0f, 8.5f, 2.0f)
                close()
                moveTo(15.5f, 8.0f)
                lineTo(15.5f, 8.0f)
                curveTo(14.67f, 8.0f, 14.0f, 8.67f, 14.0f, 9.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f)
                close()
            }
        }
        .build()
        return _alignVerticalBottom!!
    }

private var _alignVerticalBottom: ImageVector? = null
