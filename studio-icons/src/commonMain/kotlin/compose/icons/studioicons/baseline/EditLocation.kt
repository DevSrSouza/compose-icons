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

public val BaselineGroup.EditLocation: ImageVector
    get() {
        if (_editLocation != null) {
            return _editLocation!!
        }
        _editLocation = Builder(name = "EditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(10.44f, 12.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(-1.44f)
                lineToRelative(3.35f, -3.34f)
                lineToRelative(1.43f, 1.43f)
                lineTo(10.44f, 12.0f)
                close()
                moveTo(14.89f, 7.55f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0.0f)
                lineToRelative(0.9f, 0.9f)
                curveToRelative(0.15f, 0.15f, 0.15f, 0.39f, 0.0f, 0.54f)
                close()
            }
        }
        .build()
        return _editLocation!!
    }

private var _editLocation: ImageVector? = null
