package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 128.0f)
                curveToRelative(0.0f, 58.3f, 34.7f, 80.3f, 36.2f, 81.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 224.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -4.1f, -1.1f)
                curveTo(66.1f, 221.8f, 24.0f, 195.8f, 24.0f, 128.0f)
                reflectiveCurveTo(66.1f, 34.2f, 67.9f, 33.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.0f, 2.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.8f, 10.9f)
                curveTo(74.5f, 47.8f, 40.0f, 69.8f, 40.0f, 128.0f)
                close()
                moveTo(188.1f, 33.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.3f, 13.7f)
                curveToRelative(1.5f, 0.9f, 36.2f, 22.9f, 36.2f, 81.2f)
                reflectiveCurveToRelative(-34.7f, 80.3f, -36.1f, 81.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 224.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 4.1f, -1.1f)
                curveToRelative(1.8f, -1.1f, 43.9f, -27.1f, 43.9f, -94.9f)
                reflectiveCurveTo(189.9f, 34.2f, 188.1f, 33.1f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
