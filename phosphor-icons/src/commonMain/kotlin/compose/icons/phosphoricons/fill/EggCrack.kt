package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) {
            return _eggCrack!!
        }
        _eggCrack = Builder(name = "EggCrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -87.8f, 88.0f)
                curveToRelative(-50.6f, 0.1f, -90.2f, -43.0f, -88.1f, -93.6f)
                curveToRelative(1.2f, -29.2f, 11.7f, -60.6f, 29.2f, -86.8f)
                reflectiveCurveTo(109.5f, 16.0f, 128.0f, 16.0f)
                curveToRelative(13.3f, 0.0f, 28.2f, 8.3f, 42.3f, 23.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, 5.5f)
                lineTo(123.8f, 96.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.8f, 7.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 4.9f, 5.6f)
                lineToRelative(22.6f, 8.7f)
                lineToRelative(-5.9f, 30.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 6.3f, 9.7f)
                horizontalLineToRelative(1.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.9f, -6.5f)
                lineToRelative(7.2f, -37.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.0f, -9.0f)
                lineToRelative(-18.0f, -7.0f)
                lineToRelative(36.2f, -40.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 6.3f, 0.4f)
                lineToRelative(0.7f, 1.1f)
                curveTo(205.3f, 87.5f, 216.0f, 121.2f, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
