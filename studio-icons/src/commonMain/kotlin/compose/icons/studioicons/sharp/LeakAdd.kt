package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LeakAdd: ImageVector
    get() {
        if (_leakAdd != null) {
            return _leakAdd!!
        }
        _leakAdd = Builder(name = "LeakAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                close()
                moveTo(14.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(6.08f, 0.0f, 11.0f, -4.93f, 11.0f, -11.0f)
                close()
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f)
                close()
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-6.07f, 0.0f, -11.0f, 4.93f, -11.0f, 11.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                close()
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _leakAdd!!
    }

private var _leakAdd: ImageVector? = null
