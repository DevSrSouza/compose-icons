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

public val SharpGroup.SwitchCamera: ImageVector
    get() {
        if (_switchCamera != null) {
            return _switchCamera!!
        }
        _switchCamera = Builder(name = "SwitchCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-5.17f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(7.17f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(15.0f, 15.5f)
                lineTo(15.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(2.5f)
                lineTo(5.5f, 12.0f)
                lineTo(9.0f, 8.5f)
                lineTo(9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 8.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _switchCamera!!
    }

private var _switchCamera: ImageVector? = null
