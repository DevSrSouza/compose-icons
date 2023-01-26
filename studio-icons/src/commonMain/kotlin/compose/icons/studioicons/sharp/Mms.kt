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

public val SharpGroup.Mms: ImageVector
    get() {
        if (_mms != null) {
            return _mms!!
        }
        _mms = Builder(name = "Mms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(5.0f, 14.0f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 8.0f)
                lineToRelative(4.5f, 6.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _mms!!
    }

private var _mms: ImageVector? = null
