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

public val Octicons.CrossReference16: ImageVector
    get() {
        if (_crossReference16 != null) {
            return _crossReference16!!
        }
        _crossReference16 = Builder(name = "CrossReference16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 13.0f)
                horizontalLineTo(9.06f)
                lineToRelative(-2.573f, 2.573f)
                arcTo(1.458f, 1.458f, 0.0f, false, true, 4.0f, 14.543f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 11.25f)
                verticalLineToRelative(-7.5f)
                curveTo(1.0f, 2.784f, 1.784f, 2.0f, 2.75f, 2.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(16.0f, 1.25f)
                verticalLineToRelative(4.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                lineTo(14.03f, 4.03f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(-1.543f, -1.543f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 11.604f, 1.0f)
                horizontalLineToRelative(4.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _crossReference16!!
    }

private var _crossReference16: ImageVector? = null
