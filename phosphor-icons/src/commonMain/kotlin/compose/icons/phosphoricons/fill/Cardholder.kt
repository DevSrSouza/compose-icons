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

public val FillGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(name = "Cardholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 24.0f, 72.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 72.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 208.0f, 48.0f)
                close()
                moveTo(216.0f, 112.0f)
                lineTo(167.2f, 112.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -15.7f, 12.8f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -47.0f, 0.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 88.8f, 112.0f)
                lineTo(40.0f, 112.0f)
                lineTo(40.0f, 96.0f)
                lineTo(216.0f, 96.0f)
                close()
                moveTo(216.0f, 80.0f)
                lineTo(40.0f, 80.0f)
                lineTo(40.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
