package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Mediation: ImageVector
    get() {
        if (_mediation != null) {
            return _mediation!!
        }
        _mediation = Builder(name = "Mediation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-5.06f)
                curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f)
                curveTo(7.96f, 21.69f, 6.64f, 23.0f, 5.0f, 23.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.95f, 0.0f, 1.78f, 0.45f, 2.33f, 1.14f)
                curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f)
                horizontalLineToRelative(-3.1f)
                curveTo(7.4f, 14.16f, 6.3f, 15.0f, 5.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f)
                horizontalLineToRelative(3.1f)
                curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f)
                curveTo(6.78f, 6.55f, 5.95f, 7.0f, 5.0f, 7.0f)
                curveTo(3.34f, 7.0f, 2.0f, 5.66f, 2.0f, 4.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.64f, 0.0f, 2.96f, 1.31f, 2.99f, 2.95f)
                curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _mediation!!
    }

private var _mediation: ImageVector? = null
