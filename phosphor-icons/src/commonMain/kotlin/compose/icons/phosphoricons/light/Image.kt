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

public val LightGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(218.0f, 169.5f)
                lineToRelative(-32.1f, -32.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-20.7f, 20.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(97.9f, 113.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.0f, 153.5f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 170.5f)
                lineToRelative(48.6f, -48.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(20.7f, -20.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineTo(218.0f, 186.5f)
                lineTo(218.0f, 200.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
                moveTo(148.9f, 107.1f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 146.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 148.9f, 107.1f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
