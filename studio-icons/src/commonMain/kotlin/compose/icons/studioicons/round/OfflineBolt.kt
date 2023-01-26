package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.OfflineBolt: ImageVector
    get() {
        if (_offlineBolt != null) {
            return _offlineBolt!!
        }
        _offlineBolt = Builder(name = "OfflineBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.02f)
                curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f)
                reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f)
                reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f)
                close()
                moveTo(11.48f, 17.88f)
                verticalLineToRelative(-4.14f)
                lineTo(8.82f, 13.74f)
                curveToRelative(-0.37f, 0.0f, -0.62f, -0.4f, -0.44f, -0.73f)
                lineToRelative(3.68f, -7.17f)
                curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f)
                verticalLineToRelative(4.19f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.37f, 0.0f, 0.61f, 0.39f, 0.45f, 0.72f)
                lineToRelative(-3.56f, 7.12f)
                curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f)
                close()
            }
        }
        .build()
        return _offlineBolt!!
    }

private var _offlineBolt: ImageVector? = null
