package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Timelapse: ImageVector
    get() {
        if (_timelapse != null) {
            return _timelapse!!
        }
        _timelapse = Builder(name = "Timelapse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.24f, 7.75f)
                curveToRelative(-1.17f, -1.17f, -2.7f, -1.76f, -4.24f, -1.76f)
                verticalLineToRelative(6.0f)
                lineToRelative(-4.24f, 4.24f)
                curveToRelative(2.34f, 2.34f, 6.14f, 2.34f, 8.49f, 0.0f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.14f, -0.01f, -8.48f)
                close()
                moveTo(12.0f, 1.99f)
                curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(12.0f, 19.99f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _timelapse!!
    }

private var _timelapse: ImageVector? = null
