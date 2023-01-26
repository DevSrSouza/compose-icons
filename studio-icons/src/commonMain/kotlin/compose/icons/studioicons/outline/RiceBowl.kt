package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.RiceBowl: ImageVector
    get() {
        if (_riceBowl != null) {
            return _riceBowl!!
        }
        _riceBowl = Builder(name = "RiceBowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 14.0f)
                curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f)
                lineTo(14.0f, 18.88f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.12f)
                lineToRelative(-1.27f, -0.5f)
                curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f)
                horizontalLineTo(19.66f)
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.75f)
                curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f)
                horizontalLineToRelative(0.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(10.0f, 12.0f)
                verticalLineTo(4.26f)
                curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(1.36f, 0.1f, 2.0f, 0.26f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineTo(5.08f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 12.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _riceBowl!!
    }

private var _riceBowl: ImageVector? = null
