package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Comicfury: ImageVector
    get() {
        if (_comicfury != null) {
            return _comicfury!!
        }
        _comicfury = Builder(name = "Comicfury", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 6.959f)
                lineToRelative(1.899f, -3.256f)
                lineToRelative(2.725f, 2.736f)
                lineToRelative(2.973f, -0.204f)
                lineTo(9.3f, 3.297f)
                lineToRelative(2.213f, 2.693f)
                lineToRelative(8.655f, -0.252f)
                lineToRelative(0.406f, -1.085f)
                lineTo(24.0f, 5.128f)
                verticalLineToRelative(5.268f)
                lineToRelative(-11.248f, 3.526f)
                lineToRelative(-1.085f, 6.781f)
                lineTo(0.0f, 20.703f)
                lineTo(0.0f, 6.959f)
                close()
                moveTo(2.195f, 6.211f)
                lineTo(1.041f, 8.137f)
                lineToRelative(1.75f, 1.748f)
                lineToRelative(1.133f, -1.948f)
                lineToRelative(-1.729f, -1.726f)
                close()
                moveTo(9.604f, 5.763f)
                lineTo(8.48f, 7.546f)
                lineToRelative(1.224f, 1.598f)
                lineToRelative(1.137f, -1.766f)
                lineToRelative(-1.237f, -1.615f)
                close()
                moveTo(13.505f, 9.514f)
                lineTo(11.513f, 9.863f)
                lineTo(12.51f, 11.888f)
                lineTo(13.505f, 9.514f)
                close()
                moveTo(16.824f, 8.949f)
                lineTo(14.832f, 9.297f)
                lineTo(15.828f, 11.322f)
                lineTo(16.824f, 8.949f)
                close()
                moveTo(20.052f, 8.338f)
                lineTo(18.061f, 8.687f)
                lineTo(19.057f, 10.712f)
                lineTo(20.052f, 8.338f)
                close()
                moveTo(23.235f, 7.772f)
                lineTo(21.243f, 8.121f)
                lineTo(22.239f, 10.146f)
                lineTo(23.235f, 7.772f)
                close()
            }
        }
        .build()
        return _comicfury!!
    }

private var _comicfury: ImageVector? = null
