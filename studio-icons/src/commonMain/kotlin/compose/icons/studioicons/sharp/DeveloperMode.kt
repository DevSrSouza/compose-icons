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

public val SharpGroup.DeveloperMode: ImageVector
    get() {
        if (_developerMode != null) {
            return _developerMode!!
        }
        _developerMode = Builder(name = "DeveloperMode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 1.01f)
                lineTo(5.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(15.41f, 16.59f)
                lineTo(20.0f, 12.0f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(14.0f, 8.83f)
                lineTo(17.17f, 12.0f)
                lineTo(14.0f, 15.17f)
                lineToRelative(1.41f, 1.42f)
                close()
                moveTo(10.0f, 15.17f)
                lineTo(6.83f, 12.0f)
                lineTo(10.0f, 8.83f)
                lineTo(8.59f, 7.41f)
                lineTo(4.0f, 12.0f)
                lineToRelative(4.59f, 4.59f)
                lineTo(10.0f, 15.17f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _developerMode!!
    }

private var _developerMode: ImageVector? = null
