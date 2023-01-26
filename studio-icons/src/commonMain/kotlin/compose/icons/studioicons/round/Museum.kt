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

public val RoundGroup.Museum: ImageVector
    get() {
        if (_museum != null) {
            return _museum!!
        }
        _museum = Builder(name = "Museum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 11.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(9.26f)
                curveToRelative(0.0f, -0.16f, -0.08f, -0.32f, -0.21f, -0.41f)
                lineTo(12.57f, 2.4f)
                curveToRelative(-0.34f, -0.24f, -0.8f, -0.24f, -1.15f, 0.0f)
                lineTo(2.21f, 8.85f)
                curveTo(2.08f, 8.94f, 2.0f, 9.1f, 2.0f, 9.26f)
                verticalLineToRelative(1.24f)
                curveTo(2.0f, 10.78f, 2.22f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(21.5f)
                close()
                moveTo(16.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-1.17f, 1.75f)
                curveToRelative(-0.4f, 0.59f, -1.27f, 0.59f, -1.66f, 0.0f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.7f)
                curveTo(8.0f, 11.58f, 8.58f, 11.0f, 9.3f, 11.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.43f, 0.0f, 0.84f, 0.22f, 1.08f, 0.58f)
                lineTo(12.0f, 14.0f)
                lineToRelative(1.61f, -2.42f)
                curveTo(13.86f, 11.22f, 14.26f, 11.0f, 14.7f, 11.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.72f, 0.0f, 1.3f, 0.58f, 1.3f, 1.3f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _museum!!
    }

private var _museum: ImageVector? = null
