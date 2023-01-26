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

public val OutlineGroup.EditAttributes: ImageVector
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
                lineTo(6.37f, 7.0f)
                curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f)
                horizontalLineToRelative(11.26f)
                curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f)
                reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f)
                close()
                moveTo(17.63f, 15.0f)
                lineTo(6.37f, 15.0f)
                curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f)
                reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f)
                horizontalLineToRelative(11.26f)
                curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f)
                reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f)
                close()
                moveTo(7.24f, 13.06f)
                lineToRelative(-1.87f, -1.87f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(2.57f, 2.57f)
                lineToRelative(4.22f, -4.22f)
                lineToRelative(-0.7f, -0.7f)
                close()
            }
        }
        .build()
        return _editAttributes!!
    }

private var _editAttributes: ImageVector? = null
