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

public val LightGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 74.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-47.0f, 26.9f)
                lineTo(190.0f, 68.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(110.9f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(176.0f, 66.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 3.0f, 5.2f)
                lineToRelative(56.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.2f)
                lineTo(246.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 243.0f, 74.8f)
                close()
                moveTo(234.0f, 165.7f)
                lineTo(190.0f, 140.5f)
                verticalLineToRelative(-25.0f)
                lineToRelative(44.0f, -25.2f)
                close()
                moveTo(39.3f, 20.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, -8.8f, 8.0f)
                lineTo(54.1f, 54.0f)
                lineTo(24.0f, 54.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 68.0f)
                lineTo(10.0f, 188.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(176.0f, 202.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.3f, -3.6f)
                lineTo(219.6f, 236.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(176.0f, 190.0f)
                lineTo(24.0f, 190.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(22.0f, 68.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(65.0f, 66.0f)
                lineTo(177.3f, 189.5f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 176.0f, 190.0f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
