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

public val SharpGroup._60fps: ImageVector
    get() {
        if (__60fps != null) {
            return __60fps!!
        }
        __60fps = Builder(name = "_60fps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                moveTo(22.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return __60fps!!
    }

private var __60fps: ImageVector? = null
