package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f)
                verticalLineToRelative(3.0f)
                curveTo(4.0f, 9.33f, 4.67f, 10.0f, 5.5f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.62f)
                curveToRelative(-0.4f, 0.0f, -0.78f, 0.16f, -1.06f, 0.44f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(1.5f, 1.5f)
                curveTo(5.84f, 17.84f, 6.22f, 18.0f, 6.62f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.38f)
                curveToRelative(0.4f, 0.0f, 0.78f, -0.16f, 1.06f, -0.44f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(18.16f, 4.16f, 17.78f, 4.0f, 17.38f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
