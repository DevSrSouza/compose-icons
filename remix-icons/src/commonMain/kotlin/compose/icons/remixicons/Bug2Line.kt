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

public val RemixIcons.Bug2Line: ImageVector
    get() {
        if (_bug2Line != null) {
            return _bug2Line!!
        }
        _bug2Line = Builder(name = "Bug2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.562f, 4.148f)
                arcToRelative(7.03f, 7.03f, 0.0f, false, true, 2.876f, 0.0f)
                lineToRelative(1.683f, -1.684f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-1.05f, 1.05f)
                arcTo(7.03f, 7.03f, 0.0f, false, true, 18.326f, 8.0f)
                lineTo(21.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(0.046f, 0.327f, 0.07f, 0.66f, 0.07f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.34f, -0.024f, 0.673f, -0.07f, 1.0f)
                lineTo(21.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.674f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -12.652f, 0.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.07f)
                arcTo(7.06f, 7.06f, 0.0f, false, true, 5.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.34f, 0.024f, -0.673f, 0.07f, -1.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(2.674f)
                arcToRelative(7.03f, 7.03f, 0.0f, false, true, 2.84f, -3.072f)
                lineToRelative(-1.05f, -1.05f)
                lineTo(8.88f, 2.465f)
                lineToRelative(1.683f, 1.684f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bug2Line!!
    }

private var _bug2Line: ImageVector? = null
