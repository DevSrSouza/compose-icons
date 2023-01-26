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

public val BaselineGroup.ControlPointDuplicate: ImageVector
    get() {
        if (_controlPointDuplicate != null) {
            return _controlPointDuplicate!!
        }
        _controlPointDuplicate = Builder(name = "ControlPointDuplicate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -2.79f, 1.64f, -5.2f, 4.01f, -6.32f)
                lineTo(6.01f, 3.52f)
                curveTo(2.52f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.52f, 7.24f, 6.01f, 8.48f)
                verticalLineToRelative(-2.16f)
                curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f)
                close()
                moveTo(15.0f, 3.0f)
                curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.04f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(15.0f, 19.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _controlPointDuplicate!!
    }

private var _controlPointDuplicate: ImageVector? = null
