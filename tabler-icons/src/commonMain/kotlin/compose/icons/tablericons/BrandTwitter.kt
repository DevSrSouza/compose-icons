package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) {
            return _brandTwitter!!
        }
        _brandTwitter = Builder(name = "BrandTwitter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.01f)
                curveToRelative(-1.0f, 0.49f, -1.98f, 0.689f, -3.0f, 0.99f)
                curveToRelative(-1.121f, -1.265f, -2.783f, -1.335f, -4.38f, -0.737f)
                reflectiveCurveToRelative(-2.643f, 2.06f, -2.62f, 3.737f)
                verticalLineToRelative(1.0f)
                curveToRelative(-3.245f, 0.083f, -6.135f, -1.395f, -8.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, -4.182f, 7.433f, 4.0f, 11.0f)
                curveToRelative(-1.872f, 1.247f, -3.739f, 2.088f, -6.0f, 2.0f)
                curveToRelative(3.308f, 1.803f, 6.913f, 2.423f, 10.034f, 1.517f)
                curveToRelative(3.58f, -1.04f, 6.522f, -3.723f, 7.651f, -7.742f)
                arcToRelative(13.84f, 13.84f, 0.0f, false, false, 0.497f, -3.753f)
                curveToRelative(0.0f, -0.249f, 1.51f, -2.772f, 1.818f, -4.013f)
                close()
            }
        }
        .build()
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
