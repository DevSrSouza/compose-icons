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

public val FillGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-26.4f, -29.1f)
                curveToRelative(-2.5f, 14.2f, -9.9f, 26.2f, -15.4f, 33.5f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -11.7f, 6.4f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -11.3f, -4.7f)
                lineTo(88.0f, 179.3f)
                lineTo(53.7f, 213.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(76.7f, 168.0f)
                lineTo(28.3f, 119.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 1.3f, -23.8f)
                curveTo(45.8f, 82.8f, 61.5f, 79.7f, 73.5f, 80.0f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                close()
                moveTo(232.0f, 84.7f)
                lineTo(171.3f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineToRelative(-38.0f, 38.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.3f, 11.0f)
                lineTo(179.0f, 148.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.7f, 2.7f)
                horizontalLineToRelative(0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -2.4f)
                lineTo(232.0f, 107.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
