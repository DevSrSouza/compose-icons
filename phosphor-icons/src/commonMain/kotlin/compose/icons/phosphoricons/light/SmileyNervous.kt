package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(180.7f, 168.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.0f, 8.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 176.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.7f, -2.3f)
                lineTo(160.0f, 161.6f)
                lineToRelative(-11.3f, 14.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.4f, 0.0f)
                lineTo(128.0f, 161.6f)
                lineToRelative(-11.3f, 14.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.4f, 0.0f)
                lineTo(96.0f, 161.6f)
                lineTo(84.7f, 175.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.4f, -7.4f)
                lineToRelative(16.0f, -20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.4f, 0.0f)
                lineTo(112.0f, 162.4f)
                lineToRelative(11.3f, -14.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.4f, 0.0f)
                lineTo(144.0f, 162.4f)
                lineToRelative(11.3f, -14.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.4f, 0.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(154.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 154.0f, 108.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
