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

public val TablerIcons.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) {
            return _ovalVertical!!
        }
        _ovalVertical = Builder(name = "OvalVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -3.314f, 4.03f, -6.0f, 9.0f, -6.0f)
                reflectiveCurveToRelative(9.0f, 2.686f, 9.0f, 6.0f)
                reflectiveCurveToRelative(-4.03f, 6.0f, -9.0f, 6.0f)
                reflectiveCurveToRelative(-9.0f, -2.686f, -9.0f, -6.0f)
                close()
            }
        }
        .build()
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
