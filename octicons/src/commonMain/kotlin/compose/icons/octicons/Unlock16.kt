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

public val Octicons.Unlock16: ImageVector
    get() {
        if (_unlock16 != null) {
            return _unlock16!!
        }
        _unlock16 = Builder(name = "Unlock16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 7.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 13.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.499f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.371f, -2.154f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.264f, 0.808f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 4.0f)
                close()
                moveTo(3.5f, 7.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _unlock16!!
    }

private var _unlock16: ImageVector? = null
