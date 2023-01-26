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

public val BaselineGroup.FrontHand: ImageVector
    get() {
        if (_frontHand != null) {
            return _frontHand!!
        }
        _frontHand = Builder(name = "FrontHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 8.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f)
                lineToRelative(0.0f, -10.78f)
                curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f)
                curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(1.25f)
                curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.75f)
                curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f)
                reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f)
                reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f)
                verticalLineToRelative(-6.5f)
                curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f)
                close()
            }
        }
        .build()
        return _frontHand!!
    }

private var _frontHand: ImageVector? = null
