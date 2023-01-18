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

public val FillGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(164.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 96.0f)
                close()
                moveTo(92.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 96.0f)
                close()
                moveTo(181.0f, 178.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, 1.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.2f, -3.0f)
                lineTo(160.0f, 164.8f)
                lineTo(150.2f, 177.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -12.4f, 0.0f)
                lineTo(128.0f, 164.8f)
                lineTo(118.2f, 177.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -12.4f, 0.0f)
                lineTo(96.0f, 164.8f)
                lineTo(86.2f, 177.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.4f, -10.0f)
                lineToRelative(16.0f, -20.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 12.4f, 0.0f)
                lineToRelative(9.8f, 12.2f)
                lineToRelative(9.8f, -12.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 12.4f, 0.0f)
                lineToRelative(9.8f, 12.2f)
                lineToRelative(9.8f, -12.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 12.4f, 0.0f)
                lineToRelative(16.0f, 20.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 181.0f, 178.2f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
