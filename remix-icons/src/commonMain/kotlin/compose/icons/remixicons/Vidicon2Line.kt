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

public val RemixIcons.Vidicon2Line: ImageVector
    get() {
        if (_vidicon2Line != null) {
            return _vidicon2Line!!
        }
        _vidicon2Line = Builder(name = "Vidicon2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(13.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.2f)
                lineToRelative(5.213f, -3.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.787f, 0.41f)
                verticalLineToRelative(12.08f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.787f, 0.41f)
                lineTo(17.0f, 14.8f)
                lineTo(17.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(17.0f, 12.359f)
                lineToRelative(4.0f, 2.8f)
                lineTo(21.0f, 8.84f)
                lineToRelative(-4.0f, 2.8f)
                verticalLineToRelative(0.718f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _vidicon2Line!!
    }

private var _vidicon2Line: ImageVector? = null
