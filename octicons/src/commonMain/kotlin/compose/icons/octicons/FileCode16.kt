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

public val Octicons.FileCode16: ImageVector
    get() {
        if (_fileCode16 != null) {
            return _fileCode16!!
        }
        _fileCode16 = Builder(name = "FileCode16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.75f)
                curveTo(4.0f, 0.784f, 4.784f, 0.0f, 5.75f, 0.0f)
                horizontalLineToRelative(5.586f)
                curveToRelative(0.464f, 0.0f, 0.909f, 0.184f, 1.237f, 0.513f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.329f, 0.328f, 0.513f, 0.773f, 0.513f, 1.237f)
                verticalLineToRelative(8.586f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 6.0f)
                horizontalLineToRelative(-2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 10.0f, 4.25f)
                lineTo(10.0f, 1.5f)
                lineTo(5.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(5.72f, 6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineToRelative(1.47f, -1.47f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(3.28f, 7.78f)
                lineTo(1.81f, 9.25f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                close()
                moveTo(11.5f, 1.562f)
                lineTo(11.5f, 4.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.688f)
                lineToRelative(-0.011f, -0.013f)
                lineToRelative(-2.914f, -2.914f)
                lineToRelative(-0.013f, -0.011f)
                close()
            }
        }
        .build()
        return _fileCode16!!
    }

private var _fileCode16: ImageVector? = null
