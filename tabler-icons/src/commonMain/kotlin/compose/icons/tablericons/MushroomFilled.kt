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

public val TablerIcons.MushroomFilled: ImageVector
    get() {
        if (_mushroomFilled != null) {
            return _mushroomFilled!!
        }
        _mushroomFilled = Builder(name = "MushroomFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.995f, 0.176f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(4.9f, 13.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.894f, -1.752f)
                lineToRelative(-0.006f, -0.148f)
                curveToRelative(0.0f, -5.023f, 4.027f, -9.1f, 9.0f, -9.1f)
                reflectiveCurveToRelative(9.0f, 4.077f, 9.0f, 9.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.752f, 1.894f)
                lineToRelative(-0.148f, 0.006f)
                horizontalLineToRelative(-14.2f)
                close()
            }
        }
        .build()
        return _mushroomFilled!!
    }

private var _mushroomFilled: ImageVector? = null
