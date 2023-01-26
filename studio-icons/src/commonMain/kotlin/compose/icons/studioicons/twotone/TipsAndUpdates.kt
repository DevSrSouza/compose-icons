package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.TipsAndUpdates: ImageVector
    get() {
        if (_tipsAndUpdates != null) {
            return _tipsAndUpdates!!
        }
        _tipsAndUpdates = Builder(name = "TipsAndUpdates", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 9.5f)
                curveTo(14.5f, 6.47f, 12.03f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveTo(3.5f, 6.47f, 3.5f, 9.5f)
                curveToRelative(0.0f, 2.47f, 1.49f, 3.89f, 2.35f, 4.5f)
                horizontalLineToRelative(6.3f)
                curveTo(13.01f, 13.39f, 14.5f, 11.97f, 14.5f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(7.0f, 21.1f, 7.0f, 20.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(16.5f, 9.5f)
                curveToRelative(0.0f, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f)
                horizontalLineTo(5.27f)
                curveTo(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f)
                curveTo(1.5f, 5.36f, 4.86f, 2.0f, 9.0f, 2.0f)
                reflectiveCurveTo(16.5f, 5.36f, 16.5f, 9.5f)
                close()
                moveTo(14.5f, 9.5f)
                curveTo(14.5f, 6.47f, 12.03f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveTo(3.5f, 6.47f, 3.5f, 9.5f)
                curveToRelative(0.0f, 2.47f, 1.49f, 3.89f, 2.35f, 4.5f)
                horizontalLineToRelative(6.3f)
                curveTo(13.01f, 13.39f, 14.5f, 11.97f, 14.5f, 9.5f)
                close()
                moveTo(21.37f, 7.37f)
                lineTo(20.0f, 8.0f)
                lineToRelative(1.37f, 0.63f)
                lineTo(22.0f, 10.0f)
                lineToRelative(0.63f, -1.37f)
                lineTo(24.0f, 8.0f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(22.0f, 6.0f)
                lineTo(21.37f, 7.37f)
                close()
                moveTo(19.0f, 6.0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(22.0f, 3.0f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(19.0f, 0.0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(16.0f, 3.0f)
                lineToRelative(2.06f, 0.94f)
                lineTo(19.0f, 6.0f)
                close()
            }
        }
        .build()
        return _tipsAndUpdates!!
    }

private var _tipsAndUpdates: ImageVector? = null
