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

public val RoundGroup.AddReaction: ImageVector
    get() {
        if (_addReaction != null) {
            return _addReaction!!
        }
        _addReaction = Builder(name = "AddReaction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveTo(23.55f, 3.0f, 24.0f, 3.45f, 24.0f, 4.0f)
                close()
                moveTo(21.52f, 8.95f)
                curveTo(21.83f, 9.91f, 22.0f, 10.94f, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.5f, 0.0f, 2.92f, 0.34f, 4.2f, 0.94f)
                curveTo(16.08f, 3.27f, 16.0f, 3.62f, 16.0f, 4.0f)
                curveToRelative(0.0f, 1.35f, 0.9f, 2.5f, 2.13f, 2.87f)
                curveTo(18.5f, 8.1f, 19.65f, 9.0f, 21.0f, 9.0f)
                curveTo(21.18f, 9.0f, 21.35f, 8.98f, 21.52f, 8.95f)
                close()
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 10.33f, 7.67f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(10.0f, 10.33f, 10.0f, 9.5f)
                reflectiveCurveTo(9.33f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(7.0f, 8.67f, 7.0f, 9.5f)
                close()
                moveTo(16.31f, 14.0f)
                horizontalLineTo(7.69f)
                curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.44f, 0.75f)
                curveTo(8.2f, 16.39f, 9.97f, 17.5f, 12.0f, 17.5f)
                reflectiveCurveToRelative(3.8f, -1.11f, 4.75f, -2.75f)
                curveTo(16.94f, 14.42f, 16.7f, 14.0f, 16.31f, 14.0f)
                close()
                moveTo(17.0f, 9.5f)
                curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f)
                reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(17.0f, 10.33f, 17.0f, 9.5f)
                close()
            }
        }
        .build()
        return _addReaction!!
    }

private var _addReaction: ImageVector? = null
