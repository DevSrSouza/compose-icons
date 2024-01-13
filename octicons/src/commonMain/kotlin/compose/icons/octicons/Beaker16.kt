package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Beaker16: ImageVector
    get() {
        if (_beaker16 != null) {
            return _beaker16!!
        }
        _beaker16 = Builder(name = "Beaker16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.782f)
                lineTo(5.0f, 2.5f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(11.0f, 2.5f)
                verticalLineToRelative(3.282f)
                lineToRelative(3.666f, 5.76f)
                curveTo(15.619f, 13.04f, 14.543f, 15.0f, 12.767f, 15.0f)
                lineTo(3.233f, 15.0f)
                curveToRelative(-1.776f, 0.0f, -2.852f, -1.96f, -1.899f, -3.458f)
                close()
                moveTo(2.6f, 12.347f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.633f, 1.153f)
                horizontalLineToRelative(9.534f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.633f, -1.153f)
                lineTo(12.225f, 10.5f)
                horizontalLineToRelative(-8.45f)
                close()
                moveTo(9.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.5f, 6.0f)
                curveToRelative(0.0f, 0.143f, -0.04f, 0.283f, -0.117f, 0.403f)
                lineTo(4.73f, 9.0f)
                horizontalLineToRelative(6.54f)
                lineTo(9.617f, 6.403f)
                arcTo(0.746f, 0.746f, 0.0f, false, true, 9.5f, 6.0f)
                close()
            }
        }
        .build()
        return _beaker16!!
    }

private var _beaker16: ImageVector? = null
