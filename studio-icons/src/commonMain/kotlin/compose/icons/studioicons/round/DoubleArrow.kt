package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DoubleArrow: ImageVector
    get() {
        if (_doubleArrow != null) {
            return _doubleArrow!!
        }
        _doubleArrow = Builder(name = "DoubleArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.08f, 11.42f)
                lineToRelative(-4.04f, -5.65f)
                curveTo(15.7f, 5.29f, 15.15f, 5.0f, 14.56f, 5.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.49f, 0.0f, -2.35f, 1.68f, -1.49f, 2.89f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-2.93f, 4.11f)
                curveToRelative(-0.87f, 1.21f, 0.0f, 2.89f, 1.49f, 2.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f)
                lineToRelative(4.04f, -5.65f)
                curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.08f, 11.42f)
                lineTo(9.05f, 5.77f)
                curveTo(8.7f, 5.29f, 8.15f, 5.0f, 7.56f, 5.0f)
                horizontalLineToRelative(0.0f)
                curveTo(6.07f, 5.0f, 5.2f, 6.68f, 6.07f, 7.89f)
                lineTo(9.0f, 12.0f)
                lineToRelative(-2.93f, 4.11f)
                curveTo(5.2f, 17.32f, 6.07f, 19.0f, 7.56f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f)
                lineToRelative(4.04f, -5.65f)
                curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f)
                close()
            }
        }
        .build()
        return _doubleArrow!!
    }

private var _doubleArrow: ImageVector? = null
