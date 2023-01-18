package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 143.3f)
                lineTo(160.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(95.3f)
                arcTo(59.4f, 59.4f, 0.0f, false, false, 60.0f, 188.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 120.0f, 0.0f)
                arcTo(59.4f, 59.4f, 0.0f, false, false, 160.0f, 143.3f)
                close()
                moveTo(120.0f, 24.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 48.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 120.0f, 24.0f)
                close()
                moveTo(178.1f, 85.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 19.8f, -8.2f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, 19.8f, 8.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 16.9f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 11.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -19.8f, 8.2f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, -19.8f, -8.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.9f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 178.1f, 85.7f)
                close()
                moveTo(245.9f, 114.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -19.8f, 8.2f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, -19.8f, -8.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.9f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 19.8f, -8.2f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, 19.8f, 8.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 16.9f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 245.9f, 114.3f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
