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

public val OutlineGroup._30fps: ImageVector
    get() {
        if (__30fps != null) {
            return __30fps!!
        }
        __30fps = Builder(name = "_30fps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(19.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.34f, 20.66f, 5.0f, 19.0f, 5.0f)
                close()
            }
        }
        .build()
        return __30fps!!
    }

private var __30fps: ImageVector? = null
