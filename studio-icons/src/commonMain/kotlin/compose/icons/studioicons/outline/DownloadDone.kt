package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DownloadDone: ImageVector
    get() {
        if (_downloadDone != null) {
            return _downloadDone!!
        }
        _downloadDone = Builder(name = "DownloadDone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.6f, 15.3f)
                lineTo(5.0f, 10.7f)
                lineToRelative(2.0f, -1.9f)
                lineToRelative(2.6f, 2.6f)
                lineTo(17.0f, 4.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-9.4f, 9.3f)
                close()
            }
        }
        .build()
        return _downloadDone!!
    }

private var _downloadDone: ImageVector? = null
