package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 146.0f)
                lineTo(158.0f, 146.0f)
                lineTo(158.0f, 110.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                lineTo(146.0f, 98.0f)
                lineTo(110.0f, 98.0f)
                lineTo(110.0f, 76.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, 34.0f)
                lineTo(98.0f, 110.0f)
                verticalLineToRelative(36.0f)
                lineTo(76.0f, 146.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, 34.0f)
                lineTo(110.0f, 158.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, -34.0f)
                close()
                moveTo(158.0f, 76.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, 22.0f)
                lineTo(158.0f, 98.0f)
                close()
                moveTo(54.0f, 76.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 44.0f, 0.0f)
                lineTo(98.0f, 98.0f)
                lineTo(76.0f, 98.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 54.0f, 76.0f)
                close()
                moveTo(98.0f, 180.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                lineTo(98.0f, 158.0f)
                close()
                moveTo(110.0f, 110.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                lineTo(110.0f, 146.0f)
                close()
                moveTo(180.0f, 202.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(158.0f, 158.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
