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

public val FillGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 120.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                lineTo(152.0f, 72.0f)
                curveToRelative(-0.5f, 0.0f, -52.4f, -0.7f, -101.7f, -42.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -17.1f, -2.2f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 24.0f, 42.2f)
                lineTo(24.0f, 197.8f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 9.2f, 14.5f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 6.8f, 1.5f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 10.3f, -3.7f)
                curveToRelative(37.9f, -31.8f, 77.2f, -39.6f, 93.7f, -41.5f)
                verticalLineToRelative(35.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 7.1f, 13.3f)
                lineToRelative(11.0f, 7.4f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, false, 14.7f, 1.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 9.7f, -11.1f)
                lineToRelative(11.9f, -47.3f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 240.0f, 120.0f)
                close()
                moveTo(171.0f, 211.0f)
                lineTo(160.0f, 203.7f)
                lineTo(160.0f, 168.0f)
                horizontalLineToRelative(21.8f)
                close()
                moveTo(192.0f, 152.0f)
                lineTo(160.0f, 152.0f)
                lineTo(160.0f, 88.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
