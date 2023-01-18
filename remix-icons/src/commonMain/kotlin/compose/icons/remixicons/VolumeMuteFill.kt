package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VolumeMuteFill: ImageVector
    get() {
        if (_volumeMuteFill != null) {
            return _volumeMuteFill!!
        }
        _volumeMuteFill = Builder(name = "VolumeMuteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.889f, 16.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.889f)
                lineToRelative(5.294f, -4.332f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.817f, 0.387f)
                verticalLineToRelative(15.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.817f, 0.387f)
                lineTo(5.89f, 16.0f)
                close()
                moveTo(20.414f, 12.0f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(19.0f, 13.414f)
                lineToRelative(-3.536f, 3.536f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(17.586f, 12.0f)
                lineTo(14.05f, 8.464f)
                lineToRelative(1.414f, -1.414f)
                lineTo(19.0f, 10.586f)
                lineToRelative(3.536f, -3.536f)
                lineToRelative(1.414f, 1.414f)
                lineTo(20.414f, 12.0f)
                close()
            }
        }
        .build()
        return _volumeMuteFill!!
    }

private var _volumeMuteFill: ImageVector? = null
