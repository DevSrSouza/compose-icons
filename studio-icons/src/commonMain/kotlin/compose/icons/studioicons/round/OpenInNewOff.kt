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

public val RoundGroup.OpenInNewOff: ImageVector
    get() {
        if (_openInNewOff != null) {
            return _openInNewOff!!
        }
        _openInNewOff = Builder(name = "OpenInNewOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.79f, 5.8f)
                lineToRelative(-1.94f, -1.94f)
                curveTo(14.54f, 3.54f, 14.76f, 3.0f, 15.21f, 3.0f)
                horizontalLineToRelative(5.29f)
                curveTo(20.78f, 3.0f, 21.0f, 3.22f, 21.0f, 3.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineTo(18.21f, 7.2f)
                lineToRelative(-4.09f, 4.09f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(16.79f, 5.8f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(3.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(20.0f)
                curveTo(19.45f, 12.0f, 19.0f, 12.45f, 19.0f, 13.0f)
                close()
                moveTo(19.07f, 21.9f)
                lineToRelative(-0.9f, -0.9f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.83f)
                lineToRelative(-0.9f, -0.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.09f, 22.29f, 19.46f, 22.29f, 19.07f, 21.9f)
                close()
                moveTo(16.17f, 19.0f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(10.41f, 15.0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.88f, -0.88f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.17f)
                close()
                moveTo(7.83f, 5.0f)
                horizontalLineTo(11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5.0f)
                close()
            }
        }
        .build()
        return _openInNewOff!!
    }

private var _openInNewOff: ImageVector? = null
