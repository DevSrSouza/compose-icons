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

public val OutlineGroup.HelpCenter: ImageVector
    get() {
        if (_helpCenter != null) {
            return _helpCenter!!
        }
        _helpCenter = Builder(name = "HelpCenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 16.74f)
                curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f)
                curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f)
                curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f)
                curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f)
                close()
                moveTo(11.99f, 6.0f)
                curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f)
                lineToRelative(1.64f, 0.69f)
                curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f)
                curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f)
                curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f)
                curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f)
                horizontalLineToRelative(1.82f)
                curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f)
                curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f)
                curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f)
                curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(5.0f)
                moveTo(19.0f, 3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _helpCenter!!
    }

private var _helpCenter: ImageVector? = null
