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

public val SharpGroup.PhotoFilter: ImageVector
    get() {
        if (_photoFilter != null) {
            return _photoFilter!!
        }
        _photoFilter = Builder(name = "PhotoFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.98f, 19.0f)
                lineTo(4.98f, 5.0f)
                horizontalLineToRelative(9.0f)
                lineTo(13.98f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(20.0f, 7.0f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(17.0f, 4.0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(14.0f, 7.0f)
                lineToRelative(2.06f, 0.94f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(13.25f, 10.75f)
                lineTo(12.0f, 8.0f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(8.0f, 12.0f)
                lineToRelative(2.75f, 1.25f)
                lineTo(12.0f, 16.0f)
                lineToRelative(1.25f, -2.75f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-2.75f, -1.25f)
                close()
            }
        }
        .build()
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
