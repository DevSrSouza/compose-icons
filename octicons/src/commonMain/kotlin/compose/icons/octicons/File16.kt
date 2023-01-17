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

public val Octicons.File16: ImageVector
    get() {
        if (_file16 != null) {
            return _file16!!
        }
        _file16 = Builder(name = "File16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.75f)
                curveTo(2.0f, 0.784f, 2.784f, 0.0f, 3.75f, 0.0f)
                horizontalLineToRelative(6.586f)
                curveToRelative(0.464f, 0.0f, 0.909f, 0.184f, 1.237f, 0.513f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.329f, 0.328f, 0.513f, 0.773f, 0.513f, 1.237f)
                verticalLineToRelative(9.586f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 16.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 14.25f)
                close()
                moveTo(3.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(13.5f, 6.0f)
                horizontalLineToRelative(-2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.0f, 4.25f)
                lineTo(9.0f, 1.5f)
                close()
                moveTo(10.5f, 1.562f)
                lineTo(10.5f, 4.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.688f)
                lineToRelative(-0.011f, -0.013f)
                lineToRelative(-2.914f, -2.914f)
                lineToRelative(-0.013f, -0.011f)
                close()
            }
        }
        .build()
        return _file16!!
    }

private var _file16: ImageVector? = null
