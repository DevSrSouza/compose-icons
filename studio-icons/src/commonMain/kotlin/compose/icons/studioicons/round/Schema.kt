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

public val RoundGroup.Schema: ImageVector
    get() {
        if (_schema != null) {
            return _schema!!
        }
        _schema = Builder(name = "Schema", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveTo(11.0f, 9.67f, 10.33f, 9.0f, 9.5f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                curveTo(10.33f, 7.0f, 11.0f, 6.33f, 11.0f, 5.5f)
                verticalLineToRelative(-3.0f)
                curveTo(11.0f, 1.67f, 10.33f, 1.0f, 9.5f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(4.67f, 1.0f, 4.0f, 1.67f, 4.0f, 2.5f)
                verticalLineToRelative(3.0f)
                curveTo(4.0f, 6.33f, 4.67f, 7.0f, 5.5f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(4.67f, 9.0f, 4.0f, 9.67f, 4.0f, 10.5f)
                verticalLineToRelative(3.0f)
                curveTo(4.0f, 14.33f, 4.67f, 15.0f, 5.5f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(4.67f, 17.0f, 4.0f, 17.67f, 4.0f, 18.5f)
                verticalLineToRelative(3.0f)
                curveTo(4.0f, 22.33f, 4.67f, 23.0f, 5.5f, 23.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveTo(21.0f, 9.67f, 20.33f, 9.0f, 19.5f, 9.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(14.67f, 9.0f, 14.0f, 9.67f, 14.0f, 10.5f)
                close()
            }
        }
        .build()
        return _schema!!
    }

private var _schema: ImageVector? = null
