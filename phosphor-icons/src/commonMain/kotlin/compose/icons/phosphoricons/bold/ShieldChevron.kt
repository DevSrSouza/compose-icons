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

public val BoldGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 92.2f, 78.1f, 122.7f, 93.8f, 127.9f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 12.4f, 0.0f)
                curveToRelative(15.7f, -5.2f, 93.8f, -35.7f, 93.8f, -127.9f)
                lineTo(228.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(52.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                verticalLineToRelative(54.7f)
                arcToRelative(111.6f, 111.6f, 0.0f, false, true, -6.7f, 39.2f)
                lineToRelative(-62.4f, -43.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.8f, 0.0f)
                lineTo(58.7f, 153.9f)
                arcTo(111.6f, 111.6f, 0.0f, false, true, 52.0f, 114.7f)
                close()
                moveTo(128.0f, 219.4f)
                curveToRelative(-10.0f, -3.5f, -39.1f, -15.7f, -58.3f, -44.0f)
                lineTo(128.0f, 134.6f)
                lineToRelative(58.3f, 40.8f)
                curveTo(167.1f, 203.7f, 138.0f, 215.9f, 128.0f, 219.4f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
