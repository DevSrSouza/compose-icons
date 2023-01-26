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

public val RoundGroup.Polyline: ImageVector
    get() {
        if (_polyline != null) {
            return _polyline!!
        }
        _polyline = Builder(name = "Polyline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.04f, 6.85f)
                lineTo(7.3f, 10.0f)
                horizontalLineTo(4.5f)
                curveTo(3.67f, 10.0f, 3.0f, 10.67f, 3.0f, 11.5f)
                verticalLineToRelative(3.0f)
                curveTo(3.0f, 15.33f, 3.67f, 16.0f, 4.5f, 16.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.14f, 0.0f, 0.27f, -0.02f, 0.39f, -0.05f)
                lineTo(15.0f, 19.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.75f, 0.0f, -1.37f, 0.55f, -1.48f, 1.27f)
                lineTo(9.0f, 14.26f)
                verticalLineTo(11.5f)
                curveToRelative(0.0f, -0.12f, -0.01f, -0.24f, -0.04f, -0.36f)
                lineTo(11.7f, 8.0f)
                horizontalLineToRelative(2.8f)
                curveTo(15.33f, 8.0f, 16.0f, 7.33f, 16.0f, 6.5f)
                verticalLineToRelative(-3.0f)
                curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(10.67f, 2.0f, 10.0f, 2.67f, 10.0f, 3.5f)
                verticalLineToRelative(3.0f)
                curveTo(10.0f, 6.62f, 10.01f, 6.74f, 10.04f, 6.85f)
                close()
            }
        }
        .build()
        return _polyline!!
    }

private var _polyline: ImageVector? = null
