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

public val TablerIcons.BrandSnapchat: ImageVector
    get() {
        if (_brandSnapchat != null) {
            return _brandSnapchat!!
        }
        _brandSnapchat = Builder(name = "BrandSnapchat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.882f, 7.842f)
                arcToRelative(4.882f, 4.882f, 0.0f, false, false, -9.764f, 0.0f)
                curveToRelative(0.0f, 4.273f, -0.213f, 6.409f, -4.118f, 8.118f)
                curveToRelative(2.0f, 0.882f, 2.0f, 0.882f, 3.0f, 3.0f)
                curveToRelative(3.0f, 0.0f, 4.0f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(3.0f, -2.0f, 6.0f, -2.0f)
                curveToRelative(1.0f, -2.118f, 1.0f, -2.118f, 3.0f, -3.0f)
                curveToRelative(-3.906f, -1.709f, -4.118f, -3.845f, -4.118f, -8.118f)
                close()
                moveTo(3.0f, 15.961f)
                curveToRelative(4.0f, -2.118f, 4.0f, -4.118f, 1.0f, -7.118f)
                moveToRelative(17.0f, 7.118f)
                curveToRelative(-4.0f, -2.118f, -4.0f, -4.118f, -1.0f, -7.118f)
            }
        }
        .build()
        return _brandSnapchat!!
    }

private var _brandSnapchat: ImageVector? = null
