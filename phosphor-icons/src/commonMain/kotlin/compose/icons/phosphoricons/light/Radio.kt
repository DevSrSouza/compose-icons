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

public val LightGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 74.0f)
                lineTo(72.9f, 74.0f)
                lineTo(193.7f, 37.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.4f, -11.4f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.4f, 0.2f)
                lineTo(29.0f, 74.5f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.6f, 1.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.2f, 0.3f)
                lineToRelative(-0.2f, 0.2f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -0.7f, 1.7f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.1f, 0.5f)
                horizontalLineToRelative(0.0f)
                lineTo(26.1f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineTo(26.1f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(160.0f, 106.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 160.0f, 106.0f)
                close()
                moveTo(160.0f, 170.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 160.0f, 170.0f)
                close()
                moveTo(102.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 106.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 112.0f)
                close()
                moveTo(102.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 138.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 144.0f)
                close()
                moveTo(102.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 170.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 176.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
