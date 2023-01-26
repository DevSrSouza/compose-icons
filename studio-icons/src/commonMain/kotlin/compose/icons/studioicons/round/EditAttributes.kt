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

public val RoundGroup.EditAttributes: ImageVector
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
                moveTo(11.11f, 10.6f)
                lineTo(7.6f, 14.11f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-1.86f, -1.86f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0.0f)
                lineToRelative(1.51f, 1.51f)
                lineToRelative(3.16f, -3.16f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                reflectiveCurveToRelative(0.17f, 0.51f, -0.02f, 0.71f)
                close()
            }
        }
        .build()
        return _editAttributes!!
    }

private var _editAttributes: ImageVector? = null
