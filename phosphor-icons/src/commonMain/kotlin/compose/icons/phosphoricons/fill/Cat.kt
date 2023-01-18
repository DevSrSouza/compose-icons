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

public val FillGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.4f, 36.3f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -17.0f, 4.0f)
                lineTo(187.5f, 57.2f)
                arcToRelative(111.5f, 111.5f, 0.0f, false, false, -119.0f, 0.0f)
                lineTo(51.6f, 40.3f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -17.0f, -4.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 24.0f, 51.3f)
                lineTo(24.0f, 136.0f)
                curveToRelative(0.0f, 49.1f, 40.1f, 89.6f, 91.6f, 95.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, -4.0f)
                verticalLineToRelative(-32.0f)
                lineToRelative(-13.4f, -13.4f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, -11.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, -0.2f)
                lineTo(128.0f, 180.7f)
                lineToRelative(10.3f, -10.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.5f, 0.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.4f, 11.4f)
                lineTo(136.0f, 195.3f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, 4.0f)
                curveToRelative(51.5f, -5.7f, 91.6f, -46.2f, 91.6f, -95.3f)
                lineTo(232.0f, 51.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 221.4f, 36.3f)
                close()
                moveTo(84.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 152.0f)
                close()
                moveTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(88.0f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(172.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 152.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
