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

public val RoundGroup.ViewComfyAlt: ImageVector
    get() {
        if (_viewComfyAlt != null) {
            return _viewComfyAlt!!
        }
        _viewComfyAlt = Builder(name = "ViewComfyAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(10.5f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(7.22f, 17.0f, 7.0f, 16.78f, 7.0f, 16.5f)
                verticalLineToRelative(-3.0f)
                curveTo(7.0f, 13.22f, 7.22f, 13.0f, 7.5f, 13.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveTo(11.0f, 16.78f, 10.78f, 17.0f, 10.5f, 17.0f)
                close()
                moveTo(10.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(7.22f, 11.0f, 7.0f, 10.78f, 7.0f, 10.5f)
                verticalLineToRelative(-3.0f)
                curveTo(7.0f, 7.22f, 7.22f, 7.0f, 7.5f, 7.0f)
                horizontalLineToRelative(3.0f)
                curveTo(10.78f, 7.0f, 11.0f, 7.22f, 11.0f, 7.5f)
                verticalLineToRelative(3.0f)
                curveTo(11.0f, 10.78f, 10.78f, 11.0f, 10.5f, 11.0f)
                close()
                moveTo(16.5f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveTo(17.0f, 16.78f, 16.78f, 17.0f, 16.5f, 17.0f)
                close()
                moveTo(16.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveTo(13.0f, 7.22f, 13.22f, 7.0f, 13.5f, 7.0f)
                horizontalLineToRelative(3.0f)
                curveTo(16.78f, 7.0f, 17.0f, 7.22f, 17.0f, 7.5f)
                verticalLineToRelative(3.0f)
                curveTo(17.0f, 10.78f, 16.78f, 11.0f, 16.5f, 11.0f)
                close()
            }
        }
        .build()
        return _viewComfyAlt!!
    }

private var _viewComfyAlt: ImageVector? = null
