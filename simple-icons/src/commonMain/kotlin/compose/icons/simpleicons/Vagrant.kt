package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vagrant: VectorAsset
    get() {
        if (_vagrant != null) {
            return _vagrant!!
        }
        _vagrant = VectorAssetBuilder(name = "Vagrant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.672f, 6.774f)
                lineTo(5.672f, 4.917f)
                lineToRelative(3.164f, -1.822f)
                lineTo(3.56f, 0.005f)
                lineTo(0.397f, 1.852f)
                verticalLineToRelative(2.263f)
                lineTo(7.52f, 21.41f)
                lineTo(12.0f, 23.995f)
                verticalLineToRelative(-6.496f)
                lineToRelative(2.107f, -1.224f)
                lineToRelative(-0.024f, -0.015f)
                lineToRelative(4.245f, -9.486f)
                lineTo(18.328f, 4.917f)
                lineToRelative(5.275f, -3.065f)
                lineTo(20.439f, 0.005f)
                lineToRelative(-5.272f, 3.087f)
                horizontalLineToRelative(-0.003f)
                lineTo(15.164f, 5.202f)
                lineTo(12.0f, 12.584f)
                verticalLineToRelative(2.467f)
                lineToRelative(-2.11f, 1.224f)
                close()
                moveTo(8.836f, 3.114f)
                lineTo(8.814f, 3.1f)
                lineTo(5.672f, 4.917f)
                verticalLineToRelative(1.857f)
                lineToRelative(4.218f, 9.501f)
                lineTo(12.0f, 15.234f)
                verticalLineToRelative(-2.65f)
                lineTo(8.836f, 5.202f)
                close()
                moveTo(18.328f, 4.917f)
                verticalLineToRelative(1.857f)
                lineToRelative(-4.22f, 9.101f)
                lineTo(12.0f, 17.332f)
                verticalLineToRelative(6.663f)
                lineToRelative(4.521f, -2.607f)
                lineTo(23.603f, 4.05f)
                lineTo(23.603f, 1.852f)
                close()
            }
        }
        .build()
        return _vagrant!!
    }

private var _vagrant: VectorAsset? = null
