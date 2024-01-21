package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CloudHeart: ImageVector
    get() {
        if (_cloudHeart != null) {
            return _cloudHeart!!
        }
        _cloudHeart = Builder(name = "CloudHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.004f)
                horizontalLineToRelative(-3.343f)
                curveToRelative(-2.572f, -0.004f, -4.657f, -2.011f, -4.657f, -4.487f)
                curveToRelative(0.0f, -2.475f, 2.085f, -4.482f, 4.657f, -4.482f)
                curveToRelative(0.393f, -1.762f, 1.794f, -3.2f, 3.675f, -3.773f)
                curveToRelative(1.88f, -0.572f, 3.956f, -0.193f, 5.444f, 1.0f)
                curveToRelative(1.488f, 1.19f, 2.162f, 3.007f, 1.77f, 4.769f)
                horizontalLineToRelative(0.99f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
        }
        .build()
        return _cloudHeart!!
    }

private var _cloudHeart: ImageVector? = null
