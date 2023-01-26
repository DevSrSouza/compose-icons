package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DownloadDone: ImageVector
    get() {
        if (_downloadDone != null) {
            return _downloadDone!!
        }
        _downloadDone = Builder(name = "DownloadDone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(11.01f, 13.9f)
                curveToRelative(-0.78f, 0.77f, -2.04f, 0.77f, -2.82f, -0.01f)
                lineTo(6.0f, 11.7f)
                curveToRelative(-0.55f, -0.55f, -0.54f, -1.44f, 0.03f, -1.97f)
                curveToRelative(0.54f, -0.52f, 1.4f, -0.5f, 1.92f, 0.02f)
                lineTo(9.6f, 11.4f)
                lineToRelative(6.43f, -6.43f)
                curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0.0f)
                lineToRelative(0.04f, 0.04f)
                curveToRelative(0.54f, 0.54f, 0.54f, 1.42f, -0.01f, 1.96f)
                lineToRelative(-7.0f, 6.93f)
                close()
            }
        }
        .build()
        return _downloadDone!!
    }

private var _downloadDone: ImageVector? = null
