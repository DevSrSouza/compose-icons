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

public val TablerIcons.InnerShadowLeftFilled: ImageVector
    get() {
        if (_innerShadowLeftFilled != null) {
            return _innerShadowLeftFilled!!
        }
        _innerShadowLeftFilled = Builder(name = "InnerShadowLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.929f, 4.929f)
                curveToRelative(3.905f, -3.905f, 10.237f, -3.905f, 14.142f, 0.0f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0.0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0.0f)
                curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0.0f, -14.142f)
                close()
                moveTo(8.464f, 7.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 9.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -7.072f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _innerShadowLeftFilled!!
    }

private var _innerShadowLeftFilled: ImageVector? = null
