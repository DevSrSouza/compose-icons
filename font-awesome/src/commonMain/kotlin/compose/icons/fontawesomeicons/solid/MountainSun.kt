package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MountainSun: ImageVector
    get() {
        if (_mountainSun != null) {
            return _mountainSun!!
        }
        _mountainSun = Builder(name = "MountainSun", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 560.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(55.9f, 512.0f)
                horizontalLineTo(381.1f)
                horizontalLineToRelative(75.0f)
                horizontalLineTo(578.9f)
                curveToRelative(33.8f, 0.0f, 61.1f, -27.4f, 61.1f, -61.1f)
                curveToRelative(0.0f, -11.2f, -3.1f, -22.2f, -8.9f, -31.8f)
                lineToRelative(-132.0f, -216.3f)
                curveTo(495.0f, 196.1f, 487.8f, 192.0f, 480.0f, 192.0f)
                reflectiveCurveToRelative(-15.0f, 4.1f, -19.1f, 10.7f)
                lineToRelative(-48.2f, 79.0f)
                lineTo(286.8f, 81.0f)
                curveToRelative(-6.6f, -10.6f, -18.3f, -17.0f, -30.8f, -17.0f)
                reflectiveCurveToRelative(-24.1f, 6.4f, -30.8f, 17.0f)
                lineTo(8.6f, 426.4f)
                curveTo(3.0f, 435.3f, 0.0f, 445.6f, 0.0f, 456.1f)
                curveTo(0.0f, 487.0f, 25.0f, 512.0f, 55.9f, 512.0f)
                close()
            }
        }
        .build()
        return _mountainSun!!
    }

private var _mountainSun: ImageVector? = null
