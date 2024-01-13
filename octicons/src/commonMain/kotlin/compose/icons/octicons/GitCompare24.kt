package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.GitCompare24: ImageVector
    get() {
        if (_gitCompare24 != null) {
            return _gitCompare24!!
        }
        _gitCompare24 = Builder(name = "GitCompare24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(19.75f, 17.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, 3.501f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.001f, -3.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.905f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(12.685f, 4.0f)
                horizontalLineToRelative(4.065f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(7.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-4.064f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.061f, 1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(7.5f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, -6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 6.5f, 0.0f)
                close()
                moveTo(4.25f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.25f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.095f, 22.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(1.22f, -1.22f)
                horizontalLineTo(7.25f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, -3.75f)
                verticalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(4.064f)
                lineToRelative(-1.22f, -1.22f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.332f, -1.265f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.729f, 0.205f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _gitCompare24!!
    }

private var _gitCompare24: ImageVector? = null
