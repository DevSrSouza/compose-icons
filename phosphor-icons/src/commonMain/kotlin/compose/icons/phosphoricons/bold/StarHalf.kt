package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.6f, 118.6f)
                lineToRelative(-8.8f, 7.2f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, -7.6f, 2.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -9.3f, -4.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.6f, -16.9f)
                lineToRelative(2.3f, -2.0f)
                lineToRelative(-3.0f, -0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 1.5f, -23.9f)
                lineToRelative(11.6f, 0.7f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 243.0f, 96.2f)
                arcTo(20.9f, 20.9f, 0.0f, false, true, 236.6f, 118.6f)
                close()
                moveTo(204.2f, 199.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.2f, 5.9f)
                lineToRelative(0.6f, 2.5f)
                lineToRelative(-2.2f, -1.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.8f, 20.3f)
                lineToRelative(9.8f, 6.2f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, false, 10.9f, 3.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 11.8f, -3.9f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, false, 7.9f, -21.9f)
                close()
                moveTo(176.0f, 137.7f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, false, -6.8f, 21.1f)
                lineToRelative(1.2f, 4.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, 9.0f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, false, 3.0f, -0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.6f, -14.6f)
                lineToRelative(-0.7f, -2.7f)
                lineToRelative(1.8f, -1.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -15.3f, -18.5f)
                close()
                moveTo(140.0f, 72.5f)
                lineTo(140.0f, 181.3f)
                lineToRelative(3.1f, 2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.7f, 16.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -16.6f, 3.8f)
                lineToRelative(-2.2f, -1.5f)
                lineTo(83.1f, 230.6f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, true, -24.5f, -0.8f)
                arcTo(22.4f, 22.4f, 0.0f, false, true, 50.0f, 206.1f)
                lineToRelative(13.1f, -51.2f)
                lineTo(19.4f, 118.6f)
                arcTo(20.9f, 20.9f, 0.0f, false, true, 13.0f, 96.2f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 31.1f, 82.0f)
                lineToRelative(56.8f, -3.6f)
                lineToRelative(21.2f, -53.5f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, 37.8f, 0.0f)
                lineToRelative(21.2f, 53.5f)
                horizontalLineToRelative(2.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -1.6f, 24.0f)
                lineToRelative(-4.5f, -0.3f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -17.6f, -12.9f)
                close()
                moveTo(116.0f, 181.3f)
                lineTo(116.0f, 72.5f)
                lineToRelative(-6.7f, 16.8f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -17.6f, 12.9f)
                lineToRelative(-50.5f, 3.2f)
                lineTo(80.0f, 137.7f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, true, 6.8f, 21.1f)
                lineTo(74.4f, 207.7f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
