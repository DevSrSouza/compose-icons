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

public val Octicons.FilterRemove16: ImageVector
    get() {
        if (_filterRemove16 != null) {
            return _filterRemove16!!
        }
        _filterRemove16 = Builder(name = "FilterRemove16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.384f, 4.57f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, false, 1.061f, 0.0f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, false, 0.0f, -1.061f)
                lineToRelative(-0.884f, -0.884f)
                lineToRelative(0.883f, -0.884f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.384f, 0.68f)
                lineToRelative(-0.884f, 0.884f)
                lineToRelative(-0.884f, -0.884f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.061f)
                lineToRelative(0.883f, 0.884f)
                lineToRelative(-0.883f, 0.884f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.061f)
                lineToRelative(0.884f, -0.884f)
                lineToRelative(0.884f, 0.884f)
                close()
                moveTo(0.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(9.0f, 4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(0.75f, 3.0f)
                close()
                moveTo(3.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 7.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 7.75f)
                close()
                moveTo(6.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _filterRemove16!!
    }

private var _filterRemove16: ImageVector? = null
