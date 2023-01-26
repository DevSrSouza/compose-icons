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

public val SharpGroup.Workspaces: ImageVector
    get() {
        if (_workspaces != null) {
            return _workspaces!!
        }
        _workspaces = Builder(name = "Workspaces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                curveToRelative(-2.2f, 0.0f, -4.0f, 1.8f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f)
                reflectiveCurveTo(8.2f, 13.0f, 6.0f, 13.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(9.8f, 3.0f, 8.0f, 4.8f, 8.0f, 7.0f)
                reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f)
                reflectiveCurveTo(14.2f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.2f, 0.0f, -4.0f, 1.8f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f)
                reflectiveCurveTo(20.2f, 13.0f, 18.0f, 13.0f)
                close()
            }
        }
        .build()
        return _workspaces!!
    }

private var _workspaces: ImageVector? = null
