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

public val RoundGroup.AlignHorizontalRight: ImageVector
    get() {
        if (_alignHorizontalRight != null) {
            return _alignHorizontalRight!!
        }
        _alignHorizontalRight = Builder(name = "AlignHorizontalRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 2.45f, 20.45f, 2.0f, 21.0f, 2.0f)
                close()
                moveTo(3.5f, 10.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0.0f)
                curveTo(18.0f, 7.67f, 17.33f, 7.0f, 16.5f, 7.0f)
                horizontalLineToRelative(-13.0f)
                curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f)
                verticalLineToRelative(0.0f)
                curveTo(2.0f, 9.33f, 2.67f, 10.0f, 3.5f, 10.0f)
                close()
                moveTo(9.5f, 17.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveTo(8.67f, 14.0f, 8.0f, 14.67f, 8.0f, 15.5f)
                verticalLineToRelative(0.0f)
                curveTo(8.0f, 16.33f, 8.67f, 17.0f, 9.5f, 17.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalRight!!
    }

private var _alignHorizontalRight: ImageVector? = null
