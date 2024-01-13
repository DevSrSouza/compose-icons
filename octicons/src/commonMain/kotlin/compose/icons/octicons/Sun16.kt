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

public val Octicons.Sun16: ImageVector
    get() {
        if (_sun16 != null) {
            return _sun16!!
        }
        _sun16 = Builder(name = "Sun16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(8.0f, 10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(13.657f, 2.343f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.061f)
                lineToRelative(-1.061f, 1.06f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(4.464f, 11.536f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-1.06f, 1.061f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.061f, -1.06f)
                lineToRelative(1.06f, -1.061f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(7.25f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(3.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                lineTo(0.75f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 8.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 13.0f)
                close()
                moveTo(11.536f, 11.536f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(1.061f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.061f)
                lineToRelative(-1.061f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.061f)
                close()
                moveTo(2.343f, 2.343f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                lineToRelative(1.06f, 1.061f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _sun16!!
    }

private var _sun16: ImageVector? = null
