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

public val BoldGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.3f, 222.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -6.2f, -1.7f)
                curveTo(64.0f, 225.2f, 20.0f, 198.0f, 20.0f, 128.0f)
                reflectiveCurveTo(64.0f, 30.8f, 65.8f, 29.7f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 78.2f, 50.2f)
                curveTo(76.7f, 51.2f, 44.0f, 72.3f, 44.0f, 128.0f)
                reflectiveCurveToRelative(32.9f, 76.9f, 34.3f, 77.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 82.3f, 222.2f)
                close()
                moveTo(190.2f, 29.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.5f, 20.5f)
                curveToRelative(1.4f, 0.9f, 34.3f, 22.0f, 34.3f, 77.8f)
                reflectiveCurveToRelative(-32.9f, 76.9f, -34.2f, 77.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 228.0f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, 6.2f, -1.7f)
                curveTo(192.0f, 225.2f, 236.0f, 198.0f, 236.0f, 128.0f)
                reflectiveCurveTo(192.0f, 30.8f, 190.2f, 29.7f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
