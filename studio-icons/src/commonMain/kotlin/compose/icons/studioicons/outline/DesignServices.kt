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

public val OutlineGroup.DesignServices: ImageVector
    get() {
        if (_designServices != null) {
            return _designServices!!
        }
        _designServices = Builder(name = "DesignServices", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.97f, 7.27f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-4.49f, 4.49f)
                lineTo(8.35f, 3.63f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(3.89f, 3.89f)
                lineTo(3.0f, 16.76f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(4.52f, -4.52f)
                lineToRelative(3.89f, 3.89f)
                curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-3.89f, -3.89f)
                lineTo(20.97f, 7.27f)
                close()
                moveTo(5.04f, 6.94f)
                lineToRelative(1.89f, -1.9f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(1.27f, 1.27f)
                lineTo(7.02f, 7.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.19f, -1.19f)
                lineToRelative(1.2f, 1.2f)
                lineToRelative(-1.9f, 1.9f)
                lineTo(5.04f, 6.94f)
                close()
                moveTo(16.27f, 14.38f)
                lineToRelative(-1.19f, 1.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.19f, -1.19f)
                lineToRelative(1.27f, 1.27f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(-3.89f, -3.89f)
                lineToRelative(1.9f, -1.9f)
                lineTo(16.27f, 14.38f)
                close()
                moveTo(6.41f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.41f)
                lineToRelative(9.61f, -9.61f)
                lineToRelative(1.3f, 1.3f)
                lineToRelative(0.11f, 0.11f)
                lineTo(6.41f, 19.0f)
                close()
                moveTo(16.02f, 6.56f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(16.02f, 6.56f)
                close()
            }
        }
        .build()
        return _designServices!!
    }

private var _designServices: ImageVector? = null
