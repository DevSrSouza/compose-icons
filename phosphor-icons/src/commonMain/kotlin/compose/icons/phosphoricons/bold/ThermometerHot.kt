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

public val BoldGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.8f)
                lineTo(96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(120.0f, 167.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f)
                close()
                moveTo(192.2f, 88.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 11.3f, 0.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 45.3f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                close()
                moveTo(231.8f, 111.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 11.3f, 0.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 45.3f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
                moveTo(160.0f, 150.7f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -104.0f, 0.0f)
                lineTo(56.0f, 56.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                close()
                moveTo(148.0f, 188.0f)
                arcToRelative(40.6f, 40.6f, 0.0f, false, false, -9.2f, -25.6f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.8f, -7.6f)
                lineTo(136.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(98.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.9f, 7.8f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 148.0f, 188.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
