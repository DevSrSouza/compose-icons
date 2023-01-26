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

public val RoundGroup.Fort: ImageVector
    get() {
        if (_fort != null) {
            return _fort!!
        }
        _fort = Builder(name = "Fort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.17f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                lineToRelative(1.41f, -1.41f)
                curveTo(10.79f, 7.21f, 11.0f, 6.7f, 11.0f, 6.17f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.45f, 3.0f, 5.0f, 3.45f, 5.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(1.45f, 3.0f, 1.0f, 3.45f, 1.0f, 4.0f)
                verticalLineToRelative(2.17f)
                curveTo(1.0f, 6.7f, 1.21f, 7.21f, 1.59f, 7.59f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(1.21f, 16.79f, 1.0f, 17.3f, 1.0f, 17.83f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(0.0f, -2.89f)
                curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f)
                curveTo(12.92f, 15.82f, 14.0f, 16.79f, 14.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-1.17f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineTo(21.0f, 15.0f)
                verticalLineTo(9.0f)
                lineToRelative(1.41f, -1.41f)
                curveTo(22.79f, 7.21f, 23.0f, 6.7f, 23.0f, 6.17f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(21.45f, 3.0f, 21.0f, 3.45f, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _fort!!
    }

private var _fort: ImageVector? = null
