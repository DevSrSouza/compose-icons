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

public val RemixIcons.Gift2Fill: ImageVector
    get() {
        if (_gift2Fill != null) {
            return _gift2Fill!!
        }
        _gift2Fill = Builder(name = "Gift2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(14.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.163f, 5.001f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineToRelative(3.337f, 0.001f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.664f, -3.95f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 14.5f, 2.0f)
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
        return _gift2Fill!!
    }

private var _gift2Fill: ImageVector? = null
