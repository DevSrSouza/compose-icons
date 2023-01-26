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

public val OutlineGroup.Biotech: ImageVector
    get() {
        if (_biotech != null) {
            return _biotech!!
        }
        _biotech = Builder(name = "Biotech", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.47f, -2.57f)
                curveToRelative(0.41f, 0.59f, 1.06f, 1.0f, 1.83f, 1.06f)
                curveToRelative(0.7f, 0.06f, 1.36f, -0.19f, 1.85f, -0.62f)
                lineToRelative(0.59f, 1.61f)
                lineToRelative(0.94f, -0.34f)
                lineToRelative(0.34f, 0.94f)
                lineToRelative(1.88f, -0.68f)
                lineToRelative(-0.34f, -0.94f)
                lineToRelative(0.94f, -0.34f)
                lineTo(13.76f, 2.6f)
                lineToRelative(-0.94f, 0.34f)
                lineTo(12.48f, 2.0f)
                lineTo(10.6f, 2.68f)
                lineToRelative(0.34f, 0.94f)
                lineTo(10.0f, 3.97f)
                lineToRelative(0.56f, 1.55f)
                curveTo(9.39f, 5.48f, 8.37f, 6.27f, 8.08f, 7.38f)
                curveTo(6.27f, 8.14f, 5.0f, 9.92f, 5.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.86f, 4.52f)
                lineToRelative(1.71f, 4.7f)
                lineToRelative(-0.94f, 0.34f)
                lineToRelative(-1.71f, -4.7f)
                lineTo(12.86f, 4.52f)
                close()
                moveTo(10.5f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(9.5f, 7.45f, 9.95f, 7.0f, 10.5f, 7.0f)
                close()
            }
        }
        .build()
        return _biotech!!
    }

private var _biotech: ImageVector? = null
