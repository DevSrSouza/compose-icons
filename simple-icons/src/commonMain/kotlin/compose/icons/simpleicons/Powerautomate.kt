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

public val SimpleIcons.Powerautomate: ImageVector
    get() {
        if (_powerautomate != null) {
            return _powerautomate!!
        }
        _powerautomate = Builder(name = "Powerautomate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.079f, 7.235f)
                lineToRelative(3.666f, 4.097f)
                curveToRelative(0.34f, 0.38f, 0.34f, 0.956f, 0.0f, 1.336f)
                lineToRelative(-7.63f, 8.528f)
                curveToRelative(-0.19f, 0.213f, -0.462f, 0.334f, -0.748f, 0.334f)
                lineTo(7.289f, 21.53f)
                lineToRelative(12.79f, -14.295f)
                close()
                moveTo(6.789f, 21.53f)
                lineTo(1.005f, 21.53f)
                curveToRelative(-0.867f, 0.0f, -1.326f, -1.025f, -0.748f, -1.671f)
                lineTo(15.748f, 2.545f)
                curveToRelative(0.139f, 0.057f, 0.265f, 0.145f, 0.367f, 0.259f)
                lineToRelative(3.631f, 4.058f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, -0.039f, 0.039f)
                lineTo(6.916f, 21.197f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.127f, 0.333f)
                close()
                moveTo(15.145f, 2.47f)
                lineTo(6.953f, 11.625f)
                lineTo(0.257f, 4.141f)
                curveToRelative(-0.578f, -0.646f, -0.119f, -1.671f, 0.748f, -1.671f)
                horizontalLineToRelative(14.14f)
                close()
            }
        }
        .build()
        return _powerautomate!!
    }

private var _powerautomate: ImageVector? = null
