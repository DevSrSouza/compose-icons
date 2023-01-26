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

public val RoundGroup.Luggage: ImageVector
    get() {
        if (_luggage != null) {
            return _luggage!!
        }
        _luggage = Builder(name = "Luggage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(8.75f, 18.0f)
                lineTo(8.75f, 18.0f)
                curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f)
                verticalLineToRelative(-7.5f)
                curveTo(8.0f, 9.34f, 8.34f, 9.0f, 8.75f, 9.0f)
                horizontalLineToRelative(0.0f)
                curveTo(9.16f, 9.0f, 9.5f, 9.34f, 9.5f, 9.75f)
                verticalLineToRelative(7.5f)
                curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f)
                close()
                moveTo(12.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                curveTo(11.25f, 9.34f, 11.59f, 9.0f, 12.0f, 9.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                curveTo(12.75f, 17.66f, 12.41f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(13.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.25f, 18.0f)
                lineTo(15.25f, 18.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                curveTo(14.5f, 9.34f, 14.84f, 9.0f, 15.25f, 9.0f)
                horizontalLineToRelative(0.0f)
                curveTo(15.66f, 9.0f, 16.0f, 9.34f, 16.0f, 9.75f)
                verticalLineToRelative(7.5f)
                curveTo(16.0f, 17.66f, 15.66f, 18.0f, 15.25f, 18.0f)
                close()
            }
        }
        .build()
        return _luggage!!
    }

private var _luggage: ImageVector? = null
