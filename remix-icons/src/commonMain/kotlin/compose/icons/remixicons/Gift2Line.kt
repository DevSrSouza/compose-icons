package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Gift2Line: ImageVector
    get() {
        if (_gift2Line != null) {
            return _gift2Line!!
        }
        _gift2Line = Builder(name = "Gift2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.163f, 5.001f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineToRelative(3.337f, 0.001f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.664f, -3.95f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 14.5f, 2.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(20.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(9.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.144f, 2.993f)
                lineTo(9.5f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.356f, -1.493f)
                lineTo(9.5f, 4.0f)
                close()
                moveTo(14.5f, 4.0f)
                lineToRelative(-0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.35f, 1.349f)
                lineTo(13.0f, 5.5f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.144f, -0.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.986f)
                lineTo(14.5f, 4.0f)
                close()
            }
        }
        .build()
        return _gift2Line!!
    }

private var _gift2Line: ImageVector? = null
