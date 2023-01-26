package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NightlightRound: ImageVector
    get() {
        if (_nightlightRound != null) {
            return _nightlightRound!!
        }
        _nightlightRound = Builder(name = "NightlightRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 12.0f)
                curveToRelative(0.0f, -3.57f, 2.2f, -6.62f, 5.31f, -7.87f)
                curveToRelative(0.89f, -0.36f, 0.75f, -1.69f, -0.19f, -1.9f)
                curveToRelative(-1.1f, -0.24f, -2.27f, -0.3f, -3.48f, -0.14f)
                curveToRelative(-4.51f, 0.6f, -8.12f, 4.31f, -8.59f, 8.83f)
                curveTo(4.44f, 16.93f, 9.13f, 22.0f, 15.01f, 22.0f)
                curveToRelative(0.73f, 0.0f, 1.43f, -0.08f, 2.12f, -0.23f)
                curveToRelative(0.95f, -0.21f, 1.1f, -1.53f, 0.2f, -1.9f)
                curveToRelative(-3.22f, -1.29f, -5.33f, -4.41f, -5.32f, -7.87f)
                close()
            }
        }
        .build()
        return _nightlightRound!!
    }

private var _nightlightRound: ImageVector? = null
