package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Dental: ImageVector
    get() {
        if (_dental != null) {
            return _dental!!
        }
        _dental = Builder(name = "Dental", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                curveToRelative(-1.074f, -0.586f, -2.583f, -1.5f, -4.0f, -1.5f)
                curveToRelative(-2.1f, -0.001f, -4.0f, 1.247f, -4.0f, 5.0f)
                curveToRelative(0.0f, 4.899f, 1.056f, 8.41f, 2.671f, 10.537f)
                curveToRelative(0.573f, 0.756f, 1.97f, 0.521f, 2.567f, -0.236f)
                curveToRelative(0.398f, -0.505f, 0.819f, -1.439f, 1.262f, -2.801f)
                curveToRelative(0.292f, -0.771f, 0.892f, -1.504f, 1.5f, -1.5f)
                curveToRelative(0.602f, 0.004f, 1.21f, 0.737f, 1.5f, 1.5f)
                curveToRelative(0.443f, 1.362f, 0.864f, 2.295f, 1.262f, 2.8f)
                curveToRelative(0.597f, 0.759f, 1.994f, 0.993f, 2.567f, 0.237f)
                curveToRelative(1.615f, -2.127f, 2.671f, -5.637f, 2.671f, -10.537f)
                curveToRelative(0.0f, -3.74f, -1.908f, -4.994f, -4.0f, -5.0f)
                curveToRelative(-1.423f, -0.004f, -2.92f, 0.911f, -4.0f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                lineToRelative(3.0f, 1.5f)
            }
        }
        .build()
        return _dental!!
    }

private var _dental: ImageVector? = null
