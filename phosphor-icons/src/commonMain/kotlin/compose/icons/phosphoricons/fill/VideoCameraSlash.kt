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

public val FillGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.0f, 65.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.5f, -10.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 6.6f, -3.1f)
                horizontalLineTo(160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(54.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.1f, 7.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.8f, -1.6f)
                close()
                moveTo(40.8f, 18.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, -0.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 29.4f)
                lineTo(49.6f, 52.0f)
                horizontalLineTo(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 68.0f)
                verticalLineTo(188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(160.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.7f, -13.2f)
                lineToRelative(42.4f, 46.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 240.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(245.5f, 74.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -9.5f, -1.1f)
                lineTo(196.0f, 95.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, 7.0f)
                verticalLineToRelative(50.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 7.0f)
                lineToRelative(40.0f, 22.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.8f, -2.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.2f, -5.7f)
                verticalLineTo(80.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 245.5f, 74.2f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
