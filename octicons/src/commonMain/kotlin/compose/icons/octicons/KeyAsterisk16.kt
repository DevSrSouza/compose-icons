package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.KeyAsterisk16: ImageVector
    get() {
        if (_keyAsterisk16 != null) {
            return _keyAsterisk16!!
        }
        _keyAsterisk16 = Builder(name = "KeyAsterisk16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.75f, 0.0f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 16.0f, 2.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 13.25f, 16.0f)
                horizontalLineTo(2.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 0.0f, 13.25f)
                close()
                moveTo(2.75f, 1.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineTo(6.7f)
                lineToRelative(1.69f, -0.975f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.3f)
                lineTo(9.5f, 8.0f)
                lineToRelative(1.69f, 0.976f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 1.298f)
                lineTo(8.75f, 9.3f)
                verticalLineToRelative(1.951f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(9.299f)
                lineToRelative(-1.69f, 0.976f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -1.3f)
                lineTo(6.5f, 8.0f)
                lineToRelative(-1.69f, -0.975f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -1.3f)
                lineToRelative(1.69f, 0.976f)
                verticalLineTo(4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _keyAsterisk16!!
    }

private var _keyAsterisk16: ImageVector? = null
