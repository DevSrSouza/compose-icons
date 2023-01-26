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

public val SharpGroup.Extension: ImageVector
    get() {
        if (_extension != null) {
            return _extension!!
        }
        _extension = Builder(name = "Extension", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.36f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(3.64f)
                curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveTo(9.26f, 0.86f, 8.0f, 2.03f, 8.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.01f)
                verticalLineToRelative(5.8f)
                horizontalLineTo(3.4f)
                curveToRelative(1.31f, 0.0f, 2.5f, 0.88f, 2.75f, 2.16f)
                curveToRelative(0.33f, 1.72f, -0.98f, 3.24f, -2.65f, 3.24f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.8f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0.0f, -1.31f, 0.88f, -2.5f, 2.16f, -2.75f)
                curveToRelative(1.72f, -0.33f, 3.24f, 0.98f, 3.24f, 2.65f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f)
                curveToRelative(-0.13f, -1.3f, -1.33f, -2.24f, -2.63f, -2.24f)
                close()
            }
        }
        .build()
        return _extension!!
    }

private var _extension: ImageVector? = null
