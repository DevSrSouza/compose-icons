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

public val RoundGroup.Checklist: ImageVector
    get() {
        if (_checklist != null) {
            return _checklist!!
        }
        _checklist = Builder(name = "Checklist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveTo(21.55f, 9.0f, 22.0f, 8.55f, 22.0f, 8.0f)
                close()
                moveTo(13.0f, 16.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(13.45f, 15.0f, 13.0f, 15.45f, 13.0f, 16.0f)
                close()
                moveTo(10.47f, 4.63f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-4.23f, 4.25f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f)
                lineTo(2.7f, 8.16f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(3.54f, -3.54f)
                curveTo(9.45f, 4.25f, 10.09f, 4.25f, 10.47f, 4.63f)
                close()
                moveTo(10.48f, 12.64f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-4.23f, 4.25f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f)
                lineTo(2.7f, 16.16f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(3.54f, -3.54f)
                curveTo(9.45f, 12.25f, 10.09f, 12.25f, 10.48f, 12.64f)
                lineTo(10.48f, 12.64f)
                close()
            }
        }
        .build()
        return _checklist!!
    }

private var _checklist: ImageVector? = null
