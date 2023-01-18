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

public val LightGroup.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 62.7f)
                lineTo(134.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 62.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 50.6f)
                lineTo(122.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 113.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -50.6f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 102.0f)
                close()
                moveTo(226.0f, 168.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -20.0f, -25.3f)
                lineTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(194.0f, 142.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 50.6f)
                lineTo(194.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 193.3f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 226.0f, 168.0f)
                close()
                moveTo(200.0f, 182.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 200.0f, 182.0f)
                close()
                moveTo(62.0f, 110.7f)
                lineTo(62.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(70.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 50.6f)
                lineTo(50.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(62.0f, 161.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -50.6f)
                close()
                moveTo(56.0f, 150.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 150.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
