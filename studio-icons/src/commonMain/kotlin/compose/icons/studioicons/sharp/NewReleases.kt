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

public val SharpGroup.NewReleases: ImageVector
    get() {
        if (_newReleases != null) {
            return _newReleases!!
        }
        _newReleases = Builder(name = "NewReleases", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineToRelative(-2.44f, -2.78f)
                lineToRelative(0.34f, -3.68f)
                lineToRelative(-3.61f, -0.82f)
                lineToRelative(-1.89f, -3.18f)
                lineTo(12.0f, 3.0f)
                lineTo(8.6f, 1.54f)
                lineTo(6.71f, 4.72f)
                lineToRelative(-3.61f, 0.81f)
                lineToRelative(0.34f, 3.68f)
                lineTo(1.0f, 12.0f)
                lineToRelative(2.44f, 2.78f)
                lineToRelative(-0.34f, 3.69f)
                lineToRelative(3.61f, 0.82f)
                lineToRelative(1.89f, 3.18f)
                lineTo(12.0f, 21.0f)
                lineToRelative(3.4f, 1.46f)
                lineToRelative(1.89f, -3.18f)
                lineToRelative(3.61f, -0.82f)
                lineToRelative(-0.34f, -3.68f)
                lineTo(23.0f, 12.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _newReleases!!
    }

private var _newReleases: ImageVector? = null
