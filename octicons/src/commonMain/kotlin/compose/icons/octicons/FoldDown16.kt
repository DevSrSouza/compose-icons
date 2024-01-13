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

public val Octicons.FoldDown16: ImageVector
    get() {
        if (_foldDown16 != null) {
            return _foldDown16!!
        }
        _foldDown16 = Builder(name = "FoldDown16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.177f, 14.323f)
                lineToRelative(2.896f, -2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, -0.427f)
                lineTo(8.75f, 11.0f)
                lineTo(8.75f, 7.764f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                lineTo(7.25f, 11.0f)
                lineTo(5.104f, 11.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, 0.427f)
                lineToRelative(2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.354f, 0.0f)
                close()
                moveTo(2.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(6.0f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                close()
                moveTo(8.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(12.0f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                close()
                moveTo(14.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _foldDown16!!
    }

private var _foldDown16: ImageVector? = null
