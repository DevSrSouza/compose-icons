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

public val RemixIcons.Ship2Line: ImageVector
    get() {
        if (_ship2Line != null) {
            return _ship2Line!!
        }
        _ship2Line = Builder(name = "Ship2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(5.446f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.848f, 0.47f)
                lineTo(18.75f, 10.0f)
                horizontalLineToRelative(4.408f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.439f, 0.74f)
                lineTo(19.637f, 18.0f)
                lineTo(19.0f, 18.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, true, -1.535f, -0.198f)
                lineTo(20.63f, 12.0f)
                lineTo(3.4f, 12.0f)
                lineToRelative(1.048f, 5.824f)
                arcTo(6.013f, 6.013f, 0.0f, false, true, 3.0f, 18.0f)
                horizontalLineToRelative(-0.545f)
                lineToRelative(-1.24f, -6.821f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.197f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(5.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(11.392f)
                lineToRelative(-2.5f, -4.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 20.0f)
                arcToRelative(5.978f, 5.978f, 0.0f, false, false, 4.0f, -1.528f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 11.0f, 20.0f)
                arcToRelative(5.978f, 5.978f, 0.0f, false, false, 4.0f, -1.528f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 19.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.963f, 7.963f, 0.0f, false, true, 11.0f, 22.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.963f, 7.963f, 0.0f, false, true, 3.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _ship2Line!!
    }

private var _ship2Line: ImageVector? = null
