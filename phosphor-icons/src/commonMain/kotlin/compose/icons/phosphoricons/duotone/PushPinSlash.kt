package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(226.3f, 101.7f)
                lineTo(164.0f, 164.0f)
                curveToRelative(11.5f, 22.9f, -1.7f, 45.9f, -10.1f, 57.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.1f, 0.8f)
                lineTo(34.0f, 114.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.6f, -11.9f)
                curveTo(64.3f, 78.1f, 92.0f, 92.0f, 92.0f, 92.0f)
                lineToRelative(62.3f, -62.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(60.6f, 60.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 226.3f, 101.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(73.5f, 80.0f)
                curveToRelative(-12.0f, -0.3f, -27.7f, 2.8f, -43.9f, 15.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -1.3f, 23.8f)
                lineTo(76.7f, 168.0f)
                lineTo(42.3f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(88.0f, 179.3f)
                lineToRelative(48.2f, 48.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.3f, 4.7f)
                horizontalLineToRelative(1.1f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 11.7f, -6.4f)
                curveToRelative(5.5f, -7.3f, 12.9f, -19.3f, 15.4f, -33.5f)
                lineToRelative(26.4f, 29.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(147.5f, 216.2f)
                lineTo(39.6f, 108.3f)
                curveToRelative(25.1f, -20.2f, 47.9f, -9.6f, 48.8f, -9.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 3.3f, 0.8f)
                lineToRelative(67.7f, 74.5f)
                curveTo(163.7f, 191.2f, 153.9f, 207.7f, 147.5f, 216.2f)
                close()
                moveTo(236.7f, 96.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -4.7f, 11.3f)
                lineToRelative(-41.4f, 41.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, 2.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.6f, -2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                lineTo(220.7f, 96.0f)
                lineTo(160.0f, 35.3f)
                lineToRelative(-38.0f, 38.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 110.7f, 62.0f)
                lineToRelative(38.0f, -38.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(232.0f, 84.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 236.7f, 96.0f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
