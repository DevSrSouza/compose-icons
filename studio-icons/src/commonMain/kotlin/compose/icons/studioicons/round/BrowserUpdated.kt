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

public val RoundGroup.BrowserUpdated: ImageVector
    get() {
        if (_browserUpdated != null) {
            return _browserUpdated!!
        }
        _browserUpdated = Builder(name = "BrowserUpdated", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.89f, 0.0f, 1.34f, 1.08f, 0.71f, 1.71f)
                lineToRelative(-2.59f, 2.59f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.59f, -2.59f)
                curveTo(11.08f, 11.08f, 11.52f, 10.0f, 12.41f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 3.45f, 14.45f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(6.0f, 19.59f)
                curveTo(6.0f, 20.37f, 6.63f, 21.0f, 7.41f, 21.0f)
                horizontalLineToRelative(9.17f)
                curveToRelative(0.78f, 0.0f, 1.41f, -0.63f, 1.41f, -1.41f)
                curveToRelative(0.0f, -0.72f, -0.44f, -1.03f, -1.0f, -1.59f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                lineToRelative(7.0f, 0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 3.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveTo(6.45f, 18.55f, 6.0f, 18.87f, 6.0f, 19.59f)
                close()
            }
        }
        .build()
        return _browserUpdated!!
    }

private var _browserUpdated: ImageVector? = null
