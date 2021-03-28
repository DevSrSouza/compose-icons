package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
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
                lineTo(2.0f, 1.75f)
                close()
                moveTo(9.5f, 1.562f)
                lineTo(9.5f, 4.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.688f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.011f, -0.013f)
                lineTo(9.513f, 1.573f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.013f, -0.011f)
                close()
                moveTo(1.5f, 12.237f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.262f, -2.25f)
                lineTo(4.0f, 9.99f)
                verticalLineToRelative(1.938f)
                curveToRelative(0.0f, 0.218f, 0.26f, 0.331f, 0.42f, 0.183f)
                lineToRelative(2.883f, -2.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.366f)
                lineTo(4.42f, 6.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.42f, 0.183f)
                lineTo(4.0f, 8.49f)
                lineToRelative(-0.23f, -0.001f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 0.0f, 12.238f)
                verticalLineToRelative(1.012f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.013f)
                close()
            }
        }
        .build()
        return _fileSymlinkFile16!!
    }

private var _fileSymlinkFile16: ImageVector? = null
