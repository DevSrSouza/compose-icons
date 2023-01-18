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

public val LightGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.5f, 64.0f)
                curveTo(44.2f, 81.5f, 38.0f, 103.0f, 38.0f, 128.0f)
                reflectiveCurveToRelative(6.2f, 46.5f, 18.5f, 64.0f)
                curveToRelative(9.2f, 13.0f, 18.5f, 18.8f, 18.6f, 18.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 8.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.2f, 2.0f)
                curveTo(67.2f, 220.1f, 26.0f, 194.6f, 26.0f, 128.0f)
                reflectiveCurveTo(67.2f, 35.9f, 68.9f, 34.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.2f, 10.2f)
                curveTo(75.0f, 45.2f, 65.7f, 51.0f, 56.5f, 64.0f)
                close()
                moveTo(187.1f, 34.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.2f, 10.2f)
                curveToRelative(0.1f, 0.1f, 9.4f, 5.9f, 18.6f, 18.9f)
                curveToRelative(12.3f, 17.5f, 18.5f, 39.0f, 18.5f, 64.0f)
                reflectiveCurveToRelative(-6.2f, 46.5f, -18.5f, 64.0f)
                curveToRelative(-9.2f, 13.0f, -18.5f, 18.8f, -18.6f, 18.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 8.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.2f, 2.0f)
                curveToRelative(1.7f, -1.0f, 42.9f, -26.5f, 42.9f, -93.1f)
                reflectiveCurveTo(188.8f, 35.9f, 187.1f, 34.9f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
