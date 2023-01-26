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

public val RoundGroup.GridOff: ImageVector
    get() {
        if (_gridOff != null) {
            return _gridOff!!
        }
        _gridOff = Builder(name = "GridOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                verticalLineToRelative(0.89f)
                lineToRelative(2.0f, 2.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(2.0f, 2.0f)
                lineTo(14.0f, 10.0f)
                verticalLineToRelative(0.89f)
                lineToRelative(2.0f, 2.0f)
                lineTo(16.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 16.0f)
                verticalLineToRelative(0.89f)
                lineToRelative(2.0f, 2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(5.11f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(22.16f, 21.88f)
                lineTo(2.12f, 1.84f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(2.0f, 4.55f)
                lineTo(2.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(15.45f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
                close()
                moveTo(10.0f, 12.55f)
                lineTo(11.45f, 14.0f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(-1.45f)
                close()
                moveTo(4.0f, 6.55f)
                lineTo(5.45f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 6.55f)
                close()
                moveTo(8.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.45f)
                lineToRelative(0.55f, 0.55f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.45f)
                lineToRelative(0.55f, 0.55f)
                lineTo(14.0f, 20.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineToRelative(-1.45f)
                lineTo(17.45f, 20.0f)
                lineTo(16.0f, 20.0f)
                close()
            }
        }
        .build()
        return _gridOff!!
    }

private var _gridOff: ImageVector? = null
