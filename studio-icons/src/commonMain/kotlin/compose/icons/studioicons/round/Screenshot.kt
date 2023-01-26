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

public val RoundGroup.Screenshot: ImageVector
    get() {
        if (_screenshot != null) {
            return _screenshot!!
        }
        _screenshot = Builder(name = "Screenshot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.01f)
                lineTo(7.0f, 1.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.1f, 1.01f, 17.0f, 1.01f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.5f, 8.5f)
                horizontalLineToRelative(1.75f)
                curveTo(11.66f, 8.5f, 12.0f, 8.16f, 12.0f, 7.75f)
                verticalLineToRelative(0.0f)
                curveTo(12.0f, 7.34f, 11.66f, 7.0f, 11.25f, 7.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(8.34f, 7.0f, 8.0f, 7.34f, 8.0f, 7.75f)
                verticalLineToRelative(2.5f)
                curveTo(8.0f, 10.66f, 8.34f, 11.0f, 8.75f, 11.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(12.75f, 17.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                lineToRelative(0.0f, 0.0f)
                curveTo(12.0f, 16.66f, 12.34f, 17.0f, 12.75f, 17.0f)
                close()
            }
        }
        .build()
        return _screenshot!!
    }

private var _screenshot: ImageVector? = null
