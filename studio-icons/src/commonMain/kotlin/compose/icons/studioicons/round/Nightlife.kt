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

public val RoundGroup.Nightlife: ImageVector
    get() {
        if (_nightlife != null) {
            return _nightlife!!
        }
        _nightlife = Builder(name = "Nightlife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.87f, 5.0f)
                horizontalLineToRelative(10.26f)
                curveToRelative(0.8f, 0.0f, 1.28f, 0.89f, 0.83f, 1.55f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.04f, 6.55f)
                curveTo(1.59f, 5.89f, 2.07f, 5.0f, 2.87f, 5.0f)
                close()
                moveTo(10.1f, 9.0f)
                lineToRelative(1.4f, -2.0f)
                horizontalLineTo(4.49f)
                lineToRelative(1.4f, 2.0f)
                horizontalLineTo(10.1f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                curveTo(21.33f, 5.0f, 22.0f, 5.67f, 22.0f, 6.5f)
                verticalLineToRelative(0.0f)
                curveTo(22.0f, 7.33f, 21.33f, 8.0f, 20.5f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 1.84f, -1.64f, 3.28f, -3.54f, 2.95f)
                curveToRelative(-1.21f, -0.21f, -2.2f, -1.2f, -2.41f, -2.41f)
                curveTo(12.72f, 15.64f, 14.16f, 14.0f, 16.0f, 14.0f)
                curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.9f, 17.9f, 5.0f, 19.0f, 5.0f)
                close()
            }
        }
        .build()
        return _nightlife!!
    }

private var _nightlife: ImageVector? = null
