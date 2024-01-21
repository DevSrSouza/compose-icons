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

public val Octicons.Unfold16: ImageVector
    get() {
        if (_unfold16 != null) {
            return _unfold16!!
        }
        _unfold16 = Builder(name = "Unfold16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.177f, 0.677f)
                lineToRelative(2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, 0.427f)
                lineTo(8.75f, 4.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(7.25f, 4.0f)
                lineTo(5.104f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, -0.427f)
                lineTo(7.823f, 0.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                close()
                moveTo(7.25f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(8.75f, 12.0f)
                horizontalLineToRelative(2.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, 0.427f)
                lineToRelative(-2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.354f, 0.0f)
                lineToRelative(-2.896f, -2.896f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 5.104f, 12.0f)
                lineTo(7.25f, 12.0f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(2.25f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 8.0f)
                close()
                moveTo(8.25f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 8.0f)
                close()
                moveTo(14.25f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _unfold16!!
    }

private var _unfold16: ImageVector? = null
