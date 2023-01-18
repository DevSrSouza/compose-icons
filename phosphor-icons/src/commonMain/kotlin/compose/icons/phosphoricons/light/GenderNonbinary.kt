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

public val LightGroup.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) {
            return _genderNonbinary!!
        }
        _genderNonbinary = Builder(name = "GenderNonbinary", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 90.3f)
                verticalLineToRelative(-35.0f)
                lineTo(160.4f, 73.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.3f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.6f, -8.3f)
                lineTo(138.8f, 44.0f)
                lineToRelative(28.3f, -19.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.6f, -8.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.3f, -1.7f)
                lineTo(128.0f, 36.8f)
                lineTo(95.6f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.3f, 1.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 88.9f, 25.0f)
                lineToRelative(28.3f, 19.0f)
                lineTo(88.9f, 63.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.6f, 8.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 2.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.3f, -1.0f)
                lineTo(122.0f, 55.3f)
                verticalLineToRelative(35.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, 62.0f, -62.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
