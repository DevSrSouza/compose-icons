package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AppShortcut: ImageVector
    get() {
        if (_appShortcut != null) {
            return _appShortcut!!
        }
        _appShortcut = Builder(name = "AppShortcut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.38f, 9.62f)
                lineToRelative(0.4f, 0.87f)
                curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f)
                lineToRelative(0.4f, -0.87f)
                lineToRelative(0.87f, -0.4f)
                curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f)
                lineToRelative(-0.87f, -0.4f)
                lineToRelative(-0.4f, -0.87f)
                curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0.0f)
                lineToRelative(-0.4f, 0.87f)
                lineToRelative(-0.87f, 0.4f)
                curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f)
                lineTo(20.38f, 9.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.54f, 9.0f)
                lineToRelative(-0.79f, 1.75f)
                lineTo(13.0f, 11.54f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.75f, 0.79f)
                lineTo(15.54f, 15.0f)
                curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f)
                lineToRelative(0.79f, -1.75f)
                lineTo(19.0f, 12.46f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.75f, -0.79f)
                lineTo(16.46f, 9.0f)
                curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.77f, 13.5f)
                lineToRelative(-0.4f, 0.87f)
                lineToRelative(-0.87f, 0.4f)
                curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f)
                lineToRelative(0.87f, 0.4f)
                lineToRelative(0.4f, 0.87f)
                curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f)
                lineToRelative(0.4f, -0.87f)
                lineToRelative(0.87f, -0.4f)
                curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f)
                lineToRelative(-0.87f, -0.4f)
                lineToRelative(-0.4f, -0.87f)
                curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f)
                close()
            }
        }
        .build()
        return _appShortcut!!
    }

private var _appShortcut: ImageVector? = null
