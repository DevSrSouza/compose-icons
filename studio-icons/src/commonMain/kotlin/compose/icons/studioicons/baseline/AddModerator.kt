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

public val BaselineGroup.AddModerator: ImageVector
    get() {
        if (_addModerator != null) {
            return _addModerator!!
        }
        _addModerator = Builder(name = "AddModerator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.22f, 22.61f)
                curveToRelative(-0.4f, 0.15f, -0.8f, 0.29f, -1.22f, 0.39f)
                curveToRelative(-5.16f, -1.26f, -9.0f, -6.45f, -9.0f, -12.0f)
                verticalLineTo(5.0f)
                lineToRelative(9.0f, -4.0f)
                lineToRelative(9.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.9f, -0.11f, 1.78f, -0.3f, 2.65f)
                curveToRelative(-0.81f, -0.41f, -1.73f, -0.65f, -2.7f, -0.65f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.36f, 0.46f, 2.61f, 1.22f, 3.61f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(2.99f)
                reflectiveCurveToRelative(-1.99f, 0.01f, -2.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _addModerator!!
    }

private var _addModerator: ImageVector? = null
