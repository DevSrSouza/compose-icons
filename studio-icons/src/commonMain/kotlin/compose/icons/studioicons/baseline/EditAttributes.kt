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

public val BaselineGroup.EditAttributes: ImageVector
    get() {
        if (_editAttributes != null) {
            return _editAttributes!!
        }
        _editAttributes = Builder(name = "EditAttributes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.63f, 7.0f)
                horizontalLineTo(6.37f)
                curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f)
                horizontalLineToRelative(11.26f)
                curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f)
                reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f)
                close()
                moveTo(7.24f, 14.46f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(1.87f, 1.87f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(0.7f, 0.7f)
                lineToRelative(-4.22f, 4.22f)
                close()
            }
        }
        .build()
        return _editAttributes!!
    }

private var _editAttributes: ImageVector? = null
