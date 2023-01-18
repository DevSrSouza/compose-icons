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

public val BoldGroup.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) {
            return _genderNonbinary!!
        }
        _genderNonbinary = Builder(name = "GenderNonbinary", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 84.9f)
                verticalLineTo(63.5f)
                lineToRelative(17.4f, 10.7f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 6.3f, 1.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 10.2f, -5.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 170.0f, 53.8f)
                lineTo(150.9f, 42.0f)
                lineTo(170.0f, 30.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 157.4f, 9.8f)
                lineTo(128.0f, 27.9f)
                lineTo(98.6f, 9.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 86.0f, 30.2f)
                lineTo(105.1f, 42.0f)
                lineTo(86.0f, 53.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.9f, 16.5f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 92.3f, 76.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 6.3f, -1.8f)
                lineTo(116.0f, 63.5f)
                verticalLineTo(84.9f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
