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

public val RoundGroup.ManageSearch: ImageVector
    get() {
        if (_manageSearch != null) {
            return _manageSearch!!
        }
        _manageSearch = Builder(name = "ManageSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 9.0f, 2.0f, 8.55f, 2.0f, 8.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(7.0f, 8.55f, 6.55f, 9.0f, 6.0f, 9.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(7.0f, 12.45f, 6.55f, 12.0f, 6.0f, 12.0f)
                close()
                moveTo(19.88f, 18.29f)
                lineToRelative(-3.12f, -3.12f)
                curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f)
                curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f)
                curveTo(8.6f, 8.33f, 11.49f, 5.5f, 14.87f, 6.07f)
                curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f)
                curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f)
                lineToRelative(3.13f, 3.13f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.91f, 18.68f, 20.27f, 18.68f, 19.88f, 18.29f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveTo(17.0f, 12.65f, 17.0f, 11.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(2.0f, 18.55f, 2.45f, 19.0f, 3.0f, 19.0f)
                close()
            }
        }
        .build()
        return _manageSearch!!
    }

private var _manageSearch: ImageVector? = null
