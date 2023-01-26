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

public val OutlineGroup.AddLocationAlt: ImageVector
    get() {
        if (_addLocationAlt != null) {
            return _addLocationAlt!!
        }
        _addLocationAlt = Builder(name = "AddLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(13.0f, 3.06f)
                verticalLineToRelative(2.02f)
                arcTo(6.53f, 6.53f, 0.0f, false, false, 12.0f, 5.0f)
                curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveTo(4.0f, 6.22f, 7.8f, 3.0f, 12.0f, 3.0f)
                curveToRelative(0.34f, 0.0f, 0.67f, 0.02f, 1.0f, 0.06f)
                close()
            }
        }
        .build()
        return _addLocationAlt!!
    }

private var _addLocationAlt: ImageVector? = null
