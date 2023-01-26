package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PermMedia: ImageVector
    get() {
        if (_permMedia != null) {
            return _permMedia!!
        }
        _permMedia = Builder(name = "PermMedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(24.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(24.0f, 4.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineToRelative(4.5f, -6.0f)
                lineToRelative(3.5f, 4.51f)
                lineToRelative(2.5f, -3.01f)
                lineTo(21.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                close()
            }
        }
        .build()
        return _permMedia!!
    }

private var _permMedia: ImageVector? = null
