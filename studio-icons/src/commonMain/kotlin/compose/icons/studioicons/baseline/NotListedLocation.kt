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

public val BaselineGroup.NotListedLocation: ImageVector
    get() {
        if (_notListedLocation != null) {
            return _notListedLocation!!
        }
        _notListedLocation = Builder(name = "NotListedLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(12.88f, 15.75f)
                horizontalLineToRelative(-1.75f)
                lineTo(11.13f, 14.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(12.88f, 12.88f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(0.0f, -2.84f, 2.62f, -2.62f, 2.62f, -4.38f)
                curveToRelative(0.0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f)
                lineTo(8.5f, 8.5f)
                curveTo(8.5f, 6.57f, 10.07f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 2.19f, -2.62f, 2.41f, -2.62f, 4.38f)
                close()
            }
        }
        .build()
        return _notListedLocation!!
    }

private var _notListedLocation: ImageVector? = null
