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

public val RemixIcons.VolumeDownFill: ImageVector
    get() {
        if (_volumeDownFill != null) {
            return _volumeDownFill!!
        }
        _volumeDownFill = Builder(name = "VolumeDownFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.889f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.889f)
                lineToRelative(5.294f, -4.332f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.817f, 0.387f)
                verticalLineToRelative(15.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.817f, 0.387f)
                lineTo(8.89f, 16.0f)
                close()
                moveTo(18.863f, 16.591f)
                lineToRelative(-1.422f, -1.422f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 19.0f, 12.0f)
                curveToRelative(0.0f, -1.43f, -0.75f, -2.685f, -1.88f, -3.392f)
                lineToRelative(1.439f, -1.439f)
                arcTo(5.991f, 5.991f, 0.0f, false, true, 21.0f, 12.0f)
                curveToRelative(0.0f, 1.842f, -0.83f, 3.49f, -2.137f, 4.591f)
                close()
            }
        }
        .build()
        return _volumeDownFill!!
    }

private var _volumeDownFill: ImageVector? = null
