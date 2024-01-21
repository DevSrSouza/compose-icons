package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zcash: ImageVector
    get() {
        if (_zcash != null) {
            return _zcash!!
        }
        _zcash = Builder(name = "Zcash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(10.992f, 4.418f)
                horizontalLineToRelative(2.014f)
                verticalLineToRelative(2.014f)
                lineToRelative(3.275f, -0.002f)
                verticalLineToRelative(1.826f)
                lineToRelative(-5.08f, 6.889f)
                horizontalLineToRelative(5.08f)
                verticalLineToRelative(2.423f)
                horizontalLineToRelative(-3.275f)
                verticalLineToRelative(2.006f)
                horizontalLineToRelative(-2.012f)
                verticalLineToRelative(-2.006f)
                lineTo(7.72f, 17.568f)
                verticalLineToRelative(-1.826f)
                lineToRelative(5.074f, -6.888f)
                lineTo(7.719f, 8.854f)
                lineTo(7.719f, 6.432f)
                horizontalLineToRelative(3.273f)
                lineTo(10.992f, 4.418f)
                close()
            }
        }
        .build()
        return _zcash!!
    }

private var _zcash: ImageVector? = null
