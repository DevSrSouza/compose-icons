package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EarbudsBattery: ImageVector
    get() {
        if (_earbudsBattery != null) {
            return _earbudsBattery!!
        }
        _earbudsBattery = Builder(name = "EarbudsBattery", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.38f, 16.5f)
                lineTo(5.38f, 16.5f)
                curveToRelative(-1.04f, 0.0f, -1.88f, -0.84f, -1.88f, -1.87f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f)
                verticalLineToRelative(6.63f)
                curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.37f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.86f, 0.0f, 3.37f, -1.51f, 3.37f, -3.37f)
                verticalLineTo(9.37f)
                curveToRelative(0.0f, -1.04f, 0.84f, -1.87f, 1.87f, -1.87f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.04f, 0.0f, 1.87f, 0.84f, 1.87f, 1.87f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(9.37f)
                curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.63f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(8.76f, 6.0f, 7.25f, 7.51f, 7.25f, 9.37f)
                verticalLineToRelative(5.25f)
                curveTo(7.25f, 15.66f, 6.41f, 16.5f, 5.38f, 16.5f)
                close()
            }
        }
        .build()
        return _earbudsBattery!!
    }

private var _earbudsBattery: ImageVector? = null
