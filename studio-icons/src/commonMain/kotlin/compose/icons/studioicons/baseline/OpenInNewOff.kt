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

public val BaselineGroup.OpenInNewOff: ImageVector
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
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-2.79f, -2.8f)
                lineToRelative(-4.09f, 4.09f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(16.79f, 5.8f)
                close()
                moveTo(19.0f, 12.0f)
                verticalLineToRelative(4.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(18.17f, 21.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(16.17f, 19.0f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(9.7f, 15.71f)
                lineTo(8.29f, 14.3f)
                lineToRelative(1.59f, -1.59f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.17f)
                close()
                moveTo(7.83f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5.0f)
                close()
            }
        }
        .build()
        return _openInNewOff!!
    }

private var _openInNewOff: ImageVector? = null
