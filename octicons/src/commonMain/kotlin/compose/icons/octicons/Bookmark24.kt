package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Bookmark24: ImageVector
    get() {
        if (_bookmark24 != null) {
            return _bookmark24!!
        }
        _bookmark24 = Builder(name = "Bookmark24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.75f)
                curveTo(5.0f, 2.784f, 5.784f, 2.0f, 6.75f, 2.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.218f, 0.586f)
                lineTo(12.0f, 17.21f)
                lineToRelative(-5.781f, 4.625f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 21.25f)
                close()
                moveTo(6.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(15.94f)
                lineToRelative(5.031f, -4.026f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.938f, 0.0f)
                lineTo(17.5f, 19.69f)
                lineTo(17.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _bookmark24!!
    }

private var _bookmark24: ImageVector? = null
