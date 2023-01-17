package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fivem: ImageVector
    get() {
        if (_fivem != null) {
            return _fivem!!
        }
        _fivem = Builder(name = "Fivem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 24.0f)
                horizontalLineToRelative(-5.225f)
                curveToRelative(-0.117f, 0.0f, -0.455f, -1.127f, -1.026f, -3.375f)
                curveToRelative(-1.982f, -6.909f, -3.124f, -10.946f, -3.417f, -12.12f)
                lineToRelative(3.37f, -3.325f)
                horizontalLineToRelative(0.099f)
                curveToRelative(0.454f, 1.42f, 2.554f, 7.676f, 6.299f, 18.768f)
                close()
                moveTo(12.342f, 7.084f)
                horizontalLineToRelative(-0.048f)
                arcToRelative(3.382f, 3.385f, 0.0f, false, true, -0.098f, -0.492f)
                verticalLineToRelative(-0.098f)
                arcToRelative(102.619f, 102.715f, 0.0f, false, true, 3.272f, -3.275f)
                curveToRelative(0.13f, 0.196f, 0.196f, 0.356f, 0.196f, 0.491f)
                verticalLineToRelative(0.05f)
                arcToRelative(140.694f, 140.826f, 0.0f, false, true, -3.322f, 3.324f)
                close()
                moveTo(5.994f, 10.9f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(0.67f, -2.12f, 1.076f, -3.209f, 1.223f, -3.275f)
                lineTo(14.492f, 0.343f)
                curveToRelative(0.08f, 0.0f, 0.258f, 0.524f, 0.533f, 1.562f)
                close()
                moveTo(7.364f, 6.886f)
                horizontalLineToRelative(-0.05f)
                curveTo(8.813f, 2.342f, 9.612f, 0.048f, 9.71f, 0.0f)
                horizontalLineToRelative(4.495f)
                verticalLineToRelative(0.05f)
                arcToRelative(664.971f, 664.971f, 0.0f, false, true, -6.841f, 6.839f)
                close()
                moveTo(4.674f, 14.76f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(0.166f, -0.798f, 0.554f, -1.418f, 1.174f, -1.855f)
                arcToRelative(312.918f, 313.213f, 0.0f, false, true, 5.71f, -5.717f)
                horizontalLineToRelative(0.05f)
                curveToRelative(-0.117f, 0.672f, -0.375f, 1.175f, -0.781f, 1.52f)
                close()
                moveTo(1.598f, 24.0f)
                lineToRelative(-0.098f, -0.05f)
                curveToRelative(1.399f, -4.172f, 2.148f, -6.322f, 2.248f, -6.45f)
                lineToRelative(6.74f, -6.694f)
                verticalLineToRelative(0.05f)
                curveTo(10.232f, 11.88f, 8.974f, 16.263f, 6.73f, 24.0f)
                close()
            }
        }
        .build()
        return _fivem!!
    }

private var _fivem: ImageVector? = null
