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

public val RemixIcons.VolumeUpLine: ImageVector
    get() {
        if (_volumeUpLine != null) {
            return _volumeUpLine!!
        }
        _volumeUpLine = Builder(name = "VolumeUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.22f)
                lineTo(6.603f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.603f)
                lineTo(10.0f, 16.78f)
                lineTo(10.0f, 7.22f)
                close()
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
                moveTo(19.406f, 20.134f)
                lineToRelative(-1.416f, -1.416f)
                arcTo(8.978f, 8.978f, 0.0f, false, false, 21.0f, 12.0f)
                arcToRelative(8.982f, 8.982f, 0.0f, false, false, -3.304f, -6.968f)
                lineToRelative(1.42f, -1.42f)
                arcTo(10.976f, 10.976f, 0.0f, false, true, 23.0f, 12.0f)
                curveToRelative(0.0f, 3.223f, -1.386f, 6.122f, -3.594f, 8.134f)
                close()
                moveTo(15.863f, 16.591f)
                lineToRelative(-1.422f, -1.422f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 16.0f, 12.0f)
                curveToRelative(0.0f, -1.43f, -0.75f, -2.685f, -1.88f, -3.392f)
                lineToRelative(1.439f, -1.439f)
                arcTo(5.991f, 5.991f, 0.0f, false, true, 18.0f, 12.0f)
                curveToRelative(0.0f, 1.842f, -0.83f, 3.49f, -2.137f, 4.591f)
                close()
            }
        }
        .build()
        return _volumeUpLine!!
    }

private var _volumeUpLine: ImageVector? = null
