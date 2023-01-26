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

public val SharpGroup.VideocamOff: ImageVector
    get() {
        if (_videocamOff != null) {
            return _videocamOff!!
        }
        _videocamOff = Builder(name = "VideocamOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.61f)
                verticalLineTo(6.5f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-6.61f)
                close()
                moveTo(3.41f, 1.86f)
                lineTo(2.0f, 3.27f)
                lineTo(4.73f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(13.73f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _videocamOff!!
    }

private var _videocamOff: ImageVector? = null
