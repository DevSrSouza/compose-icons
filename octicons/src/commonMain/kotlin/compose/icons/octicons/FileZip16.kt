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

public val Octicons.FileZip16: ImageVector
    get() {
        if (_fileZip16 != null) {
            return _fileZip16!!
        }
        _fileZip16 = Builder(name = "FileZip16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.09f, 0.048f, 0.173f, 0.126f, 0.217f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.752f, 1.298f)
                arcTo(1.748f, 1.748f, 0.0f, false, true, 2.0f, 13.25f)
                lineTo(2.0f, 1.75f)
                curveTo(2.0f, 0.784f, 2.784f, 0.0f, 3.75f, 0.0f)
                horizontalLineToRelative(5.586f)
                curveToRelative(0.464f, 0.0f, 0.909f, 0.185f, 1.237f, 0.513f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.329f, 0.328f, 0.513f, 0.773f, 0.513f, 1.237f)
                verticalLineToRelative(8.586f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.25f, 15.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(12.5f, 4.664f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.073f, -0.177f)
                lineTo(9.513f, 1.573f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, -0.073f)
                lineTo(7.25f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(7.25f, 10.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(6.0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 5.25f)
                close()
                moveTo(6.75f, 7.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.0f, 6.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.75f, 6.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 6.75f)
                close()
                moveTo(8.75f, 3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.0f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.75f, 9.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 9.75f)
                close()
                moveTo(7.0f, 12.25f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _fileZip16!!
    }

private var _fileZip16: ImageVector? = null
