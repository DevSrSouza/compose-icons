package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ScheduleSend: ImageVector
    get() {
        if (_scheduleSend != null) {
            return _scheduleSend!!
        }
        _scheduleSend = Builder(name = "ScheduleSend", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(18.65f, 19.35f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.79f)
                lineToRelative(1.85f, 1.85f)
                lineTo(18.65f, 19.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                lineToRelative(-6.0f, -1.5f)
                verticalLineTo(7.01f)
                lineToRelative(8.87f, 3.74f)
                curveToRelative(0.94f, -0.47f, 2.0f, -0.75f, 3.13f, -0.75f)
                curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(7.0f, -2.95f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveToRelative(0.0f, -0.8f, 0.14f, -1.56f, 0.39f, -2.28f)
                lineTo(5.0f, 16.99f)
                verticalLineTo(13.5f)
                lineTo(11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _scheduleSend!!
    }

private var _scheduleSend: ImageVector? = null
