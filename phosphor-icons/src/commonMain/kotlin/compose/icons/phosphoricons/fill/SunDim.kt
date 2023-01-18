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

public val FillGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 128.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -68.0f, -68.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 196.0f, 128.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(136.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 44.0f)
                close()
                moveTo(57.3f, 68.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.3f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineToRelative(-5.7f, -5.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 51.6f, 62.9f)
                close()
                moveTo(36.0f, 120.0f)
                lineTo(28.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(57.3f, 187.4f)
                lineTo(51.6f, 193.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -2.3f)
                lineToRelative(5.7f, -5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -11.3f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 212.0f)
                close()
                moveTo(198.7f, 187.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.3f)
                lineToRelative(5.7f, 5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                close()
                moveTo(228.0f, 120.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(193.1f, 70.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.6f, -2.3f)
                lineToRelative(5.7f, -5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.3f, -11.3f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 193.1f, 70.9f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
