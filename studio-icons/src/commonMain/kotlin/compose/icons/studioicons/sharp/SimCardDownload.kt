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

public val SharpGroup.SimCardDownload: ImageVector
    get() {
        if (_simCardDownload != null) {
            return _simCardDownload!!
        }
        _simCardDownload = Builder(name = "SimCardDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(10.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(12.0f, 17.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.02f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _simCardDownload!!
    }

private var _simCardDownload: ImageVector? = null
