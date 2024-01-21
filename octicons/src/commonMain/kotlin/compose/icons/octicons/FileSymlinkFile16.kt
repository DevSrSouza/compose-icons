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

public val Octicons.FileSymlinkFile16: ImageVector
    get() {
        if (_fileSymlinkFile16 != null) {
            return _fileSymlinkFile16!!
        }
        _fileSymlinkFile16 = Builder(name = "FileSymlinkFile16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.75f)
                curveTo(2.0f, 0.784f, 2.784f, 0.0f, 3.75f, 0.0f)
                horizontalLineToRelative(5.586f)
                curveToRelative(0.464f, 0.0f, 0.909f, 0.184f, 1.237f, 0.513f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.329f, 0.328f, 0.513f, 0.773f, 0.513f, 1.237f)
                verticalLineToRelative(8.586f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.25f, 15.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(12.5f, 6.0f)
                lineTo(9.75f, 6.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 8.0f, 4.25f)
                lineTo(8.0f, 1.5f)
                lineTo(3.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(3.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(1.5f, 12.237f)
                verticalLineToRelative(1.013f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.012f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, true, 3.77f, -3.749f)
                lineTo(4.0f, 8.49f)
                lineTo(4.0f, 6.573f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.42f, -0.183f)
                lineToRelative(2.883f, 2.678f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.366f)
                lineTo(4.42f, 12.111f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.42f, -0.183f)
                lineTo(4.0f, 9.99f)
                lineToRelative(-0.238f, -0.003f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.262f, 2.25f)
                close()
                moveTo(9.5f, 1.562f)
                lineTo(9.5f, 4.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.688f)
                lineToRelative(-0.011f, -0.013f)
                lineToRelative(-2.914f, -2.914f)
                lineToRelative(-0.013f, -0.011f)
                close()
            }
        }
        .build()
        return _fileSymlinkFile16!!
    }

private var _fileSymlinkFile16: ImageVector? = null
