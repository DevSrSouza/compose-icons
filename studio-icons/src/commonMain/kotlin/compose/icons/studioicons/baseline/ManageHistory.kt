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

public val BaselineGroup.ManageHistory: ImageVector
    get() {
        if (_manageHistory != null) {
            return _manageHistory!!
        }
        _manageHistory = Builder(name = "ManageHistory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.69f, 18.37f)
                lineToRelative(1.14f, -1.0f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.45f, 0.49f)
                curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.3f, 1.49f)
                curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                lineToRelative(-1.45f, -0.49f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.14f, 1.0f)
                curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f)
                lineToRelative(-1.14f, 1.0f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.45f, -0.49f)
                curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                lineTo(18.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.3f, -1.49f)
                curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                lineToRelative(1.45f, 0.49f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.14f, -1.0f)
                curveTo(22.77f, 19.13f, 22.77f, 18.87f, 22.69f, 18.37f)
                close()
                moveTo(19.0f, 21.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(20.1f, 21.0f, 19.0f, 21.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(5.41f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(1.04f, -1.79f)
                lineTo(13.0f, 11.59f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                curveTo(9.17f, 3.0f, 6.65f, 4.32f, 5.0f, 6.36f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.26f)
                curveTo(7.53f, 6.19f, 9.63f, 5.0f, 12.0f, 5.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(10.86f, 18.91f)
                curveTo(7.87f, 18.42f, 5.51f, 16.01f, 5.08f, 13.0f)
                horizontalLineTo(3.06f)
                curveToRelative(0.5f, 4.5f, 4.31f, 8.0f, 8.94f, 8.0f)
                curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.07f, 0.0f)
                lineTo(10.86f, 18.91f)
                close()
            }
        }
        .build()
        return _manageHistory!!
    }

private var _manageHistory: ImageVector? = null
