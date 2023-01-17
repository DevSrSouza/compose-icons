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

public val Octicons.Mirror24: ImageVector
    get() {
        if (_mirror24 != null) {
            return _mirror24!!
        }
        _mirror24 = Builder(name = "Mirror24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.553f, 6.064f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.256f, 0.554f)
                lineToRelative(-5.75f, -5.25f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.0f, -1.108f)
                lineToRelative(5.75f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.809f, -0.132f)
                close()
                moveTo(2.447f, 17.936f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 17.25f)
                lineTo(2.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.256f, -0.554f)
                lineToRelative(5.75f, 5.25f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.0f, 1.108f)
                lineToRelative(-5.75f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.809f, 0.132f)
                close()
                moveTo(7.387f, 12.0f)
                lineTo(3.5f, 8.45f)
                verticalLineToRelative(7.1f)
                lineTo(7.388f, 12.0f)
                close()
                moveTo(16.613f, 12.0f)
                lineTo(20.5f, 15.55f)
                verticalLineToRelative(-7.1f)
                lineTo(16.612f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _mirror24!!
    }

private var _mirror24: ImageVector? = null
