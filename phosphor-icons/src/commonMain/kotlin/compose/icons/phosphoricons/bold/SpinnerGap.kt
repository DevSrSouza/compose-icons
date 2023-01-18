package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) {
            return _spinnerGap!!
        }
        _spinnerGap = Builder(name = "SpinnerGap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 32.0f)
                lineTo(140.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(224.0f, 116.0f)
                lineTo(192.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(181.7f, 164.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, 16.9f)
                lineToRelative(22.6f, 22.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 192.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 180.0f)
                close()
                moveTo(74.3f, 164.8f)
                lineTo(51.6f, 187.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(22.6f, -22.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, -16.9f)
                close()
                moveTo(76.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(64.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 128.0f)
                close()
                moveTo(68.6f, 51.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(74.3f, 91.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 0.0f, -16.9f)
                close()
            }
        }
        .build()
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
