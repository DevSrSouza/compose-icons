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

public val Octicons.FileRemoved16: ImageVector
    get() {
        if (_fileRemoved16 != null) {
            return _fileRemoved16!!
        }
        _fileRemoved16 = Builder(name = "FileRemoved16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                lineTo(13.5f, 4.664f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.073f, -0.177f)
                lineToRelative(-2.914f, -2.914f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, -0.073f)
                close()
                moveTo(8.25f, 7.5f)
                horizontalLineToRelative(2.242f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(-2.254f, 0.015f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.01f, -1.5f)
                close()
            }
        }
        .build()
        return _fileRemoved16!!
    }

private var _fileRemoved16: ImageVector? = null
